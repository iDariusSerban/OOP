package Ex8;

public class Employee {
    private String firstName;
    private String lastName;

    private int salary;
    private Address address;

    public Employee(String firstName , String lastName , int salary, Address address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName (){
        return this.firstName + " " + this.lastName;
    }
    public String getAddressStreet(){
        return address.getStreet();
    }
}
