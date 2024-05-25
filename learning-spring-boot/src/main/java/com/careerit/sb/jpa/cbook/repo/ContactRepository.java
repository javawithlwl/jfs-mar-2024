package com.careerit.sb.jpa.cbook.repo;

import com.careerit.sb.jpa.cbook.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ContactRepository extends JpaRepository<Contact, UUID> {

    @Query("select c from Contact c where c.name like %:str% or c.email like %:str% or c.mobile like %:str% or c.city like %:str%")
    List<Contact> search(@Param("str") String name);
}
