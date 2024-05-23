
interface Drawable{
    default void draw(){
        System.out.println("draw from interface drawable");
    };
}

interface Resizable{
    default void resize(double factor){
        System.out.println("resize from interface resizable");
    }
}

class Circle1 implements Drawable, Resizable{
    public void draw(){
        System.out.println("drawing a circle");
    }

    public void resize(double factor){
        System.out.println("resizing circle by factor " + factor);
    }
}

class Rectangle1 implements Drawable{
    public void draw(){
        System.out.println("drawing a rectangle");
    }
}

class exam2{
    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        Rectangle1 rectangle = new Rectangle1();

        circle.draw();
        circle.resize(2.5);
        rectangle.draw();
    }
}