/*oops means object oriented programming language 
it  is way to write the programms using classes and objects
it explain the object proorties xlass
class oop {
    String color;
    int speed;
    void drive() {
        System.out.println("carr driving");
    }

}*/
class oop {
    String name;
    int age;
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        oop s1 = new oop();
        s1.name = "mani";
        s1.age = 19;
        s1.display();
    }
}