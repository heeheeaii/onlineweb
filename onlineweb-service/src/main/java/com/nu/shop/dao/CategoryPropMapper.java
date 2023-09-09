

package com.nu.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nu.shop.bean.model.CategoryProp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author laoma
 */
public interface CategoryPropMapper extends BaseMapper<CategoryProp> {

	/**
	 * 插入分类属性
	 * @param categoryId
	 * @param propIds
	 */
	void insertCategoryProp(@Param("categoryId") Long categoryId, @Param("propIds") List<Long> propIds);

	/**
	 * 根据分类id删除分类属性
	 * @param categoryId
	 */
	void deleteByCategoryId(Long categoryId);

	/**
	 * 根据属性id删除分类属性
	 * @param propId
	 */
	void deleteByPropId(Long propId);
}
