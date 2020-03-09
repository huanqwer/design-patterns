package test;

public class Son extends Father{

    public void sing(){
        System.out.println("im erzi");
    }

    public static void main(String[] args) {
        Father father = new Son();
        ((Son) father).sing();
    }
}
