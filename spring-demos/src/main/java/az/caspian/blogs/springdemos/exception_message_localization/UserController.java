package az.caspian.blogs.springdemos.exception_message_localization;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping("/{username}")
  public User findByUsername(
      @PathVariable String username,
      @RequestParam(required = false, defaultValue = "en") String lang
  ) {
    return userService.findByUsername(username, lang);
  }

}
