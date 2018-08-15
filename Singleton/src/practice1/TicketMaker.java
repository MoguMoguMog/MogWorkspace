package practice1;

public class TicketMaker {
	private static TicketMaker ticketMaker = new TicketMaker();
	private int ticket = 1000;

	private TicketMaker() {
		System.out.println("インスタンスを生成しました。");
	}

	public TicketMaker getInstance() {
		return ticketMaker;
	}
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
