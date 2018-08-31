class getSetInt {
  static int num; // default 0
  public static void main(String[] args) {
    System.out.println("Original num, getNum(): " + getNum()); // num is 0 (null)
    setNum();  // setNum() set class.var to 1
    System.out.println("After setNum(), getNum(): " + getNum());  // return num again after setNum()
  }
  public static int getNum() {
    return num;
  }
  public static void setNum() {
    getSetInt.num = 1;
  }
}
