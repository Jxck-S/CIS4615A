// R05 OBJ01-J. Limit accessibility of fields
public class Widget {
    private int total; // Number of elements

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