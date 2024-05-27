package com.careerit.sb.jpa.cbook.repo;

import com.careerit.sb.jpa.cbook.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity,ID> extends JpaRepository<T, ID> {

  @Override
  @Query("select e from #{#entityName} e where e.deleted = false and e.id = :id")
  @Transactional(readOnly = true)
  Optional<T> findById(ID id);

  @Override
  @Query("select e from #{#entityName} e where e.deleted = false")
  @Transactional(readOnly = true)
  List<T> findAll();

}
