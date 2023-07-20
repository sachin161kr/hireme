package com.sachinkumar.hireme.Respository;

import com.sachinkumar.hireme.Models.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobPostRepo extends JpaRepository<JobPost,String> {
}
