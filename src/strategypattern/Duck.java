package strategypattern;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public abstract void display();

	/**
	 * 
	 * @param fb
	 */
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}

	/**
	 * 
	 * @param qb
	 */
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}

	public void performFly() {
            flyBehavior.fly();
	}

	public void performQuack() {
            quackBehavior.quack();
	}

}