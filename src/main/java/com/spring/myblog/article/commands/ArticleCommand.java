package com.spring.myblog.article.commands;

import org.springframework.ui.Model;

public interface ArticleCommand {
	void execute(Model model);
}
