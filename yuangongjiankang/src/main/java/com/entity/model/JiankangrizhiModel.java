package com.entity.model;

import com.entity.JiankangrizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 健康日志
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiankangrizhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 健康日志编号
     */
    private String jiankangrizhiUuidNumber;


    /**
     * 健康日志名称
     */
    private String jiankangrizhiName;


    /**
     * 健康日志类型
     */
    private Integer jiankangrizhiTypes;


    /**
     * 睡眠情况
     */
    private Integer shuimianTypes;


    /**
     * 饮酒
     */
    private Integer yinjiuTypes;


    /**
     * 吸烟
     */
    private Integer xiyanTypes;


    /**
     * 高压
     */
    private Integer gaoya;


    /**
     * 低压
     */
    private Integer diya;


    /**
     * 身高(m)
     */
    private Double shengao;


    /**
     * 体重(kg)
     */
    private Double tizhong;


    /**
     * 状态
     */
    private Integer zhuangtaiTypes;


    /**
     * 日志内容
     */
    private String jiankangrizhiContent;


    /**
     * 所属日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date suoshuriqiTime;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 所需热量(千卡)
     */
    private Double reliang;


    /**
     * BMI值
     */
    private Double bmiZhi;


    /**
     * 推荐饭食
     */
    private Integer tuijianTypes;


    /**
     * 创建时间  show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：健康日志编号
	 */
    public String getJiankangrizhiUuidNumber() {
        return jiankangrizhiUuidNumber;
    }


    /**
	 * 设置：健康日志编号
	 */
    public void setJiankangrizhiUuidNumber(String jiankangrizhiUuidNumber) {
        this.jiankangrizhiUuidNumber = jiankangrizhiUuidNumber;
    }
    /**
	 * 获取：健康日志名称
	 */
    public String getJiankangrizhiName() {
        return jiankangrizhiName;
    }


    /**
	 * 设置：健康日志名称
	 */
    public void setJiankangrizhiName(String jiankangrizhiName) {
        this.jiankangrizhiName = jiankangrizhiName;
    }
    /**
	 * 获取：健康日志类型
	 */
    public Integer getJiankangrizhiTypes() {
        return jiankangrizhiTypes;
    }


    /**
	 * 设置：健康日志类型
	 */
    public void setJiankangrizhiTypes(Integer jiankangrizhiTypes) {
        this.jiankangrizhiTypes = jiankangrizhiTypes;
    }
    /**
	 * 获取：睡眠情况
	 */
    public Integer getShuimianTypes() {
        return shuimianTypes;
    }


    /**
	 * 设置：睡眠情况
	 */
    public void setShuimianTypes(Integer shuimianTypes) {
        this.shuimianTypes = shuimianTypes;
    }
    /**
	 * 获取：饮酒
	 */
    public Integer getYinjiuTypes() {
        return yinjiuTypes;
    }


    /**
	 * 设置：饮酒
	 */
    public void setYinjiuTypes(Integer yinjiuTypes) {
        this.yinjiuTypes = yinjiuTypes;
    }
    /**
	 * 获取：吸烟
	 */
    public Integer getXiyanTypes() {
        return xiyanTypes;
    }


    /**
	 * 设置：吸烟
	 */
    public void setXiyanTypes(Integer xiyanTypes) {
        this.xiyanTypes = xiyanTypes;
    }
    /**
	 * 获取：高压
	 */
    public Integer getGaoya() {
        return gaoya;
    }


    /**
	 * 设置：高压
	 */
    public void setGaoya(Integer gaoya) {
        this.gaoya = gaoya;
    }
    /**
	 * 获取：低压
	 */
    public Integer getDiya() {
        return diya;
    }


    /**
	 * 设置：低压
	 */
    public void setDiya(Integer diya) {
        this.diya = diya;
    }
    /**
	 * 获取：身高(m)
	 */
    public Double getShengao() {
        return shengao;
    }


    /**
	 * 设置：身高(m)
	 */
    public void setShengao(Double shengao) {
        this.shengao = shengao;
    }
    /**
	 * 获取：体重(kg)
	 */
    public Double getTizhong() {
        return tizhong;
    }


    /**
	 * 设置：体重(kg)
	 */
    public void setTizhong(Double tizhong) {
        this.tizhong = tizhong;
    }
    /**
	 * 获取：状态
	 */
    public Integer getZhuangtaiTypes() {
        return zhuangtaiTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setZhuangtaiTypes(Integer zhuangtaiTypes) {
        this.zhuangtaiTypes = zhuangtaiTypes;
    }
    /**
	 * 获取：日志内容
	 */
    public String getJiankangrizhiContent() {
        return jiankangrizhiContent;
    }


    /**
	 * 设置：日志内容
	 */
    public void setJiankangrizhiContent(String jiankangrizhiContent) {
        this.jiankangrizhiContent = jiankangrizhiContent;
    }
    /**
	 * 获取：所属日期
	 */
    public Date getSuoshuriqiTime() {
        return suoshuriqiTime;
    }


    /**
	 * 设置：所属日期
	 */
    public void setSuoshuriqiTime(Date suoshuriqiTime) {
        this.suoshuriqiTime = suoshuriqiTime;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：所需热量(千卡)
	 */
    public Double getReliang() {
        return reliang;
    }


    /**
	 * 设置：所需热量(千卡)
	 */
    public void setReliang(Double reliang) {
        this.reliang = reliang;
    }
    /**
	 * 获取：BMI值
	 */
    public Double getBmiZhi() {
        return bmiZhi;
    }


    /**
	 * 设置：BMI值
	 */
    public void setBmiZhi(Double bmiZhi) {
        this.bmiZhi = bmiZhi;
    }
    /**
	 * 获取：推荐饭食
	 */
    public Integer getTuijianTypes() {
        return tuijianTypes;
    }


    /**
	 * 设置：推荐饭食
	 */
    public void setTuijianTypes(Integer tuijianTypes) {
        this.tuijianTypes = tuijianTypes;
    }
    /**
	 * 获取：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
