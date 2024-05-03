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


import com.dao.DiscussrexiaojiajuDao;
import com.entity.DiscussrexiaojiajuEntity;
import com.service.DiscussrexiaojiajuService;
import com.entity.vo.DiscussrexiaojiajuVO;
import com.entity.view.DiscussrexiaojiajuView;

@Service("discussrexiaojiajuService")
public class DiscussrexiaojiajuServiceImpl extends ServiceImpl<DiscussrexiaojiajuDao, DiscussrexiaojiajuEntity> implements DiscussrexiaojiajuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussrexiaojiajuEntity> page = this.selectPage(
                new Query<DiscussrexiaojiajuEntity>(params).getPage(),
                new EntityWrapper<DiscussrexiaojiajuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrexiaojiajuEntity> wrapper) {
		  Page<DiscussrexiaojiajuView> page =new Query<DiscussrexiaojiajuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussrexiaojiajuVO> selectListVO(Wrapper<DiscussrexiaojiajuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussrexiaojiajuVO selectVO(Wrapper<DiscussrexiaojiajuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussrexiaojiajuView> selectListView(Wrapper<DiscussrexiaojiajuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussrexiaojiajuView selectView(Wrapper<DiscussrexiaojiajuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
