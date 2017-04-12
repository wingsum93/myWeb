package com.ericho.fyp.controller;

import java.util.List;

import org.assertj.core.util.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ericho.fyp.dao.ProductRepository;
import com.ericho.fyp.model.Product;
import com.google.gson.Gson;

@RequestMapping("/test")
@Controller
public class TestController {
	Logger log = LoggerFactory.getLogger(TestController.class);
	Gson gs = new Gson();
	@Autowired 
	private ProductRepository productRepository;
	
	@RequestMapping(path="/getAllProduct") // 
	public @ResponseBody String addNewUser () {
		List<Product> list = Lists.newArrayList(productRepository.findAll());
		return gs.toJson(list);
	}
}
