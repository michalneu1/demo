package com.example.demo.client;

import com.example.demo.dto.GitHubRepository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "github")
public interface GitHubClient {
    @GetMapping("/repos/{owner}/{repo}")
    GitHubRepository getRepository(@PathVariable("owner") String owner, @PathVariable("repo") String repo);
}
