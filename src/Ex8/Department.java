package Ex8;

import java.util.Arrays;

public class Department {
    private String depName;
    private Employee[] employees;
    private int numberOfEmployees = 0;


    public Department(String depName, Employee[] employees) {
        this.depName = depName;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depName='" + depName + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", numberOfEmployees=" + numberOfEmployees +
                '}';
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    public void printEmployeeList (){
        for (int i=0; i< numberOfEmployees;i++){
            System.out.println(employees[i]);
        }
    }
    public void printEmployeeListStreetName (){
        for (int i=0; i< numberOfEmployees;i++){
            System.out.println(employees[i].getAddressStreet());
        }
    }
    public Employee getEmployeeByName (String name){
        for (int i=0; i< numberOfEmployees;i++){
            if (name.equals(employees[i].getLastName())){
                return employees[i];
            }
        }
        return null;
    }

   //8.9. scrie o metoda care cauta o adresa (dupa strada) in lista de angajati a departamentului, si ii afiseaza strada daca o gaseste

    public String searchAddressByStreet(String streetName){
        Address address;
        // parcurgem lista de angajati a departametului si comparam numele strazii cu numele strazii fiecarui angajat
        for (int i=0; i<numberOfEmployees;i++){
            if (streetName.equals(employees[i].getAddressStreet())){
                return streetName;
            }
        }

        return null;
    }
}
