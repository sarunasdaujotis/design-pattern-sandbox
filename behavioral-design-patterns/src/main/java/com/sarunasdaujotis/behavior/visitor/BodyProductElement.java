package com.sarunasdaujotis.behavior.visitor;

public class BodyProductElement extends ProductElement {

	@Override
	public String accept(final Visitor visitor) {
		return visitor.visit(this);
	}

	public String getElement() {
		return "body";
	}

}
