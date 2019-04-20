package Interface.DefaultMethods.entites;


public class BrazilInterestService implements InterestService {
    private Double interest;

    public BrazilInterestService(Double interest) {
        this.interest = interest;
    }

    @Override
    public double getInterestRate() {
        return interest;
    }

}
