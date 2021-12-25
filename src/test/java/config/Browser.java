package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${environment}.properties"
})
public interface Browser extends Config {

    @Key("environment")
    String environment();

    @Key("browserName")
    String browserName();

    @Key("browserVersion")
    String browserVersion();

    @Key("URL")
    String URL();

}
