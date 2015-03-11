/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  Card c = new Card("3", "Hearts", 5);
  Card b = new Card("A", "Clubs", 1);
  Card a = new Card("Q", "Spades", 13);
  System.out.println(c.toString());
  System.out.println(b.rank()+" "+b.suit()+" "+b.pointValue());
  System.out.println(a.matches(b));
 }
}
