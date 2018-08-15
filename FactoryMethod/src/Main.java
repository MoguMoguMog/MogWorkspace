import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("石川");
		Product card2 = factory.create("田中");
		Product card3 = factory.create("中田");
		card1.use();
		card2.use();
		card3.use();

	}
}
