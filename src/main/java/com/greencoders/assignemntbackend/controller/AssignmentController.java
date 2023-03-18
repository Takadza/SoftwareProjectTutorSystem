package com.greencoders.assignemntbackend.controller;

import com.greencoders.assignemntbackend.config.JwtFilter;
import com.greencoders.assignemntbackend.config.JwtService;
import com.greencoders.assignemntbackend.dto.AssignmentRequest;
import com.greencoders.assignemntbackend.model.Assignment;
import com.greencoders.assignemntbackend.model.User;
import com.greencoders.assignemntbackend.service.AssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/assignments")
@RequiredArgsConstructor
public class AssignmentController {

    private final  AssignmentService assignmentService;

    @PostMapping("/create")
    public ResponseEntity<Assignment> createAssignment(
                                                       @AuthenticationPrincipal User user) {
        Assignment savedAssignment = assignmentService.createAssignment( user);
        return ResponseEntity.ok(savedAssignment);
    }


}
