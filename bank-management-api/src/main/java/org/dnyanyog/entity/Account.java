package org.dnyanyog.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table
public class Account {

  //	@GeneratedValue
  @Id @Column private long customerId;

  @Column private String atmPin;

  @Column private String cardNo;

  @Column private String accountType;

  @Column private double balance;

  @Column private String accountStatus;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "customerId")
  private CustomerResgistration customer;

  public CustomerResgistration getCustomer() {
    return customer;
  }

  public void setCustomer(CustomerResgistration customer) {
    this.customer = customer;
  }

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
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

  public String getAccountStatus() {
    return accountStatus;
  }

  public void setAccountStatus(String accountStatus) {
    this.accountStatus = accountStatus;
  }
}
