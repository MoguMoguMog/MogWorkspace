import java.util.ArrayList;

public class BookShelf implements Aggregate{
	private ArrayList books;
	public BookShelf(int initialSize) {
		this.books = new ArrayList(initialSize);
	}
	public Book getBookAt(int index) {
		return (Book) books.get(index);
	}
	public void appendBook(Book book) {
		this.books.add(book);
	}
	public int getLength() {
		return this.books.size();
	}
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
