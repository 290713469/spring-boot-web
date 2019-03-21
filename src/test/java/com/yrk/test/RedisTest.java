package com.yrk.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yrk.domain.User;
import com.yrk.redis.UserRedis;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {

	
	private static Logger logger = LoggerFactory.getLogger(RedisTest.class);
	
	@Autowired
	private UserRedis userRedis;
	
	
	@Test
	public void add() {
		User u = new User();
		u.setId("user1");
		u.setName("username1");
		System.out.print("key= " + this.getClass().getName()+":userByName"+u.getName());
		userRedis.add(this.getClass().getName()+":userByName"+u.getName(), 10L, u);
	}
}
