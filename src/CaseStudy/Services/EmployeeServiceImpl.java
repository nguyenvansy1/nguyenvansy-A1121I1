//package CaseStudy.Services;
//
//import CaseStudy.Models.Employee;
//import FinalExamModule2.util.ReadAndWrite;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class EmployeeServiceImpl extends Employee implements EmployeeService {
//    public static List<Employee> employeeList = new ArrayList<>();
//    Scanner sc = new Scanner(System.in);
//    private static final String PHONE_NUMBER = "\\+84-[\\d]{9}";
//
//
//    @Override
//    public void display() {
//        List<Employee> employeeList = ReadAndWrite.readEmployeeListFromCSV();
//        if (employeeList.isEmpty()) {
//            System.out.println("Employee list is empty ->Please enter list employee! ");
//        }
//        else {
//            for (int i = 0; i < employeeList.size(); i++) {
//                System.out.println((i + 1) + "." + employeeList.get(i));
//            }
//        }
//    }
//
//    @Override
//    public void addNew() {
//        int id = -1;
//        if (employeeList.isEmpty()) {
//            id = 1;
//        } else {
//            id = employeeList.get(employeeList.size() - 1).getId() + 1;
//        }
//        System.out.println("Id: " + id);
//
//        String name;
//        do {
//            System.out.println("Input Name: ");
//            name = sc.nextLine();
//        } while (name.equals(""));
//
//        int age = 0;
//        do {
//            System.out.println("Input Age: ");
//            try {
//                age = Integer.parseInt(sc.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Please enter the number that is right format");
//                continue;
//            }
//            if (age < 18 || age > 100) {
//                System.out.println("Error: Invalid date -> Try again! ");
//                continue;
//            }
//            break;
//        } while (true);
//
////        String age;
////        while (true) {
////            System.out.println("Age: ");
////            age= scanner.nextLine();
////            SimpleDateFormat age = new SimpleDateFormat("dd-MM-yyyy");
////            age.setLenient(false);
////            try {
////                age.parse(birthday);
////            }
////            catch (ParseException e) {
////                System.out.println("Error: Invalid date -> Try again! ");
////                continue;
////            }
////            break;
////        }
//
//        String gender;
//        do {
//            System.out.println("Input Gender: ");
//            String str = sc.nextLine();
//
//            if (str.toLowerCase().equals("man") || str.toLowerCase().equals("women")) {
//                gender = str.toUpperCase();
//                break;
//            } else {
//                System.out.println("Error: Gender does not exist -> Try again!");
//                continue;
//            }
//
//        } while (true);
//
//        int idCard=0;
//        do {
//            System.out.println("Input idCard: ");
//            try {
//                idCard = Integer.parseInt(sc.nextLine());
//            } catch (NumberFormatException e) {
//                System.out.println("Please enter the number that is right format");
//            };
//            break;
//        } while (true);
//
//        System.out.println("Input NumberPhone: ");
//        String numberPhone = inputNumberPhone();
////        do {
////            System.out.println("Input NumberPhone: ");
////            try {
////                numberPhone = inputNumberPhone();
////            } catch (Exception e) {
////                System.out.println("Please enter the number that is right format");
////                continue;
////            }
////            break;
////        } while (true);
//
//        String email;
//        do {
//            System.out.println("Input Email: ");
//            email = sc.nextLine();
//        } while (email.equals(""));
//
//        String level;
//        do {
//            System.out.println("Input Level: ");
//            level = sc.nextLine();
//        } while (level.equals(""));
//
//        String position;
//        do {
//            System.out.println("Input Position: ");
//            position = sc.nextLine();
//        } while (position.equals(""));
//
//        int salary;
//        do {
//            try {
//                System.out.println("Salary:");
//                salary = Integer.parseInt(sc.nextLine());
//            } catch (Exception err) {
//                System.out.println("Error: Could not salary to number ->Try again!");
//                continue;
//            }
//            if (salary <= 0) {
//                System.out.println("Error: Invalid salary ->Try again!");
//                continue;
//            }
//            break;
//        } while (true);
//
//        Employee employee = new Employee(id, name, age, gender, idCard, numberPhone, email, level, position, salary);
//        employeeList.add(employee);
//        if (employeeList.size() == 1) {
//            ReadAndWrite.writeEmployeeListToCSV(employeeList, true);
//        }
//        else
//        if (employeeList.size() > 1) {
//            for (int i = 0; i < employeeList.size()-1; i++) {
//                employeeList.remove(i);
//            }
//            ReadAndWrite.writeEmployeeListToCSV(employeeList, true);
//        }
//    }
//
////        String line = this.getId()+ ","+ this.getName()+ "," +this.getAge()+ ","+this.getGender()+ ","+this.getCmnd()+
////                ","+this.getNumberphone()+","+this.getEmail()+ ","+this.getLevel()+ ","+this.getPosition()+ ","+this.getSalary();
//
//
//
//    @Override
//    public void edit() {
//
//        List<Employee> employeeList = ReadAndWrite.readEmployeeListFromCSV();
//        if (employeeList.isEmpty()) {
//            System.out.println("Employee list is empty ->Please enter list employee! ");
//            System.out.println("---------------------------");
//        }
//        else {
//            display();
//            System.out.println("Select the employee id to edit: ");
//            int idEdit = 0;
//            do {
//                try {
//                    idEdit = Integer.parseInt(sc.nextLine());
//                } catch (NumberFormatException e) {
//                    System.out.println("Please enter the number that is right format");
//                    continue;
//                }
//                break;
//            } while (true);
//            for (int i = 0; i < employeeList.size(); i++) {
//                if (idEdit == employeeList.get(i).getId()) {
//                    int id = employeeList.get(i).getId();
//
//                    String name;
//                    do {
//                        System.out.println("Input Name: ");
//                        name = sc.nextLine();
//                    } while (name.equals(""));
//
//                    int age = 0;
//                    do {
//                        System.out.println("Input Age: ");
//                        try {
//                            age = Integer.parseInt(sc.nextLine());
//                        } catch (NumberFormatException e) {
//                            System.out.println("Please enter the number that is right format");
//                            continue;
//                        }
//                        if (age < 18 || age > 100) {
//                            System.out.println("Error: Invalid date -> Try again! ");
//                            continue;
//                        }
//                        break;
//                    } while (true);
//
////        String age;
////        while (true) {
////            System.out.println("Age: ");
////            age= scanner.nextLine();
////            SimpleDateFormat age = new SimpleDateFormat("dd-MM-yyyy");
////            age.setLenient(false);
////            try {
////                age.parse(birthday);
////            }
////            catch (ParseException e) {
////                System.out.println("Error: Invalid date -> Try again! ");
////                continue;
////            }
////            break;
////        }
//
//                    String gender;
//                    do {
//                        System.out.println("Input Gender: ");
//                        String str = sc.nextLine();
//
//                        if (str.toLowerCase().equals("man") || str.toLowerCase().equals("women")) {
//                            gender = str.toLowerCase();
//                            break;
//                        } else {
//                            System.out.println("Error: Gender does not exist -> Try again!");
//                            continue;
//                        }
//                    } while (true);
//
//                    int idCard;
//                    do {
//                        System.out.println("Input idCard: ");
//                        try {
//                            idCard = Integer.parseInt(sc.nextLine());
//                        } catch (NumberFormatException e) {
//                            System.out.println("Please enter the number that is right format");
//                            continue;
//                        }
//                        break;
//                    } while (true);
//
//                    System.out.println("Input NumberPhone");
//                    String numberPhone = inputNumberPhone();
//
//
//                    String email;
//                    do {
//                        System.out.println("Input Email: ");
//                        email = sc.nextLine();
//                    } while (email.equals(""));
//
//                    String level;
//                    do {
//                        System.out.println("Input Level: ");
//                        level = sc.nextLine();
//                    } while (level.equals(""));
//
//                    String position;
//                    do {
//                        System.out.println("Input Position: ");
//                        position = sc.nextLine();
//                    } while (position.equals(""));
//
//                    int salary;
//                    do {
//                        try {
//                            System.out.println("Salary:");
//                            salary = Integer.parseInt(sc.nextLine());
//                        } catch (Exception err) {
//                            System.out.println("Error: Could not salary to number ->Try again!");
//                            continue;
//                        }
//                        if (salary <= 0) {
//                            System.out.println("Error: Invalid salary ->Try again!");
//                            continue;
//                        }
//                        break;
//                    } while (true);
//                    employeeList.set(i, new Employee(id, name, age, gender, idCard, numberPhone, email, level, position, salary));
//                    ReadAndWrite.writeEmployeeListToCSV(employeeList, false);
//                    break;
//                }
//            }
//        }
//
//
//    }
//
//
//    @Override
//    public void delete() {
//
//        List<Employee> employeeList = ReadAndWrite.readEmployeeListFromCSV();
//        if (employeeList.isEmpty()) {
//            System.out.println("Employee list is empty ->Please enter list employee! ");
//            System.out.println("---------------------------");
//        } else {
//            display();
//            System.out.println("Select the employee id to delete: ");
//            int idDelete;
//            do {
//                try {
//                    idDelete = Integer.parseInt(sc.nextLine());
//                } catch (NumberFormatException e) {
//                    System.out.println("Please enter the number that is right format");
//                    continue;
//                }
//                break;
//            } while (true);
//
//            for (int i = 0; i < employeeList.size(); i++) {
//                if (idDelete == employeeList.get(i).getId()) {
//                    employeeList.remove(i);
//                }
//            }
//            ReadAndWrite.writeEmployeeListToCSV(employeeList, false);
//
//        }
//    }
//
//    public void search() {
//        List<Employee> employeeList = ReadAndWrite.readEmployeeListFromCSV();
//        if (employeeList.isEmpty()) {
//            System.out.println("Employee list is empty ->Please enter list employee! ");
//            System.out.println("---------------------------");
//        } else {
//            System.out.println("Select the employee id to search: ");
//            int idSearch;
//            do {
//                try {
//                    idSearch = Integer.parseInt(sc.nextLine());
//                } catch (NumberFormatException e) {
//                    System.out.println("Please enter the number that is right format");
//                    continue;
//                }
//                break;
//            } while (true);
//
//            for (int i = 0; i < employeeList.size(); i++) {
//                if (idSearch == employeeList.get(i).getId()) {
//                    System.out.println((i + 1) + "." + employeeList.get(i));
//                    System.out.println("-------------------------");
//                }
//            }
//        }
//    }
//
//    public String inputNumberPhone(){
//
//        return Regex.regexStr(sc.nextLine(),PHONE_NUMBER,"Import bad format -> Please enter again: ");
//    }
//}
//
