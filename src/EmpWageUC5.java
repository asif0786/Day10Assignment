public class EmpWageUC5 {
    public static final int partTime = 1;
    public static final int fullTime = 2;
    public static final int ratePerHour = 20;
    public static final int workDays = 2;
    public static void main(String[] args) {
        int empHrs = 0, empWage =0, totalEmpWage = 0;

        for(int day =0;day < workDays; day++) {
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
            empWage = empHrs * ratePerHour;
            totalEmpWage += empWage;
            System.out.println("Employee Wage: "+empWage);
        }
        System.out.println("Total Employee Wage: "+totalEmpWage);
    }
}
