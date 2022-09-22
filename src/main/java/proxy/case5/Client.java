package proxy.case5;

import proxy.case5.proxy.ProxyImage;
import proxy.case5.subject.Image;

public class Client {

	public static void main(String[] args) {

		Image image = new ProxyImage("test_10mb.jpg");

		//image will be loaded from disk
		image.display();
		System.out.println("");

		//image will not be loaded from disk
		image.display();

	}
}
