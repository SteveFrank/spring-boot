package org.zdy.simple.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author frankq
 * @date 2021/11/21
 */
@EnableConfigurationProperties(SimpleBean.class)
@ConfigurationProperties(prefix = "simplebean")
public class SimpleBean {

	private long id;
	private String name;

	public SimpleBean() {
	}

	public SimpleBean(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SimpleBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
