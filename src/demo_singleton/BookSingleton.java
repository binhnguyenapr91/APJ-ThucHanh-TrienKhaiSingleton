package demo_singleton;

public class BookSingleton {
	private String author;
	private String title;
	private static BookSingleton book;
	private static boolean isLoanedOut;

	private BookSingleton() {
		this.author = "BinhNguyen";
		this.title = "Love and Life";
		BookSingleton.book = null;
		BookSingleton.isLoanedOut = false;
	}
	
	public static BookSingleton borrowBook() {
		if(!isLoanedOut) {
			if(book==null) {
				book = new BookSingleton();
			}
		}
		return book;
	}
	
	public void returnBook(BookSingleton bookReturned){
	    isLoanedOut = false;
	}
	
	public String getAuthor() {
	    return author;
	}

	public String getTitle() {
	    return title;
	}

	public String getAuthorAndTitle(){
	    return getTitle() + " by " + getAuthor();
	}
}
