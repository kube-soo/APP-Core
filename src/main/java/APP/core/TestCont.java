package APP.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestCont {

    @GetMapping("/test")
    public String getTest() {
        return "index";
    }
}
