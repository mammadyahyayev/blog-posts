package com.blogs;

import java.util.Optional;

public class OrElseAndOrElseGetMethods {

  record Chat(String name) {
  }

  class ChatService {
    public Optional<Chat> findChatByName(String name) {
      // searching inside db
      var foundedChat = new Chat(name);
      return Optional.of(foundedChat);
    }
  }

  private final ChatService chatService = new ChatService();

  public static void main(String[] args) {
    var main = new OrElseAndOrElseGetMethods();
    main.testOrElse();
    System.out.println("**********");
    main.testOrElseGet();
  }

  public void testOrElse() {
    System.out.println("Testing orElse() method");
    chatService.findChatByName("demo-chat")
        .orElse(save(new Chat("demo-chat")));
  }

  public void testOrElseGet() {
    System.out.println("Testing orElseGet() method");
    chatService.findChatByName("demo-chat")
        .orElseGet(() -> save(new Chat("demo-chat")));
  }

  public Chat save(Chat chat) {
    System.out.println("Saving " + chat);
    // saving Chat to database
    return chat;
  }
}
