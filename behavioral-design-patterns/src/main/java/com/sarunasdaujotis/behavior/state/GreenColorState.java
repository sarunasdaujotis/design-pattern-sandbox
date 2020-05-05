package com.sarunasdaujotis.behavior.state;

public class GreenColorState implements TrafficLightState {
	@Override
	public void previous(final TrafficLightContext trafficLightContext) {
		trafficLightContext.setTrafficLightState(new YellowColorState());
	}

	@Override
	public void next(final TrafficLightContext trafficLightContext) {
		trafficLightContext.setTrafficLightState(new YellowColorState());
	}
}
