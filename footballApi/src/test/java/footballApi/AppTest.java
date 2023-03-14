package footballApi;

import org.apache.http.HttpStatus;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class AppTest {
    @Test
    public void testListaValores(){
        given()
                .headers("x-rapidapi-host","v3.football.api-sports.io")
                .headers("x-rapidapi-key","XxXxXxXxXxXxXxXxXxXxXxXx")
        .when()
                .get("https://v3.football.api-sports.io/leagues")
        .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .body(is(notNullValue()));
    }
}
