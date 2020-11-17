package example;

import client.QueryServerServiceLocator;
import client.QueryServer_PortType;

public class hello {
    public static void main(String[] args) throws Exception {
        QueryServerServiceLocator loc = new QueryServerServiceLocator();
        QueryServer_PortType port = loc.getQueryServer();
        //调用port的三个方法来进行查询天气。
        System.out.println(port.getYearTemperature("2018"));
        System.out.println(port.getMonthTemperature("2018 12"));
        System.out.println(port.getDayTemperature("2018 8 8"));

    }
}
