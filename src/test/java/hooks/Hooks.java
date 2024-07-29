package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.ContentType;
import utilities.TestData;
import utilities.enums.HeaderResources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Hooks {

    public  static PrintStream log;

    {
        try {
            log = new PrintStream(new FileOutputStream("test-output/loggingApi.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Before
    public void setUp(Scenario scenario){
        log.append(scenario.getName());



            RestAssured.requestSpecification = new RequestSpecBuilder().setBaseUri(TestData.homePage)
                    .addHeader(HeaderResources.connection.header, HeaderResources.connection.headerValue)
                    .addHeader(HeaderResources.accept.header, HeaderResources.accept.headerValue)
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(new ErrorLoggingFilter())
                    .setContentType(ContentType.JSON).build();

    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()) {
            RestAssured.responseSpecification = new ResponseSpecBuilder().log(LogDetail.ALL).build();
        }
    }


}
