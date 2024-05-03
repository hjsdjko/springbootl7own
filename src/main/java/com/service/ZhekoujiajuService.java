package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhekoujiajuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhekoujiajuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhekoujiajuView;


/**
 * 折扣家具
 *
 * @author 
 * @email 
 * @date 2021-01-15 12:19:26
 */
public interface ZhekoujiajuService extends IService<ZhekoujiajuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhekoujiajuVO> selectListVO(Wrapper<ZhekoujiajuEntity> wrapper);
   	
   	ZhekoujiajuVO selectVO(@Param("ew") Wrapper<ZhekoujiajuEntity> wrapper);
   	
   	List<ZhekoujiajuView> selectListView(Wrapper<ZhekoujiajuEntity> wrapper);
   	
   	ZhekoujiajuView selectView(@Param("ew") Wrapper<ZhekoujiajuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhekoujiajuEntity> wrapper);
   	
}

