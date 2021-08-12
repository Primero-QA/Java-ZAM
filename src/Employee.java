public class Employee {
    String firstName, lastName, position, email, phone;
    int salary, age;

    public Employee (String firstName, String lastName, String position, String email, String phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee () {
        System.out.println("First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Position: " + position + "\n" +
                "E-mail: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Salary: " + salary + "\n" +
                "Age: " + age + "\n");
    }
}
