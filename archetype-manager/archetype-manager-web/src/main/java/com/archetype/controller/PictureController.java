package com.archetype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.archetype.commom.pojo.PictureResult;
import com.archetype.service.PictureService;

/**
 * @author CKM-KING
 * @date 2017年11月29日:下午5:30:04
 * <p>describe:</p>
 * <p>context:上传图片</p>
 * @version 1.0.0
 */
@Controller
@RequestMapping("/pic")
public class PictureController {
	
	@Autowired
	private PictureService pictureService;

	@RequestMapping(value = "/upload",produces="application/json;charset=UTF-8")
	@ResponseBody
	public PictureResult uploda(MultipartFile uploadFile) throws Exception {
		//调用service上传图片
		PictureResult pictureResult = pictureService.uploadFile(uploadFile);
		//返回上传结果
		return pictureResult;
		
	}
}
