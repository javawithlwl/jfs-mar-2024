package com.careerit.sb.jpa.cbook.repo;

import com.careerit.sb.jpa.cbook.domain.Address;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface AddressRepository extends BaseRepository<Address, UUID>{
}
