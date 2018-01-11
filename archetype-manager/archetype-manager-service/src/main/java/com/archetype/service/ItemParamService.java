package com.archetype.service;

import com.archetype.commom.pojo.ArchetypeResult;
import com.archetype.pojo.TbItemParam;

/**
 * @author CKM-KING
 * @date 2017年12月9日:下午8:45:15
 * <p>describe:</p>
 * <p>context:类目参数</p>
 * @version 1.0.0
 */
public interface ItemParamService {
	
	/**
	 * @autor CKM-KING
	 * @date 2017年12月9日:下午8:46:59
	 * @getItemParamByCid:ItemParamService
	 * <p>describe:</p>
	 * <p>context:根据cid获得类目参数</p>
	 * @package com.archetype.service
	 * @version 1.0.0
	 * @return ArchetypeResult
	 */
	ArchetypeResult getItemParamByCid(long id);
	
	/**
	 * @autor CKM-KING
	 * @date 2017年12月10日:下午4:26:26
	 * @insertItemParam:ItemParamService
	 * <p>describe:</p>
	 * <p>context:添加类目参数</p>
	 * @package com.archetype.service
	 * @version 1.0.0
	 * @return ArchetypeResult
	 */
	ArchetypeResult insertItemParam(TbItemParam itemParam) ;
}
