package chain_of_responsibility.case7;


import chain_of_responsibility.case7.ConcreteHandler.*;

public class Client {

	public static void main(String[] args) {

		FrontDeskSupport frontDeskSupport = new FrontDeskSupport();
		SupervisorSupport supervisorSupport = new SupervisorSupport();
		ManagerSupport managerSupport = new ManagerSupport();
		DirectorSupport directorSupport = new DirectorSupport();

		frontDeskSupport.setNext(supervisorSupport);
		supervisorSupport.setNext(managerSupport);
		managerSupport.setNext(directorSupport);

		SupportService supportService = new SupportService();
		supportService.setHandler(frontDeskSupport);

		ServiceRequest request = new ServiceRequest();
		request.setType(ServiceLevel.LEVEL_ONE);
		supportService.handleRequest(request);
		System.out.println(request.getConclusion());

		request = new ServiceRequest();
		request.setType(ServiceLevel.LEVEL_THREE);
		supportService.handleRequest(request);
		System.out.println(request.getConclusion());


		/**
		 * 에러 발생이 의도한 결과임.
		 * INVALID_REQUEST 처리 핸들러 없음.
		 * */
		request = new ServiceRequest();
		request.setType(ServiceLevel.INVALID_REQUEST);
		supportService.handleRequest(request);
		System.out.println(request.getConclusion());
	}

}
