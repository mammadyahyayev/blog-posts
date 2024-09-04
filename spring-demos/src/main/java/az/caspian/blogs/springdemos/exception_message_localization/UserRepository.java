package az.caspian.blogs.springdemos.exception_message_localization;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  {
  Optional<User> findByUsername(String username);
}
