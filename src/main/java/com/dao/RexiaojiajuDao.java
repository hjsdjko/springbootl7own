package com.dao;

import com.entity.RexiaojiajuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RexiaojiajuVO;
import com.entity.view.RexiaojiajuView;


/**
 * 热销家具
 * 
 * @author 
 * @email 
 * @date 2021-01-15 12:19:26
 */
public interface RexiaojiajuDao extends BaseMapper<RexiaojiajuEntity> {
	
	List<RexiaojiajuVO> selectListVO(@Param("ew") Wrapper<RexiaojiajuEntity> wrapper);
	
	RexiaojiajuVO selectVO(@Param("ew") Wrapper<RexiaojiajuEntity> wrapper);
	
	List<RexiaojiajuView> selectListView(@Param("ew") Wrapper<RexiaojiajuEntity> wrapper);

	List<RexiaojiajuView> selectListView(Pagination page,@Param("ew") Wrapper<RexiaojiajuEntity> wrapper);
	
	RexiaojiajuView selectView(@Param("ew") Wrapper<RexiaojiajuEntity> wrapper);
	
}
