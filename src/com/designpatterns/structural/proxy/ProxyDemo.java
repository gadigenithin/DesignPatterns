package com.designpatterns.structural.proxy;

public class ProxyDemo {

	public static void main(String[] args) {

		Translator translator1 = getTranslatorProxy("user123", false);

		for (int i = 1; i <= 7; i++) {
			translator1.translate("Hello", "en", "es");
		}

		System.out.println("\n----------------------------------------\n");

		Translator translator2 = getTranslatorProxy("user789", true);

		for (int i = 1; i <= 7; i++) {
			translator2.translate("Bye", "en", "fr");
		}

	}

	private static Translator getTranslatorProxy(String userId, boolean isPremiumUser) {
		Translator realTranslator = new DeepLTranslator();

		TranslatorProxy translatorProxy = new TranslatorProxy(realTranslator, userId, isPremiumUser);

		return translatorProxy;
	}

}
