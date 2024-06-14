public class Patient {
    int age;
    String patientName,gender;

    Patient(int age, String patientName, String gender ){
        this.age=age;
        this.patientName=patientName;
        this.gender=gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "age=" + age +
                ", patientName='" + patientName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public boolean addPatient(){

    }
}
