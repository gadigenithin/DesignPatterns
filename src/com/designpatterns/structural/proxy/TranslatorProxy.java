package com.designpatterns.structural.proxy;


import java.util.HashMap;
import java.util.Map;

public class TranslatorProxy implements Translator {

	private Translator translator;
	private String userId;
	private Boolean isPremiumUser;

	private Integer FREE_LIMIT = 5;

	private Map<String, Integer> userCount = new HashMap<>();

	public TranslatorProxy(Translator translator, String userId, boolean isPremiumUser) {
		this.translator = translator;
		this.userId = userId;
		this.isPremiumUser = isPremiumUser;
	}

	@Override
	public void translate(String text, String fromLang, String toLang) {

		int count = userCount.getOrDefault(userId, 0);

		if (!isPremiumUser && count >= FREE_LIMIT) {
			System.out.println("Limit exceed for free usage, upgrade to premium.");
			return;
		}

		translator.translate(text, fromLang, toLang);

		userCount.put(userId, count + 1);

	}

}
