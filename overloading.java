
class outerClass{
    int a = 10;
    static class innerClass{
        public int b = 32;
    }
}

public class overloading {
    public static void main(String[] args) {
//        System.out.println("Hello main 1");
          outerClass out = new outerClass();
        System.out.println(out.a);
//        System.out.println(out.b);
        outerClass.innerClass hi = new outerClass.innerClass();
        System.out.println(hi.b);
    }


}
