package org.dnyanyog.dto.response;

import org.springframework.stereotype.Component;

@Component
public class AdminCanEditTheCustomersResponse {

  private String status;

  private String message;

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
}
