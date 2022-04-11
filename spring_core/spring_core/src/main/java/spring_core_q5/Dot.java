package spring_core_q5;

import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Required;

public class Dot implements Shape {
	private Point centerofcircle ;
	@Inject
	private injectimpl injectImpl;
	public Point getcenter() {
		return centerofcircle;
	}
	@Required
	public void setcenter(Point center) {
		this.centerofcircle = center;
	}
	
	public void draw() {
		System.out.println("Dot is at : ("+centerofcircle.getx()+" . "+centerofcircle.gety()+")");
		System.out.println(injectImpl);
	}
}
