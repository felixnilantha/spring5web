package com.consciousprogrammers.spring5webabb.repositories;

import com.consciousprogrammers.spring5webabb.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
