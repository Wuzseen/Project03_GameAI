package marioBehaviorTrees;

public class PrioritizeCoinSequence extends Sequence {
	public PrioritizeCoinSequence() {
		super();
		this.AddTask(new IsCoinNear());
		this.AddTask(new ResetJumpTask()); // if you're jumping stop, get the coin!
		this.AddTask(new MoveRightTask());
		this.AddTask(new ShootEnemySequence());
	}
}
