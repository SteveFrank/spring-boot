package org.springboot.mytest.pojo;

import org.springframework.stereotype.Component;

/**
 * @author frankq
 * @date 2021/11/21
 */
@Component
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
}
