package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.DepartmentVO;
import com.inhatc.persistence.DepartmentDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class DepartmentDAOUpdateTest {
	@Inject
	private DepartmentDAO dao;

	@Test
	public void testUpdateDepartment() throws Exception {
		DepartmentVO vo = new DepartmentVO();
		vo.setDepartment_id("두 번째");
		vo.setDepartment_name("수정한 학과 2");
		vo.setCount(11);
		vo.setYunhan(11111);
		dao.update(vo);
	}
}
