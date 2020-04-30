package com.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.jpa.BookEntity;

@Repository
public interface BookRepository extends CrudRepository<BookEntity,Long> {

	@Query("select p from BookEntity p where p.name LIKE '%' || :name || '%'")
	List<BookEntity> searchByName(@Param("name") String name);

}
