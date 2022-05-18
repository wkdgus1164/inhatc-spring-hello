package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.StudentVO;
import com.inhatc.persistence.StudentDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class StudentDAOUpdateTest {
	@Inject
	private StudentDAO dao;
	
	@Test
	public void testUpdateStudent() throws Exception {
		StudentVO vo = new StudentVO();
		vo.setStudentname("全辨悼");
		vo.setPhone("010-1234-5678");
		vo.setAddress("诀单捞飘等 林家");
		vo.setEmail("update@gmail.com");
		dao.update(vo);
	}
}
