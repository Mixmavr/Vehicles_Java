package Car_Dealership;

public class Dealership {

    public static void main(String[] args){

        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress("123 Anything st");
        cust1.setCash(12000);

        Vehicle vehicle = new Vehicle();
        Employee emp = new Employee();

        cust1.purchase(vehicle,emp,false);




    }
}
