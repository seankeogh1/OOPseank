


public class CusomerApp {
    public static void main(String[] args) {
        PrefferedCustomer prefferedCustomer2 = new PrefferedCustomer();
        prefferedCustomer2.setName("Sean");
        prefferedCustomer2.setAddress("ATU");
        prefferedCustomer2.setPhone("0837446738");
        prefferedCustomer2.setCust_num("2009");
        prefferedCustomer2.setMailingList(false);
        prefferedCustomer2.addloyaltyPoints(700);
        System.out.println(prefferedCustomer2);

        prefferedCustomer2.addloyaltyPoints(800);
        System.out.println(prefferedCustomer2);
    }
}
