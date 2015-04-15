/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.github.kgit.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 统一定义id的entity基类.
 * 
 * 基类统一定义id的属性名称、数据类型、列名映射及生成策略.
 *
 */
// JPA 基类的标识
@MappedSuperclass
public abstract class BaseEntity {

	protected String id;

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
