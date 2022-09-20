package factory_method.case4;

public class CommercialPlan extends Plan {

	@Override
	void getRate() {
		rate = 7.50;
	}
}
