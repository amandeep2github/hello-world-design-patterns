package learn.java.design_patterns.strategy;

public class HelloWorldStrategy {
	private Strategy hwStrategy;
	public void sayIt(){
		hwStrategy.sayIt();
	}
	public void setHwStrategy(Strategy hwStrategy) {
		this.hwStrategy = hwStrategy;
	}
	
	
}
