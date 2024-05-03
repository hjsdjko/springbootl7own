package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhekoujiajuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhekoujiajuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhekoujiajuView;


/**
 * 折扣家具评论表
 *
 * @author 
 * @email 
 * @date 2021-01-15 12:19:27
 */
public interface DiscusszhekoujiajuService extends IService<DiscusszhekoujiajuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhekoujiajuVO> selectListVO(Wrapper<DiscusszhekoujiajuEntity> wrapper);
   	
   	DiscusszhekoujiajuVO selectVO(@Param("ew") Wrapper<DiscusszhekoujiajuEntity> wrapper);
   	
   	List<DiscusszhekoujiajuView> selectListView(Wrapper<DiscusszhekoujiajuEntity> wrapper);
   	
   	DiscusszhekoujiajuView selectView(@Param("ew") Wrapper<DiscusszhekoujiajuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhekoujiajuEntity> wrapper);
   	
}

