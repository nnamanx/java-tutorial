package homework5;

public class Area {

    int height;
    int lenght;

    void calcAreaAndPer(int height, int length) {
        int area = height * lenght;
        int perimeter = 2 * (height + length);

        System.out.println("Perimeter is " + perimeter + " and area is " + area);
    }
}
