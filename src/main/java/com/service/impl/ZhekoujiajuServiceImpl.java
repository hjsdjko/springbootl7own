package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhekoujiajuDao;
import com.entity.ZhekoujiajuEntity;
import com.service.ZhekoujiajuService;
import com.entity.vo.ZhekoujiajuVO;
import com.entity.view.ZhekoujiajuView;

@Service("zhekoujiajuService")
public class ZhekoujiajuServiceImpl extends ServiceImpl<ZhekoujiajuDao, ZhekoujiajuEntity> implements ZhekoujiajuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhekoujiajuEntity> page = this.selectPage(
                new Query<ZhekoujiajuEntity>(params).getPage(),
                new EntityWrapper<ZhekoujiajuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhekoujiajuEntity> wrapper) {
		  Page<ZhekoujiajuView> page =new Query<ZhekoujiajuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhekoujiajuVO> selectListVO(Wrapper<ZhekoujiajuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhekoujiajuVO selectVO(Wrapper<ZhekoujiajuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhekoujiajuView> selectListView(Wrapper<ZhekoujiajuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhekoujiajuView selectView(Wrapper<ZhekoujiajuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
