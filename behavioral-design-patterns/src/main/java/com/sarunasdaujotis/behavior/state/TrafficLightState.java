package com.sarunasdaujotis.behavior.state;

public interface TrafficLightState {

	void previous(TrafficLightContext trafficLightContext);
	void next(TrafficLightContext trafficLightContext);
}
