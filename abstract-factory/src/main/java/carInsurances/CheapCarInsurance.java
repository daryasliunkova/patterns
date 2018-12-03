package carInsurances;

import abstracts.CarInsurance;

public class CheapCarInsurance extends CarInsurance {
    @Override
    public void insurance() {
        System.out.println("Cheap Car insurance");
    }
}
