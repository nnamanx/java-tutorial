package homework5;

public class Math {
    int sum(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        return a / b;
    }

    static double pow(double a, double b) {

        double res = a;

        for (int i = 0; i < b - 1; i++) {
            res *= a;
        }

        return res;
    }

    long factorial(int n) {
        if (n == 0) {
            return 1;
        } else return n * factorial(n - 1);
    }

    static double sqrt(double n) {
        double s = n / 2;
        double t;
        do {
            t = s;
            s = (t + (n / t)) / 2;
        }
        while ((t - s) != 0);

        return s;
    }
}
