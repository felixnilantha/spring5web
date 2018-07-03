package com.consciousprogrammers.spring5webabb.repositories;

import com.consciousprogrammers.spring5webabb.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
