
import exception.NullPointer;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.MediaType;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.bind.annotation.RestController;


@RestController
public class MinValueServer {

    @Autowired
    MinValue minValue;

    @GetMapping(path = "/min-value", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public double findNimValue(@RequestBody ReceivedArrayList receivedArrayList) throws NullPointer {
        return minValue.minValue(receivedArrayList.getArrayList());
    }

}