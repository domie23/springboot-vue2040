
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 健康日志
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jiankangrizhi")
public class JiankangrizhiController {
    private static final Logger logger = LoggerFactory.getLogger(JiankangrizhiController.class);

    private static final String TABLE_NAME = "jiankangrizhi";

    @Autowired
    private JiankangrizhiService jiankangrizhiService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private NewsService newsService;//新闻
    @Autowired
    private NewsCollectionService newsCollectionService;//新闻收藏
    @Autowired
    private NewsLiuyanService newsLiuyanService;//新闻留言
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = jiankangrizhiService.queryPage(params);

        //字典表数据转换
        List<JiankangrizhiView> list =(List<JiankangrizhiView>)page.getList();
        for(JiankangrizhiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiankangrizhiEntity jiankangrizhi = jiankangrizhiService.selectById(id);
        if(jiankangrizhi !=null){
            //entity转view
            JiankangrizhiView view = new JiankangrizhiView();
            BeanUtils.copyProperties( jiankangrizhi , view );//把实体数据重构到view中
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(jiankangrizhi.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangrizhiEntity jiankangrizhi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiankangrizhi:{}",this.getClass().getName(),jiankangrizhi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            jiankangrizhi.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<JiankangrizhiEntity> queryWrapper = new EntityWrapper<JiankangrizhiEntity>()
            .eq("yonghu_id", jiankangrizhi.getYonghuId())
            .eq("jiankangrizhi_name", jiankangrizhi.getJiankangrizhiName())
            .eq("jiankangrizhi_types", jiankangrizhi.getJiankangrizhiTypes())
            .eq("shuimian_types", jiankangrizhi.getShuimianTypes())
            .eq("yinjiu_types", jiankangrizhi.getYinjiuTypes())
            .eq("xiyan_types", jiankangrizhi.getXiyanTypes())
            .eq("gaoya", jiankangrizhi.getGaoya())
            .eq("diya", jiankangrizhi.getDiya())
            .eq("zhuangtai_types", jiankangrizhi.getZhuangtaiTypes())
            .eq("suoshuriqi_time", new SimpleDateFormat("yyyy-MM-dd").format(jiankangrizhi.getSuoshuriqiTime()))
            .eq("tuijian_types", jiankangrizhi.getTuijianTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiankangrizhiEntity jiankangrizhiEntity = jiankangrizhiService.selectOne(queryWrapper);
        if(jiankangrizhiEntity==null){
            jiankangrizhi.setInsertTime(new Date());
            jiankangrizhi.setCreateTime(new Date());
            jiankangrizhiService.insert(jiankangrizhi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiankangrizhiEntity jiankangrizhi, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,jiankangrizhi:{}",this.getClass().getName(),jiankangrizhi.toString());
        JiankangrizhiEntity oldJiankangrizhiEntity = jiankangrizhiService.selectById(jiankangrizhi.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            jiankangrizhi.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            jiankangrizhiService.updateById(jiankangrizhi);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<JiankangrizhiEntity> oldJiankangrizhiList =jiankangrizhiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        jiankangrizhiService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<JiankangrizhiEntity> jiankangrizhiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JiankangrizhiEntity jiankangrizhiEntity = new JiankangrizhiEntity();
//                            jiankangrizhiEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            jiankangrizhiEntity.setJiankangrizhiUuidNumber(data.get(0));                    //健康日志编号 要改的
//                            jiankangrizhiEntity.setJiankangrizhiName(data.get(0));                    //健康日志名称 要改的
//                            jiankangrizhiEntity.setJiankangrizhiTypes(Integer.valueOf(data.get(0)));   //健康日志类型 要改的
//                            jiankangrizhiEntity.setShuimianTypes(Integer.valueOf(data.get(0)));   //睡眠情况 要改的
//                            jiankangrizhiEntity.setYinjiuTypes(Integer.valueOf(data.get(0)));   //饮酒 要改的
//                            jiankangrizhiEntity.setXiyanTypes(Integer.valueOf(data.get(0)));   //吸烟 要改的
//                            jiankangrizhiEntity.setGaoya(Integer.valueOf(data.get(0)));   //高压 要改的
//                            jiankangrizhiEntity.setDiya(Integer.valueOf(data.get(0)));   //低压 要改的
//                            jiankangrizhiEntity.setShengao(data.get(0));                    //身高(m) 要改的
//                            jiankangrizhiEntity.setTizhong(data.get(0));                    //体重(kg) 要改的
//                            jiankangrizhiEntity.setZhuangtaiTypes(Integer.valueOf(data.get(0)));   //状态 要改的
//                            jiankangrizhiEntity.setJiankangrizhiContent("");//详情和图片
//                            jiankangrizhiEntity.setSuoshuriqiTime(sdf.parse(data.get(0)));          //所属日期 要改的
//                            jiankangrizhiEntity.setInsertTime(date);//时间
//                            jiankangrizhiEntity.setReliang(data.get(0));                    //所需热量(千卡) 要改的
//                            jiankangrizhiEntity.setBmiZhi(data.get(0));                    //BMI值 要改的
//                            jiankangrizhiEntity.setTuijianTypes(Integer.valueOf(data.get(0)));   //推荐饭食 要改的
//                            jiankangrizhiEntity.setCreateTime(date);//时间
                            jiankangrizhiList.add(jiankangrizhiEntity);


                            //把要查询是否重复的字段放入map中
                                //健康日志编号
                                if(seachFields.containsKey("jiankangrizhiUuidNumber")){
                                    List<String> jiankangrizhiUuidNumber = seachFields.get("jiankangrizhiUuidNumber");
                                    jiankangrizhiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> jiankangrizhiUuidNumber = new ArrayList<>();
                                    jiankangrizhiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("jiankangrizhiUuidNumber",jiankangrizhiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //健康日志编号
                        List<JiankangrizhiEntity> jiankangrizhiEntities_jiankangrizhiUuidNumber = jiankangrizhiService.selectList(new EntityWrapper<JiankangrizhiEntity>().in("jiankangrizhi_uuid_number", seachFields.get("jiankangrizhiUuidNumber")));
                        if(jiankangrizhiEntities_jiankangrizhiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(JiankangrizhiEntity s:jiankangrizhiEntities_jiankangrizhiUuidNumber){
                                repeatFields.add(s.getJiankangrizhiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [健康日志编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        jiankangrizhiService.insertBatch(jiankangrizhiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = jiankangrizhiService.queryPage(params);

        //字典表数据转换
        List<JiankangrizhiView> list =(List<JiankangrizhiView>)page.getList();
        for(JiankangrizhiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiankangrizhiEntity jiankangrizhi = jiankangrizhiService.selectById(id);
            if(jiankangrizhi !=null){


                //entity转view
                JiankangrizhiView view = new JiankangrizhiView();
                BeanUtils.copyProperties( jiankangrizhi , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(jiankangrizhi.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangrizhiEntity jiankangrizhi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jiankangrizhi:{}",this.getClass().getName(),jiankangrizhi.toString());
        Wrapper<JiankangrizhiEntity> queryWrapper = new EntityWrapper<JiankangrizhiEntity>()
            .eq("yonghu_id", jiankangrizhi.getYonghuId())
            .eq("suoshuriqi_time", new SimpleDateFormat("yyyy-MM-dd").format(jiankangrizhi.getSuoshuriqiTime()))
                ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiankangrizhiEntity jiankangrizhiEntity = jiankangrizhiService.selectOne(queryWrapper);
        if(jiankangrizhiEntity==null){


            double reliang = 66+13.7*jiankangrizhi.getTizhong()+5*jiankangrizhi.getShengao()*100-6.8*18;
            jiankangrizhi.setReliang(reliang);
            jiankangrizhi.setBmiZhi(jiankangrizhi.getTizhong()/(jiankangrizhi.getShengao()*jiankangrizhi.getShengao()));

            if(jiankangrizhi.getBmiZhi()<18.5){
                jiankangrizhi.setTuijianTypes(1);
            }else if(jiankangrizhi.getBmiZhi()>23.9){
                jiankangrizhi.setTuijianTypes(3);
            }else{
                jiankangrizhi.setTuijianTypes(2);

            }

            jiankangrizhi.setInsertTime(new Date());
            jiankangrizhi.setCreateTime(new Date());
        jiankangrizhiService.insert(jiankangrizhi);

            return R.ok();
        }else {
            return R.error(511,"该用户该天已有上传健康日志了");
        }
    }

}

