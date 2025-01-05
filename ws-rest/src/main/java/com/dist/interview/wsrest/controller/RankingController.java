package com.dist.interview.wsrest.controller;


import com.dist.interview.dal.entity.Candidate;
import com.dist.interview.serviceapi.service.RankingService;
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

    @GetMapping("/{id}")
    public Candidate getCandidateById(@PathVariable String id) {
        return rankingService.getCandidateById(id);
    }

    @GetMapping("/score/{score}")
    public List<Candidate> getCandidatesByInterviewScore(@PathVariable double score) {
        return rankingService.getCandidatesByInterviewScore(score);
    }

}

