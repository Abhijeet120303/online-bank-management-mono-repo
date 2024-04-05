package org.dnyanyog.controller;

import org.dnyanyog.dto.response.GetTotalBalanceResponse;
import org.dnyanyog.service.GetToatalBalnaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTotalBalanceController {

  @Autowired private GetToatalBalnaceService getToatalBalnaceService;

  @GetMapping(path = "/api/v1/customer/get/balance/{customerId}")
  public ResponseEntity<GetTotalBalanceResponse> getTotalBalance(
      @PathVariable(name = "customerId") Long customerId) {
    try {
      if (customerId == null || customerId < 0) {
        return ResponseEntity.badRequest().build();
      }

      GetTotalBalanceResponse response = getToatalBalnaceService.getTotalBalance(customerId);

      if ("Success".equals(response.getStatus())) {
        return ResponseEntity.ok(response);
      } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
      }
    } catch (Exception e) {
      // Log the exception for debugging purposes
      e.printStackTrace();

      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
  }
}
