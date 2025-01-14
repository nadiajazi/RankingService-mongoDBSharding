package com.dist.interview.dal.repository;


import com.dist.interview.dal.entity.CandidateMongoEntity;
import com.dist.interview.dal.entity.CandidateMongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends MongoRepository<CandidateMongoEntity, String> {
    List<CandidateMongoEntity> findByInterviewId(String interviewId);
    List<CandidateMongoEntity> findByStatus(String status);

}

