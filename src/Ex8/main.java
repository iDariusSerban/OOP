package Ex8;

public class main {

    public static void main(String[] args) {

        Address address1 = new Address("Deva", "Aurel Vlaicu", 3);
        Address address2 = new Address("Hunedoara", "Mihai Eminescu", 3);

        Address address3 = new Address("Turda", "Ion Caramitru", 3);
        Address address4 = new Address("Simeria", "Vasile Alecsandri", 3);
        Address address5 = new Address("Calan", "Tudor Arghezi", 3);

        Employee employee1 = new Employee("Ion", "Popa", 5000, address1);
        Employee employee2 = new Employee("Marcel", "Strant", 5000, address2);

        Employee employee3 = new Employee("Alin", "Craciun", 5000, address3);
        Employee employee4 = new Employee("Vasile", "Pop", 5000, address4);
        Employee employee5 = new Employee("Gheorge", "Popescu", 5000, address5);

        Employee[] employeesdep1 = {employee1, employee2};
        Employee[] employeesdep2 = {employee3, employee4, employee5};

        Department department1 = new Department("Contabilitate", employeesdep1);
        department1.setNumberOfEmployees(employeesdep1.length);
        Department department2 = new Department("Marketing", employeesdep2);
        department2.setNumberOfEmployees(employeesdep2.length);

        Department[] depList = {department1, department2};


        Company company = new Company("Intel", 1940, depList);
        company.setNumberOfDep(depList.length);

        System.out.println(employee1.getFullName()); //EX1
        System.out.println(employee3.getAddressStreet()); //EX2
        System.out.println(employee2.getAddress()); //EX3
        System.out.println(department1.getNumberOfEmployees()); //EX4
        System.out.println(department2.getNumberOfEmployees()); //EX4
        department2.printEmployeeList(); //ex5
        department1.printEmployeeListStreetName(); //ex6
        System.out.println(" ");

        searchEmployee("Pop", department2); //ex7
        printEmployeeAddress("Craciun", department2); // ex8
        printAddressByStreet("Aurel Vlaicu", department1);//ex9
        System.out.println(" ");

        company.printDep(); //ex10
        company.printEmployeesFromDep(department2); //ex11
        company.numberOfEmployeesFromDep(department1); //ex12


    }

    public static void searchEmployee(String name, Department department) {
        if (department.getEmployeeByName(name) == null) {
            System.out.println("Nu este nici un angajat cu numele respectiv");
        } else {
            System.out.println(department.getEmployeeByName(name).getFullName());
        }
    }

    public static void printEmployeeAddress(String name, Department department) {
        if (department.getEmployeeByName(name) == null) {
            System.out.println("Nu este nici un angajat cu numele respectiv");
        } else {
            System.out.println(department.getEmployeeByName(name).getAddress());
        }
    }

    public static void printAddressByStreet(String streetName, Department department) {
        if (department.searchAddressByStreet(streetName) == null) {
            System.out.println("Nu este nici un angajat pe strada respectiva");
        } else {
            System.out.println(department.searchAddressByStreet(streetName));
        }
    }
}