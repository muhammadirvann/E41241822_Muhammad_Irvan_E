
package Minggu_5.Tugas;

class A {
    
    void callthis(){
        System.out.println("Inside class A's Method!");
    }
}

class B extends A {
    void callthis() {
        System.out.println("Inside class B's Method!");
    }
}

class C extends A {
    void callthis(){
        System.out.println("Inside class C's Method!");
    }
}

class DynamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        A ref;
        
        ref = b;
        ref.callthis();
        
        ref = c;
        ref.callthis();
        
        ref = a;
        ref.callthis();
    }
}
