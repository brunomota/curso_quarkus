package br.com.mota.resource;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

@QuarkusTest
class BitcoinResourceTest {

    @Test
    void testarSeStatusCodeDaRequisicaoEstaOK() {
        RestAssured.given().get("/bitcoins").then().statusCode(200);
    }
}