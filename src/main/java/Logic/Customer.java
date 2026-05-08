package Logic;

public class Customer {
    private String fname;
    private String lname;
    private String postcode;

    public Customer(String fnane, String lname, String postcode){
        this.fname = fname;
        this.lname = lname;
        this.postcode = postcode;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void trackDelivery(){}
    public void placeDelivery(){}
    public void cancelDelivery(){}

    public void Register(){}
    public void login(){}

}
