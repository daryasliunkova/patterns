package creators;

import abstracts.CarInsurance;
import abstracts.HomeInsurance;
import abstracts.InsuranceCreator;
import abstracts.PersonalInsurance;
import carInsurances.CheapCarInsurance;
import homeInsurances.CheapHomeInsurance;
import personalInsurances.CheapPersonalInsurance;

public class CheapInsuranceCreator extends InsuranceCreator{

    @Override
    public CarInsurance createCarInsurance() {
        return new CheapCarInsurance();
    }

    @Override
    public HomeInsurance createHomeInsurance() {
        return new CheapHomeInsurance();
    }

    @Override
    public PersonalInsurance createPersonalInsurance() {
        return new CheapPersonalInsurance();
    }
}
