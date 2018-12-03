package personalInsurances;

import abstracts.PersonalInsurance;

public class CheapPersonalInsurance extends PersonalInsurance{
    @Override
    public void insurance() {
        System.out.println("Cheap personal insurance");
    }
}
