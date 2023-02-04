package com.simple.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.simple.basic.mapper.TestMapper;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class) //junit으로 테스트 환경 구성
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //동작시킬 스프링 설정파일 (전체 경로)
public class JDBCMyBatis {
	
	@Autowired
	SqlSessionFactoryBean SqlSessionFactory;
	
	@Autowired
	TestMapper testMapper;
	
	@Test
	public void testCode01() {
		System.out.println(SqlSessionFactory);
	}
	
	@Test
	public void testCode02() {
		String time = testMapper.getTime();
		System.out.println(time);
	}
	
}
