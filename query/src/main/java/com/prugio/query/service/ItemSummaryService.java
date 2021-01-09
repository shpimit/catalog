package com.prugio.query.service;

import com.prugio.query.entity.ItemSummary;

import java.util.List;
import java.util.Optional;

public interface ItemSummaryService {
    public List<ItemSummary> findAll();
    public ItemSummary save(ItemSummary itemSummary);
    public Optional<ItemSummary> findById(Long id);
    public void deleteById(Long id);
}
