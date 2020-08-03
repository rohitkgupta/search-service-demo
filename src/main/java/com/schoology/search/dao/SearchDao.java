package com.schoology.search.dao;

import java.util.List;

public interface SearchDao {
    void addSearchTerm(String query);
    List<String> findMatchingSearchTerms(String query);
}
