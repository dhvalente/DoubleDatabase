package com.example.demo.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "account")
public class Account {

    @MongoId
    private ObjectId id;

    private String userEmail;

    private String nickName;

    private String accountDomain;

    private String password;

    // getters and setters
}