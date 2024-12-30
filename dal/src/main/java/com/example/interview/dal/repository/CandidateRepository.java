package com.example.interview.dal.repository;


import com.example.interview.dal.entity.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends MongoRepository<Candidate, String> {
    List<Candidate> findByInterviewId(String interviewId);
    List<Candidate> findByStatus(String status);
}

