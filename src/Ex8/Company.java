package Ex8;

public class Company {
    private String companyName;
     private int foundingYear;
     private  Department[] departments;

     private int numberOfDep = 0;


    public Company(String companyName, int foundingYear, Department[] departments) {
        this.companyName = companyName;
        this.foundingYear = foundingYear;
        this.departments = departments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public void setFoundingYear(int foundingYear) {
        this.foundingYear = foundingYear;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getNumberOfDep() {
        return numberOfDep;
    }

    public void setNumberOfDep(int numberOfDep) {
        this.numberOfDep = numberOfDep;
    }

    public void printDep(){
        for (int i = 0; i < numberOfDep; i++) {
            System.out.println(departments[i]);
        }
    }
    public void printEmployeesFromDep (Department department){
        department.printEmployeeList();
    }
    public void numberOfEmployeesFromDep(Department department){
        System.out.println(department.getNumberOfEmployees());
    }

    public int getNumberOfEmployees(){
        int count =0;
        for (int i = 0; i < departments.length; i++) {
           count+=departments[i].getEmployees().length;
        }
        return count;
    }
    public String[] getAllEmployees(){
        String[] allEmployeesNames = new String[getNumberOfEmployees()];
        int k= 0;
        for (int i = 0; i < departments.length; i++) {
            for (int j= 0; j< departments[i].getEmployees().length; j++){
                allEmployeesNames[k]= departments[i].getEmployees()[j].getFullName();
                k++;
            }
        }
        return allEmployeesNames;
    }
}
