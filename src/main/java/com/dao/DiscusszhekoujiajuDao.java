package com.dao;

import com.entity.DiscusszhekoujiajuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhekoujiajuVO;
import com.entity.view.DiscusszhekoujiajuView;


/**
 * 折扣家具评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-15 12:19:27
 */
public interface DiscusszhekoujiajuDao extends BaseMapper<DiscusszhekoujiajuEntity> {
	
	List<DiscusszhekoujiajuVO> selectListVO(@Param("ew") Wrapper<DiscusszhekoujiajuEntity> wrapper);
	
	DiscusszhekoujiajuVO selectVO(@Param("ew") Wrapper<DiscusszhekoujiajuEntity> wrapper);
	
	List<DiscusszhekoujiajuView> selectListView(@Param("ew") Wrapper<DiscusszhekoujiajuEntity> wrapper);

	List<DiscusszhekoujiajuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhekoujiajuEntity> wrapper);
	
	DiscusszhekoujiajuView selectView(@Param("ew") Wrapper<DiscusszhekoujiajuEntity> wrapper);
	
}
