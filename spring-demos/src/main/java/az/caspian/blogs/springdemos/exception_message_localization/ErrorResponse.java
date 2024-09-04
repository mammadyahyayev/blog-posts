package az.caspian.blogs.springdemos.exception_message_localization;

public record ErrorResponse(
    int status,
    String message
) {
}

