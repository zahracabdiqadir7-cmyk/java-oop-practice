class Student {
String name;
int age;
void introduce() {
System.out.println(name + "is " + age + "years old");
}
}
public class StudentDemo {
public static void main(String[] args) {
Student student = new Student();
student.name = "Hodan";
student.age = 21;
student.introduce();

Student student2 = new Student();
student2.name = "naima";
student2.age = 20;
student2.introduce();
}
}