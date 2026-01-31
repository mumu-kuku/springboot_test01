package com.mumu.springboot;

import com.mumu.springboot.bean.Vip;
import com.mumu.springboot.dao.VipDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@MapperScan("com.mumu.springboot.dao")
public class SpringbootTest2Application {

	public static void main(String[] args) {

// 获取Spring上下文
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootTest2Application.class, args);
		// 根据id获取容器中的对象
		VipDao vipDao = applicationContext.getBean("vipDao", VipDao.class);
		Vip vip = vipDao.selectById(1L);
		System.out.println(vip);
		// 关闭Spring上下文
		applicationContext.close();
	}

}
