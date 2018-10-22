package test;

public class ImagineProxy implements Element {
	private Imagine realImage;
	private String fileName;

	public ImagineProxy(String fileName) {		
		this.fileName = fileName;
	}

	public void print() {
		if(realImage == null) {
			realImage = new Imagine(fileName);
		}
		realImage.print();		
	}
	
	public void add(Element element) {
			throw new java.lang.UnsupportedOperationException("Not supported yet");
	}

	public void remove(Element element) {
		throw new java.lang.UnsupportedOperationException("Not supported yet");
	}

	public Element getElement(int index) {
		throw new java.lang.UnsupportedOperationException("Not supported yet");
	}
}
