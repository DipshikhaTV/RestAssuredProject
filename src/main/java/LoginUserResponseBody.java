import lombok.Getter;
import lombok.Setter;

@Getter
public class LoginUserResponseBody {

    private String token;

    @Setter
    private int statusCode;
}
