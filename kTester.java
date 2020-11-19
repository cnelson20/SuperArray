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
    n2 = Demo.removeDuplicates(n2);
    System.out.println("\nExpects [a,b,d]");
    System.out.println(n2);
    n2.add("c"); n2.add("e"); n2.add("f");
    //findOverlap()
    String[] temp = {"d","e","f","g","h","i"};
    SuperArray nTemp = new SuperArray(temp);
    SuperArray n3 = Demo.findOverlap(n2,nTemp);
    System.out.println("\nExpects [d,e,f]");
    //test indexOf() and lastIndexOf()
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
    //zip tester
    String[] temp3 = {"0","1","2"};
    String[] temp4 = {"d","e","f","d"};
    nTemp = new SuperArray(temp3);
    System.out.println("\nExpects [d,0,e,1,f,2,d]");
    System.out.println(Demo.zip(n3, nTemp));
    n3 = new SuperArray(temp4);
    nTemp.add("3");
    System.out.println("\nExpects [d,0,e,1,f,2,d,3]");
    System.out.println(Demo.zip(n3, nTemp));
    nTemp.add("4");
    n3 = new SuperArray(temp4);
    System.out.println("\nExpects [d,0,e,1,f,2,d,3,4]");
    System.out.println(Demo.zip(n3, nTemp));
    //System.out.println(n3);
    System.out.println("set()");
    try {
      n3.set(-1,"hello");
    } catch (IllegalArgumentException e) {
      System.out.println("Error Caught Index out of bounds");
    } catch (Exception e) {
      System.out.println("Unknown error occurred");
      e.printStackTrace();
    }
    System.out.println("\nget()");
    try {
      n3.get(-1);
    } catch (IllegalArgumentException e) {
      System.out.println("Error Caught Index out of bounds");
    } catch (Exception e) {
      System.out.println("Unknown error occurred");
      e.printStackTrace();
    }
    System.out.println("\nadd()");
    try {
      n3.add(-1,"hello");
    } catch (IllegalArgumentException e) {
      System.out.println("Error Caught Index out of bounds");
    } catch (Exception e) {
      System.out.println("Unknown error occurred");
      e.printStackTrace();
    }
    System.out.println("\nremove()");
    try {
      n3.remove(-1);
    } catch (IllegalArgumentException e) {
      System.out.println("Error Caught Index out of bounds");
    } catch (Exception e) {
      System.out.println("Unknown error occurred");
      e.printStackTrace();
    }


  }
}
