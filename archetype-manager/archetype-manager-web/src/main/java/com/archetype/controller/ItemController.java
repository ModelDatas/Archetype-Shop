package com.archetype.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.archetype.commom.pojo.ArchetypeResult;
import com.archetype.commom.pojo.EUDataGridResult;
import com.archetype.pojo.TbItem;
import com.archetype.service.ItemService;

/**
 * @author CKM-KING
 * @date 2017年11月22日:下午3:21:24
 * <p>describe:</p>
 * <p>context:</p>
 * @version 1.0.0
 */
@Controller
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/list")
	public @ResponseBody EUDataGridResult getItemList(Integer page, Integer rows) {
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	
	@RequestMapping("/save")
	public @ResponseBody ArchetypeResult saveItem(TbItem item, String desc) throws Exception {
		//添加商品信息
		itemService.saveItem(item, desc, null);
		return ArchetypeResult.ok();
	}
	
}
