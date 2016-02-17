package YahooFinance;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Utility {
   
   public static void downloadString(String url) {
      
   }
   
   public static void downloadFile(String filename, String url) 
         throws MalformedURLException, IOException {
         
         BufferedInputStream fin = null;
         FileOutputStream fout = null;

         try {
            fin = new BufferedInputStream(new URL(url).openStream());
            fout = new FileOutputStream(filename);


              final byte data[] = new byte[1024];
              int count;
              while ((count = fin.read(data, 0, 1024)) != -1) {
                  fout.write(data, 0, count);
              }
          } finally {
              if (fin != null) {
                  fin.close();
              }
              if (fout != null) {
                  fout.close();
              }
          }
   }
}
