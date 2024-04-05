package org.dnyanyog.dto.response;

import org.springframework.stereotype.Component;

@Component
public class CustomerCanGetCardNoAndPinResponse {

  private String status;

  private String message;

  private long customerId;

  private String EmailId;

  private String cardNo;

  private String atmPin;

  private double balance;

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }

  public String getEmailId() {
    return EmailId;
  }

  public void setEmailId(String emailId) {
    EmailId = emailId;
  }
}
