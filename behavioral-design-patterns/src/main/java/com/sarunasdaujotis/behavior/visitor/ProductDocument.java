package com.sarunasdaujotis.behavior.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ProductDocument extends ProductElement {

	private final List<ProductElement> documentElements = new ArrayList<>();

	public void addProductElement(ProductElement productElement) {
		documentElements.add(productElement);
	}

	@Override
	public String accept(final Visitor visitor) {
		final StringJoiner result = new StringJoiner("\n");
		for (ProductElement productElement : documentElements) {
			result.add(productElement.accept(visitor));
		}
		return result.toString();
	}

}
