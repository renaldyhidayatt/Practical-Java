package concurrency.concurrency16;

class SharedResource {
    private User current;

    public SharedResource(User current) {
        this.current = current;
    }

    public User getCurrent() {
        return current;
    }

    public synchronized void setCurrent(User d) {
        current = d;
    }
}

class User {
    private String name;
    private boolean active;

    public User(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public synchronized void use(SharedResource sharedResource,
                                 User otherUser) {
        while (active) {
            if (sharedResource.getCurrent() != this) {
                try {
                    wait(1000);
                } catch (InterruptedException e) {

                }
                continue;
            }
            if (otherUser.isActive()) {
                System.out.println(getName() +
                        " : handover the shared resource to the user " +
                        otherUser.getName());
                sharedResource.setCurrent(otherUser);
                continue;
            }
            System.out.println(getName() + ": using the shared resource");
            active = false;
            sharedResource.setCurrent(otherUser);
        }
    }
}

public class Main {

    public static void main(String[] args) {

        final User userA = new User("User A ", true);
        final User userB = new User("User B", true);

        final SharedResource sharedResource = new SharedResource(userA);

        new Thread(new Runnable() {
            @Override
            public void run() {
                userA.use(sharedResource,
                        userB);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                userB.use(sharedResource, userA);
            }
        }).start();

    }
}
