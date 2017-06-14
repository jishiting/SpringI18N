package com.demo.controller;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConvertDemo {
	static Logger log = Logger.getLogger("ConvertDemo");

	public ConvertDemo() {
		super();
		log.setLevel(Level.INFO);
	}

	public static void main(String[] args) {
		numberFormat();
		dataFormat();
		messageFormat();
	}

	private static void messageFormat() {
		log.info("start message format");
		//the index start from 0.
		String pattern1 = "{0}，你好！你于 {1} 在工商银行存入 {2} 元。";
		String pattern2 = "At {1,time,short} On {1,date,long}，{0} paid {2,number, currency}.";

		// the param will be replaced by Java
		Object[] params = { "John", new GregorianCalendar().getTime(), 1.0E3 };

		//1.use default locale to format
		String msg1 = MessageFormat.format(pattern1, params);

		//2.use locale that assigned to format
		MessageFormat mf = new MessageFormat(pattern2, Locale.US);
		String msg2 = mf.format(params);
		System.out.println(msg1);
		System.out.println(msg2);
		log.info("end message format");
	}

	private static void dataFormat() {
		log.info("start data format");
		Locale locale = new Locale("en", "US");
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		System.out.println(df.format(date));
		locale = new Locale("ar", "SD");
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
		System.out.println(df.format(date));
		log.info("end data format");
	}

	private static void numberFormat() {
		log.info("start number format");
		Locale locale = Locale.CHINA;
		Locale locale1 = Locale.US;
		NumberFormat currFmt = NumberFormat.getCurrencyInstance(locale);
		NumberFormat currFmt1 = NumberFormat.getCurrencyInstance(locale1);
		double amt = 123456.78;
		System.out.println(currFmt.format(amt));
		System.out.println(currFmt1.format(amt));
		log.info("end number format");

	}
}
