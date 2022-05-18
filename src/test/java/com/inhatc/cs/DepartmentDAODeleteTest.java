package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.persistence.DepartmentDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class DepartmentDAODeleteTest {
	@Inject
	private DepartmentDAO dao;
	
	@Test
	public void testDeleteMember() throws Exception {
		dao.delete("Ã¹ ¹øÂ°");
	}
}
