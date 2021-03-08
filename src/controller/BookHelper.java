package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Book;


/**
 * Abutalib Hasan - amhasan
 * 202101 CIS171 12928
 * Mar 6, 2021
 */
public class BookHelper {
	static EntityManagerFactory  emfactory = Persistence.createEntityManagerFactory("BookStore");
	public void insertBook(Book b) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(b);
		em.getTransaction().commit();
		em.close();
		
	}
	
	public List<Book> showAllBooks(){
		EntityManager em = emfactory.createEntityManager();
		List<Book> allBooks = em.createQuery("SELECT b FROM Book b").getResultList();
		return allBooks;
	}
	

}
