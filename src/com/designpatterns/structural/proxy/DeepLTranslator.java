package com.designpatterns.structural.proxy;

public class DeepLTranslator implements Translator {

	@Override
	public void translate(String text, String fromLang, String toLang) {

		System.out.println("[Google] " + text + " translated from " + fromLang + " to " + toLang);

	}

}