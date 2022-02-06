package pl.edu.wszib.exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class ChceckExceptionDemo {
    public static void main(String[] args) throws MalformedURLException{
        ChceckExceptionDemo ced = new ChceckExceptionDemo();
      //  ced.urlTesterByTryCaych("ttps://onet.pl");
        ced.urlTesterByThrows("ajp://wszib.edu.pl");
    }


    public void  urlTesterByTryCaych(String urlString){
        try {
            URL url = new URL(urlString);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("Niepoprawny url: " + e.getMessage());;
        }
    }

    public void urlTesterByThrows(String urlString) throws MalformedURLException {
        URL url = new URL(urlString);
        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
    }

}
