package com.archetype.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archetype.commom.pojo.ArchetypeResult;
import com.archetype.mapper.TbItemParamMapper;
import com.archetype.pojo.TbItemParam;
import com.archetype.pojo.TbItemParamExample;
import com.archetype.pojo.TbItemParamExample.Criteria;
import com.archetype.pojo.TbItemParamItem;
import com.archetype.service.ItemParamService;

/**
 * @author CKM-KING
 * @date 2017年12月9日:下午8:50:39
 * <p>describe:</p>
 * <p>context:</p>
 * @version 1.0.0
 */
@Service
public class ItemParamServiceImpl implements ItemParamService{

	@Autowired
	private TbItemParamMapper itemParamMapper;
	
	
	@Override
	public ArchetypeResult getItemParamByCid(long cid) {
		TbItemParamExample example = new TbItemParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andItemCatIdEqualTo(cid);
		List<TbItemParam> list = itemParamMapper.selectByExampleWithBLOBs(example);
		//判断是否查询到结果
		if (list != null && list.size() > 0) {
			return ArchetypeResult.ok(list.get(0));
		}
		
		return ArchetypeResult.ok();
	}


	@Override
	public ArchetypeResult insertItemParam(TbItemParam itemParam) {
		//补全pojo
		itemParam.setCreated(new Date());
		itemParam.setUpdated(new Date());
		//插入到规格参数模板表
		itemParamMapper.insert(itemParam);
		return ArchetypeResult.ok();
	}

	
	
}
