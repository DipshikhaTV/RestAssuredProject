import lombok.Getter;
import lombok.Setter;

@Getter
public class GetSingleUserResponseBody {

    private Data data;
    private Support support;

    @Setter
    private int statusCode;
}
