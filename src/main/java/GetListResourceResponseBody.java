import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
public class GetListResourceResponseBody {

    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<ResourceData> data;
    private Support support;
    @Setter
    private int statusCode;
}
