package myself.textalign;

/**
 * Lesson: jackson mapped requires a default java constructor.
 * */
public class InputText {

	private String text;
	private int len;

	public InputText() {

	}

	public InputText(String text, int len) {
		this.text = text;
		this.len = len;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}
}
