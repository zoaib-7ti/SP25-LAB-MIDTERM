public class SelfDrivingCar {

    private TrackingService trackingService = TrackingService.getInstance();

    public void requestRide(String destination) {

        System.out.println("Self-driving ride requested to: " + destination);

        System.out.println("Car is driving autonomously to " + destination + "...");

        trackingService.sendLiveUpdate();
    }
}