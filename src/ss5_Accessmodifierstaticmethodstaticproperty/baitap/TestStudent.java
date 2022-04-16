package ss5_Accessmodifierstaticmethodstaticproperty.baitap;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sy Nguyen");
        student.setCLass1("A1121i1");
        System.out.println(student.getName());
        System.out.println(student.getClass1());
    }
}
