package com.kh.spring.demo.model.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Dev implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int no;
	private String name;
	private int career;
	private String email;
	private String gender;
	private String[] lang;
	
}
