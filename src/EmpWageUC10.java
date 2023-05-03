public class CompanyEmpWage{
    public final String company;
    public final int ratePerHour;
    public final int workDays;
    public final int maxHrsInMonth;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int ratePerHour, int workDays, int maxHrsInMonth){
        this.company = company;
        this.ratePerHour = ratePerHour;
        this.workDays = workDays;
        this.maxHrsInMonth = maxHrsInMonth;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: "+company+" is: "+totalEmpWage;
    }

}
public class EmpWageUC10 {
    public static final int partTime = 1;
    public static final int fullTime = 2;

    private int numOfCompany =0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageUC10(){
        companyEmpWageArray = new CompanyEmpWage[5];
    }
    private void addCompanyEmpWage(String company, int ratePerHour, int workDays, int maxHrsInMonth){
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company. ratePerHour, workDays, maxHrsInMonth)
        numOfCompany++;
    }

    private void computeEmpWage(){
        for (int i = 0; i < numOfCompany; i++){
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }
    private int computeEmpWage(CompanyEmpWage companyEmpWage){
        int empHrs = 0, totalEmpHrs =0, totalWorkDays = 0;
        while(totalEmpHrs <= companyEmpWage.maxHrsInMonth && totalWorkDays < companyEmpWage.workDays) {
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
