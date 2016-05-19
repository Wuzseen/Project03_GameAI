package marioBehaviorTrees;

public class ShortBlockJump extends Sequence {
	public ShortBlockJump() {
		super();
		this.AddTask(new IsLevelShortBlockingNear());
		this.AddTask(new MoveRightTask());
		this.AddTask(new HopTask());
	}
}
