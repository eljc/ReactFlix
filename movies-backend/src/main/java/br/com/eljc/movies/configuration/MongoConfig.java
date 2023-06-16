package br.com.eljc.movies.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.*;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

import java.util.List;

@Configuration
public class MongoConfig {
    public MongoConfig(MappingMongoConverter mappingMongoConverter) {
        // Remove "_class" field from MongoDB documents
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
    }
}