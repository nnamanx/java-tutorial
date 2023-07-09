package generics;

public class Main {
    public static void main(String[] args) {
        CarModels<String, Integer> car = new CarModels<>();

        car.setModel("Ferrari");
        car.setSerialNo(21399);

        System.out.println(car.getModel());
        System.out.println(car.getSerialNo());

    }
}