package utilities;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class Dataproviders {

    //DataProvider 1

    @DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {
        String path=".\\testData\\OrgzStackLoginData.xlsx";  //taking xl file from testData
        ExcelUtility xlutil=new ExcelUtility(path); //creating an object for XLUtility

        int totalrows=xlutil.getRowCount("Sheet1");
        int totalcols=xlutil.getCellCount("Sheet1",1);

        String logindata[][]=new String[totalrows][totalcols]; //Created for two dimension array which can store

        for (int i=1; i<=totalrows;i++)  //1 //Read the data from xl storing in two dimensional array
        {
            for (int j=0; j<totalcols;j++)
            {
                logindata[i-1][j]=xlutil.getCellData("Sheet1",i,j);
            }
        }

        return logindata; //returning two dimension array
    }

    //DataProvider 2

    //DataProvider 3

    //DataProvider 4

}
