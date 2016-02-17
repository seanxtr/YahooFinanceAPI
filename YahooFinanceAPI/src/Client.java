
import java.io.IOException;
import java.net.MalformedURLException;

import YahooFinance.*;

public class Client {

   public static void main(String[] args) {
      String filename = "C:\\Data\\AAPL.csv";
      String url = "http://real-chart.finance.yahoo.com/table.csv?s=AAPL&a=00&b=29&c=1993&d=08&e=12&f=2014&g=d&ignore=.csv";
      
      try {
         Utility.downloadFile(filename, url);
      } catch (MalformedURLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

}
