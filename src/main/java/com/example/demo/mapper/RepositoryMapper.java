package com.example.demo.mapper;

import com.example.demo.dto.GitHubRepository;
import com.example.demo.dto.RepositoryDetails;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface RepositoryMapper {

    RepositoryDetails toDetails(GitHubRepository repository);

}
