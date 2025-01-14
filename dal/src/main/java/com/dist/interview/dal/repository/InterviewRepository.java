package com.dist.interview.dal.repository;

import com.dist.interview.dal.entity.InterviewMongoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InterviewRepository extends MongoRepository<InterviewMongoEntity, String> {

    // Custom query to find interviews by candidateId
    List<InterviewMongoEntity> findByCandidateId(String candidateId);

    // Custom query to find interviews by interviewerName
    List<InterviewMongoEntity> findByInterviewerName(String interviewerName);

    // Custom query to find interviews by both interviewerName and candidateId
    List<InterviewMongoEntity> findByInterviewerNameAndCandidateId(String interviewerName, String candidateId);
}
