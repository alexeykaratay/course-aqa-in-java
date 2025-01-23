import connector.Controller;
import connector.DataDto;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.net.HttpURLConnection.HTTP_OK;

public class ApiTest {

    @Test
    public void checkMethodGet() {
        int statusCode = new Controller().verifyGet().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода GET не соответствует");
    }

    @Test
    public void checkMethodPostWithoutBody() {
        int statusCode = new Controller().verifyPostWithoutBody().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода POST не соответствует");
    }

    @Test
    public void checkMethodPost() {
        DataDto dataDto = DataDto.builder()
                .foo1("bar1")
                .foo2("bar2")
                .build();
        int statusCode = new Controller().verifyPost(dataDto).statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода POST не соответствует");
    }

    @Test
    public void checkMethodPut() {
        int statusCode = new Controller().verifyPut().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода PUT не соответствует");
    }

    @Test
    public void checkMethodPatch() {
        int statusCode = new Controller().verifyPatch().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода PATCH не соответствует");
    }

    @Test
    public void checkMethodDelete() {
        int statusCode = new Controller().verifyDelete().statusCode();
        Assert.assertEquals(statusCode, HTTP_OK, "Статускод метода DELETE не соответствует");
    }
}
