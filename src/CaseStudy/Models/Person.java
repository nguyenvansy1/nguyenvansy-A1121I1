package CaseStudy.Models;

public abstract class Person {
    private String name;
    private int id;
    private int age ;
    private String gender;
    private int cmnd ;
    private String numberphone;
    private String email;

    public Person() {

    }


    public Person(int id, String name, int age, String gender,int cmnd, String numberphone, String email)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.cmnd = cmnd;
        this.numberphone = numberphone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
