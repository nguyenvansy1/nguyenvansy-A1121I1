package CaseStudy.Models;

public class Employee extends Person {
    private String level ;
    private String position ;
    private int salary ;

    public Employee(){

    }

    public Employee(int id,String name, int age, String gender,int cmnd, String numberphone,String email ,String level, String position, int salary)
    {
        super(id,name,age,gender,cmnd,numberphone,email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String level, String position, int salary)
    {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", cmnd='" + getCmnd() + '\'' +
                ", numberphone='" + getNumberphone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getInfoToCSV(){
        return this.getId()+ ","+ this.getName()+ "," +this.getAge()+ ","+this.getGender()+ ","+this.getCmnd()+
                ","+this.getNumberphone()+","+this.getEmail()+ ","+this.getLevel()+ ","+this.getPosition()+ ","+this.getSalary();
    }
}

