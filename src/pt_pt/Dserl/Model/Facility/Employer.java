package pt_pt.Dserl.Model.Facility;

public class Employer {
    private String name;
    private int age;
    private double salary;
    private Research research;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Research getResearch() {
        return research;
    }

    public void setResearch(Research research) {
        this.research = research;
    }

    public Employer(String name, int age, double salary, Research research) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.research = research;
    }
}
