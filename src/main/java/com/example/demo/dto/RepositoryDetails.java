package com.example.demo.dto;

import java.time.Instant;

public record RepositoryDetails(String fullName, String description, String cloneUrl, int stars,
                                Instant createdAt) {
}
