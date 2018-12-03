package homeInsurances;

import abstracts.HomeInsurance;

public class ScamHomeInsurance extends HomeInsurance {
    @Override
    public void insurance() {
        System.out.println("Scam home insurance");
    }
}
