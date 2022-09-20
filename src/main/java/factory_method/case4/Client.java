package factory_method.case4;

public class Client {
	public static void main(String[] args) {

		Plan domesticPlan = GetPlanFactory.getPlan("DOMESTICPLAN");
		Plan commercialPlan = GetPlanFactory.getPlan("COMMERCIALPLAN");
		Plan institutionalPlan = GetPlanFactory.getPlan("INSTITUTIONALPLAN");

		domesticPlan.calculateBill(10);
		commercialPlan.calculateBill(10);
		institutionalPlan.calculateBill(10);
	}
}
