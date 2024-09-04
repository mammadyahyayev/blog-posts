package az.caspian.blogs.springdemos.exception_message_localization;

import io.micrometer.common.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  private final MessageSource messageSource;

  @ExceptionHandler(value = ResponseException.class)
  public ResponseEntity<ErrorResponse> handleResponseStatusException(ResponseException ex) {
    log.error("ResponseException: {}", ex.getMessage());

    String message = ex.getMessage();

    String messageTemplate = ex.getMessageTemplate();
    if (StringUtils.isNotBlank(messageTemplate)) {
      message = messageSource.getMessage(messageTemplate, ex.getParams(), ex.getLocale());
    }

    var errorResponse = new ErrorResponse(ex.getStatus().value(), message);

    return new ResponseEntity<>(errorResponse, ex.getStatus());
  }
}
