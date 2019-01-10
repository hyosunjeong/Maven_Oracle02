package com.biz.oracle.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.biz.oracle.sql.ScoreSQL;
import com.biz.oracle.vo.ScoreVO;

public interface ScoreDao {
	
	/*
	 * CRUD
	 * SELECT => 1.SelectAll 	2.findByNum
	 * INSERT
	 * UPDATE
	 * DELETE
	 */
	
	@Select(ScoreSQL.SC_ALL)
	public List<ScoreVO> SelectAll();
	
	@Select(ScoreSQL.SC_FIND_ID)
	public ScoreVO findById(long id);
	
	@Select(ScoreSQL.SC_FIND_NUM)
	public List<ScoreVO> findByStNum(String st_num);
	
	@Insert(ScoreSQL.SC_INSERT)
	public int Insert(ScoreVO vo);
	
	@Update(ScoreSQL.SC_UPDATE)
	public int Update(ScoreVO vo);
	
	@Delete(ScoreSQL.SC_DELETE)
	public int Delete(long id);
	
	
	// VO로 리턴하는 경우는 PK로 지정된 경우만 가능하다.
	

}
