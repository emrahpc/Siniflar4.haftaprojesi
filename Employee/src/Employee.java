public class Employee {

    private int id;
    private String name;
    private int Salary;
    private String Department;

    public Employee(){



    }
    public Employee(int id,String name,int Salary,String Department)
    {
       this.id=id;
       this.name=name;
       this.Salary=Salary;
       this.Department=Department;

    }



    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int CalculateBonus(){

        return getSalary();

    }
    public void Info(){
        System.out.println("id " + id +",name " + name +",salary " + Salary +",department " + Department);

    }

}
