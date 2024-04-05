package org.dnyanyog.repo;

import org.dnyanyog.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface GetTotalBankAccountRepository extends JpaRepository<Account, Long> {}
