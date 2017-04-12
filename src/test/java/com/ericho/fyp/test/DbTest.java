package com.ericho.fyp.test;

import java.util.List;

import javax.transaction.Transactional;

import org.assertj.core.util.Lists;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ericho.fyp.dao.ProductRepository;
import com.ericho.fyp.model.Product;
import com.google.gson.Gson;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
@Transactional
public class DbTest {
	Logger log = LoggerFactory.getLogger(DbTest.class);
	Gson gs = new Gson();
	@Autowired
	ProductRepository productRepository;
	
	public void test111(){
		List<Product> prods = Lists.newArrayList(productRepository.findAll());
		log.debug(gs.toJson(prods));
	}
}
