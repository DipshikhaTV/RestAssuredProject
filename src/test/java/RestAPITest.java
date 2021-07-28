import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class RestAPITest {

   // @Test
    public void callPostCreateAPI(){

      CreateUserRequestBody requestBody =
              CreateUserRequestBody.builder().name("Mita").job("Pilot").build();

        CreateUserResponseBody responseBody =
              new RestAPIClient().createUser(requestBody);
      assertEquals(responseBody.getStatusCode(),201);


    }
    @Test
    public void callGetListUsersAPI(){

        GetListUserResponseBody responseBody =
                new RestAPIClient().getUser();

       assertEquals(responseBody.getStatusCode(),200);
    }

    @Test
    public void callGetSingleUserAPI(){

        GetSingleUserResponseBody responseBody =
                new RestAPIClient().getSingleUser();

        assertEquals(responseBody.getStatusCode(),200);
    }

    @Test
    public void callGetSingleInvalidUserAPI(){

        GetSingleUserResponseBody responseBody =
                new RestAPIClient().getSingleInvalidUser();

        assertEquals(responseBody.getStatusCode(),404);
    }

    @Test
    public void callGetListResourceAPI(){

        GetListResourceResponseBody responseBody =
                new RestAPIClient().getListResource();

        assertEquals(responseBody.getStatusCode(),200);
    }

    @Test
    public void callGetSingleResourceAPI(){

        GetSingleResourceResponseBody responseBody =
                new RestAPIClient().getSingleResource();

        assertEquals(responseBody.getStatusCode(),200);
    }

    @Test
    public void callPutUpdateUserAPI(){

        UpdateUserRequestBody requestBody =
                UpdateUserRequestBody.builder().name("Mita").job("Pilot").build();

        UpdateUserResponseBody responseBody =
                new RestAPIClient().updateUser(requestBody);

        assertEquals(responseBody.getStatusCode(),200);
    }

    @Test
    public void callPatchUpdateUserAPI(){

        UpdateUserRequestBody requestBody =
                UpdateUserRequestBody.builder().name("Mita").job("Pilot").build();

        UpdateUserResponseBody responseBody =
                new RestAPIClient().patchUpdateUser(requestBody);

        assertEquals(responseBody.getStatusCode(),200);
    }

    @Test
    public void callDeleteUserAPI(){

        DeleteUserResponseBody responseBody =
                new RestAPIClient().deleteUser();

        assertEquals(responseBody.getStatusCode(),204);
    }

    @Test
    public void callPostRegisterAPI(){

        RegisterUserRequestBody requestBody =
                RegisterUserRequestBody.builder().email("eve.holt@reqres.in").password("Pilot").build();

        RegisterUserResponseBody responseBody =
                new RestAPIClient().registerUser(requestBody);

        assertEquals(responseBody.getStatusCode(),200);
    }

    @Test
    public void callPostRegisterAPIInvalid(){

        RegisterUserInvalidRequestBody requestBody =
                RegisterUserInvalidRequestBody.builder().email("eve.holt@reqres.in").build();

        RegisterUserInvalidResponseBody responseBody =
                new RestAPIClient().registerInvalidUser(requestBody);

        assertEquals(responseBody.getStatusCode(),400);
    }

    @Test
    public void callPostLoginAPI(){

        RegisterUserRequestBody requestBody =
                RegisterUserRequestBody.builder().email("eve.holt@reqres.in").password("Pilot").build();

        LoginUserResponseBody responseBody =
                new RestAPIClient().loginUser(requestBody);

        assertEquals(responseBody.getStatusCode(),200);
    }

    @Test
    public void callPostLoginAPIInvalid(){

        RegisterUserInvalidRequestBody requestBody =
                RegisterUserInvalidRequestBody.builder().email("eve.holt@reqres.in").build();

        RegisterUserInvalidResponseBody responseBody =
                new RestAPIClient().loginInvalidUser(requestBody);

        assertEquals(responseBody.getStatusCode(),400);
    }

    @Test
    public void callGetListUserDelayedAPI(){

        GetListUserResponseBody responseBody =
                new RestAPIClient().getSingleUserDelayed();

        assertEquals(responseBody.getStatusCode(),200);
    }

}
