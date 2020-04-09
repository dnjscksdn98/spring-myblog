package com.spring.myblog.dto;

import java.sql.Timestamp;

public class ArticleDto {
	
	private int id;
	private String writer;
	private String title;
	private String content;
	private Timestamp rdate;
	private int views;
	
	public ArticleDto() {
		
	}
	
	public ArticleDto(int id, String writer, String title, String content, Timestamp rdate, int views) {
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.rdate = rdate;
		this.views = views;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getRdate() {
		return rdate;
	}

	public void setRdate(Timestamp rdate) {
		this.rdate = rdate;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}
	
	
}
