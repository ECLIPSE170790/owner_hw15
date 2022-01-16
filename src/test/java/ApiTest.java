import config.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApiTest {

    @Test
    void checkValuesFromSystemProperties() {
        System.setProperty("baseUrl", "www.1234.ru");
        System.setProperty("token", "efwef7478e49fe");

        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

        Assertions.assertEquals("www.1234.ru", apiConfig.getBaseUrl());
        Assertions.assertEquals("efwef7478e49fe", apiConfig.getToken());
    }

    @Test
    void checkValuesFromConfigFile() {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());

        Assertions.assertEquals("http://localhost:8080/api", apiConfig.getBaseUrl());
        Assertions.assertEquals("blabla17171717", apiConfig.getToken());
    }
}
