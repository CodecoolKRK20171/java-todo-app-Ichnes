import java.util.Scanner;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {

      Scanner input = new Scanner(System.in);


      final int MAX = 2;

      ArrayList<String> myList = new ArrayList<String>();
      int choice = 0;

      while (choice != 5) {

          System.out.println();
          System.out.println("Type 1 to add a new thing to your to do list.");
          System.out.println("Type 2 to print the to do list.");
          System.out.println("Type 3 to mark todo list.");
          System.out.println("Type 4 to archive marked todo events.");
          System.out.println("Type 5 to exit program.");
          System.out.print("Select an option: ");
          choice = input.nextInt();
          int count = 0;

          if (choice == 1) {
              System.out.println("If you add new thing, press enter to add other new thing");
               for (int i=0; i<2; i++) {
                 input.nextLine();
                 myList.add(input.nextLine());
                  break;
               }
          }

          if (choice == 2) {
            System.out.println("List with all to do things:\n");
             for (int index = 0;index < myList.size(); index++) {
                  String value = myList.get(index);
                  System.out.println(index + " " + value);
             }
         }

     }

  }
}
