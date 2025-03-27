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
 * 新闻
 *
 * @author 
 * @email
 */
@TableName("news")
public class NewsEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public NewsEntity() {

	}

	public NewsEntity(T t) {
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
     * 新闻名称
     */
    @ColumnInfo(comment="新闻名称",type="varchar(200)")
    @TableField(value = "news_name")

    private String newsName;


    /**
     * 新闻编号
     */
    @ColumnInfo(comment="新闻编号",type="varchar(200)")
    @TableField(value = "news_uuid_number")

    private String newsUuidNumber;


    /**
     * 新闻照片
     */
    @ColumnInfo(comment="新闻照片",type="varchar(200)")
    @TableField(value = "news_photo")

    private String newsPhoto;


    /**
     * 新闻视频
     */
    @ColumnInfo(comment="新闻视频",type="varchar(200)")
    @TableField(value = "news_video")

    private String newsVideo;


    /**
     * 赞
     */
    @ColumnInfo(comment="赞",type="int(11)")
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @ColumnInfo(comment="踩",type="int(11)")
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 新闻类型
     */
    @ColumnInfo(comment="新闻类型",type="int(11)")
    @TableField(value = "news_types")

    private Integer newsTypes;


    /**
     * 新闻热度
     */
    @ColumnInfo(comment="新闻热度",type="int(11)")
    @TableField(value = "news_clicknum")

    private Integer newsClicknum;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="发布时间",type="timestamp")
    @TableField(value = "fabu_time")

    private Date fabuTime;


    /**
     * 新闻详情
     */
    @ColumnInfo(comment="新闻详情",type="longtext")
    @TableField(value = "news_content")

    private String newsContent;


    /**
     * 是否上架
     */
    @ColumnInfo(comment="是否上架",type="int(11)")
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "news_delete")

    private Integer newsDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：新闻名称
	 */
    public String getNewsName() {
        return newsName;
    }
    /**
	 * 设置：新闻名称
	 */

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }
    /**
	 * 获取：新闻编号
	 */
    public String getNewsUuidNumber() {
        return newsUuidNumber;
    }
    /**
	 * 设置：新闻编号
	 */

    public void setNewsUuidNumber(String newsUuidNumber) {
        this.newsUuidNumber = newsUuidNumber;
    }
    /**
	 * 获取：新闻照片
	 */
    public String getNewsPhoto() {
        return newsPhoto;
    }
    /**
	 * 设置：新闻照片
	 */

    public void setNewsPhoto(String newsPhoto) {
        this.newsPhoto = newsPhoto;
    }
    /**
	 * 获取：新闻视频
	 */
    public String getNewsVideo() {
        return newsVideo;
    }
    /**
	 * 设置：新闻视频
	 */

    public void setNewsVideo(String newsVideo) {
        this.newsVideo = newsVideo;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 设置：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 设置：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：新闻类型
	 */
    public Integer getNewsTypes() {
        return newsTypes;
    }
    /**
	 * 设置：新闻类型
	 */

    public void setNewsTypes(Integer newsTypes) {
        this.newsTypes = newsTypes;
    }
    /**
	 * 获取：新闻热度
	 */
    public Integer getNewsClicknum() {
        return newsClicknum;
    }
    /**
	 * 设置：新闻热度
	 */

    public void setNewsClicknum(Integer newsClicknum) {
        this.newsClicknum = newsClicknum;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getFabuTime() {
        return fabuTime;
    }
    /**
	 * 设置：发布时间
	 */

    public void setFabuTime(Date fabuTime) {
        this.fabuTime = fabuTime;
    }
    /**
	 * 获取：新闻详情
	 */
    public String getNewsContent() {
        return newsContent;
    }
    /**
	 * 设置：新闻详情
	 */

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 设置：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getNewsDelete() {
        return newsDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setNewsDelete(Integer newsDelete) {
        this.newsDelete = newsDelete;
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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "News{" +
            ", id=" + id +
            ", newsName=" + newsName +
            ", newsUuidNumber=" + newsUuidNumber +
            ", newsPhoto=" + newsPhoto +
            ", newsVideo=" + newsVideo +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", newsTypes=" + newsTypes +
            ", newsClicknum=" + newsClicknum +
            ", fabuTime=" + DateUtil.convertString(fabuTime,"yyyy-MM-dd") +
            ", newsContent=" + newsContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", newsDelete=" + newsDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
