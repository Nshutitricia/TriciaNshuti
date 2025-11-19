package q2;
import java.util.Date;
import java.util.Scanner;

public final class Ticket extends Payment {
    private String ticketNumber;
    private Date issueDate;

    public Ticket(int id, Date createdDate, Date updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  Date bookingDate, String seatNumber, String travelClass,
                  Date paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, Date issueDate) {
        super(id, createdDate, updatedDate,
                airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid);
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    public double calculateFare() {
        double taxes = getBaseFare() * 0.16;
        double discount = 20;
        return getBaseFare() + taxes - discount;
    }

    public void displayAllData() {
        System.out.println("===== TICKET (27253) =====");
        System.out.println("Ticket No: " + ticketNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Passenger: " + getPassengerName() + ", Age: " + getAge() + ", Gender: " + getGender() + ", Contact: " + getContact());
        System.out.println("Flight: " + getFlightNumber() + " (" + getDeparture() + " -> " + getDestination() + ")");
        System.out.println("Airline: " + getAirlineName() + " (" + getAirlineCode() + ")");
        System.out.println("Pilot: " + getPilotName() + ", License: " + getLicenseNumber() + ", Exp: " + getExperienceYears() + " yrs");
        System.out.println("Cabin Crew: " + getCrewName() + ", Role: " + getRole() + ", Shift: " + getShift());
        System.out.println("Booking Date: " + getBookingDate() + ", Seat: " + getSeatNumber() + ", Class: " + getTravelClass());
        System.out.println("Payment: " + getAmountPaid() + ", Method: " + getPaymentMethod() + ", Date: " + getPaymentDate());
        System.out.println("Calculated Fare: " + calculateFare());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter passenger name: ");
        String pname = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter gender (Male/Female): ");
        String gender = sc.nextLine();
        System.out.print("Enter contact: ");
        String contact = sc.nextLine();
        System.out.print("Enter ticket number: ");
        String tnum = sc.nextLine();

        Ticket t = new Ticket(
                1, new Date(), new Date(),
                "Kigali Airport", "KGL", "Kigali",
                "RwandAir", "RW", "info@rw.com",
                "WB100", "KGL", "NBO", 300,
                "John Pilot", "LIC123", 5,
                "Alice", "Attendant", "Day",
                pname, age, gender, contact,
                new Date(), "12A", "Economy",
                new Date(), "Card", 300,
                tnum, new Date()
        );

        t.displayAllData();
    }
}
