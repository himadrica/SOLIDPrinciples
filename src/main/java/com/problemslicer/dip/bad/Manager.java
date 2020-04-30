package com.problemslicer.dip.bad;

/**
 * @author himadri
 * 
 * The below class looks good as it will track developer assigned work
 * But the mistake we did is apparent. Our high-level Manager class is directly dependent on 
 * the low-level Developer class. if you see in the code, the Developer class is hard-coded in Manager. 
 * But, a team members should not be tied to a Developer.
 * 
 * Both Manager and Developer are dependent on each other.
 * 
 * A team member responsibility can be different like Architect, Tester, QA, ShellScriptDeveloper
 * 
 * What if we want to introducer new type of team member like above, this implementation will not work efficiently
 * we might have to introduce new methods like developer work, architect work, testerWork etc
 * it will make code messier and will be hard to manage, add and modify code in future.
 * 
 * Dependency injection will help here to separate the direct dependency on each other.
 * 
 * To follow the Dependency Inversion Principle in our example, we will need an abstraction that both 
 * the Manager and Developer classes will depend on
 * 
 */
public class Manager {

	private Developer developer;

	public Manager(Developer developer) {
		super();
		this.developer = developer;
	}

	public void manageMyTeamWork() {
		developer.assignedWork();
	}
}
