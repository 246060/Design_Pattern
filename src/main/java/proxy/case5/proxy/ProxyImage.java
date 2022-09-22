package proxy.case5.proxy;

import proxy.case5.real_subject.RealImage;
import proxy.case5.subject.Image;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {

		if (realImage == null) {
			realImage = new RealImage(fileName);
		}

		realImage.display();
	}
}