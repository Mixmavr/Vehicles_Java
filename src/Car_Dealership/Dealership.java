package Car_Dealership;

public class Dealership {

    public static void main(String[] args){

        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress("123 Anything st");
        cust1.setCash(25000);

        Vehicle vehicle = new Vehicle("BMW","M3","20000");
        vehicle.setMake("Honda");
        vehicle.setModel("Accord");
        vehicle.setPrice(15000);
        Employee emp = new Employee();

        cust1.purchase(vehicle,emp,false);

        Vehicle car = new Vehicle("BMW","M3","20000");






    }
}
