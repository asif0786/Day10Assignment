public class EmpWageUC9 {
    public static final int partTime = 1;
    public static final int fullTime = 2;
    private final String company;
    private final int ratePerHour;
    private final int workDays;
    private final int maxHrsInMonth;
    private int totalEmpWage;


    public EmpWageUC9(String company, int ratePerHour, int workDays, int maxHrsInMonth) {
        this.company = company;
        this.ratePerHour = ratePerHour;
        this.workDays = workDays;
        this.maxHrsInMonth = maxHrsInMonth;
    }
    public void computeEmpWage(){
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
        totalEmpWage = totalEmpHrs * ratePerHour;
    }

    @Override
    public String toString(){
        return "Total Emp Wage for Company: "+company+" is:"+totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWageUC9 dMart = new EmpWageUC9("DMart", 20, 2, 10);
        EmpWageUC9 reliance = new EmpWageUC9("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}
