import java.time.LocalDate;

public class Educational extends Building {

    private int numberOfClassrooms;
    public Educational(String name, String architect, LocalDate dateOfConstruction, int numberOfRooms) {
        super(name, architect, dateOfConstruction, numberOfRooms);
        this.numberOfClassrooms = numberOfClassrooms;

    }
}