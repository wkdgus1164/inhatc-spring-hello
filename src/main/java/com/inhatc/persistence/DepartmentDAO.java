package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.DepartmentVO;

public interface DepartmentDAO {
	public void insertDepartment(DepartmentVO vo);

	public DepartmentVO readDepartment(String department_id) throws Exception;

	public void update(DepartmentVO vo) throws Exception;

	public List<DepartmentVO> listAll() throws Exception;

	public void delete(String department_id) throws Exception;

	public int listCount() throws Exception;
}
