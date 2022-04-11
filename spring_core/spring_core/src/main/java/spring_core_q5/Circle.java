package spring_core_q5;

import javax.annotation.Resource;

public class Circle implements Shape {
	private Point y ;
	
	public void draw() {
		System.out.println("Drawing a circle shape");
		System.out.println("Center is ("+y.getx()+" . "+y.gety()+")");
	}
	
	public Point getP() {
		return y;
	}
	
	@Resource(name="i")
	public void setP(Point y) {
		this.y = y;
	}
}
