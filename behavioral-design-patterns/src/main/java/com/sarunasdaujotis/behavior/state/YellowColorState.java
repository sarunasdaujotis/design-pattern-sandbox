package com.sarunasdaujotis.behavior.state;

public class YellowColorState implements TrafficLightState {
	@Override
	public void previous(final TrafficLightContext trafficLightContext) {
		trafficLightContext.setTrafficLightState(new RedColorState());
	}

	@Override
	public void next(final TrafficLightContext trafficLightContext) {
		trafficLightContext.setTrafficLightState(new GreenColorState());
	}
}
