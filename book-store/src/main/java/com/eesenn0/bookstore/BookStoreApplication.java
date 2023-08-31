package com.eesenn0.bookstore;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eesenn0.bookstore.model.Book;
import com.eesenn0.bookstore.repository.BookRepository;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1 = Book.builder()
			.name("Harry Potter")
			.author("J.K. Rowling")
			.price(50.0)
			.stock(10)
			.build();

		Book book2 = Book.builder()
			.name("The Discourses")
			.author("Epictetus")
			.price(30.5)
			.stock(15)
			.build();

		Book book3 = Book.builder()
			.name("Education of the Will")
			.author("Jules Payot")
			.price(40.0)
			.stock(5)
			.build();

		bookRepository.saveAll(Arrays.asList(book1, book2, book3));
	}

}
