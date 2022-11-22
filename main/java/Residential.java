import java.time.LocalDate;

public class Residential extends Building {
    private int numberOfClassrooms;

    public Residential(String name, String architect, LocalDate dateOfConstruction, int numberOfRooms) {
            super(name, architect, dateOfConstruction, numberOfRooms);
            this.numberOfClassrooms = numberOfClassrooms;

        }
}
