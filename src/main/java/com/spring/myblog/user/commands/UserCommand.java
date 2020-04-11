package com.spring.myblog.user.commands;

import org.springframework.ui.Model;

public interface UserCommand {
	void execute(Model model);
}
