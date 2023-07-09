package Gc;

public class Main_gc {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.name = "Tarana";

        teacher = new Teacher();

        System.gc();


    }


}
