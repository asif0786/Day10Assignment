public class EmpWageUC8 {
    public static final int partTime = 1;
    public static final int fullTime = 2;

    public static int computeWage(String company, int ratePerHour, int workDays, int maxHrsInMonth){
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
            System.out.println("Day "+totalWorkDays+":"+" Employee Hr: "+empHrs);
        }
        int totalEmpWage = totalEmpHrs * ratePerHour;
        System.out.println("Total Employee Wage for Company: "+company+" is: "+totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        computeWage("DMart", 20, 2, 10);
        computeWage("Reliance", 10, 4, 20);

    }
}
