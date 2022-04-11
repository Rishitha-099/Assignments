package spring_core_q5;

public interface Shape {
	public abstract void draw() ;

}
class injectimpl{
	int x;
	public int getS() {
		return x;
	}
	public void setS(int x) {
		this.x = x;
	}
	public String toString() {
        return ("@injectImplementation"+x);
    }
}