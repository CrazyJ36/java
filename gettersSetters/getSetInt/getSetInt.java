class getSetInt {
  static int num;
  public static void main(String[] args) {
    System.out.println(getNum()); // num is 0 (null)
    setNum();  // setNum() set class.var to 1
    System.out.println(getNum());  // return num again after setNum()
  }
  public static int getNum() {
    return num;
  }
  public static void setNum() {
    getSetInt.num = 1;
  }
}
