package com.codegroup.auth.controllers;

import com.codegroup.auth.domain.product.Product;
import com.codegroup.auth.domain.product.ProductRequestDTO;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
public class ProductControllerTest {


    //@Test
    public void deveRetornarQuantidadeDeLeiloes() {

//        ProductRequestDTO product = new ProductRequestDTO("Lapis", 2);
//        JsonPath retorno =
//                given()
//                        .header("Accept", "application/json")
//                        .contentType("application/json")
//                        .auth()
//                        .basic("", "")
//                        .body(product)
//                        .expect()
//                        .statusCode(200)
//                        .when()
//                        .post("/product")
//                        .andReturn()
//                        .jsonPath();

    }

}
