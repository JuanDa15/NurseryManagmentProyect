package Models;
import java.util.ArrayList;

public class Nursery{
    private String code;
    private String name;
    private String department;
    private String municipality;
    private ArrayList<Labor> laborList;

    public Nursery() {
    }

    public Nursery(String code, String name, String department, String municipality, ArrayList<Labor> laborList) {
        this.code = code;
        this.name = name;
        this.department = department;
        this.municipality = municipality;
        this.laborList = laborList;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public ArrayList<Labor> getLaborList() {
        return laborList;
    }

    public void setLaborList(ArrayList<Labor> laborList) {
        this.laborList = laborList;
    }
}
