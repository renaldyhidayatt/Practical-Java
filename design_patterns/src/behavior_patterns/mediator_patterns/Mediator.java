package behavior_patterns.mediator_patterns;

public interface Mediator {

    void addColleague(Colleague user);

    void sendMessage(String msg, Colleague user);
}
