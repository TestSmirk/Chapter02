package com.example.demo;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(path = "bs",collectionResourceRel = "bs1",itemResourceRel = "b")
public interface BookRepository extends JpaRepository <Book,Integer>{
    @RestResource(path = "author",rel = "author")
    List<Book> findByAuthorContains(@Param("author") String author);
    @RestResource(path = "name",rel = "name")
    Book findByNameEquals(@Param("name") String name);
}
