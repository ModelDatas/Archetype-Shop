package com.archetype.service;

import java.util.List;

import com.archetype.commom.pojo.EUTreeNode;
import com.archetype.pojo.TbItemCat;

/**
 * @author CKM-KING
 * @date 2017年11月24日:下午2:50:38
 * <p>describe:</p>
 * <p>context:</p>
 * @version 1.0.0
 */
public interface ItemCatService {

	/**
	 * @autor CKM-KING
	 * @date 2017年11月24日:下午2:50:52
	 * @getItemCatList:ItemCatService
	 * <p>describe:</p>
	 * <p>context:</p>
	 * @package com.archetype.service
	 * @version 1.0.0
	 * @return List<?>
	 */
	public List<EUTreeNode> getCatList(long parentId);
}
