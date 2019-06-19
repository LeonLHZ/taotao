package com.taotao.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.utils.JsonUtils;

@Controller
public class PictureController {
	@Value("${IMAGE_SERVER_URL}")
	private String IMAGE_SERVER_URL;
	
	
	@RequestMapping("/pic/upload")
	@ResponseBody
	public String picUpload(MultipartFile uploadFile) {
		try {
		String fileStr = uploadFile.getOriginalFilename();
	
		String newFileStr = UUID.randomUUID()+uploadFile.getOriginalFilename().substring(fileStr.lastIndexOf("."));
		String url=IMAGE_SERVER_URL+newFileStr;
		Map result = new HashMap<>();
			
				uploadFile.transferTo(new File("D://img//"+newFileStr));
				result.put("url", url);
				System.out.println(url);
				result.put("error", 0);
				return JsonUtils.objectToJson(result);
			} catch (Exception e) {
				e.printStackTrace();
				Map result = new HashMap<>();
				result.put("error", 1);
				result.put("message", "图片上传失败");
			return JsonUtils.objectToJson(result);
			}
		
	}

}
