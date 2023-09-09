

package com.nu.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nu.shop.bean.model.AttachFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author laoma
 * Created by lgh on 2022/07/27.
 */
public interface AttachFileService extends IService<AttachFile> {

	/**
	 * 上传文件到本地
	 * @param file
	 * @throws IOException e
	 * @return
	 */
	String uploadFile(MultipartFile file) throws IOException;

	/**
	 * 删除文件
	 * @param fileName 文件名称
	 */
	void deleteFile(String fileName);
}
