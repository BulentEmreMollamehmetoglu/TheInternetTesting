package Inheritance;

public class Main {
    public static void main(String[] args) {
        IndividualCustomer bulent = new IndividualCustomer();
        bulent.customerNumber = "12345";
        CorporateCustomer hepsiBurada = new CorporateCustomer();
        hepsiBurada.customerNumber = "78910";
        IndividualCustomer bulent2 = new IndividualCustomer();
        bulent2.customerNumber = "12346";
        CorporateCustomer hepsiBurada2 = new CorporateCustomer();
        hepsiBurada2.customerNumber = "78911";
        CustomerManager customerManager = new CustomerManager();
//        customerManager.add(bulent);
//        customerManager.add(hepsiBurada);
        Customer[] customers = {bulent,bulent2,hepsiBurada,hepsiBurada2};
        customerManager.addMultiple(customers);

    }
}
