import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.lang.*;

public class Main {
  public static String delimeter = "#---#";
  public static void main(String... args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader(new File("cars.txt")));
    try{
      makeCars(br);
    }
    finally{
      br.close();
    }
   }

  public static void makeCars(BufferedReader br) throws Exception {

    String line;
    while((line = br.readLine()) !=null) {
      while(line.startsWith(delimeter)) {
        String name = br.readLine();
        name = name.substring(1);
        File file = new File(name);
        PrintWriter writer = new PrintWriter(file, "UTF-8");
        String content;
        while ((content = br.readLine()) !=null){
          line = content;
          if (!content.startsWith(delimeter))
            writer.println(content);
          else
            break;
        }
        writer.close();
      }
    }
  }
}
