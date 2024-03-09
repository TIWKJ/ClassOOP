public class TestpartTimeEm {
    public static void main(String[] args) {

        PartTimeEmployee p1 = new PartTimeEmployee();
        p1.setNameRateHours("SomChai", "Jaidee ", 20, 5);
        p1.calculatePay();
        System.out.println(p1);
       
        PartTimeEmployee p2 = new PartTimeEmployee("Harry", "Porter", 100, 5);
        p2.calculatePay();
        System.out.println(p2);
        
    } 
}
