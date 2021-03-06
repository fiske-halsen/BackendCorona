package utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HttpUtils {

    public static String fetchData(String _url) throws MalformedURLException, IOException{
    URL url = new URL(_url);
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestMethod("GET");
    //con.setRequestProperty("Accept", "application/json;charset=UTF-8");
    con.setRequestProperty("Accept", "application/json");
    con.setRequestProperty("User-Agent", "server"); //remember if you are using SWAPI
    con.setRequestProperty("X-Access-Token", "f30b264d-e56c-46db-8780-2e151d7ab22d");
    Scanner scan = new Scanner(con.getInputStream());
    String jsonStr = "";
    while(scan.hasNext()) {
      jsonStr += scan.nextLine();
    }
    scan.close();
    return jsonStr;
  }

}
