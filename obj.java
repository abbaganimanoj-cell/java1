/*class obj  {
    String name;
    int age;
    obj(String n,int a) {
        name = n;
        age = a;
     }
     void display() {
        System.out.println("name"+ name);
        System.out.println("age" + age);
     }
     public static void main(String[]  args) {
        obj s1 = new obj();
        s1.name = "mani";
        s1.age = 18;
        s1.display();
     }
}
class obj {
   String name;
   int age;
   void display() {
      System.out.println("name :" + name);
      System.out.println("age :" + age);
   }
   public static void main(String[] args) {
      obj s1 = new obj();
      s1.name ="mani";
      s1.age = 19;
      s1.display();
   }

}*/
class obj {
   String name;
   int age;
   obj(String n,int a) {
      name = n;
      age = a;
   }
   void display()
 {
   System.out.println("name : " + name);
   System.out.println("age :" + age);
 }
 public static void main(String[] args) {
   obj s1 = new obj("mani" , 19);
   s1.display();

 }
 }
