package com.lj.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lj.service.BuyStockException;
import com.lj.service.BuyStockSerivce;
import com.lj.service.BuyStockServiceImpl;


public class MyTest {
	
	BuyStockSerivce bss;
	
	@Before
	public void before() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/lj/test/applicationContext.xml");
	    bss = (BuyStockSerivce) ac.getBean("myBuyStockService");
	    System.out.println(bss);
	}

	
	@Test
	public void test01() {
		bss.initAccount("wh", 10000);
		bss.initStockGet("刘氏集团", 0);
	}	
	
	//两个事务之间出现exception 那么 很有可能会导致  账号钱被扣  股票却没有买到的情况，  所以需要实现事务的原子性，一个事务失败  所有事务都回滚
	@Test
	public void test02() throws BuyStockException {
		bss.buyStock("wh", 2000, "刘氏集团", 5);
	}
	

}