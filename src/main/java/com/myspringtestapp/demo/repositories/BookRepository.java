package com.myspringtestapp.demo.repositories;

import com.myspringtestapp.demo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
