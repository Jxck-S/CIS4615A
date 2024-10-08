// R05 OBJ01-J. Limit accessibility of fields Given the non-compliant code below:
public class Widget {
    public int total; // Number of elements
   
    void add() {
      if (total < Integer.MAX_VALUE) {     
        total++;
        // ...
      } else {
        throw new ArithmeticException("Overflow");
      }
    }
   
    void remove() { 
      if (total > 0) {     
        total--;
        // ...
      } else {
        throw new ArithmeticException("Overflow");
      }
    }
  }