public class Circle {
    final double PI = 3.141592653589793;
    final String shape;

    {
        System.out.println("IIB 1");
        shape = "Circle";
    }

    Circle(){
        System.out.println("Constructor of  " + this.shape);
    }

    {
        System.out.println("IIB 2");
    }

    final void info(){
        System.out.println("Final method of Circle class");
    }

    public void area(int radius){
        double area_ = PI * radius * radius;
        System.out.println("Area = " + area_);
    }
}