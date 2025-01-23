package connector;

import io.restassured.response.Response;

public class Controller extends BaseConnector{

    private static final String GET_ENDPOINT = "get?foo1=bar1&foo2=bar2";
    private static final String POST_ENDPOINT = "post";
    private static final String PUT_ENDPOINT = "put";
    private static final String PATCH_ENDPOINT = "patch";

    private static final String DELETE_ENDPOINT = "delete";

    public Response verifyGet() {
        return get(GET_ENDPOINT);
    }

    public Response verifyPut() {return put(PUT_ENDPOINT);}

    public Response verifyPatch() {
        return patch(PATCH_ENDPOINT);
    }

    public Response verifyPostWithoutBody() {
        return post(POST_ENDPOINT, converter.toJson(""));
    }

    public Response verifyPost(DataDto dataDto) {
        return post(POST_ENDPOINT, converter.toJson(dataDto));
    }

    public Response verifyDelete() {
        return delete(DELETE_ENDPOINT);
    }
}
