package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ThemeResolver;

@Controller
@RequestMapping("/theme")
public class ThemeController {

	@Autowired
	private ThemeResolver themeResolver;
	private final Log logger = LogFactory.getLog(getClass());

	@RequestMapping("/changeTheme")
	public ModelAndView changeTheme(HttpServletRequest request, HttpServletResponse response, String themeName) {
		//http://localhost:8081/i18n/theme/changeTheme?themeName=theme_arabic
		logger.info("current theme is " + themeResolver.resolveThemeName(request));
		themeResolver.setThemeName(request, response, themeName);
		logger.info("current theme change to " + themeResolver.resolveThemeName(request));
		return new ModelAndView("redirect:/");
	}

}
