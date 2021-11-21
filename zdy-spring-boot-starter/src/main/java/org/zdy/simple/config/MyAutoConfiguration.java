package org.zdy.simple.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zdy.simple.pojo.SimpleBean;

/**
 * @author frankq
 * @date 2021/11/21
 */
@Configuration
public class MyAutoConfiguration {

	@Bean
	public SimpleBean simpleBean() {
		return new SimpleBean();
	}

}
