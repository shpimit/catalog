package com.prugio.command.repository;

import com.prugio.command.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository  extends JpaRepository<Item, Long> {
}
