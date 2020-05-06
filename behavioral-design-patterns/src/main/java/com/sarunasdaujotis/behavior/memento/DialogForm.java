package com.sarunasdaujotis.behavior.memento;

public class DialogForm {

	private TextState textState;

	private final TextBoxComponent textBoxComponent;

	public DialogForm() {
		this.textState = new TextState("");
		this.textBoxComponent = new TextBoxComponent();
	}

	public TextState getCurrentState() {
		return textState;
	}

	public void write(final String text) {
		textBoxComponent.appendText(text);
	}

	public void save() {
		textState = textBoxComponent.persist();
	}

	public void undo() {
		textBoxComponent.restore(textState);
	}
}
