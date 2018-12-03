package carInsurances;

import abstracts.CarInsurance;

public class ExpensiveCarInsurance extends CarInsurance {
    @Override
    public void insurance() {
        System.out.println("Expensive Car insurance");
    }
}
