package day08;

public class Fish extends Animal{
	String name;
	
	
	public Fish(){
	}
	public Fish (String name) {
		super.kind = "물고기";
		this.name = name;
	}
	
	
	public void print() {
		System.out.println( this.kind + "  " +name);
		//System.out.println( super.kind + "  " +name);
	}
	
	
	public void breath() {
		System.out.println("breath for Gill");
	}
	
}
