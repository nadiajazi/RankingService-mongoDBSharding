//package com.dist.interview.dal.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;
//
//@Configuration
//public class MongoConfig {
//
//    @Bean
//    public SimpleMongoClientDatabaseFactory mongoDbFactory() {
//        String mongoUri = "mongodb://localhost:27017/candidatesDB";
//        return new SimpleMongoClientDatabaseFactory(mongoUri);
//    }
//
//    @Bean
//    public MongoTemplate mongoTemplate(SimpleMongoClientDatabaseFactory mongoDbFactory) {
//        return new MongoTemplate(mongoDbFactory);
//    }
//}
