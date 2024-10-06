import java.util.Random;
// R49_MSC02_J Generate strong random numbers Given the non-compliant code below:
 
Random number = new Random(123L);
//...
for (int i = 0; i < 20; i++) {
  // Generate another random integer in the range [0, 20]
  int n = number.nextInt(21);
  System.out.println(n);
}