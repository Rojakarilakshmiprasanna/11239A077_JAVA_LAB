interface A {
    void show();
}

interface B {
    void display();
}

// Class implements two interfaces
class C implements A, B {
    public void show() {
        System.out.println("This is show() from Interface A");
    }

    public void display() {
        System.out.println("This is display() from Interface B");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}