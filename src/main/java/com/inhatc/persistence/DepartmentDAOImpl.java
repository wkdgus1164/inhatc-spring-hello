package com.inhatc.persistence;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.DepartmentVO;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.Department201844035Mapper";

	@Override
	public void insertDepartment(DepartmentVO vo) {
		sqlSession.insert(namespace + ".inserDepartment", vo);

	}

	@Override
	public DepartmentVO readDepartment(String department_id) throws Exception {
		return (DepartmentVO) sqlSession.selectOne(namespace + ".selectDepartment", department_id);
	}

	@Override
	public void update(DepartmentVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);

	}

	@Override
	public List<DepartmentVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".selectAll");
	}

	@Override
	public void delete(String department_id) throws Exception {
		sqlSession.update(namespace + ".delete", department_id);

	}

	@Override
	public int listCount() throws Exception {
		return sqlSession.selectOne(namespace + ".listCount");
	}
}
