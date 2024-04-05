package total_customer_bank_account;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TotalCustomerBankAccountController {

  @FXML private TableView<TotalAccounts> tableView;

  @FXML private TableColumn<TotalAccounts, String> firstName;

  @FXML private TableColumn<TotalAccounts, String> lastName;

  @FXML private TableColumn<TotalAccounts, String> mobileNumber;

  @FXML private TableColumn<TotalAccounts, String> emailId;

  @FXML private TableColumn<TotalAccounts, String> atmPin;

  @FXML private TableColumn<TotalAccounts, String> customerId;

  @FXML private TableColumn<TotalAccounts, String> cardNo;

  @FXML private TableColumn<TotalAccounts, String> accountType;

  @FXML private TableColumn<TotalAccounts, String> balance;

  @FXML private TableColumn<TotalAccounts, String> accountStatus;

  @FXML private TextField customerIds;

  @FXML private TextField firstNames;

  @FXML private TextField accountNumber;

  @FXML private TextField reset;

  @FXML
  private void initialize() {}

  @FXML
  private void reset() {}
}
