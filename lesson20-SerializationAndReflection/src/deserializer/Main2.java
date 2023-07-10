package deserializer;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = null;

        FileInputStream fileIn = new FileInputStream("/Users/lamankhudadatzada/Desktop/BE/lesson20-SerializationAndReflection/src/userInfo.ser");

        ObjectInputStream in = new ObjectInputStream(fileIn);

        user = (User) in.readObject();

        in.close();
        fileIn.close();

        System.out.println("The user's name:");
        System.out.println(user.name);
        System.out.println("The user's password:");
        System.out.println(user.password);


    }
}
