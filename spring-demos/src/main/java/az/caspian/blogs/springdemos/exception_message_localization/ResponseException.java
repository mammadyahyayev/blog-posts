package az.caspian.blogs.springdemos.exception_message_localization;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Locale;

@Getter
public class ResponseException extends RuntimeException {
  private final String messageTemplate;
  private final HttpStatus status;
  private final transient Object[] params;
  private final Locale locale;

  public ResponseException(HttpStatus status) {
    this.status = status;
    this.messageTemplate = null;
    this.params = null;
    this.locale = null;
  }

  public ResponseException(HttpStatus status, String message) {
    super(message);
    this.status = status;
    this.messageTemplate = null;
    this.params = null;
    this.locale = null;
  }

  public ResponseException(HttpStatus status, String messageTemplate, Object[] params, Locale locale) {
    super(messageTemplate);
    this.status = status;
    this.messageTemplate = messageTemplate;
    this.params = params;
    this.locale = locale;
  }

  public static ResponseException notFound(String message) {
    return new ResponseException(HttpStatus.NOT_FOUND, message);
  }

  public static ResponseException notFound(String messageTemplate, Locale locale) {
    return new ResponseException(HttpStatus.NOT_FOUND, messageTemplate, null, locale);
  }

  public static ResponseException notFound(String messageTemplate, Object[] params, Locale locale) {
    return new ResponseException(HttpStatus.NOT_FOUND, messageTemplate, params, locale);
  }

  public static ResponseException notFound(String messageTemplate, Locale locale, Object param) {
    return new ResponseException(HttpStatus.NOT_FOUND, messageTemplate, new Object[]{param}, locale);
  }

  public static ResponseException forbidden(String message) {
    return new ResponseException(HttpStatus.FORBIDDEN, message);
  }

  public static ResponseException forbidden(String messageTemplate, Locale locale) {
    return new ResponseException(HttpStatus.FORBIDDEN, messageTemplate, null, locale);
  }

  public static ResponseException forbidden(String messageTemplate, Object[] params, Locale locale) {
    return new ResponseException(HttpStatus.FORBIDDEN, messageTemplate, params, locale);
  }

  public static ResponseException badRequest(String message) {
    return new ResponseException(HttpStatus.BAD_REQUEST, message);
  }

  public static ResponseException badRequest(String messageTemplate, Locale locale) {
    return new ResponseException(HttpStatus.BAD_REQUEST, messageTemplate, null, locale);
  }

  public static ResponseException badRequest(String messageTemplate, Object[] params, Locale locale) {
    return new ResponseException(HttpStatus.BAD_REQUEST, messageTemplate, params, locale);
  }

  public static ResponseException conflict(String message) {
    return new ResponseException(HttpStatus.CONFLICT, message);
  }

  public static ResponseException conflict(String messageTemplate, Object[] params, Locale locale) {
    return new ResponseException(HttpStatus.CONFLICT, messageTemplate, params, locale);
  }

  public static ResponseException conflict(String messageTemplate, Locale locale, String param) {
    return new ResponseException(HttpStatus.CONFLICT, messageTemplate, new Object[]{param}, locale);
  }

  public static ResponseException internalServerError(String message) {
    return new ResponseException(HttpStatus.INTERNAL_SERVER_ERROR, message);
  }

  public static ResponseException internalServerError(String messageTemplate, Locale locale) {
    return new ResponseException(HttpStatus.INTERNAL_SERVER_ERROR, messageTemplate, null, locale);
  }
}
