package com.spring.myblog.commands;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.myblog.dao.ArticleDao;

public class ArticleWriteCommand implements ArticleCommand {
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		ArticleDao dao = new ArticleDao();
		dao.write(writer, title, content);
	}
}
