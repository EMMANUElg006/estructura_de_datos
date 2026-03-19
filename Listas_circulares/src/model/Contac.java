package model;

public class Contac {
    private String fullName;
    private String Phone;

    public Contac(String fullName, String phone) {
        this.fullName = fullName;
        Phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Contac{" +
                "fullName='" + fullName + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
