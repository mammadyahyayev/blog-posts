package az.caspian.swaggermultischema.controller.slack;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/slack/messaging")
public class SlackConnectionController {

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        return "Hello, Slack";
    }

    @GetMapping("/receive")
    public String getLastMessage() {
        return "Message received";
    }
}
