package structural.facade;

import java.util.Random;

/**
 * The Facade Design Pattern is a structural design pattern that provides a simplified interface to a complex system of classes, libraries, or frameworks.
 * It hides the complexities of the underlying system and provides a unified, easy-to-use interface to the client.
 */
interface HotelService {
    void cleaning(int roomNum);

    void foodService(int roomNumber, MenuBook menu, String message) throws InterruptedException;

    void booking();

    void unbook();

    void vacate();
}

class MenuBook {
    private String dish;
    private int count;

    public MenuBook(String dish, int count) {
        this.dish = dish;
        this.count = count;
    }

    @Override
    public String toString() {
        return "MenuBook{" +
                "dish='" + dish + '\'' +
                ", count=" + count +
                '}';
    }
}

class Room {
    private int roomNum;
    private boolean booked;

    public Room(int roomNum) {
        this.roomNum = roomNum;
        this.booked = false;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public boolean isBooked() {
        return booked;
    }

    public void book() {
        booked = true;
    }

    public void unbook() {
        booked = false;
    }
}

class RoomServices {
    private Room room;

    public RoomServices(Room room) {
        this.room = room;
    }

    void booking() {
        if (!room.isBooked()) {
            room.book();
            System.out.println("Room number " + room.getRoomNum() + " is booked.");
        } else {
            System.out.println("Room number " + room.getRoomNum() + " is already booked.");
        }
    }

    void unbook() {
        if (room != null && room.isBooked()) {
            room.unbook();
            System.out.println("Room number " + room.getRoomNum() + " is unbooked.");
        } else {
            System.out.println("Room is not booked yet.");
        }
    }

    void vacate() {
        if (room != null) {
            int roomNum = room.getRoomNum();
            room = null;
            System.out.println("Room number " + roomNum + " has been vacated.");
        } else {
            System.out.println("Room is already vacant.");
        }
    }
}

class CleanService {
    public void clean(int roomNum) {
        System.out.println("Room number " + roomNum + " is cleaned.");
    }
}

class RestaurantService {
    void foodS(int roomNumber, MenuBook menuBook, String message) throws InterruptedException {
        Random random = new Random();
        System.out.println("Order number: " + random.nextInt(100) +
                " | Menu: " + menuBook.toString() +
                " | Message: " + message);
        System.out.println("Order processing...");
        Thread.sleep(20000);
        System.out.println("Order delivered to room number: " + roomNumber);
    }
}

//  Facade Class
public class Receptionist implements HotelService {

    private RoomServices roomServices;
    private RestaurantService restaurantService;
    private CleanService cleanService;

    public Receptionist(Room room) {
        this.roomServices = new RoomServices(room);
        this.restaurantService = new RestaurantService();
        this.cleanService = new CleanService();
    }

    @Override
    public void cleaning(int roomNum) {
        cleanService.clean(roomNum);
    }

    @Override
    public void foodService(int roomNumber, MenuBook menu, String message) throws InterruptedException {
        restaurantService.foodS(roomNumber, menu, message);
    }

    @Override
    public void booking() {
        roomServices.booking();
    }

    @Override
    public void unbook() {
        roomServices.unbook();
    }

    @Override
    public void vacate() {
        roomServices.vacate();
    }

    public static void main(String[] args) throws InterruptedException {
        // Create a room
        Room room = new Room(101);

        // Create the facade (Receptionist)
        Receptionist receptionist = new Receptionist(room);

        // Booking a room
        receptionist.booking();

        // Ordering food
        receptionist.foodService(101, new MenuBook("Pasta", 2), "Less spicy");

        // Cleaning the room
        receptionist.cleaning(101);

        // Unbooking the room
        receptionist.unbook();

        // Vacating the room
        receptionist.vacate();
    }
}
