package homeInsurances;

import abstracts.HomeInsurance;

public class ExpensiveHomeInsurance extends HomeInsurance {
    @Override
    public void insurance() {
        System.out.println("expensive home insurance");
    }
}
