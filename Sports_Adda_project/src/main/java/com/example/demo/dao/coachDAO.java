package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.entity.coach;
@RepositoryRestResource(path="coach")
@CrossOrigin("http://localhost:4200")

public interface coachDAO extends JpaRepository<coach, Integer> {

}
