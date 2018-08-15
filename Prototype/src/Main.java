import framework.Manager;
import framework.Product;

public class Main {
	public static void main(String[] args) {
		Manager manager = new Manager();
		UnderlinePen underlinePen = new UnderlinePen('~');
		MessageBox messageBox = new MessageBox('*');
		MessageBox messageBox2 = new MessageBox('/');
		manager.register("strong message", underlinePen);
		manager.register("warning box", messageBox);
		manager.register("slash box", messageBox2);

		// 生成
		Product p1 = manager.create("strong message");
		p1.use("Hello, world.");
		Product p2 = manager.create("warning box");
		p2.use("Hello world.");
		Product p3 = manager.create("slash box");
		p3.use("Hello world.");
	}
}
