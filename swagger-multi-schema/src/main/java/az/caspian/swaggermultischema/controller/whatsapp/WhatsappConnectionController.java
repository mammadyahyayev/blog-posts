package az.caspian.swaggermultischema.controller.whatsapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/whatsapp/messaging")
public class WhatsappConnectionController {

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        return "Hello, Whatsapp";
    }

    @GetMapping("/receive")
    public String getLastMessage() {
        return "Message received";
    }
}
