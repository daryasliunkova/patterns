import abstracts.InsuranceCreator;
import creators.CheapInsuranceCreator;
import creators.ExpensiveInsuranceCreator;
import creators.ScamInsuranceCreator;

public class InsuranceCreatorFactory {
    public InsuranceCreator createInsuranceCreator(String type) {
        if (type.equals("cheap")) {
            return new CheapInsuranceCreator();
        } else {
            if (type.equals("expensive")) {
                return new ExpensiveInsuranceCreator();
            } else {
                return new ScamInsuranceCreator();
            }
        }
    }
}
