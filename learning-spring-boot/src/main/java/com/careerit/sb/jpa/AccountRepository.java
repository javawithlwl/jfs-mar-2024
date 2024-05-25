package com.careerit.sb.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID>{


    List<Account> findByBalanceGreaterThan(double balance);
    // find account number or name like given string

    @Query("select a from Account a where a.accno=:accno or a.name like %:name%")
    List<Account> findByAccnoOrNameLike(@Param("accno") String accNumber,
                                        @Param("name") String customerName);

    @Query(value = "select a from Account a where a.balance >:amount")
    List<Account> selectAccountBalanceGt(@Param("amount") double amount);
}
