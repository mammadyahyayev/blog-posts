package az.caspian.swaggermultischema.controller.whatsapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/whatsapp")
public class WhatsappMessagingController {

    @PostMapping("/connect")
    public String connectWhatsapp() {
        return "Whatsapp is connected";
    }

    @PostMapping("/disconnect")
    public String disconnectWhatsapp() {
        return "Whatsapp is disconnected";
    }
}
