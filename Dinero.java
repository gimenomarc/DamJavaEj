
public abstract class Dinero {
	protected double dinero;
	protected String description;
	
	/*
	 
	  public Dinero(double dinero, String description) {
		this.dinero = dinero;
		this.description = description;
	}
	
	*/
	
	public double getDinero() {
		return dinero;
	}
	
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
