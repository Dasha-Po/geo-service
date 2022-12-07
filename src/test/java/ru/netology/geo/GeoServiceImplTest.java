package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {

    GeoServiceImpl geoService;
    private static final String NEW_YORK_IP = "96.44.183.149";
    private static final String MOSCOW_IP = "172.0.32.11";
    private static final String RUSSIA_IP = "172.0.0.0";
    private static final String USA_IP = "96.0.0.0";
    private static final String LOCALHOST = "127.0.0.1";

    @BeforeEach
    void init() {
        geoService = new GeoServiceImpl();
    }

    @Test
    void testByIpNew_York() {
        Location result = geoService.byIp(NEW_YORK_IP);
        Assertions.assertEquals(Country.USA, result.getCountry());
    }

    @Test
    void testByIpMoscow() {
        Location result = geoService.byIp(MOSCOW_IP);
        Assertions.assertEquals(Country.RUSSIA, result.getCountry());
    }

    @Test
    void testByIpRussia() {
        Location result = geoService.byIp(RUSSIA_IP);
        Assertions.assertEquals(Country.RUSSIA, result.getCountry());
    }

    @Test
    void testByIpUSA() {
        Location result = geoService.byIp(USA_IP);
        Assertions.assertEquals(Country.USA, result.getCountry());
    }

    @Test
    void testByIpLOCALHOST() {
        Location result = geoService.byIp(LOCALHOST);
        Assertions.assertEquals(null, result.getCountry());
    }
}
