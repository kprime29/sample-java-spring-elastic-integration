package com.example.sample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String args[]) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		bookService.save(new Book("1", "Book1", "Author1", "23-FEB-2020"));
		bookService.save(new Book("2", "Book2", "Author2", "13-MAR-2020"));
		bookService.save(new Book("3", "Book3", "Author3", "21-MAR-2020"));
		bookService.save(new Book("4", "Book4", "Author4", "21-MAR-2020"));
		bookService.save(new Book("5", "Book5", "Author5", "21-MAR-2020"));
		bookService.save(new Book("6", "Book6", "Author6", "21-MAR-2020"));
		bookService.save(new Book("7", "Book7", "Author7", "21-MAR-2020"));
		bookService.save(new Book("8", "Book8", "Author8", "21-MAR-2020"));
		bookService.save(new Book("9", "Book9", "Author9", "21-MAR-2020"));
		bookService.save(new Book("10", "Book10", "Author10", "21-june-2020"));


        Iterable<Book> books = bookService.findAll();

		books.forEach(x -> System.out.println(x));


	}


}