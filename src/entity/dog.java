package entity;

public class dog {
    private String dogName;
    private int countFeet;

     public dog(){

     }
    public dog(String dogName, int countFeet) {
        this.dogName = dogName;
        this.countFeet = countFeet;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getCountFeet() {
        return countFeet;
    }

    public void setCountFeet(int countFeet) {
        this.countFeet = countFeet;
    }

    @Override
    public String toString() {
        return "dog{" +
                "dogName='" + dogName + '\'' +
                ", countFeet=" + countFeet +
                '}';
    }
}
