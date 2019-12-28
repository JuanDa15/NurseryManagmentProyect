package Models;

public class WeedPhysicalControl {
    private String pruningFrecuency;
    private String lastAplication;

    public WeedPhysicalControl() {
    }

    public WeedPhysicalControl(String pruningFrecuency, String lastAplication) {
        this.pruningFrecuency = pruningFrecuency;
        this.lastAplication = lastAplication;
    }

    public String getPruningFrecuency() {
        return pruningFrecuency;
    }

    public void setPruningFrecuency(String pruningFrecuency) {
        this.pruningFrecuency = pruningFrecuency;
    }

    public String getLastAplication() {
        return lastAplication;
    }

    public void setLastAplication(String lastAplication) {
        this.lastAplication = lastAplication;
    }
}
