package homeInsurances;

import abstracts.HomeInsurance;

public class CheapHomeInsurance extends HomeInsurance {
    @Override
    public void insurance() {
        System.out.println("Cheap home insurance");
    }
}
