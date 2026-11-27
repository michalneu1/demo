package com.example.demo.service;

import com.example.demo.client.GitHubClient;
import com.example.demo.dto.RepositoryDetails;
import com.example.demo.mapper.RepositoryMapper;
import org.springframework.stereotype.Service;

@Service
public class RepoService {
    private final GitHubClient client;
    private final RepositoryMapper mapper;

    public RepoService(GitHubClient client, RepositoryMapper mapper) {
        this.client = client;
        this.mapper = mapper;
    }

    public RepositoryDetails getRepo(String owner, String repository){
        return mapper.toDetails(client.getRepository(owner, repository));
    }
}
