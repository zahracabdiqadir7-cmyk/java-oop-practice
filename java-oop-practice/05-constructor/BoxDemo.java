class Box {
double width;
double height;
Box(double width, double height) {
this.width = width;
this.height = height;
}
double area() {
return width * height;
}
}
public class BoxDemo {
public static void main(String[] args) {
Box box = new Box(5, 4);
System.out.println("Area = " + box.area());

Box box2 = new Box(8, 3);
System.out.println("Area = " + box2.area());
}
}