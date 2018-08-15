
public class CharDisplay extends AbstractDisplay{
	private String string;

	public CharDisplay(String string) {
		this.string = string;
	}
	public void open() {
		System.out.print("<<");
	}

	public void print() {
		System.out.print(string);
	}

	public void close() {
		System.out.println(">>");
	}

}
