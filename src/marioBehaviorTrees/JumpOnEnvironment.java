package marioBehaviorTrees;

public class JumpOnEnvironment extends Selector {
	public JumpOnEnvironment() {
		super();
		this.AddTask(new HighBlockJump());
		this.AddTask(new ShortBlockJump());
	}
}
