package connector;

import com.google.gson.Gson;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BaseConnector {

    private static final String BASE_URL = "https://postman-echo.com/";
    protected Gson converter = new Gson();

    public Response get(String url) {
        return
                given()
                        .log().all()
                        .when()
                        .get(BASE_URL + url)
                        .then()
                        .log().all()
                        .extract()
                        .response();
    }

    public Response post(String url, String body) {
        return
                given()
                        .log().all()
                        .header("Content-Type", "application/json")
                        .body(body)
                        .when()
                        .post(BASE_URL + url)
                        .then()
                        .log().all()
                        .extract()
                        .response();
    }

    public Response put(String url) {
        return
                given()
                        .log().all()
                        .body("This is expected to be sent back as part of response body.")
                        .when()
                        .put(BASE_URL + url)
                        .then()
                        .log().all()
                        .extract()
                        .response();
    }

    public Response patch(String url) {
        return
                given()
                        .log().all()
                        .when()
                        .patch(BASE_URL + url)
                        .then()
                        .log().all()
                        .extract()
                        .response();
    }

    public Response delete(String url) {
        return
                given()
                        .log().all()
                        .when()
                        .delete(BASE_URL + url)
                        .then()
                        .log().all()
                        .extract()
                        .response();
    }
}
