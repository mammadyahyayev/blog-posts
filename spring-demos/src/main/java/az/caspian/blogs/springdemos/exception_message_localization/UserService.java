package az.caspian.blogs.springdemos.exception_message_localization;

public interface UserService {
  User findByUsername(String username, String lang);
}
