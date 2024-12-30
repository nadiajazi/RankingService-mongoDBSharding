package com.example.interview.dal.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "candidates")
@NoArgsConstructor
@AllArgsConstructor
public class Candidate {
    @Id
    private String id;
    private String interviewId;
    private String name;
    private String email;
    private String appliedPosition;
    private List<String> skills;
    private Double interviewScore;
    private Integer responseTime;
    private String feedback;
    private Double rating;
    private String status;
    private Date createdAt;
}
