package com.example.demo.controller;

import com.example.demo.dto.RepositoryDetails;
import com.example.demo.service.RepoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepoController {
    private final RepoService service;

    public RepoController(RepoService service) {
        this.service = service;
    }

    @GetMapping("/repositories/{owner}/{repo}")
    public RepositoryDetails getRepo(@PathVariable("owner") String owner, @PathVariable("repo") String repo){
        return service.getRepo(owner, repo);
    }
}
