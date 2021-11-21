package org.springboot.mytest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.zdy.simple.pojo.SimpleBean;

/**
 * @author frankq
 * @date 2021/11/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMytestApplicationTests {

	@Autowired
	private SimpleBean simpleBean;

	@Test
	public void contextLoads() {

		System.out.println(simpleBean);
	}

}
