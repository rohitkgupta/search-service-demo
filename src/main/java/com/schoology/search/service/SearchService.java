package com.schoology.search.service;

import java.util.List;
import java.util.Optional;

public interface SearchService {
    List<String> completeSearchTerm(String query);
    Optional<String> search(String query);
}
