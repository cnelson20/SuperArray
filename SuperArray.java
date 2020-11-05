import java.util.Arrays;
public class SuperArray {

  //a:
  private String[] data;
  private int size;

  //b:
  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public SuperArray(int InitalCapacity) {
    data = new String[InitalCapacity];
    size = 0;
  }
  public SuperArray(String[] arr) {
    data = arr;
    size = data.length;
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
  public void add(String element) {
    if (size >= data.length) {resize((int)(size * .25));}
    data[size] = element;
    size++;
  }

  public void add(int index, String element) {
    if (size >= data.length) {resize((int)(size * .25));}
    for (int i = size; i > index; i--) {
        data[i] = data[i-1];
    }
    data[index] = element;
    size++;

  }
  public String remove(int index) {
    String str = data[index];
    for (int i = index; i < size - 1; i++) {
      data[i] = data[i+1];
    }
    size--;
    return str;
  }
  //e
  public String get(int index) {
    return data[index];
  }
  //f
  public String set(int index, String element) {
    String temp = data[index];
    data[index] = element;
    return temp;
  }
  public int indexOf(String element) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(element) && element != null) {
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
  public void clear() {
    size = 0;
    data = new String[data.length];
  }
  public String[] toArray() {
    String[] arr = new String[size];
    for (int i = 0; i < size; i++) {
      arr[i] = data[i];
    }
    return arr;
  }
  //nov 4
  public void removeDuplicates() {
    SuperArray counted = new SuperArray();
    for (int i = 0; i < size; i++) {
      if (counted.contains(data[i])) {
        remove(i);
        i--;
      } else {
        counted.add(data[i]);
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray newArr = new SuperArray(Math.min(a.size,b.size));
    for (int i = 0; i < a.size; i++) {
      if (b.contains(a.get(i))) {
        newArr.add(a.get(i));
      }
    }
    newArr.removeDuplicates();
    return newArr;
  }
  public int lastIndexOf(String element) {
    for (int i = size - 1; i >= 0; i--) {
      if (data[i].equals(element) && element != null) {
        return i;
      }
    }
    return -1;
  }
  public boolean equals(SuperArray other) {
    if (this.size != other.size) {return false;}
    for (int i = 0; i < this.size; i++) {
      if (this.get(i) != other.get(i)) {return false;}
    }
    return true;
  }
}
