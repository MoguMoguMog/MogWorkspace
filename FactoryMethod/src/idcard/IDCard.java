package idcard;

import framework.Product;

public class IDCard extends Product{
	private String owner;
	private  int number = 0;

	IDCard(String owner, int number) {
		this.owner = owner;
		this.number = number;
		System.out.println(owner + number + "のカードを作ります。");
	}
	public void use() {
		System.out.println(owner + number + "のカードを使います。");
	}
	public String getOwner() {
		return owner;
	}

	public int getNumber() {
		return number;
	}
}
