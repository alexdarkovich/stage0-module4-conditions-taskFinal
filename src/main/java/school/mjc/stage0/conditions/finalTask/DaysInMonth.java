package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year % 400 == 0) {
            amountOfDaysLeap(month);
        } else if (year % 100 == 0) {
            amountOfDays(month);
        } else if (year % 4 == 0) {
            amountOfDaysLeap(month);
        } else amountOfDays(month);
    }

    public void amountOfDays(int month) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println("invalid date");
        }
    }

    public void amountOfDaysLeap(int month) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 2:
                System.out.println(29);
                break;
            default:
                System.out.println("invalid date");
        }
    }
}
