package com.spring.myblog.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.myblog.commands.ArticleCommand;
import com.spring.myblog.commands.ArticleListCommand;
import com.spring.myblog.commands.ArticleWriteCommand;
import com.spring.myblog.commands.ArticleDetailCommand;


@Controller
public class ArticleController {
	
	ArticleCommand command = null;
	
	@RequestMapping("/list")
	public String list(Model model) {
		command = new ArticleListCommand();
		command.execute(model);
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String writeView(Model model) {
		return "write_view";
	}

	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new ArticleWriteCommand();
		command.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/detail_view")
	public String detailView(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new ArticleDetailCommand();
		command.execute(model);
		return "detail_view";
	}
}
