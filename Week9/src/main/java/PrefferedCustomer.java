public class PrefferedCustomer extends Customer {
    private int loyaltyPoints;
    private double discount;


    public PrefferedCustomer() {
        super();
    }


    public PrefferedCustomer(String name, String address, String Phone, String CustomerNumber, boolean mailingList, int loyaltyPoints) {
        super(name,address,Phone,CustomerNumber,mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discount = CalculateDiscount();
    }
    public void addloyaltyPoints(int points) {
        loyaltyPoints += points;
        setDiscountlevel();
    }

    private double CalculateDiscount(){
        if (loyaltyPoints >= 2000){
            return 10.0;
        }
        else if (loyaltyPoints >= 1500){
            return 7.0;
        }
        else if (loyaltyPoints >= 1000){
            return 6.0;
        }
        else if (loyaltyPoints >= 500){
            return 5.0;
        }
        else{
            return 0.0;
        }
    }

    private void setDiscountlevel(){
        this.discount = CalculateDiscount();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Preffered Customer " +
                "Loyalty Points: "+ loyaltyPoints +
                " Discount: "+discount+"%"+".";
    }
}
