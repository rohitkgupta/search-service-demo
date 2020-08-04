package com.schoology.search.dao.impl;

import com.schoology.search.dao.SearchDao;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

@Component
public class SearchDaoImpl implements SearchDao {
    private ConcurrentSkipListSet<String>  searchTerms = new ConcurrentSkipListSet<>();

    @Override
    public void addSearchTerm(String query) {
        searchTerms.add(query);
    }

    @Override
    public List<String> findMatchingSearchTerms(String query) {
        return searchTerms.stream().filter(s -> s.contains(query)).collect(Collectors.toList());
    }
}
