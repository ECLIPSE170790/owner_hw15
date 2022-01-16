package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "file:src/test/resources/credentials.config"
})
public interface ApiConfig extends Config{

    @Config.Key("baseUrl")
    String getBaseUrl();

    @Config.Key("token")
    String getToken();
}
