package personalInsurances;

import abstracts.PersonalInsurance;

public class ExpensivePersonalInsurance extends PersonalInsurance {
    @Override
    public void insurance() {
        System.out.println("Expensive personal insurance");
    }
}
