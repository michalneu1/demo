package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;

public record GitHubRepository(@JsonProperty("full_name") String fullName, String description,
                               @JsonProperty("clone_url") String cloneUrl,
                               @JsonProperty("watchers_count") int stars, @JsonProperty("created_at") Instant createdAt) {
}
