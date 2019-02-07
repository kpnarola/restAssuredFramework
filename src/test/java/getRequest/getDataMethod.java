package getRequest;

import static io.restassured.RestAssured.*;
//added shortcut for restassure maid static
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class getDataMethod {
    @Test

public void testResponseCode(){


    int code =  get("\"https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getStatusCode();

    System.out.println("status code is "+ code);

    Assert.assertEquals(code,200);

}

    @Test

    public void testBody() {


        String data =get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();

        long time = get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime();
        System.out.println("Data is " + data);

        System.out.println("Response time" + time);

    }


}
