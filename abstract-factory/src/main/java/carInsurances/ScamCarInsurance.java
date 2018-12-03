package carInsurances;

import abstracts.CarInsurance;

public class ScamCarInsurance extends CarInsurance {
    @Override
    public void insurance() {
        System.out.println("Scam car insurance");
    }
}
