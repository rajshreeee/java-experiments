public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddess;
 public VipCustomer(){
     this("Dinank", 4000.0, "bista.dinank@xyz.com");
     }

    public VipCustomer(String name, String emailAddess) {
     this(name, 4000.0, "bista.dinank@xyz.com");
        this.name = name;
        this.emailAddess = emailAddess;
        this.creditLimit = 4000.0;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddess() {
        return this.emailAddess;
    }

    public VipCustomer(String name, double creditLimit, String emailAddess) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddess = emailAddess;
 }
}
