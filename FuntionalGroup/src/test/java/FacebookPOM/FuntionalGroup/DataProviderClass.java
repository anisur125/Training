package FacebookPOM.FuntionalGroup;

import org.testng.annotations.Test;

import Common.Browsers;

import org.testng.annotations.DataProvider;

public class DataProviderClass extends Browsers {
  @Test(dataProvider = "signin")
  public void f(String n, String s) {
	  HomePage homepage_obj = new HomePage(driver);
	  homepage_obj.email_field(n);
	  homepage_obj.email_field(s);
	  homepage_obj.log_in_button();
  }

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "hello@yahho.com", "adkafdjf" },
      new Object[] { "hellooo@yahhoo", "bjhgjhg" },
      new Object[] {"fhfhf", "c"}
    };
  }
}
