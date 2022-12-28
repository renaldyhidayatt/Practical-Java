package behavior_patterns.mediator_patterns;

public interface Colleague {
    void send(String msg);

    void receive(String msg);
}
