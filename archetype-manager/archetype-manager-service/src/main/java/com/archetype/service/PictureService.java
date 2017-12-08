package com.archetype.service;

import org.springframework.web.multipart.MultipartFile;

import com.archetype.commom.pojo.PictureResult;

/**
 * @author CKM-KING
 * @date 2017年11月29日:下午1:48:24
 * <p>describe:</p>
 * <p>context:图片上传</p>
 * @version 1.0.0
 */
public interface PictureService {
	public PictureResult uploadFile(MultipartFile uploadFile); 
}
