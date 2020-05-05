package com.sarunasdaujotis.behavior.visitor;

public class HeaderProductElement extends ProductElement {

	@Override
	public String accept(final Visitor visitor) {
		return visitor.visit(this);
	}

	public String getElement() {
		return "header";
	}
}
