public class SuperArray {

  //a:
  private String[] data;
  private int size;

  //b:
  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public SuperArray(String[] arr) {
    data = arr;
  }
  //g:
  private void resize(int x) {
    String[] newArr = new String[size+x];
    for (int i = 0; i < size; i++) {
      newArr[i] = data[i];
    }
    data = newArr;
  }
  //c
  public int size() {
    return size;
  }
  //d
  public boolean add(String element) {
    if (size >= data.length) {resize(1);}
    data[size] = element;
    size++;
    return true;
  }
  //e
  public String get(int index) {
    return data[index];
  }
  //f
  public String set(int index, String element) {
    data[index] = element;
    return element;
  }
  public int indexOf(String element) {
    for (int i = 0; i < size - 1; i++) {
      if (data[i].equals(element)) {
        return i;
      }
    }
    return -1;
  }
  //nov 3 do now
  public boolean contains(String element) {
    return indexOf(element) != -1;
  }
  public boolean isEmpty() {
    return size == 0;
  }
  public String toString() {
    String str = "[";
    for (int i = 0; i < size; i++) {
      if (i != 0) {str += ", ";}
      str += data[i];
    }
    return str + "]";
  }
}
