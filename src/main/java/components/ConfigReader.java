package components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component
@PropertySource("classpath:application.properties")
public class ConfigReader {
    @Value("${configured_language}")
    private String configuredLanguage;

    @Value("${ENG_hello_world}")
    private String englishHelloWorld;

    @Value("${NL_hello_world}")
    private String dutchHelloWorld;

    @Value("${FR_hello_world}")
    private String frenchHelloWorld;

    @Value("${GER_hello_world}")
    private String germanHelloWorld;

    public String getHelloWorldMessage() {
        switch (configuredLanguage) {
            case "ENG":
                return englishHelloWorld;
            case "NL":
                return dutchHelloWorld;
            case "FR":
                return frenchHelloWorld;
            case "GER":
                return germanHelloWorld;
            default:
                return "Hello, World!";
        }
    }
}
