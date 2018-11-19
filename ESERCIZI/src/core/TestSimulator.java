package core;

public abstract class TestSimulator {

	protected TestParameters[] testCases;
	
	protected TestSimulator(TestParameters[] testCases) {
		this.testCases = testCases;
	}
	
	public abstract Output solve(Input input);
	
}
