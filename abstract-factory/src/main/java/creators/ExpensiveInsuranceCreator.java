package creators;

import abstracts.CarInsurance;
import abstracts.HomeInsurance;
import abstracts.InsuranceCreator;
import abstracts.PersonalInsurance;
import carInsurances.ExpensiveCarInsurance;
import homeInsurances.ExpensiveHomeInsurance;
import personalInsurances.ExpensivePersonalInsurance;

public class ExpensiveInsuranceCreator extends InsuranceCreator {
    @Override
    public CarInsurance createCarInsurance() {
        return new ExpensiveCarInsurance();
    }

    @Override
    public HomeInsurance createHomeInsurance() {
        return new ExpensiveHomeInsurance();
    }

    @Override
    public PersonalInsurance createPersonalInsurance() {
        return new ExpensivePersonalInsurance();
    }
}
