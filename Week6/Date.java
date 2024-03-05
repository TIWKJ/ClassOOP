public class Date {
    private int day;
    private int month;    
    private int year;

    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 1900;
    }
    
    public Date(int day, int month, int year) {
        this.year = (year >=1900 && year<=2013) ? year : 1900 ; 
        this.month = (month >=1 && month <=12 ) ? month : 1 ;
        int Max = MaxDays(month, year);
        this.day = (day >=1 && day <= Max) ? day : 1 ;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private int MaxDays(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28; 
            case 4: case 6: case 9: case 11: 
                return 30;
            default: 
                return 31;
        }
    }


    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}
