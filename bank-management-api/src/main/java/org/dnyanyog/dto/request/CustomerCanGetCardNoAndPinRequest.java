package org.dnyanyog.dto.request;

import org.springframework.stereotype.Component;

@Component
public class CustomerCanGetCardNoAndPinRequest {

  private String customerId;

  private String EmailId;

  private String cardNo;

  private String atmPin;

  private String emailId;

  public String getAtmPin() {
    return atmPin;
  }

  public void setAtmPin(String atmPin) {
    this.atmPin = atmPin;
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public String getEmailId() {
    return EmailId;
  }

  public void setEmailId(String emailId) {
    EmailId = emailId;
  }
}
