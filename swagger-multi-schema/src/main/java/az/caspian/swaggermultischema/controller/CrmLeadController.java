package az.caspian.swaggermultischema.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/leads")
public class CrmLeadController {

    @GetMapping
    public List<String> getAllLeads() {
        return List.of("Jack", "Rose");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createLead(@RequestParam String firstName, @RequestParam String lastName) {
        return firstName + " " + lastName;
    }
}
