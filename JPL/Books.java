class Book {
    void display() {
        System.out.println("I am a blank book!");
    }
}

class ReferenceBook extends Book {
    void display() {
        System.out.println("I am a Reference Book!");
    }
}

class Magazine extends Book {
    void display() {
        System.out.println("I am a Magazine!");
    }
}

public class Books {
    public static void main(String[] args) {
        ReferenceBook refbook = new ReferenceBook();
        Magazine mag = new Magazine();
        refbook.display();
        mag.display();
    }
}
