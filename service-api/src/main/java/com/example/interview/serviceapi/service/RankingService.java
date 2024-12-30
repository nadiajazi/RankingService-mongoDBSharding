package com.example.interview.serviceapi.service;



import com.example.interview.dal.entity.Candidate;

import java.util.List;

public interface RankingService {
    List<Candidate> getCandidatesByInterviewId(String interviewId);
    List<Candidate> getCandidatesByStatus(String status);
    List<Candidate> getCandidatesRankedByScore();
}
