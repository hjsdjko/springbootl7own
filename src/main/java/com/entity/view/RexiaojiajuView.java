package com.entity.view;

import com.entity.RexiaojiajuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热销家具
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-15 12:19:26
 */
@TableName("rexiaojiaju")
public class RexiaojiajuView  extends RexiaojiajuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RexiaojiajuView(){
	}
 
 	public RexiaojiajuView(RexiaojiajuEntity rexiaojiajuEntity){
 	try {
			BeanUtils.copyProperties(this, rexiaojiajuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
