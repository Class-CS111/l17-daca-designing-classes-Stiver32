/********************************************
*	DACArecipient Tester: Cameron Ortega
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

public class Main {
  public static void main(String[] args) {
      DACArecipient r1 = new DACArecipient();
      int birthday = 2451564;
      int validFromDate = 2452000;
      int expirationDate = 2453000;

      r1.setAll("Mendez", "Javier", "56-3-445", "El Salvador", birthday, validFromDate, expirationDate, 'M');

      DACArecipient r2 = new DACArecipient();
      r2.setAll("Mendez", "Javier", "56-3-445", "El Salvador", birthday, validFromDate, expirationDate, 'M');

      DACArecipient r3 = new DACArecipient();
      r3.setAll("Garcia", "Maria", "99-9-999", "Mexico", 2450000, 2451000, 2452000, 'F');

      System.out.println(r1.toString());
      System.out.println(r3.toString());

      System.out.println("r1 equals r2? " + r1.equals(r2));
      System.out.println("r1 equals r3? " + r1.equals(r3));

      System.out.println(r1.printCard());
      System.out.println(r3.printCard());
  }
}
