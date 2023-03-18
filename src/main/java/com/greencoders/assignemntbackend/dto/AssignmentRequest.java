package com.greencoders.assignemntbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentRequest {
        private String name;
        private String githubUrl;
        private String branch;
        private String codeReviewVideoUrl;




}
