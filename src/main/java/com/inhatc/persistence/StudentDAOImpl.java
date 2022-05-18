package com.inhatc.persistence;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.StudentVO;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.StudentInfoMapper";

	@Override
	public void insertStudent(StudentVO vo) {
		sqlSession.insert(namespace + ".inserStudent", vo);
	}

	@Override
	public StudentVO readStudent(String studentno) throws Exception {
		return (StudentVO) sqlSession.selectOne(namespace + ".selectStudent", studentno);
	}

	@Override
	public void update(StudentVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);
	}

	@Override
	public List<StudentVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".selectAll");
	}

	@Override
	public void delete(String studentno) throws Exception {
		sqlSession.update(namespace + ".delete", studentno);
	}

	@Override
	public int listCount() throws Exception {
		return sqlSession.selectOne(namespace + ".listCount");
	}
}
