package com.sarunasdaujotis.behavior.memento;

public class TextBoxComponent {

	private StringBuilder currentText;

	public TextBoxComponent() {
		this.currentText = new StringBuilder();
	}

	public void appendText(final String text) {
		currentText.append(text);
	}

	public TextState persist() {
		return new TextState(currentText.toString());
	}

	public void restore(final TextState textState) {
		currentText = new StringBuilder(textState.getText());
	}
}
