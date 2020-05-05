package com.sarunasdaujotis.creational.singleton;

public class SingletonClass {

	private static final SingletonClass INSTANCE = new SingletonClass();

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return INSTANCE;
	}

	public String getRandomText() {
		return "some text";
	}
}
