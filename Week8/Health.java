package Week8;

public class Health {
    private String name;
    private double weight;
    private double height;
    private int age;
    private char gender;


    public Health(String name, double weight, double height, int age, char gender) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }


    public double calculateBMR() {
        double bmr = 0;
    
        if (this.gender == 'M') {
            bmr = 66 + (13.7 * weight) + (5 * height) - (6.8 * age);
        } else if (this.gender == 'F') {
            bmr = 665 + (9.6 * weight) + (1.8 * height) - (4.7 * age);
        } else {
            System.out.println("Invalid gender specified.");
        }
    
        return bmr; 
            
    }

    public boolean isFat() {
        if (this.gender == 'M') {
            if (getWeight() > (getHeight() - 100)) {
                return true;
            }
            return false;
        } else if (this.gender == 'F') {
            if (getWeight() > (getHeight() - 110)) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("Invalid gender specified.");
        }

    }

}
