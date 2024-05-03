package com.entity.view;

import com.entity.DiscusszhekoujiajuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 折扣家具评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-15 12:19:27
 */
@TableName("discusszhekoujiaju")
public class DiscusszhekoujiajuView  extends DiscusszhekoujiajuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhekoujiajuView(){
	}
 
 	public DiscusszhekoujiajuView(DiscusszhekoujiajuEntity discusszhekoujiajuEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhekoujiajuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
