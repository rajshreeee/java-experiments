package javaExperiments.shraday.bank;

public class VipCustomer {
    String name;
    float creditLimit;
    String email;

    public VipCustomer() {
        this("", 0, "");
    }
    public VipCustomer(String name) {
        this(name, 0, "");
    }

    public VipCustomer(String name, float creditLimit){
        this(name, creditLimit, "");
    }
    
    public VipCustomer(String name, float creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
