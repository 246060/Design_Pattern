package memento.case5.Caretaker;

import memento.case5.Memento.TextWindowState;
import memento.case5.Originator.TextWindow;

public class TextEditor {

	private TextWindow textWindow;
	private TextWindowState savedTextWindow;

	public TextEditor(TextWindow textWindow) {
		this.textWindow = textWindow;
	}

	public void write(String text) {
		textWindow.addText(text);
	}

	public String print() {
		return textWindow.getCurrentText();
	}

	public void hitSave() {
		savedTextWindow = textWindow.save();
	}

	public void hitUndo() {
		textWindow.restore(savedTextWindow);
	}
}
