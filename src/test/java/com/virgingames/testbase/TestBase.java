package com.virgingames.testbase;


import com.virgingames.constant.Path;
import com.virgingames.utils.PropertyReader;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by NP
 */
public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {

            propertyReader = PropertyReader.getInstance();
            RestAssured.baseURI = propertyReader.getProperty("baseUrl");
            RestAssured.basePath = Path.USERS;
}
    }
