import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Building {

    private String name;
    private String architect;
    private LocalDate dateOfConstruction;
    private int numberOfRooms;


    public Building(String name, String architect, LocalDate dateOfConstruction, int numberOfRooms){
        this.name = name;
        this.architect = architect;
        this.dateOfConstruction = dateOfConstruction;
        this.numberOfRooms = numberOfRooms;
    }

    //Getters

    private String getName(){
        return name;
    }

    private String getArchitect(){
        return architect;
    }

    private LocalDate getDateOfConstruction(){
        return dateOfConstruction;
    }

    private int getNumberOfRooms(){
        return numberOfRooms;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setArchitect(String architect) {
        this.architect = architect;
    }

    public void setDateOfConstruction(LocalDate dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

}
