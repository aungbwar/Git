public class recrusion {
  public static void main(String[] args) {

    System.out.println(factorial(5));
  
  }

  public static int factorial(int x ) {
    if (x == 1) {return x; }
    return factorial(x - 1) * x;
  }
}
