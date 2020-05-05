package com.sarunasdaujotis.behavior.state;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TrafficLightTest {

	private TrafficLightContext context;

	@Before
	public void setUp() {
		context = new TrafficLightContext();
	}

	@Test
	public void testRedYellowColorTransition() {
		context.next();
		assertTrue(context.getTrafficLightState() instanceof YellowColorState);
	}

	@Test
	public void testYellowGreenColorTransition() {
		context.setTrafficLightState(new YellowColorState());
		context.next();
		assertTrue(context.getTrafficLightState() instanceof GreenColorState);
	}

	@Test
	public void testGreenYellowColorTransition() {
		context.setTrafficLightState(new GreenColorState());
		context.next();
		assertTrue(context.getTrafficLightState() instanceof YellowColorState);
	}

	@Test
	public void testYellowRedColorTransition() {
		context.setTrafficLightState(new YellowColorState());
		context.previous();
		assertTrue(context.getTrafficLightState() instanceof RedColorState);
	}
}