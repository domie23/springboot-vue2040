package com.entity.vo;

import com.entity.NewsEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 新闻
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("news")
public class NewsVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 新闻名称
     */

    @TableField(value = "news_name")
    private String newsName;


    /**
     * 新闻编号
     */

    @TableField(value = "news_uuid_number")
    private String newsUuidNumber;


    /**
     * 新闻照片
     */

    @TableField(value = "news_photo")
    private String newsPhoto;


    /**
     * 新闻视频
     */

    @TableField(value = "news_video")
    private String newsVideo;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 新闻类型
     */

    @TableField(value = "news_types")
    private Integer newsTypes;


    /**
     * 新闻热度
     */

    @TableField(value = "news_clicknum")
    private Integer newsClicknum;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "fabu_time")
    private Date fabuTime;


    /**
     * 新闻详情
     */

    @TableField(value = "news_content")
    private String newsContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "news_delete")
    private Integer newsDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：新闻名称
	 */
    public String getNewsName() {
        return newsName;
    }


    /**
	 * 获取：新闻名称
	 */

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }
    /**
	 * 设置：新闻编号
	 */
    public String getNewsUuidNumber() {
        return newsUuidNumber;
    }


    /**
	 * 获取：新闻编号
	 */

    public void setNewsUuidNumber(String newsUuidNumber) {
        this.newsUuidNumber = newsUuidNumber;
    }
    /**
	 * 设置：新闻照片
	 */
    public String getNewsPhoto() {
        return newsPhoto;
    }


    /**
	 * 获取：新闻照片
	 */

    public void setNewsPhoto(String newsPhoto) {
        this.newsPhoto = newsPhoto;
    }
    /**
	 * 设置：新闻视频
	 */
    public String getNewsVideo() {
        return newsVideo;
    }


    /**
	 * 获取：新闻视频
	 */

    public void setNewsVideo(String newsVideo) {
        this.newsVideo = newsVideo;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：新闻类型
	 */
    public Integer getNewsTypes() {
        return newsTypes;
    }


    /**
	 * 获取：新闻类型
	 */

    public void setNewsTypes(Integer newsTypes) {
        this.newsTypes = newsTypes;
    }
    /**
	 * 设置：新闻热度
	 */
    public Integer getNewsClicknum() {
        return newsClicknum;
    }


    /**
	 * 获取：新闻热度
	 */

    public void setNewsClicknum(Integer newsClicknum) {
        this.newsClicknum = newsClicknum;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getFabuTime() {
        return fabuTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setFabuTime(Date fabuTime) {
        this.fabuTime = fabuTime;
    }
    /**
	 * 设置：新闻详情
	 */
    public String getNewsContent() {
        return newsContent;
    }


    /**
	 * 获取：新闻详情
	 */

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getNewsDelete() {
        return newsDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setNewsDelete(Integer newsDelete) {
        this.newsDelete = newsDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
