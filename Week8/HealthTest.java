package Week8;

import java.util.ArrayList;

public class HealthTest {
    public static void main(String[] args) {
        ArrayList<Health> list = new ArrayList<Health>();
        list.add(new Health("Sora", 75, 180, 15, 'F'));
        list.add(new Health("Dan", 72, 165,20, 'M'));
        list.add(new Health("Endo", 90, 180,23, 'M'));

        for(Health argument : list){
            System.out.println("Name :" + argument.getName() + " Weight :" + argument.getWeight() + " Height :" + argument.getHeight() + " Age :" + argument.getAge() + " Gender :" + argument.getGender());
            if(argument.isFat() == true){
                System.out.println("Fat");
            }
            else{
                System.out.println("Not Fat");
            }
            System.out.println("This is BMR value recommend per day " + argument.calculateBMR());

        }
    }
}
