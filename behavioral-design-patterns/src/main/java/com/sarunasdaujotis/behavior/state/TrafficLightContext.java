package com.sarunasdaujotis.behavior.state;

public class TrafficLightContext {

	private TrafficLightState trafficLightState;

	public TrafficLightContext() {
		trafficLightState = new RedColorState();
	}

	public TrafficLightState getTrafficLightState() {
		return trafficLightState;
	}

	public void setTrafficLightState(final TrafficLightState trafficLightState) {
		this.trafficLightState = trafficLightState;
	}

	public void next() {
		trafficLightState.next(this);
	}

	public void previous() {
		trafficLightState.previous(this);
	}

}
