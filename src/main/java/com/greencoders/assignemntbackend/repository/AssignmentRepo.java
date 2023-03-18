package com.greencoders.assignemntbackend.repository;

import com.greencoders.assignemntbackend.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepo extends JpaRepository<Assignment, Long> {

}
