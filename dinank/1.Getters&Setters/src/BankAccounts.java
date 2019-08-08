public class BankAccounts {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmailAddress;
    private String phoneNumber;

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
   public String getCustomerEmailAddress(){
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress){
        this.customerEmailAddres = customerEmalAddress;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double balance){
        this.accountBalance += balance;
        System.out.println(balance + ntd into account number: " + this.accountNumber);
    }

    public void withdrawFunds(double balance){
        if (this.accountBalance - balance < 0){
            this.accountBalance -= balance;
            System.out.println( balance + "has been withdrawn from account number: " + this.accountNumber);
        }
    }
}
