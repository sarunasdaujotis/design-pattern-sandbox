package com.sarunasdaujotis.creational.singleton;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SingletonTest {

	@Test
	public void testSingletonPattern() {
		final SingletonClass instance = SingletonClass.getInstance();

		assertEquals("some text", instance.getRandomText());
	}

}