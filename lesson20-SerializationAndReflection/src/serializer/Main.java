package serializer;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User();

        user.name = "Laman";
        user.password = "I<3pizza";

        user.sayHello();

        FileOutputStream fileOut = new FileOutputStream("/Users/lamankhudadatzada/Desktop/BE/lesson20-SerializationAndReflection/src/userInfo.ser");

        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);

        out.close();
        fileOut.close();

    }
}