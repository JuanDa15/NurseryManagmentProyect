package Models;
import java.util.ArrayList;

public class Producer {
    public int id;
    public String name;
    public String lastName;
    public ArrayList<Nursery> nurseryList;

    public Producer() {
    }

    public Producer(int id, String name, String lastName, ArrayList<Nursery> nurseryList) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.nurseryList = nurseryList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Nursery> getNurseryList() {
        return nurseryList;
    }

    public void setNurseryList(ArrayList<Nursery> nurseryList) {
        this.nurseryList = nurseryList;
    }  
}
