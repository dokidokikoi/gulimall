package com.harukaze.shop.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.harukaze.common.valid.AddGroup;
import com.harukaze.common.valid.UpdateGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author harukaze
 * @email harukaze_doki@163.com
 * @date 2022-04-10 12:23:33
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@NotNull(message = "修改，id不能为空", groups = UpdateGroup.class)
	@Null(message = "新增，id必须为空", groups = AddGroup.class)
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名不能为空")
	private String name;
	/**
	 * 品牌logo地址
	 */
	@URL(message = "logo必须是一个合法的url地址")
	@NotBlank
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@NotNull
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]$", message = "检索首字母必须为一个字母")
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull
	@Min(value = 0, message = "排序不能小于0")
	private Integer sort;

}
