import lombok.Getter;
import lombok.Setter;

@Getter
public class GetSingleResourceResponseBody {

    private Data data;
    private Support support;

    @Setter
    private int statusCode;
}
