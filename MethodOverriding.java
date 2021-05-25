package Oops;

class MethodOverriding {
    /*
     * override a method? same method name in different classes if child & parent
     * has has a method with same name is termed as method overrriding ;Same name &
     * same Parameters
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.info();

    }

}

class Boss {

    public void info() {
        System.out.println("I am a boss");

    }
}

class Employee extends Boss {
    public void info() {
        String name = "Sardar Puneet Parsad Singh";
        int age = 35;
        double salary = 5000000.00;
        System.out.println("Age=" + age);
        System.out.println("Name=" + name);
        System.out.println("Salary=" + salary);

    }
}
