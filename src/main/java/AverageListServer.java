
import exception.NullPointer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class AverageListServer {

    @Autowired
    AverageList averageList;

    @GetMapping(path = "/average-list", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public double averageList(@RequestBody ReceivedArrayList receivedArrayList) throws NullPointer {
        return averageList.averageList(receivedArrayList.getArrayList());
    }

}