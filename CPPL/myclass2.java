abstract class animal {
    abstract void animalSound();
    public void sleep() {
        System.out.println("I am sleeping!");
    }
}

class dog extends animal {
    public void animalSound() {
        System.out.println("The dog says hello!");
    }
}

public class myclass2 {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.animalSound();
        d1.sleep();
    }
}
