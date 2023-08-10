public class Classroom {
    String name;

    Classroom() { name = "unknown"; }

    Classroom(String name) { this.name = name; }

    void display() {
        System.out.println("The name of the stuent is " + name);
    }

    public static void main(String[] args) {
        Classroom std1 = new Classroom();
        Classroom std2 = new Classroom("Kevin");
        std1.display();
        std2.display();
    }
}