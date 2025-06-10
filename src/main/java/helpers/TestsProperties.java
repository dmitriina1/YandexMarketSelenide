package helpers;

import org.aeonbits.owner.Config;

/**
 * Интерфейс {@code TestsProperties} предназначен для определения конфигурационных параметров,
 * используемых в тестах.
 *
 * @author Наливайко Дмитрий
 */

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "system:env",
        "file:src/main/resources/tests.properties"
})
public interface TestsProperties extends Config{

    /**
     * Возвращает URL Яндекс.Маркета, используемый в тестах.
     *
     * @return URL Яндекс.Маркета
     */
    @Config.Key("yandexMarket.url")
    String yandexMarketUrl();

    /**
     * Возвращает значение таймаута по умолчанию для тестов.
     *
     * @return таймаут в миллисекундах
     */
    @Config.Key("default.timeout")
    int defaultTimeout();

    /**
     * Возвращает значение таймаута по умолчанию для тестов.
     *
     * @return таймаут в миллисекундах
     */
    @Config.Key("default.browser")
    String defaultBrowser();

}