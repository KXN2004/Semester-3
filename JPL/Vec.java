import java.util.*;

class Vec
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    Vector <String> v = new Vector <String> ();
    for (int i = 3; i >= 0; i--)
    {
      System.out.println("Enter a String:");
      String input = scan.next();
      if (v.contains(input))
      {
        v.remove(input);
        System.out.println("The vector now is " + v);
      }
      else
      {
        v.add(input);
        System.out.println("The updated vector is " + v);
      }
    }
  }
}