package main.java.com.egor_abrosimov.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
        System.out.println(address);
        byte[] b = address.getAddress();
        System.out.println(Arrays.toString(b));

        address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(address);

        InetAddress sw[] = InetAddress.getAllByName("www.nba.com");
        for (int i = 0; i < sw.length; i++) {
            System.out.println(sw[i]);
        }
    }
}
