public class EmpWageUC3 {
    public static void main(String[] args) {
        int partTime = 1;
        int fullTime = 2;
        int ratePerHour = 20;
        int empHrs = 0;
        int empWage =0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if(empCheck == partTime){
            empHrs = 4;
        }
        else if(empCheck == fullTime){
            empHrs = 8;
        }else {
            empHrs = 0;
        }
        empWage = empHrs * ratePerHour;
        System.out.println("Employee Wage: "+empWage);
    }
}
