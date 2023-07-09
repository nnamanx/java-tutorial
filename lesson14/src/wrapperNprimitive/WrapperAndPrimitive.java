package wrapperNprimitive;

public class WrapperAndPrimitive {
    public static void main(String[] args) {

        float f = 5.2f;

        Float f1 = new Float(5.2);

//        cannot do f1 = 0;
//        unboxing
        f1 = Float.parseFloat("5");
        System.out.println(f1);

//        autoboxing
        f = Float.valueOf(f1);
        System.out.println(f);


    }
}
