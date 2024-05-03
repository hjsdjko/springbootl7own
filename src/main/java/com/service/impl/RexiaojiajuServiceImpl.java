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


import com.dao.RexiaojiajuDao;
import com.entity.RexiaojiajuEntity;
import com.service.RexiaojiajuService;
import com.entity.vo.RexiaojiajuVO;
import com.entity.view.RexiaojiajuView;

@Service("rexiaojiajuService")
public class RexiaojiajuServiceImpl extends ServiceImpl<RexiaojiajuDao, RexiaojiajuEntity> implements RexiaojiajuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RexiaojiajuEntity> page = this.selectPage(
                new Query<RexiaojiajuEntity>(params).getPage(),
                new EntityWrapper<RexiaojiajuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RexiaojiajuEntity> wrapper) {
		  Page<RexiaojiajuView> page =new Query<RexiaojiajuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RexiaojiajuVO> selectListVO(Wrapper<RexiaojiajuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RexiaojiajuVO selectVO(Wrapper<RexiaojiajuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RexiaojiajuView> selectListView(Wrapper<RexiaojiajuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RexiaojiajuView selectView(Wrapper<RexiaojiajuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
