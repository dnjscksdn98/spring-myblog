package com.spring.myblog.commands;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.spring.myblog.dao.ArticleDao;
import com.spring.myblog.dto.ArticleDto;

public class ArticleListCommand implements ArticleCommand {
	
	@Override
	public void execute(Model model) {
		ArticleDao dao = new ArticleDao();
		ArrayList<ArticleDto> dtos = dao.list();
		model.addAttribute("list", dtos);
	}
}
