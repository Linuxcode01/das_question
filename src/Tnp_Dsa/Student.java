package Tnp_Dsa;

public class Student {
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }


    public static void main(String[] args) {
        Student st = new Student("chandan", 21);
        st.display();
    }
}
