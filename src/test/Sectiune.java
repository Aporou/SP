package test;
import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Element {

	private List<Element> elemente = new ArrayList<Element>();
	public String name;
	
	public Sectiune(String name) {
		this.name=name;
	}
	
	
	
	public List<Element> getElemente() {
		return elemente;
	}



	public void setElemente(List<Element> elemente) {
		this.elemente = elemente;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void print() {
		for(Element element: elemente) {
			element.print();
		}
	}

	@Override
	public void add(Element element) {
		this.elemente.add(element);
		
	}

	@Override
	public void remove(Element element) {
		this.elemente.remove(element);
	}



	@Override
	public Element getElement(int index) {
		return	this.elemente.get(index);
	}

}
