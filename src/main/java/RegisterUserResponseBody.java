import lombok.Getter;
import lombok.Setter;

@Getter
public class RegisterUserResponseBody {


    private int id;
    private String token;


    @Setter
    private int statusCode;
}
