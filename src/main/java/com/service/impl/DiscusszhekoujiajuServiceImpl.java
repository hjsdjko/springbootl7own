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


import com.dao.DiscusszhekoujiajuDao;
import com.entity.DiscusszhekoujiajuEntity;
import com.service.DiscusszhekoujiajuService;
import com.entity.vo.DiscusszhekoujiajuVO;
import com.entity.view.DiscusszhekoujiajuView;

@Service("discusszhekoujiajuService")
public class DiscusszhekoujiajuServiceImpl extends ServiceImpl<DiscusszhekoujiajuDao, DiscusszhekoujiajuEntity> implements DiscusszhekoujiajuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhekoujiajuEntity> page = this.selectPage(
                new Query<DiscusszhekoujiajuEntity>(params).getPage(),
                new EntityWrapper<DiscusszhekoujiajuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhekoujiajuEntity> wrapper) {
		  Page<DiscusszhekoujiajuView> page =new Query<DiscusszhekoujiajuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhekoujiajuVO> selectListVO(Wrapper<DiscusszhekoujiajuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhekoujiajuVO selectVO(Wrapper<DiscusszhekoujiajuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhekoujiajuView> selectListView(Wrapper<DiscusszhekoujiajuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhekoujiajuView selectView(Wrapper<DiscusszhekoujiajuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
