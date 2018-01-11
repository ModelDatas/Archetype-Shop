package com.archetype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.archetype.commom.pojo.ArchetypeResult;
import com.archetype.pojo.TbItemParam;
import com.archetype.service.ItemParamService;


/**
 * @author CKM-KING
 * @date 2017年12月9日:下午9:10:04
 * <p>describe:</p>
 * <p>context:获得参数</p>
 * @version 1.0.0
 */
@Controller
@RequestMapping("/item/param")
public class ItemParamController {
	
	@Autowired
	private ItemParamService itemParamService;
	
	@RequestMapping("/query/itemcatid/{itemCatId}")
	public @ResponseBody ArchetypeResult 
	getItemParamById(@PathVariable(value="itemCatId") Long itemCatId){
		ArchetypeResult result = itemParamService.getItemParamByCid(itemCatId);
		return  result;
	}
	
	@RequestMapping("/save/{cid}")
	@ResponseBody
	public ArchetypeResult insertItemParam(@PathVariable Long cid, String paramData) {
		//创建pojo对象
		TbItemParam itemParam = new TbItemParam();
		itemParam.setItemCatId(cid);
		itemParam.setParamData(paramData);
		ArchetypeResult result = itemParamService.insertItemParam(itemParam);
		return result;
	}
	
}
