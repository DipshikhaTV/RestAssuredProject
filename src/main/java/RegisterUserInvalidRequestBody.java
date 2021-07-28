import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RegisterUserInvalidRequestBody {


    private String email;
}
