package org.dnyanyog.controller;

import org.dnyanyog.dto.request.CustomerCanGetCardNoAndPinRequest;
import org.dnyanyog.dto.response.CustomerCanGetCardNoAndPinResponse;
import org.dnyanyog.service.CustomerCanGetCardNoAndPinSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerCanGetCardNoAndPinController {

  @Autowired CustomerCanGetCardNoAndPinSrvice service;

  @PostMapping(path = "/api/v1/customer/get/cardNoAndPin")
  public CustomerCanGetCardNoAndPinResponse getCustomerInformation(
      @RequestBody CustomerCanGetCardNoAndPinRequest request) {
    return service.getCustomerInformation(request);
  }
}
