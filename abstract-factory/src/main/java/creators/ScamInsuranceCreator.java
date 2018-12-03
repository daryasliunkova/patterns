package creators;

import abstracts.CarInsurance;
import abstracts.HomeInsurance;
import abstracts.InsuranceCreator;
import abstracts.PersonalInsurance;
import carInsurances.ScamCarInsurance;
import homeInsurances.ScamHomeInsurance;
import personalInsurances.ScamPersolnalInsurance;

public class ScamInsuranceCreator extends InsuranceCreator {
    @Override
    public CarInsurance createCarInsurance() {
        return new ScamCarInsurance();
    }

    @Override
    public HomeInsurance createHomeInsurance() {
        return new ScamHomeInsurance();
    }

    @Override
    public PersonalInsurance createPersonalInsurance() {
        return new ScamPersolnalInsurance();
    }
}
