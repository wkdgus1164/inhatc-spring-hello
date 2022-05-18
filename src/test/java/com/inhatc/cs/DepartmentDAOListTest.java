package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.persistence.DepartmentDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class DepartmentDAOListTest {
	@Inject
	private DepartmentDAO dao;

	@Test
	public void testListCount() throws Exception {
		System.out.println("데이터 수 : " + dao.listCount());
	}

	@Test
	public void testListAll() throws Exception {
		System.out.println(dao.listAll());
	}
}
