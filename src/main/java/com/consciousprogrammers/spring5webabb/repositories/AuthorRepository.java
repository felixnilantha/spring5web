package com.consciousprogrammers.spring5webabb.repositories;

import com.consciousprogrammers.spring5webabb.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
