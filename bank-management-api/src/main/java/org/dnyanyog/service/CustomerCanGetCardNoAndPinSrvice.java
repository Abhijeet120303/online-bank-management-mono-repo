package org.dnyanyog.service;

import java.util.Optional;
import org.dnyanyog.dto.request.CustomerCanGetCardNoAndPinRequest;
import org.dnyanyog.dto.response.CustomerCanGetCardNoAndPinResponse;
import org.dnyanyog.entity.Account;
import org.dnyanyog.entity.CustomerResgistration;
import org.dnyanyog.repo.AdminCanSearchTheCustomersRepository;
import org.dnyanyog.repo.CustomerCanGetCardNoAndPinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerCanGetCardNoAndPinSrvice {

  @Autowired CustomerCanGetCardNoAndPinRepository repo;

  @Autowired AdminCanSearchTheCustomersRepository repo1;

  public CustomerCanGetCardNoAndPinResponse getCustomerInformation(
      CustomerCanGetCardNoAndPinRequest request) {

    CustomerCanGetCardNoAndPinResponse response = new CustomerCanGetCardNoAndPinResponse();

    Optional<Account> accountData =
        repo.findByCardNoAndAtmPin(request.getCardNo(), request.getAtmPin());

    if (accountData.isPresent()) {
      Account acc = accountData.get();

      response.setStatus("Success");
      response.setMessage("CustomerId And Email Successfully Get");

      response.setCustomerId(acc.getCustomerId());
      response.setBalance(acc.getBalance());

      CustomerResgistration customer = acc.getCustomer(); // Fix this line

      if (customer != null) {
        String emailId = customer.getEmailId();
        response.setEmailId(emailId);
      } else {
        response.setStatus("Error");
        response.setMessage("Customer Not Found");
      }

    } else {
      response.setStatus("Error");
      response.setMessage("CustomerId Not Found");
    }

    return response;
  }
}
