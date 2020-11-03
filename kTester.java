public class kTester {
  public static void main(String[] args) {
    SuperArray n2 = new SuperArray();
    n2.add("a"); n2.add("c"); n2.add("d");
    System.out.println("Expects [a,c,d]");
    System.out.println(n2.toString());
    n2.add(1,"b");
    System.out.println("\nExpects [a,b,c,d]");
    System.out.println(n2);
    n2.remove(2);
    System.out.println("\nExpects [a,b,d]");
    System.out.println(n2);
  }
}
