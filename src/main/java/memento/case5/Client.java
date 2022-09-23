package memento.case5;

import memento.case5.Caretaker.TextEditor;
import memento.case5.Originator.TextWindow;

public class Client {

	public static void main(String[] args) {

		TextEditor textEditor = new TextEditor(new TextWindow());

		textEditor.write("The Memento Design Pattern\n");
		textEditor.write("How to implement it in Java?\n");

		textEditor.hitSave();
		System.out.println(textEditor.print());


		textEditor.write("Buy milk and eggs before coming home\n");

		textEditor.hitUndo();
		System.out.println(textEditor.print());
	}
}
