package com.simple.score.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository
public class ScoreDAOImpl implements ScoreDAO {

	@Autowired
	private DataSource source;

	@Override
	public void regist(ScoreVO vo) {

		String sql = "insert into score(name, kor, eng) values(?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = source.getConnection();

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getKor());
			pstmt.setString(3, vo.getEng());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	@Override
	public ArrayList<ScoreVO> getList() {

		ArrayList<ScoreVO> list = new ArrayList<ScoreVO>();
		String sql = "select * from score order by num asc";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = source.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			//ORM - Object Relational Mapping
			while(rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setNum(rs.getInt("num"));
				vo.setName(rs.getString("name"));
				vo.setKor(rs.getString("kor"));
				vo.setEng(rs.getString("eng"));

				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	@Override
	public void delete(int num) {
		
		//삭제 기능 - 화면에 key를 넘기도록 변경
		String sql = "delete from score where num = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = source.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	//	//데이터베이스역할(임의)
	//	ArrayList<ScoreVO> list = new ArrayList<ScoreVO>();
	//	
	//	@Override
	//	public void regist(ScoreVO vo) {
	//		
	//		
	//		
	//		list.add(vo);
	//		System.out.println(list.toString());
	//	}
	//
	//	@Override
	//	public ArrayList<ScoreVO> getList() { //데이터 조회
	//		return list;
	//	}
	//
	//	@Override
	//	public void delete(int num) { //삭제
	//		list.remove(num);
	//	}


}
