package pt_pt.Dserl.Model.Facility;

import pt_pt.Dserl.Model.Locational.Location;

import java.util.ArrayList;

public class Laboratory extends Facility {

    ArrayList<Employer> employers = new ArrayList<Employer>();
    private double researchValue;
    private int numberOfResearches;

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    public double getResearchValue() {
        return researchValue;
    }

    public void setResearchValue(double researchValue) {
        this.researchValue = researchValue;
    }

    public int getNumberOfResearches() {
        return numberOfResearches;
    }

    public void setNumberOfResearches(int numberOfResearches) {
        this.numberOfResearches = numberOfResearches;
    }

    public Laboratory(String name, Location location, double value, ArrayList<Employer> employers, double researchValue, int numberOfResearches) {
        super(name, location, value);
        this.employers = employers;
        this.researchValue = researchValue;
        this.numberOfResearches = numberOfResearches;
    }
}
