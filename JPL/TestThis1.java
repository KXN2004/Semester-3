class Employee {
    double salary = 10000;
}

class Programmer extends Employee {
    double bonus = 5000;
}

class TestThis1 {
    public static void main(String[] args) {
        Employee coder = new Employee();
        System.out.println("The salary of the programmer is " + coder.salary);
        System.out.println("The bonus of the programmer is " + coder.bonus);
    }
}