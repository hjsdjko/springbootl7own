package com.dao;

import com.entity.DiscussrexiaojiajuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussrexiaojiajuVO;
import com.entity.view.DiscussrexiaojiajuView;


/**
 * 热销家具评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-15 12:19:27
 */
public interface DiscussrexiaojiajuDao extends BaseMapper<DiscussrexiaojiajuEntity> {
	
	List<DiscussrexiaojiajuVO> selectListVO(@Param("ew") Wrapper<DiscussrexiaojiajuEntity> wrapper);
	
	DiscussrexiaojiajuVO selectVO(@Param("ew") Wrapper<DiscussrexiaojiajuEntity> wrapper);
	
	List<DiscussrexiaojiajuView> selectListView(@Param("ew") Wrapper<DiscussrexiaojiajuEntity> wrapper);

	List<DiscussrexiaojiajuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussrexiaojiajuEntity> wrapper);
	
	DiscussrexiaojiajuView selectView(@Param("ew") Wrapper<DiscussrexiaojiajuEntity> wrapper);
	
}
