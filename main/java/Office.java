import java.time.LocalDate;

public class Office extends Building {

    private int numberOfCompanies;

    public Office(String name, String architect, LocalDate dateOfConstruction, int numberOfRooms){
        super(name, architect, dateOfConstruction, numberOfRooms);
        this.numberOfCompanies = numberOfCompanies;
    }

}
