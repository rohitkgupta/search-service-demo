package com.schoology.search.service.impl;

import com.schoology.search.dao.SearchDao;
import com.schoology.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SearchServiceImpl implements SearchService {
    private SearchDao searchDao;

    @Autowired
    public SearchServiceImpl(SearchDao searchDao) {
        this.searchDao = searchDao;
    }

    @Override
    public List<String> completeSearchTerm(String query) {
        return searchDao.findMatchingSearchTerms(query);
    }

    @Override
    public Optional<String> search(String query) {
        searchDao.addSearchTerm(query);
        return Optional.of(String.format("Welcome to Schoology search. %s Result for %s: No content", System.lineSeparator(), query));
    }
}
