package com.myspringtestapp.demo.repositories;

import com.myspringtestapp.demo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
