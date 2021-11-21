package org.springboot.mytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.zdy.simple.config.EnableRegisterServer;

/**
 * @author frankq
 * @date 2021/11/21
 */
@SpringBootApplication //标注在类上说明这个类是`SpringBoot`的主配置类
@ConfigurationPropertiesScan
@EnableRegisterServer
public class SpringBootMytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMytestApplication.class, args);
	}

}
