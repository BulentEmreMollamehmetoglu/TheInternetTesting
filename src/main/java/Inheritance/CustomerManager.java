package Inheritance;

public class CustomerManager {
    public void add(Customer customer){
        System.out.println(customer.customerNumber + " added");
    }
    public void addMultiple(Customer[] customers){
        for(Customer customer : customers){
            add(customer);
        }
    }
}
