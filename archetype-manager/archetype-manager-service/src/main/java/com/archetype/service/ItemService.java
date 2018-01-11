package com.archetype.service;

import com.archetype.commom.pojo.ArchetypeResult;
import com.archetype.commom.pojo.EUDataGridResult;
import com.archetype.pojo.TbItem;



/**
 * @author CKM-KING
 * @date 2017年11月20日:下午7:59:21
 * <p>describe:</p>
 * <p>context:</p>
 * @version 1.0.0
 */
public interface ItemService {
	
	
	/**
	 * @autor CKM-KING
	 * @date 2017年11月20日:下午8:18:08
	 * @getItemById:ItemService
	 * <p>describe:</p>
	 * <p>context:获取商品数据</p>
	 * @package com.archetype.service
	 * @version SnapShot1.0.0
	 * @return EUDataGridResult
	 */
	public EUDataGridResult getItemList(int page, int rows);	
	
	/**
	 * @autor CKM-KING
	 * @date 2017年11月30日:下午1:24:27
	 * @saveItem:ItemService
	 * <p>describe:</p>
	 * <p>context:添加商品</p>
	 * @package com.archetype.service
	 * @version 1.0.0
	 * @return void
	 * @throws Exception 
	 */
	public ArchetypeResult saveItem(TbItem item, String desc, String itemParams) throws Exception;
}
