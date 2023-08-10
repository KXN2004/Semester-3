import java.util.Scanner;

class Employee {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    String name[] = new String[10];
    String address[] = new String[10];
    int year[] = new int[10];
    for (int i = 0; i < 3; i++)
    {
        System.out.println("For employee no. " + (i + 1));
        System.out.println("Enter the name of Employee: ");
        name[i] = input.next();
        System.out.println("Enter the year of joining: ");
        year[i] = input.nextInt();
        System.out.println("Enter the address: ");
        address[i] = input.next();
        System.out.println();
    }
    System.out.println("Name  Year of Joining  Address");
    for (int i = 0; i < 3; i++)
    {
      System.out.print(name[i] + "\t" + year[i] + "\t" + address[i]);
      System.out.println();
    }
  }
}