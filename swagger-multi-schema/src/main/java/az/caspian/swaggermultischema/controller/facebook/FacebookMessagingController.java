package az.caspian.swaggermultischema.controller.facebook;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/facebook")
public class FacebookMessagingController {

    @PostMapping("/connect")
    public String connectFacebook() {
        return "Facebook is connected";
    }

    @PostMapping("/disconnect")
    public String disconnectFacebook() {
        return "Facebook is disconnected";
    }
}
