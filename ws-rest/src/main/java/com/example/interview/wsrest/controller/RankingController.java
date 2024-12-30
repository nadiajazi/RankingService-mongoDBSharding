package com.example.interview.wsrest.controller;


import com.example.interview.dal.entity.Candidate;
import com.example.interview.serviceapi.service.RankingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/candidates")
public class RankingController {

    private final RankingService rankingService;

    @Autowired
    public RankingController(RankingService candidateService) {
        this.rankingService = candidateService;
    }

    @GetMapping("/interview/{interviewId}")
    public List<Candidate> getCandidatesByInterviewId(@PathVariable String interviewId) {
        return rankingService.getCandidatesByInterviewId(interviewId);
    }

    @GetMapping("/status/{status}")
    public List<Candidate> getCandidatesByStatus(@PathVariable String status) {
        return rankingService.getCandidatesByStatus(status);
    }
    @GetMapping("/ranked")
    public List<Candidate> getCandidatesRankedByScore() {
        return rankingService.getCandidatesRankedByScore();
    }

}

