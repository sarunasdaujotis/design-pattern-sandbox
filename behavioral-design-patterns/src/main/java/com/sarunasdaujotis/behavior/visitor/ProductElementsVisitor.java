package com.sarunasdaujotis.behavior.visitor;

public class ProductElementsVisitor implements Visitor {

	@Override
	public String visit(final HeaderProductElement element) {
		return element.getElement();
	}

	@Override
	public String visit(final BodyProductElement element) {
		return element.getElement();
	}
}
