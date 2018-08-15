package idcard;

import java.util.HashMap;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory{
	private HashMap map = new HashMap();
	private int serial = 0;

	protected Product createProduct(String owner) {
		return new IDCard(owner, serial++);
	}

	protected void registerProduct(Product product) {
		map.put(((IDCard)product).getNumber(), ((IDCard)product).getOwner());
	}
	public HashMap getOwners(int number) {
		return map;
	}

}
