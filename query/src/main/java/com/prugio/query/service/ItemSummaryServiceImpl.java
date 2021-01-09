package com.prugio.query.service;

import com.prugio.query.entity.ItemSummary;
import com.prugio.query.repository.ItemSummaryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor   // 자동으로 final 멤버변수 생성자를 만들어줌.
@Slf4j
@Service
public class ItemSummaryServiceImpl implements ItemSummaryService {

    private final ItemSummaryRepository itemSummaryRepository;

    @Override
    public List<ItemSummary> findAll() {
        return itemSummaryRepository.findAll();
    }

    @Override
    @Transactional
    public ItemSummary save(ItemSummary itemSummary) {
        return itemSummaryRepository.save(itemSummary);
    }

    @Override
    @Transactional
    public Optional<ItemSummary>  findById(Long id) {

//        Optional<ItemSummary> items = itemSummaryRepository.findById(1L);
//
//        items.ifPresent(selectItem ->{
//            System.out.println("item: "+selectItem);
//        });
//
//        return  items != null ? items : Collections.emptyList();
        return itemSummaryRepository.findById(id);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        itemSummaryRepository.deleteById(id);
    }
}
