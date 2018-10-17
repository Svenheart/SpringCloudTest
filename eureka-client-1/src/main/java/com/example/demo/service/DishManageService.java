package com.example.demo.service;

import com.example.demo.entity.DishMenu;
import com.example.demo.util.Msg;


/**
 * @program:com.lt5.foodmanage.service
 * @description:
 * @class:DishManageService
 * @author:SanCheng
 * @create:2018-10-16
 **/
public interface DishManageService {
	Msg addDish(DishMenu dishMenu);
	Msg deleteDish(DishMenu dishMenu);
	Msg queryDish(int storeId);
	Msg updateDish(DishMenu dishMenu);
}
