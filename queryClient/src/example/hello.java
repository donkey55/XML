package example;

import client.QueryServerServiceLocator;
import client.QueryServer_PortType;

public class hello {
    public static void main(String[] args) throws Exception {
        QueryServerServiceLocator loc = new QueryServerServiceLocator();
        QueryServer_PortType port = loc.getQueryServer();
        System.out.println("fuck" + port.hello("sbsabsa", "lsp"));
        String op = port.getMonthTemperature("2018 12");
        System.out.println("fuck" + op);
    }
}
