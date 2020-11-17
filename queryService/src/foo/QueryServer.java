package foo;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.text.DecimalFormat;
import java.util.List;

public class QueryServer {
  private String filePath = "E:\\coding\\java\\XML\\xml\\";
  private SAXBuilder saxBuilder = new SAXBuilder();
  private static final String uri = "http://schemas.openxmlformats.org/spreadsheetml/2006/main";

  public String getYearTemperature(String year) throws Exception {
    StringBuilder result = new StringBuilder();
    if (Integer.parseInt(year) >= 2009 && Integer.parseInt(year) <= 2018) {
      List<Element> rowList = saxBuilder.build(new File(filePath + year + ".xml")).
              getRootElement().getChild("sheetData", Namespace.getNamespace(uri)).getChildren();
      for (Element row : rowList.subList(1, rowList.size())) {
        StringBuilder monthAndTem = new StringBuilder();
        int i = 0;
        List<Element> cList = row.getChildren().subList(1,5);
        monthAndTem.append(cList.get(i++).getChild("v", Namespace.getNamespace(uri)).getValue()).append(" 年 ");
        monthAndTem.append(cList.get(i++).getChild("v", Namespace.getNamespace(uri)).getValue()).append(" 月 ");
        monthAndTem.append(cList.get(i++).getChild("v", Namespace.getNamespace(uri)).getValue()).append(" 日 平均气温：");
        monthAndTem.append(new DecimalFormat("0.0").format(Double.parseDouble(cList.get(i).getChild("v", Namespace.getNamespace(uri)).getValue()))).append("℃");
        result.append(monthAndTem.toString()).append("\n");
      }
    }
    return result.toString();
  }

  public String getMonthTemperature(String yearAndMonth) throws Exception {
    String year = yearAndMonth.split(" ")[0];
    String month = yearAndMonth.split(" ")[1];
    StringBuilder result = new StringBuilder();
    System.out.println(year + month);
    if (Integer.parseInt(year) >= 2009 && Integer.parseInt(year) <= 2018) {
      List<Element> rowList = saxBuilder.build(new File(filePath + year + ".xml")).
              getRootElement().getChild("sheetData", Namespace.getNamespace(uri)).getChildren();
      for (Element row : rowList.subList(1, rowList.size())) {
        StringBuilder monthAndTem = new StringBuilder();
        int i = 0;
        List<Element> cList = row.getChildren().subList(1,5);
        monthAndTem.append(cList.get(i++).getChild("v", Namespace.getNamespace(uri)).getValue()).append(" 年 ");
        String tempMonth = cList.get(i++).getChild("v", Namespace.getNamespace(uri)).getValue();
        monthAndTem.append(tempMonth).append(" 月 ");
        monthAndTem.append(cList.get(i++).getChild("v", Namespace.getNamespace(uri)).getValue()).append(" 日 平均气温：");
        monthAndTem.append(new DecimalFormat("0.0").format(Double.parseDouble(cList.get(i).getChild("v", Namespace.getNamespace(uri)).getValue()))).append("℃");
        if (tempMonth.equals(month)) {
          result.append(monthAndTem.toString()).append("\n");
        }
      }
    }
    return result.toString();
  }

  public String getDayTemperature(String yearAndMonthAndDay) throws Exception {
    String year = yearAndMonthAndDay.split(" ")[0];
    String month = yearAndMonthAndDay.split(" ")[1];
    String day = yearAndMonthAndDay.split(" ")[2];
    String result = "";
    if (Integer.parseInt(year) >= 2009 && Integer.parseInt(year) <= 2018) {
      List<Element> rowList = saxBuilder.build(new File(filePath + year + ".xml")).
              getRootElement().getChild("sheetData", Namespace.getNamespace(uri)).getChildren();
      for (Element row : rowList.subList(1, rowList.size())) {
        StringBuilder monthAndTem = new StringBuilder();
        int i = 0;
        List<Element> cList = row.getChildren().subList(1,5);
        monthAndTem.append(cList.get(i++).getChild("v", Namespace.getNamespace(uri)).getValue()).append(" 年 ");
        String tempMonth = cList.get(i++).getChild("v", Namespace.getNamespace(uri)).getValue();
        monthAndTem.append(tempMonth).append(" 月 ");
        String tempDay = cList.get(i++).getChild("v", Namespace.getNamespace(uri)).getValue();
        monthAndTem.append(tempDay).append(" 日 平均气温：");
        monthAndTem.append(new DecimalFormat("0.0").format(Double.parseDouble(cList.get(i).getChild("v", Namespace.getNamespace(uri)).getValue()))).append("℃");
        if (tempMonth.equals(month) && tempDay.equals(day)) {
          result = monthAndTem.toString();
        }
      }
    }
    return result;
  }
}
