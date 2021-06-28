package smallworld.core;

public class SmallObject {
  public SmallObject[] data;
  public SmallObject objClass;

  // 
  public Object value;

  public SmallObject() {
    objClass = null;
    data = null;
  }

  public SmallObject(SmallObject cl, int size) {
    objClass = cl;
    data = new SmallObject[size];
  }

  public SmallObject copy(SmallObject cl) {
    return this;
  }

  ////////////////////////
  public SmallObject(SmallObject cls, Object v) {
    this(cls, 0);
    value = v;
  }
}
