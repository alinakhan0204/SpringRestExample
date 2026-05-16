package com.springRest.JobAppRestEx.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springRest.JobAppRestEx.model.JobPost;

@Repository
public interface JobRepoJPA extends JpaRepository<JobPost,Integer>{

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}
