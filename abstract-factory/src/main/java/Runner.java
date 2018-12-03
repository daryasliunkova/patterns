import abstracts.InsuranceCreator;
import creators.CheapInsuranceCreator;

public class Runner {
    public static void main(String[] args) {
        InsuranceCreatorFactory insuranceCreatorFactory = new InsuranceCreatorFactory();
        InsuranceCreator insuranceCreator = insuranceCreatorFactory.createInsuranceCreator("cheap");

        insuranceCreator.createCarInsurance().insurance();
        insuranceCreator.createPersonalInsurance().insurance();
        insuranceCreator.createHomeInsurance().insurance();
    }
}
