package com.mumu.springboot;

import com.mumu.springboot.bean.AppBean;
import com.mumu.springboot.bean.Vip;
import com.mumu.springboot.dao.VipDao;
import com.mumu.springboot.service.AppService;
import com.mumu.springboot.service.impl.AppServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class SpringbootTest2ApplicationTests {
	@Autowired
	private AppService appService;

	@Autowired
	private AppBean appBean;

	@Test
	void contextLoads() {
	}
}
