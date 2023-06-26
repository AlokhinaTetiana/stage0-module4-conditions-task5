package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        int check;
        if(year%4==0&&year%100!=0 || year%4==0&&year%100==0&&year%400==0) check=0;
        else{check=1;};
        switch (check){
            case 0:System.out.println("leap");
                break;
            default: System.out.println("not leap");
        }
    }
}
