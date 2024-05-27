package com.careerit.sb.jpa.cbook.repo;

import com.careerit.sb.jpa.cbook.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ContactRepository extends BaseRepository<Contact, UUID> {

    @Query("select c from Contact c where c.name like %:str% or c.email like %:str% or c.mobile like %:str% and c.deleted = false")
    List<Contact> search(@Param("str") String name);


}
