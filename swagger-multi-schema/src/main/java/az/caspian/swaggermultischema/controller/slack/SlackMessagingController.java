package az.caspian.swaggermultischema.controller.slack;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/slack")
public class SlackMessagingController {

    @PostMapping("/connect")
    public String connectSlack() {
        return "Slack is connected";
    }

    @PostMapping("/disconnect")
    public String disconnectSlack() {
        return "Slack is disconnected";
    }
}
