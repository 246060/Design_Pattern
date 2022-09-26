package callback.case1;


/**
 * 콜백 패턴은 함수가 일급 시민으로 취급되는 함수형 언어에 더 기본입니다.
 * Java 8 이전에는 간단한(유사한 명령) 인터페이스를 사용하여 콜백을 시뮬레이션 할 수 있습니다.
 */
public final class Main {

	public static void main(final String[] args) {

		var task = new SimpleTask();
		task.executeWith(() -> System.out.println("I'm done now."));
	}
}
