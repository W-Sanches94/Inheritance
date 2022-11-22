import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Objects;

public class Architect {

    private ArrayList<Object> portfolio;

    public Architect (ArrayList<Object> portfolio){
        this.portfolio = portfolio;
    }
//getters & setters
    public ArrayList<Object> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(ArrayList<Object> portfolio) {
        this.portfolio = portfolio;
    }
}
