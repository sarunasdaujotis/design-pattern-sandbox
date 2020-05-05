package com.sarunasdaujotis.behavior.state;

public class RedColorState implements TrafficLightState {
	@Override
	public void previous(final TrafficLightContext trafficLightContext) {
		if (trafficLightContext.getTrafficLightState() == null) {
			trafficLightContext.setTrafficLightState(new YellowColorState());
		}
	}

	@Override
	public void next(final TrafficLightContext trafficLightContext) {
		trafficLightContext.setTrafficLightState(new YellowColorState());
	}
}
