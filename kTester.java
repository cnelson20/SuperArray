public class kTester {
  public static void main(String[] args) {
    SuperArray n = new SuperArray();
    for (int i = 0; i < 255; i++) {
      n.add("" + (char)(i));
    }
    for(int i = 0; i < n.size(); i++){
      System.out.print(n.get(i));
    }
    System.out.println("");
    System.out.println(n.indexOf("A"));
    SuperArray n2 = new SuperArray();
    System.out.println(n2);
  }
}
