

package com.nu.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nu.shop.bean.model.IndexImg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author laoma
 */
public interface IndexImgMapper extends BaseMapper<IndexImg> {

	/**
	 * 根据id列表删除图片
	 * @param ids
	 */
	void deleteIndexImgByIds(@Param("ids") Long[] ids);

	/**
	 * 获取图片列表
	 * @return
	 */
	List<IndexImg> listIndexImg();
}
