package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussrexiaojiajuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussrexiaojiajuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussrexiaojiajuView;


/**
 * 热销家具评论表
 *
 * @author 
 * @email 
 * @date 2021-01-15 12:19:27
 */
public interface DiscussrexiaojiajuService extends IService<DiscussrexiaojiajuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrexiaojiajuVO> selectListVO(Wrapper<DiscussrexiaojiajuEntity> wrapper);
   	
   	DiscussrexiaojiajuVO selectVO(@Param("ew") Wrapper<DiscussrexiaojiajuEntity> wrapper);
   	
   	List<DiscussrexiaojiajuView> selectListView(Wrapper<DiscussrexiaojiajuEntity> wrapper);
   	
   	DiscussrexiaojiajuView selectView(@Param("ew") Wrapper<DiscussrexiaojiajuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussrexiaojiajuEntity> wrapper);
   	
}

