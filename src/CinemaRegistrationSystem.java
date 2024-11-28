import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// IRegistration Interface
interface IRegistration {
    void addCustomer(Customer customer);
    void listCustomers();
}

// BaseEntity Class
abstract class BaseEntity {
    private final int id;
    private final String name;

    public BaseEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract void showInfo();
}

// Customer Class
class Customer extends BaseEntity {
    private final String phoneNumber;
    private final String surname;

    public Customer(int id, String name, String surname, String phoneNumber) {
        super(id, name);
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public void showInfo() {
        System.out.println("Customer Name: " + getName() + " " + surname + ", Phone: " + phoneNumber);
    }
}

// Movie Class
class Movie implements IRegistration {
    private final String name;
    private final int duration;
    private final String genre;
    private final List<Customer> customers;

    public Movie(String name, int duration, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.customers = new ArrayList<>();
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void listCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers registered for this movie.");
        } else {
            System.out.println("Customers Registered for the Movie:");
            for (Customer customer : customers) {
                customer.showInfo();
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }
}

// Theater Class
class Theater extends BaseEntity implements IRegistration {
    private final int capacity;
    private Movie playingMovie;
    private final List<Customer> customers;

    public Theater(int id, String name, int capacity) {
        super(id, name);
        this.capacity = capacity;
        this.customers = new ArrayList<>();
    }

    public void assignMovie(Movie movie) {
        this.playingMovie = movie;
    }

    public Movie getPlayingMovie() {
        return playingMovie;
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void listCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers registered for this theater.");
        } else {
            System.out.println("Customers Registered for the Theater:");
            for (Customer customer : customers) {
                customer.showInfo();
            }
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Theater Name: " + getName() + ", Capacity: " + capacity);
        if (playingMovie != null) {
            System.out.println("Playing Movie: " + playingMovie.getName());
        } else {
            System.out.println("No movie is currently playing in this theater.");
        }
    }
}

// Main Class
public class CinemaRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        List<Movie> movies = new ArrayList<>();
        List<Theater> theaters = new ArrayList<>();

        while (true) {
            System.out.println("\n═══════════════════ Cinema Registration System ═══════════════════");
            System.out.println("» 1. Add New Movie");
            System.out.println("» 2. Add New Customer");
            System.out.println("» 3. Add New Theater");
            System.out.println("» 4. Movie Information and Assigned Theaters");
            System.out.println("» 5. List Customers in a Theater");
            System.out.println("» 6. Exit");

            System.out.print("» Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n═════════════ Enter movie details or type 0 to go back ═════════════");
                    System.out.print("» Movie Name: ");
                    String movieName = scanner.nextLine();
                    if (movieName.equals("0")) {
                        System.out.println("Returning to the main menu...\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                        break;
                    }

                    System.out.print("» Duration (min): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("» Genre: ");
                    String genre = scanner.nextLine();
                    Movie movie = new Movie(movieName, duration, genre);
                    movies.add(movie);
                    System.out.println("Movie successfully added!\n" +
                            "═══════════════════════════════════════════════════════════════════════");
                    break;

                case 2:
                    System.out.println("\n═════════════ Enter customer details or type 0 to go back ═════════════");
                    System.out.print("» Customer Name: ");
                    String customerName = scanner.nextLine();
                    if (customerName.equals("0")) {
                        System.out.println("Returning to the main menu...\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                        break;
                    }

                    System.out.print("» Customer Surname: ");
                    String customerSurname = scanner.nextLine();
                    System.out.print("» Phone Number: ");
                    String phoneNumber = scanner.nextLine();

                    if (movies.isEmpty()) {
                        System.out.println("No movies have been added yet. Please add a movie first.\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                        break;
                    }

                    System.out.println("» Which movie to register for? Select a movie:");
                    for (int i = 0; i < movies.size(); i++) {
                        System.out.println((i + 1) + ". " + movies.get(i).getName());
                    }
                    System.out.print("» Choice: ");
                    int movieChoice = scanner.nextInt();
                    scanner.nextLine(); //

                    if (movieChoice < 1 || movieChoice > movies.size()) {
                        System.out.println("Invalid movie selection. Please try again.");
                        break;
                    }

                    Customer customer = new Customer(customers.size() + 1, customerName, customerSurname, phoneNumber);
                    customers.add(customer);
                    movies.get(movieChoice - 1).addCustomer(customer);
                    System.out.println("Customer successfully added and registered for the movie!\n" +
                            "═══════════════════════════════════════════════════════════════════════");
                    break;

                case 3:
                    System.out.println("\n═════════════ Enter Theater details or type 0 to go back ═════════════");
                    System.out.print("» Theater Name: ");
                    String theaterName = scanner.nextLine();
                    if (theaterName.equals("0")) {
                        System.out.println("Returning to the main menu...\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                        break;
                    }

                    System.out.print("» Capacity: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine();
                    Theater theater = new Theater(theaters.size() + 1, theaterName, capacity);
                    theaters.add(theater);

                    if (!movies.isEmpty()) {
                        System.out.println("» Select a movie:");
                        for (int i = 0; i < movies.size(); i++) {
                            System.out.println((i + 1) + ". " + movies.get(i).getName());
                        }

                        System.out.print("» Choice: ");
                        int movieAssignmentChoice = scanner.nextInt();
                        scanner.nextLine();

                        theater.assignMovie(movies.get(movieAssignmentChoice - 1));
                        System.out.println("Movie successfully assigned to the theater!\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                    } else {
                        System.out.println("No movies have been added yet.\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                    }
                    break;

                case 4:
                    if (movies.isEmpty()) {
                        System.out.println("No movies have been added yet.\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                    } else {
                        System.out.println("\n════════════════════ Movies and Assigned Theaters ════════════════════");
                        for (Movie m : movies) {
                            System.out.println("Movie: " + m.getName() + " (" + m.getDuration() + " min, Genre: " + m.getGenre() + ")");
                            for (Theater t : theaters) {
                                if (t.getPlayingMovie() == m) {
                                    System.out.println("» Assigned Theater: " + t.getName() +
                                            "\n═══════════════════════════════════════════════════════════════════════");
                                }
                            }
                        }
                    }
                    break;

                case 5:
                    if (theaters.isEmpty()) {
                        System.out.println("No theaters have been added yet.\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                        break;
                    }
                    System.out.println("═══════════════ List Information And Assigned Theaters ═══════════════");
                    System.out.println("» Select a theater:");
                    for (int i = 0; i < theaters.size(); i++) {
                        System.out.println("» "+ (i + 1) + ". " + theaters.get(i).getName());
                    }
                    System.out.println("» 0. Go Back");

                    System.out.print("» Choice: ");
                    int theaterChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (theaterChoice == 0) {
                        System.out.println("Returning to the main menu...\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                        break;
                    }

                    Theater selectedTheater = theaters.get(theaterChoice - 1);

                    if (selectedTheater.getPlayingMovie() != null) {
                        System.out.println("» Playing Movie: " + selectedTheater.getPlayingMovie().getName()
                                + " (" + selectedTheater.getPlayingMovie().getDuration() + " min, Genre: "
                                + selectedTheater.getPlayingMovie().getGenre() + ")");
                        selectedTheater.getPlayingMovie().listCustomers();
                        System.out.println("\n═══════════════════════════════════════════════════════════════════════");
                    } else {
                        System.out.println("No movie is currently playing in this theater.\n" +
                                "═══════════════════════════════════════════════════════════════════════");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...\n" +
                            "═══════════════════════════════════════════════════════════════════════");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.\n" +
                            "═══════════════════════════════════════════════════════════════════════");
            }
        }
    }
}
