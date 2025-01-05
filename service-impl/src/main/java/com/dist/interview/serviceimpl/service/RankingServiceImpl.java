package com.dist.interview.serviceimpl.service;


import com.dist.interview.dal.entity.Candidate;
import com.dist.interview.dal.repository.CandidateRepository;
import com.dist.interview.serviceapi.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RankingServiceImpl implements RankingService {

    private final CandidateRepository candidateRepository;

    @Autowired
    public RankingServiceImpl(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    @Override
    public List<Candidate> getCandidatesByInterviewId(String interviewId) {
        return candidateRepository.findByInterviewId(interviewId);
    }

    @Override
    public List<Candidate> getCandidatesByStatus(String status) {
        return candidateRepository.findByStatus(status);
    }

    @Override
    public List<Candidate> getCandidatesRankedByScore() {
        return candidateRepository.findAll()
                .stream()
                .sorted((c1, c2) -> Double.compare(c2.getInterviewScore(), c1.getInterviewScore()))
                .collect(Collectors.toList());
    }

    @Override
    public Candidate getCandidateById(String id) {
        return candidateRepository.findById(id).orElse(null);
    }

    @Override
    public List<Candidate> getCandidatesByInterviewScore(double score) {
        return candidateRepository.findByInterviewScoreGreaterThanEqual(score);
    }

}
