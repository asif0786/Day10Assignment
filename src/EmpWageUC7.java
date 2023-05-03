public class EmpWageUC7 {
    public static final int partTime = 1;
    public static final int fullTime = 2;
    public static final int ratePerHour = 20;
    public static final int workDays = 2;
    public static final int maxHrsInMonth =10;

    public static int computeWage(){
        int empHrs = 0, totalEmpHrs =0, totalWorkDays = 0;

        while(totalEmpHrs <= maxHrsInMonth && totalWorkDays < workDays) {
            totalWorkDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case partTime:
                    empHrs = 4;
                    break;
                case fullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: "+totalWorkDays+" Employee Hr: "+empHrs);
        }
        int totalEmpWage = totalEmpHrs * ratePerHour;
        System.out.println("Total Employee Wage: "+totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        computeWage();
    }
}
