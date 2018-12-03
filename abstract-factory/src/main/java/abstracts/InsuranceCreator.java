package abstracts;

import creators.CheapInsuranceCreator;
import creators.ExpensiveInsuranceCreator;
import creators.ScamInsuranceCreator;

public abstract class InsuranceCreator {
    public abstract CarInsurance createCarInsurance();
    public abstract HomeInsurance createHomeInsurance();
    public abstract PersonalInsurance createPersonalInsurance();


}
