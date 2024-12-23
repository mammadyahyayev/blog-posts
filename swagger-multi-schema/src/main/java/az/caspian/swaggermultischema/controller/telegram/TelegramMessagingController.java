package az.caspian.swaggermultischema.controller.telegram;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/telegram")
public class TelegramMessagingController {

    @PostMapping("/connect")
    public String connectTelegram() {
        return "Telegram is connected";
    }

    @PostMapping("/disconnect")
    public String disconnectTelegram() {
        return "Telegram is disconnected";
    }
}
