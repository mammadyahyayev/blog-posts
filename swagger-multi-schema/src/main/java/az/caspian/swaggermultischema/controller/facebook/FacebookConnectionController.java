package az.caspian.swaggermultischema.controller.facebook;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/facebook/messaging")
public class FacebookConnectionController {

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        return "Hello, Facebook";
    }

    @GetMapping("/receive")
    public String getLastMessage() {
        return "Message received";
    }
}
