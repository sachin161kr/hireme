package com.sachinkumar.hireme.Controllers;

import com.sachinkumar.hireme.Models.JobPost;
import com.sachinkumar.hireme.Respository.JobPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobListController {

    @Autowired
    JobPostRepo jobPostRepo;

    @GetMapping("/posts")
    public List<JobPost> getAllPosts()
    {
        return jobPostRepo.findAll();
    }

    @PostMapping("/submitPost")
    public String submitPost(@RequestBody JobPost jobPost)
    {
        jobPostRepo.save(jobPost);
        return "Post Submitted";
    }

    @PostMapping("/deletePost")
    public String deletePost(@RequestBody JobPost jobPost)
    {
           jobPostRepo.delete(jobPost);
            return "Post Deleted";
    }


}
