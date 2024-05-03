package com.dao;

import com.entity.ZhekoujiajuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhekoujiajuVO;
import com.entity.view.ZhekoujiajuView;


/**
 * 折扣家具
 * 
 * @author 
 * @email 
 * @date 2021-01-15 12:19:26
 */
public interface ZhekoujiajuDao extends BaseMapper<ZhekoujiajuEntity> {
	
	List<ZhekoujiajuVO> selectListVO(@Param("ew") Wrapper<ZhekoujiajuEntity> wrapper);
	
	ZhekoujiajuVO selectVO(@Param("ew") Wrapper<ZhekoujiajuEntity> wrapper);
	
	List<ZhekoujiajuView> selectListView(@Param("ew") Wrapper<ZhekoujiajuEntity> wrapper);

	List<ZhekoujiajuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhekoujiajuEntity> wrapper);
	
	ZhekoujiajuView selectView(@Param("ew") Wrapper<ZhekoujiajuEntity> wrapper);
	
}
