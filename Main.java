import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> words = new ArrayList<>();

    System.out.println("Please enter words, enter STOP to stop the loop.");
    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      words.add(input);
    }
    words.remove(words.size()-1);
    System.out.println(words.size());
    System.out.print("[");
    for (String word : words) {
      System.out.print(word);
      if (word != words.get(words.size()-1)){
        System.out.print(", ");
      }
    }
    System.out.println("]");

    if (words.size() > 2){
      words.remove(words.size()-1);
      words.add(words.get(0));
      words.remove(0);
    }

    System.out.print("[");
    for (String word : words) {
      System.out.print(word);
      if (word != words.get(words.size()-1)){
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }
}
