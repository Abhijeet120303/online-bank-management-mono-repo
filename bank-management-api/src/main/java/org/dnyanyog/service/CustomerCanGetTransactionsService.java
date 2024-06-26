package org.dnyanyog.service;

import java.util.List;
import org.dnyanyog.entity.Transactions;
import org.dnyanyog.repo.CustomerCanGetTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerCanGetTransactionsService {

  @Autowired CustomerCanGetTransactionsRepository repo;

  public List<Transactions> getTransactionsByCustomerId(Long customerId) {
    return repo.findByCustomerId(customerId);
  }
}
