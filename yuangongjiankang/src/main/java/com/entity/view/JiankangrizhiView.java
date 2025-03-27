package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.JiankangrizhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 健康日志
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("jiankangrizhi")
public class JiankangrizhiView extends JiankangrizhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 健康日志类型的值
	*/
	@ColumnInfo(comment="健康日志类型的字典表值",type="varchar(200)")
	private String jiankangrizhiValue;
	/**
	* 睡眠情况的值
	*/
	@ColumnInfo(comment="睡眠情况的字典表值",type="varchar(200)")
	private String shuimianValue;
	/**
	* 饮酒的值
	*/
	@ColumnInfo(comment="饮酒的字典表值",type="varchar(200)")
	private String yinjiuValue;
	/**
	* 吸烟的值
	*/
	@ColumnInfo(comment="吸烟的字典表值",type="varchar(200)")
	private String xiyanValue;
	/**
	* 状态的值
	*/
	@ColumnInfo(comment="状态的字典表值",type="varchar(200)")
	private String zhuangtaiValue;
	/**
	* 推荐饭食的值
	*/
	@ColumnInfo(comment="推荐饭食的字典表值",type="varchar(200)")
	private String tuijianValue;

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



	public JiankangrizhiView() {

	}

	public JiankangrizhiView(JiankangrizhiEntity jiankangrizhiEntity) {
		try {
			BeanUtils.copyProperties(this, jiankangrizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 健康日志类型的值
	*/
	public String getJiankangrizhiValue() {
		return jiankangrizhiValue;
	}
	/**
	* 设置： 健康日志类型的值
	*/
	public void setJiankangrizhiValue(String jiankangrizhiValue) {
		this.jiankangrizhiValue = jiankangrizhiValue;
	}
	//当前表的
	/**
	* 获取： 睡眠情况的值
	*/
	public String getShuimianValue() {
		return shuimianValue;
	}
	/**
	* 设置： 睡眠情况的值
	*/
	public void setShuimianValue(String shuimianValue) {
		this.shuimianValue = shuimianValue;
	}
	//当前表的
	/**
	* 获取： 饮酒的值
	*/
	public String getYinjiuValue() {
		return yinjiuValue;
	}
	/**
	* 设置： 饮酒的值
	*/
	public void setYinjiuValue(String yinjiuValue) {
		this.yinjiuValue = yinjiuValue;
	}
	//当前表的
	/**
	* 获取： 吸烟的值
	*/
	public String getXiyanValue() {
		return xiyanValue;
	}
	/**
	* 设置： 吸烟的值
	*/
	public void setXiyanValue(String xiyanValue) {
		this.xiyanValue = xiyanValue;
	}
	//当前表的
	/**
	* 获取： 状态的值
	*/
	public String getZhuangtaiValue() {
		return zhuangtaiValue;
	}
	/**
	* 设置： 状态的值
	*/
	public void setZhuangtaiValue(String zhuangtaiValue) {
		this.zhuangtaiValue = zhuangtaiValue;
	}
	//当前表的
	/**
	* 获取： 推荐饭食的值
	*/
	public String getTuijianValue() {
		return tuijianValue;
	}
	/**
	* 设置： 推荐饭食的值
	*/
	public void setTuijianValue(String tuijianValue) {
		this.tuijianValue = tuijianValue;
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
		return "JiankangrizhiView{" +
			", jiankangrizhiValue=" + jiankangrizhiValue +
			", shuimianValue=" + shuimianValue +
			", yinjiuValue=" + yinjiuValue +
			", xiyanValue=" + xiyanValue +
			", zhuangtaiValue=" + zhuangtaiValue +
			", tuijianValue=" + tuijianValue +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
