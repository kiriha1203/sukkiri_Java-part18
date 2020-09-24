import java.io.*;

public class Ex2 {
  public static void main(String[] args) throws Exception {
    var fw = new FileWriter("data.txt");
    fw.write('そ');
    fw.write('れ');
    fw.write('で');
    fw.write('は');
    fw.close();
  }
}