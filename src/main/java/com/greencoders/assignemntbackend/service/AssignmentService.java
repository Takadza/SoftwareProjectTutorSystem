package com.greencoders.assignemntbackend.service;

import com.greencoders.assignemntbackend.config.JwtFilter;
import com.greencoders.assignemntbackend.config.JwtService;
import com.greencoders.assignemntbackend.dto.AssignmentRequest;
import com.greencoders.assignemntbackend.model.Assignment;
import com.greencoders.assignemntbackend.model.User;
import com.greencoders.assignemntbackend.repository.AssignmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssignmentService {

    @Autowired
    private AssignmentRepo assignmentRepo;
    public Assignment createAssignment(User user) {
        Assignment newAssignment = new Assignment();
        newAssignment.setUser(user);
        newAssignment.setStatus("new submission");


        // Save the assignment using the AssignmentRepository
        return assignmentRepo.save(newAssignment);
    }

}
