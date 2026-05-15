// 用户类
public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public void send(String message) {
        chatRoom.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " received message: " + message);
    }
}
