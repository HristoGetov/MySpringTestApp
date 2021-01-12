package com.myspringtestapp.demo.repositories;

import com.myspringtestapp.demo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
