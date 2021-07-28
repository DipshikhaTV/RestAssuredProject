import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;

public class RestAPIClient {

    public CreateUserResponseBody createUser(CreateUserRequestBody requestBody){

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                        .post("https://reqres.in/api/users");

        int statusCode =  response.statusCode();
        CreateUserResponseBody responseBody = response.as(CreateUserResponseBody.class);

        responseBody.setStatusCode(statusCode);
        return responseBody;
    }

    public GetListUserResponseBody getUser(){

        Response response =
                given()
                        .get("https://reqres.in/api/users?page=2");

       int statusCode =  response.statusCode();

        GetListUserResponseBody responseBody = response.as(GetListUserResponseBody.class);
        responseBody.setStatusCode(statusCode);

        return responseBody;

    }
    public GetSingleUserResponseBody getSingleUser(){

        Response response =
                given()
                        .get("https://reqres.in/api/users/2");

        int statusCode =  response.statusCode();

        GetSingleUserResponseBody responseBody = response.as(GetSingleUserResponseBody.class);
        responseBody.setStatusCode(statusCode);

        return responseBody;

    }

    public GetSingleUserResponseBody getSingleInvalidUser(){

        Response response =
                given()
                        .get("https://reqres.in/api/users/23");

        int statusCode =  response.statusCode();

        GetSingleUserResponseBody responseBody = response.as(GetSingleUserResponseBody.class);
        responseBody.setStatusCode(statusCode);

        return responseBody;

    }

    public GetListResourceResponseBody getListResource(){

        Response response =
                given()
                        .get("https://reqres.in/api/unknown");

        int statusCode =  response.statusCode();

        GetListResourceResponseBody responseBody = response.as(GetListResourceResponseBody.class);
        responseBody.setStatusCode(statusCode);

        return responseBody;

    }

    public GetSingleResourceResponseBody getSingleResource() {

        Response response =
                given()
                        .get("https://reqres.in/api/unknown/2");

        int statusCode = response.statusCode();

        GetSingleResourceResponseBody responseBody = response.as(GetSingleResourceResponseBody.class);
        responseBody.setStatusCode(statusCode);

        return responseBody;
    }

        public UpdateUserResponseBody updateUser(UpdateUserRequestBody requestBody){

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                        .put("https://reqres.in/api/users/2");

        int statusCode =  response.statusCode();
        UpdateUserResponseBody responseBody = response.as(UpdateUserResponseBody.class);

        responseBody.setStatusCode(statusCode);
        return responseBody;

    }

    public UpdateUserResponseBody patchUpdateUser(UpdateUserRequestBody requestBody){

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                        .patch("https://reqres.in/api/users/2");
        int statusCode =  response.statusCode();

       UpdateUserResponseBody responseBody = response.as(UpdateUserResponseBody.class);
       responseBody.setStatusCode(statusCode);

        return responseBody;

    }

    public DeleteUserResponseBody deleteUser(){

        Response response =
                given()
                        .delete("https://reqres.in/api/users/2");

        int statusCode =  response.statusCode();

        DeleteUserResponseBody responseCode = DeleteUserResponseBody.builder().statusCode(statusCode).build();

        return responseCode;
    }


    public RegisterUserResponseBody registerUser(RegisterUserRequestBody requestBody){

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                        .post("https://reqres.in/api/register");

        int statusCode =  response.statusCode();

        RegisterUserResponseBody responseBody = response.as(RegisterUserResponseBody.class);
        responseBody.setStatusCode(statusCode);

        return responseBody;
    }

    public RegisterUserInvalidResponseBody registerInvalidUser(RegisterUserInvalidRequestBody requestBody){

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                        .post("https://reqres.in/api/register");

        int statusCode =  response.statusCode();

        RegisterUserInvalidResponseBody responseBody = response.as(RegisterUserInvalidResponseBody.class);
        responseBody.setStatusCode(statusCode);

        return responseBody;
    }

    public LoginUserResponseBody loginUser(RegisterUserRequestBody requestBody){

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                        .post("https://reqres.in/api/login");

        int statusCode =  response.statusCode();

        LoginUserResponseBody responseBody = response.as(LoginUserResponseBody.class);
        responseBody.setStatusCode(statusCode);

        return responseBody;
    }

    public RegisterUserInvalidResponseBody loginInvalidUser(RegisterUserInvalidRequestBody requestBody){

        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                        .post("https://reqres.in/api/login");

        int statusCode =  response.statusCode();

        RegisterUserInvalidResponseBody responseBody = response.as(RegisterUserInvalidResponseBody.class);
        responseBody.setStatusCode(statusCode);

        return responseBody;
    }

    public GetListUserResponseBody getSingleUserDelayed(){

        Response response =
                given()
                        .get("https://reqres.in/api/users?delay=3");

        int statusCode =  response.statusCode();

        GetListUserResponseBody responseBody = response.as(GetListUserResponseBody.class);
        responseBody.setStatusCode(statusCode);
        long responseTimeInSeconds = response.getTimeIn(TimeUnit.SECONDS);
        System.out.println("Time " + responseTimeInSeconds);
        return responseBody;

    }



}
