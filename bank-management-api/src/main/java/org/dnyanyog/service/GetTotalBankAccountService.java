package org.dnyanyog.service;

import java.util.List;
import org.dnyanyog.entity.Account;
import org.dnyanyog.repo.GetTotalBankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetTotalBankAccountService {

  @Autowired GetTotalBankAccountRepository repo;

  public List<Account> getAllAccount() {
    return repo.findAll();
  }
}
