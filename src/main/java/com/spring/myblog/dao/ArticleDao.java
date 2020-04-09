package com.spring.myblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.spring.myblog.utils.JdbcUtil;
import com.spring.myblog.dto.ArticleDto;


public class ArticleDao {
	DataSource dataSource = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private final String ARTICLE_LIST = "select * from articles order by rdate desc";
	private final String ARTICLE_WRITE = "insert into article(id, writer, title, content) values(articles_seq.nextval, ?, ?, ?)";
	
	public ArticleDao() {		
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<ArticleDto> list() {
		
		ArrayList<ArticleDto> dtos = new ArrayList<ArticleDto>();
		
		try {
			conn = dataSource.getConnection();
			
			String query = ARTICLE_LIST;
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Timestamp rdate = rs.getTimestamp("rdate");
				int views = rs.getInt("views");
				
				ArticleDto dto = new ArticleDto(id, writer, title, content, rdate, views);
				dtos.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			JdbcUtil.closeResource(rs, pstmt, conn);
		}
		return dtos;
	}
	
	public void write(String writer, String title, String content) {		
		
		try {
			conn = dataSource.getConnection();
			String query = ARTICLE_WRITE;
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			JdbcUtil.closeResource(pstmt, conn);
		}
	}
}
