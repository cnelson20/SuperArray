public class SuperArray {

  //a:
  private String[] data;
  private int size;

  //b:
  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  //g:
  private void resize() {
    String[] newArr = new String[size+1];
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
    if (size >= data.length) {resize();}
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
}
