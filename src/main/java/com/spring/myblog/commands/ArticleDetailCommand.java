package com.spring.myblog.commands;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.spring.myblog.dao.ArticleDao;
import com.spring.myblog.dto.ArticleDto;

public class ArticleDetailCommand implements ArticleCommand {
	
	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String articleId = request.getParameter("id");
		
		ArticleDao dao = new ArticleDao();
		// ArticleDto dto = dao.detail(id);
		
		// model.addAttribute("detail", dto);
	}
}
