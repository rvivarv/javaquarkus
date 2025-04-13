package com.example.resource;

import jakarta.ws.rs.core.MediaType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class ComunasResourceTest {

    @Test
    void testGetComunas() {
        given()
                .when()
                .get("/comunas")
                .then()
                .statusCode(200)
                .contentType(MediaType.TEXT_PLAIN)
                .body(containsString("Comuna 1"));
    }

}
