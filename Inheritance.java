
class A {
    A(){
        System.out.println("constructor of parent");
    }
    void print(){
        System.out.println("I am the parent");
    }
}

class B extends A {
    void printf(){
        System.out.println("I am the child 1");
    }

}

class C extends A {
    C(){
        System.out.println("constructor of child C");
    }
    void println(){
        System.out.println("I am the child 2");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.println();
        c.print();
    }

}
