package com.sarunasdaujotis.behavior.visitor;

public interface Visitor {

	String visit(HeaderProductElement element);

	String visit(BodyProductElement element);
}
