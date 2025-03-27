package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.NewsLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 新闻留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("news_liuyan")
public class NewsLiuyanView extends NewsLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 新闻
		/**
		* 新闻名称
		*/

		@ColumnInfo(comment="新闻名称",type="varchar(200)")
		private String newsName;
		/**
		* 新闻编号
		*/

		@ColumnInfo(comment="新闻编号",type="varchar(200)")
		private String newsUuidNumber;
		/**
		* 新闻照片
		*/

		@ColumnInfo(comment="新闻照片",type="varchar(200)")
		private String newsPhoto;
		/**
		* 新闻视频
		*/

		@ColumnInfo(comment="新闻视频",type="varchar(200)")
		private String newsVideo;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 新闻类型
		*/
		@ColumnInfo(comment="新闻类型",type="int(11)")
		private Integer newsTypes;
			/**
			* 新闻类型的值
			*/
			@ColumnInfo(comment="新闻类型的字典表值",type="varchar(200)")
			private String newsValue;
		/**
		* 新闻热度
		*/

		@ColumnInfo(comment="新闻热度",type="int(11)")
		private Integer newsClicknum;
		/**
		* 发布时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="发布时间",type="timestamp")
		private Date fabuTime;
		/**
		* 新闻详情
		*/

		@ColumnInfo(comment="新闻详情",type="longtext")
		private String newsContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer newsDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public NewsLiuyanView() {

	}

	public NewsLiuyanView(NewsLiuyanEntity newsLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, newsLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 新闻

		/**
		* 获取： 新闻名称
		*/
		public String getNewsName() {
			return newsName;
		}
		/**
		* 设置： 新闻名称
		*/
		public void setNewsName(String newsName) {
			this.newsName = newsName;
		}

		/**
		* 获取： 新闻编号
		*/
		public String getNewsUuidNumber() {
			return newsUuidNumber;
		}
		/**
		* 设置： 新闻编号
		*/
		public void setNewsUuidNumber(String newsUuidNumber) {
			this.newsUuidNumber = newsUuidNumber;
		}

		/**
		* 获取： 新闻照片
		*/
		public String getNewsPhoto() {
			return newsPhoto;
		}
		/**
		* 设置： 新闻照片
		*/
		public void setNewsPhoto(String newsPhoto) {
			this.newsPhoto = newsPhoto;
		}

		/**
		* 获取： 新闻视频
		*/
		public String getNewsVideo() {
			return newsVideo;
		}
		/**
		* 设置： 新闻视频
		*/
		public void setNewsVideo(String newsVideo) {
			this.newsVideo = newsVideo;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}
		/**
		* 获取： 新闻类型
		*/
		public Integer getNewsTypes() {
			return newsTypes;
		}
		/**
		* 设置： 新闻类型
		*/
		public void setNewsTypes(Integer newsTypes) {
			this.newsTypes = newsTypes;
		}


			/**
			* 获取： 新闻类型的值
			*/
			public String getNewsValue() {
				return newsValue;
			}
			/**
			* 设置： 新闻类型的值
			*/
			public void setNewsValue(String newsValue) {
				this.newsValue = newsValue;
			}

		/**
		* 获取： 新闻热度
		*/
		public Integer getNewsClicknum() {
			return newsClicknum;
		}
		/**
		* 设置： 新闻热度
		*/
		public void setNewsClicknum(Integer newsClicknum) {
			this.newsClicknum = newsClicknum;
		}

		/**
		* 获取： 发布时间
		*/
		public Date getFabuTime() {
			return fabuTime;
		}
		/**
		* 设置： 发布时间
		*/
		public void setFabuTime(Date fabuTime) {
			this.fabuTime = fabuTime;
		}

		/**
		* 获取： 新闻详情
		*/
		public String getNewsContent() {
			return newsContent;
		}
		/**
		* 设置： 新闻详情
		*/
		public void setNewsContent(String newsContent) {
			this.newsContent = newsContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getNewsDelete() {
			return newsDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setNewsDelete(Integer newsDelete) {
			this.newsDelete = newsDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "NewsLiuyanView{" +
			", newsName=" + newsName +
			", newsUuidNumber=" + newsUuidNumber +
			", newsPhoto=" + newsPhoto +
			", newsVideo=" + newsVideo +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", newsClicknum=" + newsClicknum +
			", fabuTime=" + DateUtil.convertString(fabuTime,"yyyy-MM-dd") +
			", newsContent=" + newsContent +
			", newsDelete=" + newsDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
