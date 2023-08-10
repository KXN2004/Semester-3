class Teacher { 
    String name;
    
    void display() {
        System.out.println("The name of the teacher is " + name);
    }
}

class Professor extends Teacher {
    Professor(String name) { this.name = name; }

    void display() { 
        System.out.println("The name of the Professor is " + name);
    }
}

class AssociateProfessor extends Teacher{
    AssociateProfessor(String name) { this.name = name; }

    void display() {
        System.out.println("The name of the Associate Professor is " + name);
    }

}

public class Staff {
    public static void main(String[] args) {
        Professor prof = new Professor("Ms. Kavitha");
        AssociateProfessor assProf = new AssociateProfessor("Ms. Kavya");
        prof.display();
        assProf.display();
    }    
}
