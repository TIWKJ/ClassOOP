public class DateTest {
    public static void main(String[] args) {

        Date date = new Date(7,4,2004);
        System.out.printf("The Initial date is: %d/%d/%d%n" , date.getDay() , date.getMonth() , date.getYear());
        date.setDay(11);
        date.setMonth(1);
        date.setYear(2003);
        System.out.printf("Date with new values is: %d/%d/%d" ,  date.getDay() , date.getMonth() , date.getYear());
        }
}
