import java.io.*;

public class Ex1 {
  public static void main(String[] args) throws Exception {
    var fr = new FileReader("data.txt");
    int input = fr.read();
    while (input != -1) {
      System.out.println((char)input);
      input = fr.read();
    }
    fr.close();
  }
}