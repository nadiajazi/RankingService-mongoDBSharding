package com.dist.interview.serviceapi.service;



import com.dist.interview.dal.entity.Candidate;

import java.util.List;

public interface RankingService {
    List<Candidate> getCandidatesByInterviewId(String interviewId);
    List<Candidate> getCandidatesByStatus(String status);
    List<Candidate> getCandidatesRankedByScore();
    Candidate getCandidateById(String id);

    List<Candidate> getCandidatesByInterviewScore(double score);
}
