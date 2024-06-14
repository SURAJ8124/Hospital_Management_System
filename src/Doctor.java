public class Doctor {
    String name, specilization;

    public Doctor(String specilization, String name) {
        this.specilization = specilization;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecilization() {
        return specilization;
    }

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", specilization='" + specilization + '\'' +
                '}';
    }
}
