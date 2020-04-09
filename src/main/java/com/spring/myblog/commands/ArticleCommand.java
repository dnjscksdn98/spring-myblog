package com.spring.myblog.commands;

import org.springframework.ui.Model;

public interface ArticleCommand {
	void execute(Model model);
}
