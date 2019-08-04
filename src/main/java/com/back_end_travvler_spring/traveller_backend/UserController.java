package com.back_end_travvler_spring.traveller_backend;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
@CrossOrigin(origins = "http://localhost:3000")
public interface UserController extends MongoRepository<Users, String> {

    List<Users> findByUserName(@Param("userName") String userName);

    }
