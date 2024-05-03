package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RexiaojiajuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RexiaojiajuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RexiaojiajuView;


/**
 * 热销家具
 *
 * @author 
 * @email 
 * @date 2021-01-15 12:19:26
 */
public interface RexiaojiajuService extends IService<RexiaojiajuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RexiaojiajuVO> selectListVO(Wrapper<RexiaojiajuEntity> wrapper);
   	
   	RexiaojiajuVO selectVO(@Param("ew") Wrapper<RexiaojiajuEntity> wrapper);
   	
   	List<RexiaojiajuView> selectListView(Wrapper<RexiaojiajuEntity> wrapper);
   	
   	RexiaojiajuView selectView(@Param("ew") Wrapper<RexiaojiajuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RexiaojiajuEntity> wrapper);
   	
}

