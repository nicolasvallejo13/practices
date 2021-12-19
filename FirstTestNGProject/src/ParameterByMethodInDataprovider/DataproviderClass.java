package ParameterByMethodInDataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderClass {
  @DataProvider(name="SearchProvider")
  public Object[][] getDataFromDataprovider(Method m)
  {
      if(m.getName().equalsIgnoreCase("testMethodA")){
      return new Object[][] {
              { "Guru99", "India" },
              { "Krishna", "UK" },
              { "Bhupesh", "USA" }
          };}
      else{
      return new Object[][] {
              { "Canada" },
              { "Russia" },
              { "Japan" }
          };}       
  }
}
