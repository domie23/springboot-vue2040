package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 健康日志
 *
 * @author 
 * @email
 */
@TableName("jiankangrizhi")
public class JiankangrizhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiankangrizhiEntity() {

	}

	public JiankangrizhiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 健康日志编号
     */
    @ColumnInfo(comment="健康日志编号",type="varchar(200)")
    @TableField(value = "jiankangrizhi_uuid_number")

    private String jiankangrizhiUuidNumber;


    /**
     * 健康日志名称
     */
    @ColumnInfo(comment="健康日志名称",type="varchar(200)")
    @TableField(value = "jiankangrizhi_name")

    private String jiankangrizhiName;


    /**
     * 健康日志类型
     */
    @ColumnInfo(comment="健康日志类型",type="int(11)")
    @TableField(value = "jiankangrizhi_types")

    private Integer jiankangrizhiTypes;


    /**
     * 睡眠情况
     */
    @ColumnInfo(comment="睡眠情况",type="int(11)")
    @TableField(value = "shuimian_types")

    private Integer shuimianTypes;


    /**
     * 饮酒
     */
    @ColumnInfo(comment="饮酒",type="int(11)")
    @TableField(value = "yinjiu_types")

    private Integer yinjiuTypes;


    /**
     * 吸烟
     */
    @ColumnInfo(comment="吸烟",type="int(11)")
    @TableField(value = "xiyan_types")

    private Integer xiyanTypes;


    /**
     * 高压
     */
    @ColumnInfo(comment="高压",type="int(11)")
    @TableField(value = "gaoya")

    private Integer gaoya;


    /**
     * 低压
     */
    @ColumnInfo(comment="低压",type="int(11)")
    @TableField(value = "diya")

    private Integer diya;


    /**
     * 身高(m)
     */
    @ColumnInfo(comment="身高(m)",type="decimal(10,2)")
    @TableField(value = "shengao")

    private Double shengao;


    /**
     * 体重(kg)
     */
    @ColumnInfo(comment="体重(kg)",type="decimal(10,2)")
    @TableField(value = "tizhong")

    private Double tizhong;


    /**
     * 状态
     */
    @ColumnInfo(comment="状态",type="int(11)")
    @TableField(value = "zhuangtai_types")

    private Integer zhuangtaiTypes;


    /**
     * 日志内容
     */
    @ColumnInfo(comment="日志内容",type="longtext")
    @TableField(value = "jiankangrizhi_content")

    private String jiankangrizhiContent;


    /**
     * 所属日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="所属日期",type="date")
    @TableField(value = "suoshuriqi_time")

    private Date suoshuriqiTime;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 所需热量(千卡)
     */
    @ColumnInfo(comment="所需热量(千卡)",type="decimal(10,2)")
    @TableField(value = "reliang")

    private Double reliang;


    /**
     * BMI值
     */
    @ColumnInfo(comment="BMI值",type="decimal(10,2)")
    @TableField(value = "bmi_zhi")

    private Double bmiZhi;


    /**
     * 推荐饭食
     */
    @ColumnInfo(comment="推荐饭食",type="int(11)")
    @TableField(value = "tuijian_types")

    private Integer tuijianTypes;


    /**
     * 创建时间   listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jiankangrizhi{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", jiankangrizhiUuidNumber=" + jiankangrizhiUuidNumber +
            ", jiankangrizhiName=" + jiankangrizhiName +
            ", jiankangrizhiTypes=" + jiankangrizhiTypes +
            ", shuimianTypes=" + shuimianTypes +
            ", yinjiuTypes=" + yinjiuTypes +
            ", xiyanTypes=" + xiyanTypes +
            ", gaoya=" + gaoya +
            ", diya=" + diya +
            ", shengao=" + shengao +
            ", tizhong=" + tizhong +
            ", zhuangtaiTypes=" + zhuangtaiTypes +
            ", jiankangrizhiContent=" + jiankangrizhiContent +
            ", suoshuriqiTime=" + DateUtil.convertString(suoshuriqiTime,"yyyy-MM-dd") +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", reliang=" + reliang +
            ", bmiZhi=" + bmiZhi +
            ", tuijianTypes=" + tuijianTypes +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
