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
public class StudentDAOTest {
	@Inject
	private StudentDAO dao;

	@Test
	public void testInsertStudent() throws Exception {
		StudentVO vo = new StudentVO();
		vo.setStudentname("ȫ�浿");
		vo.setPhone("010-5361-7642");
		vo.setAddress("��õ�� ���� ���Ϸ� 100");
		vo.setEmail("test@gmail.com");
		dao.insertStudent(vo);
	}
}
