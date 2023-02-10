package abstractjava.abstract4;

public class TestMember {
    public static void main(String[] args) {
        System.out.println(Loan.maxTotalLoan);
        double repaymetAmount=HomeLoan.calcRepaymentAmount(50_000,1.15,5);
        System.out.println(repaymetAmount);

        Loan homeLoan= new HomeLoan("a123",300,10);
        System.out.println(homeLoan.maxTotalLoan);

    }
}
