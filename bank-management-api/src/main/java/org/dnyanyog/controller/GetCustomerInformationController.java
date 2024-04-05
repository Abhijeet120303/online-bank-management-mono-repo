package org.dnyanyog.controller;

import org.dnyanyog.dto.response.GetCustomerInformationResponse;
import org.dnyanyog.service.GetCustomerInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetCustomerInformationController {

  @Autowired private GetCustomerInformationService getCustomerInformationService;

  @GetMapping(path = "/api/v1/customer/get/information/{customerId}")
  public ResponseEntity<GetCustomerInformationResponse> getCustomerInformation(
      @PathVariable(name = "customerId") Long customerId) {
    try {
      if (customerId == null || customerId < 0) {
        return ResponseEntity.badRequest().build();
      }

      GetCustomerInformationResponse response =
          getCustomerInformationService.getCustomerInformation(customerId);

      if ("Success".equals(response.getStatus())) {
        return ResponseEntity.ok(response);
      } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
      }
    } catch (Exception e) {
      e.printStackTrace();

      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
