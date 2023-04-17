public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
//        c1.PI = 3.14; error: cannot assign a value to final variable PI
        c1.info();
        c1.area(2);

        InnerCircle inc1 = new InnerCircle();
        inc1.area(1);

        FinalCircle fc1 = new FinalCircle();
        fc1.printRadius(6);
    }
}