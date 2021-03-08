import java.time.LocalDate;
import java.util.List;
import controller.LocalDateAttributeConverte;
import controller.BookHelper;
import model.Book;

/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 6, 2021
 */
public class StartProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1,"Web dev","CiS",LocalDate.now(),65);
		BookHelper bh = new BookHelper();
		bh.insertBook(b1);
		List<Book> allBooks = bh.showAllBooks();
		for(Book l : allBooks) {
			System.out.println(l.toString());
		}
	}

}
