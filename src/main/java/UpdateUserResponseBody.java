import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public class UpdateUserResponseBody {

    private String name;
    private String job;
    private String updatedAt;

    @Setter
    private int statusCode;

}
