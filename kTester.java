public class kTester {
  public static void main(String[] args) {
    //add, remove tester
    SuperArray n2 = new SuperArray();
    n2.add("a"); n2.add("c"); n2.add("d");
    System.out.println("Expects [a,c,d]");
    System.out.println(n2);
    n2.add(1,"b");
    System.out.println("\nExpects [a,b,c,d]");
    System.out.println(n2);
    n2.remove(2);
    System.out.println("\nExpects [a,b,d]");
    System.out.println(n2);
    //removeDuplicates tester;
    n2.add("b"); n2.add("a");
    n2.removeDuplicates();
    System.out.println("\nExpects [a,b,d]");
    System.out.println(n2);
    n2.add("c"); n2.add("e"); n2.add("f");
    String[] temp = {"d","e","f","g","h","i"};
    SuperArray nTemp = new SuperArray(temp);
    SuperArray n3 = SuperArray.findOverlap(n2,nTemp);
    System.out.println("\nExpects [d,e,f]");
    System.out.println(n3);

  }
}
