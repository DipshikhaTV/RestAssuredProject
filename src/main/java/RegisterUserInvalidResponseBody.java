import lombok.Getter;
import lombok.Setter;

@Getter
public class RegisterUserInvalidResponseBody {

    private String error;

    @Setter
    private int statusCode;
}
