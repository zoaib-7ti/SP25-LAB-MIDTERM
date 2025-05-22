public class Main {
    public static void main(String[] args) {

        FamilyMember brother1 = new FamilyMember("brother 1");

        FamilyMember brother2 = new FamilyMember("Brother 2");

        TrackingService trackingService = TrackingService.getInstance();

        trackingService.registerObserver(brother1);

        trackingService.registerObserver(brother2);

        SelfDrivingCar car = new SelfDrivingCar();
        car.requestRide("garhihabibullah");
    }
}