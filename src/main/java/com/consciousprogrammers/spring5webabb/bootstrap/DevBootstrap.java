package com.consciousprogrammers.spring5webabb.bootstrap;

import com.consciousprogrammers.spring5webabb.model.Author;
import com.consciousprogrammers.spring5webabb.model.Book;
import com.consciousprogrammers.spring5webabb.model.Publisher;
import com.consciousprogrammers.spring5webabb.repositories.AuthorRepository;
import com.consciousprogrammers.spring5webabb.repositories.BookRepository;
import com.consciousprogrammers.spring5webabb.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {


    private AuthorRepository authorRepository;

    private BookRepository bookRepository;

    private PublisherRepository publisherRepository;


    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void init(){


        Author eckhart = new Author();
        eckhart.setFirstName("Eckhart");
        eckhart.setLastName("Tolle");

        Book bookPowerOfNow = new Book();

        bookPowerOfNow.setTitle("Power of now");
        bookPowerOfNow.setIsbn("12345");

        Publisher namasthe = new Publisher();
        namasthe.setName("Namasthe publication");
        namasthe.setAddress("Toranto");

        bookPowerOfNow.setPublisher(namasthe);

        eckhart.getBooks().add(bookPowerOfNow);
        authorRepository.save(eckhart);
        bookRepository.save(bookPowerOfNow);


        Author martin = new Author();
        martin.setFirstName("Martin");
        martin.setLastName("Fowler");

        Book refactoring = new Book();

        refactoring.setTitle("Refactoring");
        refactoring.setIsbn("23456");


        Publisher aWesley = new Publisher();
        aWesley.setName("England");
        aWesley.setAddress("London");

        refactoring.setPublisher(aWesley);

        martin.getBooks().add(refactoring);

        authorRepository.save(martin);
        bookRepository.save(refactoring);
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        init();
    }
}
