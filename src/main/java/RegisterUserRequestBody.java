import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegisterUserRequestBody {

    private String email;
    private String password;
}
