package com.greencoders.assignemntbackend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assignment {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String githubUrl;
    private String branch;
    private String codeReviewVideoUrl;
    private String name;
    private String status;
    @ManyToOne(optional = false)
    private User user;
}
