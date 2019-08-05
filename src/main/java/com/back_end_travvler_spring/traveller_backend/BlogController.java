package com.back_end_travvler_spring.traveller_backend;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "blogs", path = "blogs")
@CrossOrigin(origins = "http://localhost:3000")
public interface BlogController extends MongoRepository<Blog, String> {

    List<Blog> findByUserName(@Param("userName") String userName);

    List<Blog> findByCountry(@Param("country") String country);


    }
