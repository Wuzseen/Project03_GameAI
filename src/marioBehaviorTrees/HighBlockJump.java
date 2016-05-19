package marioBehaviorTrees;

public class HighBlockJump extends Sequence {
	public HighBlockJump() {
		super();
		this.AddTask(new IsLevelHighBlockingNear());
		this.AddTask(new MoveRightTask());
		this.AddTask(new JumpTask());
	}
}
