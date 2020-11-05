public class Demo {
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray newArr = new SuperArray(Math.min(a.length(),b.length()));
    for (int i = 0; i < a.length(); i++) {
      if (b.contains(a.get(i))) {
        newArr.add(a.get(i));
      }
    }
    return removeDuplicates(newArr);
  }
  public static SuperArray removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.length(); i++) {
      if (s.indexOf(s.get(i)) != i) {
        s.remove(i);
        i--;
      }
    }
    return s;
  }
  public static SuperArray zip(SuperArray a, SuperArray b) {
    int i;
    for (i = 0; 2 * i < Math.min(a.length(),b.length()); i++) {
      a.add(2 * i + 1,b.get(i));
    }
    for (int j = i; j < b.length(); j++) {
      a.add(b.get(j));
    }
    return a;
  }
}
