package az.caspian.blogs.springdemos.exception_message_localization;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Override
  public User findByUsername(String username, String lang) {
    return userRepository.findByUsername(username)
        .orElseThrow(() -> ResponseException.notFound("user_not_found", new Locale(lang)));
  }
}
