package com.sarunasdaujotis.behavior.memento;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DialogFormTest {

	private DialogForm dialogForm;

	@Before
	public void setUp() {
		dialogForm = new DialogForm();
	}

	@Test
	public void testSaveAndRestoreFunctionality() {
		dialogForm.write("Test");
		dialogForm.write("Test2");
		dialogForm.save();

		assertEquals("TestTest2", dialogForm.getCurrentState().getText());

		dialogForm.write("Test3");

		dialogForm.undo();

		assertEquals("TestTest2", dialogForm.getCurrentState().getText());
	}
}