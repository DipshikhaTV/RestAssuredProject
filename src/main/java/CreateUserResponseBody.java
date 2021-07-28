import lombok.Getter;
import lombok.Setter;

@Getter
public class CreateUserResponseBody {

    private String name;
    private String job;
    private String id;
    private String createdAt;

    @Setter
    private int statusCode;

}
