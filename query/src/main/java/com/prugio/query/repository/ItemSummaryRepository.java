package com.prugio.query.repository;

import com.prugio.query.entity.ItemSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSummaryRepository extends JpaRepository<ItemSummary, Long>  {
}
