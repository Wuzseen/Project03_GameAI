package marioBehaviorTrees;

public class JumpOnEnvironment extends Selector {
	public JumpOnEnvironment() {
		super();
		this.AddTask(new ShortBlockJump());
		this.AddTask(new HighBlockJump());
	}

}
