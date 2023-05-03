public class EmpWageUC2 {
    public static void main(String[] args) {
        int fullTime = 1;
        int ratePerHour = 20;
        int empHrs = 0;
        int empWage =0;

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == fullTime){
            empHrs = 8;
        }else {
            empHrs = 0;
        }
        empWage = empHrs * ratePerHour;
        System.out.println("Employee Wage: "+empWage);
    }
}
