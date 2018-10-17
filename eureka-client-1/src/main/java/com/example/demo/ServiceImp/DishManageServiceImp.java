package com.example.demo.ServiceImp;

import com.alibaba.fastjson.JSON;
import com.example.demo.dao.DishManageDao;
import com.example.demo.entity.DishMenu;
import com.example.demo.service.DishManageService;
import com.example.demo.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program:com.lt5.foodmanage.ServiceImp
 * @description:
 * @class:DishManageServiceImp
 * @author:SanCheng
 * @create:2018-10-16
 **/
@Service
public class DishManageServiceImp implements DishManageService {

	private Msg msg=new Msg();

	@Autowired
	private DishManageDao dishManageDao;
	@Autowired
	protected RedisTemplate<String,String> redisTemplate;

	@Override
	public Msg addDish(DishMenu dishMenu) {
		try {
			dishManageDao.addDish(dishMenu);
			msg.setDataBody("添加菜品成功！");
		}catch(Exception e){
			msg.setStatus(0);
			msg.setDataBody("添加菜品失败！");
			msg.setErrorTip("");
		}
		msg.setStatus(1);
		msg.setErrorTip("");
		return msg;
	}

	@Override
	public Msg deleteDish(DishMenu dishMenu) {
		try{
			dishManageDao.deleteDish(dishMenu);
			msg.setDataBody("删除菜品成功！");
		}catch (Exception e){
			msg.setStatus(0);
			msg.setDataBody("删除菜品失败！");
			msg.setErrorTip("");
			return msg;
		}
		msg.setStatus(1);
		msg.setErrorTip("");
		return msg;
	}

	@Override
	public Msg queryDish(int storeId) {
		try{
			String data=redisTemplate.opsForValue().get(String.valueOf(storeId));
			if(data==null){
				List<DishMenu> dishMenuList=dishManageDao.queryDish(storeId);
				data=JSON.toJSONString(dishMenuList);
				redisTemplate.opsForValue().set(String.valueOf(storeId),data);
			}
			msg.setDataBody(data);
		}catch (Exception e){
			msg.setStatus(0);
			msg.setDataBody("查询菜品失败！");
			msg.setErrorTip("");
			return msg;
		}
		msg.setStatus(1);
		msg.setErrorTip("");
		return msg;
	}

	@Override
	public Msg updateDish(DishMenu dishMenu) {
		try{
			dishManageDao.updateDish(dishMenu);
			msg.setDataBody("更新菜品成功！");
		}catch (Exception e){
			msg.setStatus(0);
			msg.setDataBody("更新菜品失败！");
			msg.setErrorTip("");
			return msg;
		}
		msg.setStatus(1);
		msg.setErrorTip("");
		return msg;
	}
}
