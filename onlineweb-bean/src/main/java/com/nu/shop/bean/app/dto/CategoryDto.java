

package com.nu.shop.bean.app.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nu.shop.common.serializer.json.ImgJsonSerializer;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author laoma
 */
@Data
public class CategoryDto {

	@Schema(description = "分类id" ,required=true)
	private Long categoryId;

	@Schema(description = "分类父id" ,required=true)
	private Long parentId;

	@Schema(description = "分类名称" ,required=true)
	private String categoryName;

	@Schema(description = "分类图片" ,required=true)
	@JsonSerialize(using = ImgJsonSerializer.class)
	private String pic;

}
