package com.biz.oracle.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * lombok 플러그인 eclipse에 설치해서 vo클래스에 
 * getter, setter, 생성자, toString 등의 작성을 대신 하도록 만들었다.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class ScoreVO {

	private long id;
	private String st_num;
	private String sc_sb_code;
	private int sc_score;
	
}
