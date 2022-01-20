public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    private Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public static class Builder {
        private Person newPerson;

        public Builder() {
            this.newPerson = new Person();
        }

        public Builder withFirstName(String firstName){
            newPerson.setFirstName(firstName);
            return this;
        }

        public Builder withLastName(String lastName){
            newPerson.setLastName(lastName);
            return this;
        }

        public Builder withMiddleName(String middleName){
            newPerson.setMiddleName(middleName);
            return this;
        }

        public Builder withCountry(String country){
            newPerson.setCountry(country);
            return this;
        }

        public Builder withAddress(String address){
            newPerson.setAddress(address);
            return this;
        }

        public Builder withPhone(String phone){
            newPerson.setPhone(phone);
            return this;
        }

        public Builder withAge(int age){
            newPerson.setAge(age);
            return this;
        }

        public Builder withGender(String gender){
            newPerson.setGender(gender);
            return this;
        }

        public Person build(){
            return this.newPerson;
        }
    }
}
