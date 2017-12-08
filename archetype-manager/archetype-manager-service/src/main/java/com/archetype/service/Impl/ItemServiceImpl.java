package com.archetype.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.archetype.commom.pojo.ArchetypeResult;
import com.archetype.commom.pojo.EUDataGridResult;
import com.archetype.commom.utils.IDUtils;
import com.archetype.mapper.TbItemDescMapper;
import com.archetype.mapper.TbItemMapper;
import com.archetype.pojo.TbItem;
import com.archetype.pojo.TbItemDesc;
import com.archetype.pojo.TbItemExample;
import com.archetype.pojo.TbItemExample.Criteria;
import com.archetype.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @author CKM-KING
 * @date 2017年11月20日:下午8:18:22
 * <p>describe:</p>
 * <p>context:</p>
 * @version 1.0.0
 */
@Service
public class ItemServiceImpl implements ItemService{

	@Autowired		
	private TbItemMapper itemMapper;
	@Autowired		
	private TbItemDescMapper itemDescMapper;
	
	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		//查询商品列表
		TbItemExample example = new TbItemExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		//创建一个返回值对象
		EUDataGridResult result = new EUDataGridResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

	@Override
	public ArchetypeResult saveItem(TbItem item, String desc, String itemParams) throws Exception {
		Date date = new Date();
		//获得商品id
		long id = IDUtils.genItemId();
		//添加商品信息
		item.setId(id);
		//商品状态，1-正常，2-下架，3-删除
		item.setStatus((byte) 1);
		item.setCreated(date);
		item.setUpdated(date);
		itemMapper.insert(item);
		//添加商品描述
		//创建TbItemDesc对象
		TbItemDesc itemDesc = new TbItemDesc();
		//获得一个商品id
		itemDesc.setItemId(id);
		itemDesc.setItemDesc(desc);
		itemDesc.setCreated(date);
		itemDesc.setUpdated(date);
		//插入数据
		itemDescMapper.insert(itemDesc);
		return	ArchetypeResult.ok();
	}
	
	

}
