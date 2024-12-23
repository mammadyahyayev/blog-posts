package az.caspian.swaggermultischema.controller.instagram;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/instagram")
public class InstagramMessagingController {

    @PostMapping("/connect")
    public String connectInstagram() {
        return "Instagram is connected";
    }

    @PostMapping("/disconnect")
    public String disconnectInstagram() {
        return "Instagram is disconnected";
    }
}
