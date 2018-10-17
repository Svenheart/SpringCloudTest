package com.example.demo.controller;


import com.example.demo.entity.DishMenu;
import com.example.demo.service.DishManageService;
import com.example.demo.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program:com.lt5.foodmanage.controller
 * @description:
 * @class:DishManageController
 * @author:SanCheng
 * @create:2018-10-16
 **/
@RestController
public class DishManageController {

	private Msg msg=new Msg();

	@Autowired
	private DishManageService dishManageService;

	@RequestMapping(method = RequestMethod.GET,value = "/dish")
	@ResponseBody
	public Msg queryDish(@RequestParam("storeId")int storeId){
		msg=dishManageService.queryDish(storeId);
		return msg;
	}

	@RequestMapping(method = RequestMethod.POST,value = "/dish")
	@ResponseBody
	public Msg addDish(@RequestBody DishMenu dishMenu){
		msg=dishManageService.addDish(dishMenu);
		return msg;
	}

	@RequestMapping(method = RequestMethod.PUT,value = "/dish")
	@ResponseBody
	public Msg updateDish(@RequestBody DishMenu dishMenu){
		msg=dishManageService.updateDish(dishMenu);
		return msg;
	}

	@RequestMapping(method = RequestMethod.DELETE,value = "/dish")
	@ResponseBody
	public Msg queryDish(@RequestBody DishMenu dishMenu){
		msg=dishManageService.deleteDish(dishMenu);
		return msg;
	}
}
