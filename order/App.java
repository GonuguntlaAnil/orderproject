package order;

public class App {
	private Nonveg var;
	public App(Nonveg var) {
		this.var=var;
	}public void order() {
		var.nonveg();
		System.out.print("Have a nice day");
	}

}
