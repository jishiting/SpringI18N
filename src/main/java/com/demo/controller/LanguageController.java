package com.demo.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

@Controller
@RequestMapping("/i18n")
public class LanguageController {
	
	@Autowired CookieLocaleResolver resolver;
	
	//@Autowired SessionLocaleResolver resolver;
	
	/**
	 * 语言切换
	 */
	@RequestMapping("language")
	public ModelAndView language(HttpServletRequest request,HttpServletResponse response,String language){
		
		language=language.toLowerCase();
		if(language==null||language.equals("")){
			return new ModelAndView("redirect:/");
		}else{
			if(language.equals("zh_cn")){
				resolver.setLocale(request, response, Locale.CHINA );
			} 
			if(language.equals("en")){
				resolver.setLocale(request, response, Locale.ENGLISH );
			}
			if(language.equals("ar")){
				resolver.setLocale(request, response, new Locale("ar", "SD") );
			}
		}
		
		return new ModelAndView("redirect:/");
	}
	
	/**
	 * 演示�?些消�?
	 */
	@RequestMapping("something")
	public void something(){}
	
	/**
	 * 换页�?
	 */
	@RequestMapping("welcome")
	public void welcome(){}

}
