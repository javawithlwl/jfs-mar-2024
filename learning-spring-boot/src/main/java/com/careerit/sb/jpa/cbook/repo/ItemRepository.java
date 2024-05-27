package com.careerit.sb.jpa.cbook.repo;

import com.careerit.sb.jpa.cbook.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
