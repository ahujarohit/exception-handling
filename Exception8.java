import java.io.*;

class Exception8 {
    public static void main(String args[]) {
        try (FileWriter fw = new FileWriter("hello.txt")) {
            fw.write("hello world");
            fw.flush();
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
}