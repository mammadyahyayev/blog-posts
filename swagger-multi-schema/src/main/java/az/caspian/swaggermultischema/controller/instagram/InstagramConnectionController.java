package az.caspian.swaggermultischema.controller.instagram;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/instagram/messaging")
public class InstagramConnectionController {

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        return "Hello, Instagram";
    }

    @GetMapping("/receive")
    public String getLastMessage() {
        return "Message received";
    }
}
