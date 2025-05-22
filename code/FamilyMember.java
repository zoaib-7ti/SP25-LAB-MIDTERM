public class FamilyMember implements Observer {
    private String name;

    public FamilyMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("[" + name + "] Notification: " + message);
    }
}