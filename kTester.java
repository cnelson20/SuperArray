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
    n3.add("d");
    System.out.println("\nExpects 0");
    System.out.println(n3.indexOf("d"));
    System.out.println("\nExpects 3");
    System.out.println(n3.lastIndexOf("d"));
    System.out.println("\nExpects false");
    System.out.println(n3.equals(n2));
    String[] temp2 = {"d","e","f","d"};
    nTemp = new SuperArray(temp2);
    System.out.println("\nExpects true");
    System.out.println(n3.equals(nTemp));
  }
}
