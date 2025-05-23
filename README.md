 Smart Travel: Self-Driving Ride with Observer Pattern

This project simulates a self-driving car ride request system where family members can track the ride status in real-time using the Observer design pattern in Java.

  Scenario

- A car owner requests a ride to a destination using a **self-driving car**.
- As the ride starts, the system sends a **notification** to all registered **family members** (observers).
- The system follows **GRASP principles** to ensure good object-oriented design.



🧠 Design Patterns Used

 🔹 Observer Pattern
- `FamilyMember` observes the `TrackingService`.
- When the car starts, all family members receive updates.

🔹 Singleton Pattern
`TrackingService` ensures a single notification center is used throughout the app.




