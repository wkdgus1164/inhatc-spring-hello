package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentVO;

public interface StudentDAO {
	public void insertStudent(StudentVO vo);

	public StudentVO readStudent(String userid) throws Exception;

	public void update(StudentVO vo) throws Exception;

	public List<StudentVO> listAll() throws Exception;

	public void delete(String userid) throws Exception;

	public int listCount() throws Exception;
}
