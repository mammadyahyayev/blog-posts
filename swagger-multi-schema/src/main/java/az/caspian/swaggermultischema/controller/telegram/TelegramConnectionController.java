package az.caspian.swaggermultischema.controller.telegram;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/telegram/messaging")
public class TelegramConnectionController {

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        return "Hello, Telegram";
    }

    @GetMapping("/receive")
    public String getLastMessage() {
        return "Message received";
    }
}
