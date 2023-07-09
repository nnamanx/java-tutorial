public class task3 {

    public static void main(String[] args) {

        String t = "              1,e 6,e 0,e 9,e           ";


        String[] arr = t.trim().split(",e");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Math.pow(Double.parseDouble(arr[i]), 2));
        }

    }
}
