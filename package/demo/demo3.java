package p1;

import p1.c1;
import p1.c2;

class c3 {

    public static void m3() {
        c1 obj1 = new c1();
        c2 obj2 = new c2();

        obj1.m1();
        obj2.m2();
    }

    public static void main(String[] args) {
        System.out.println("running demo, demo2 from demo3");
        m3();
    }

}
