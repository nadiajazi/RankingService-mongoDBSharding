package com.example.interview.serviceimpl.service;


import com.example.interview.dal.entity.Candidate;
import com.example.interview.dal.repository.CandidateRepository;
import com.example.interview.serviceapi.service.RankingService;
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

}
