package org.dnyanyog.dto.response;

import org.springframework.stereotype.Component;

@Component
public class AddAccountData {
  private long customerId;

  private String cardNo;

  private String accountType;

  private double balance;

  private String atmPin;

  private String accountStatus;

  private long serialNo;

  private String emailId;

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long l) {
    this.customerId = l;
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

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

  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }

  public long getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(long serialNo) {
    this.serialNo = serialNo;
  }
}
