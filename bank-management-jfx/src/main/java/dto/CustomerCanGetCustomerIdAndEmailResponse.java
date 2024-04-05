package dto;

public class CustomerCanGetCustomerIdAndEmailResponse {

  private String status;

  private String message;

  private long customerId;

  private String EmailId;

  private String cardNo;

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
