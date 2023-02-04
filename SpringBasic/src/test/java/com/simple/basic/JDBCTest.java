package com.simple.basic;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class) //junit으로 테스트 환경 구성
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml") //동작시킬 스프링 설정파일 (전체 경로)
public class JDBCTest {
	
//	@BeforeClass //해당 클래스에서 단 한 번 실행 - static
//	public static void loadTest() {
//		System.out.println("beforeClass 실행");
//	}
	
//	@Before //각 테스트 코드 실행 전 우선 실행됨
//	public void testCode00() {
//		System.out.println("before 실행");
//	}
	
	@Autowired
	DataSource source;
	
	@Test //테스트 코드로 실행
	public void testCode01() {
		try {
			//DataSource에서 conn 객체 얻기
			Connection conn = source.getConnection();
			System.out.println(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
