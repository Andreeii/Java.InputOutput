import java.io.*;
public class Help {
    String helpfile;

  Help(String fname){
      this.helpfile = fname;
  }

  boolean helpOn(String what)  {
      int ch;
      String topic, info;
      try (BufferedReader hl = new BufferedReader(new FileReader(helpfile))) {
          do {
              ch = hl.read();
              if (ch == '#') {
                  topic = hl.readLine();
                  if (what.compareTo(topic) == 0) {
                      do {
                          info = hl.readLine();
                          if (info != null) {
                              System.out.println(info);
                          }
                      } while ((info != null) && (info.compareTo("") != 0));
                      return true;
                  }

              }
          } while (ch != -1);
      } catch (IOException e) {
          System.out.println("error accesing file");
          return false;
      }

      return false;
  }

  String getSelection(){
      String topic = "";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter topic");
      try {
          topic = br.readLine();
      }catch (IOException e ){
          System.out.println("error reading console");
      }
      return topic;
  }

}
