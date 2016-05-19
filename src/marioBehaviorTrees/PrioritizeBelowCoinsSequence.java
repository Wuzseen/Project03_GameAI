package marioBehaviorTrees;

public class PrioritizeBelowCoinsSequence extends Sequence {
	public PrioritizeBelowCoinsSequence() {
		super();
		this.AddTask(new IsCoinBelow()); // yum coin
		this.AddTask(new StopMoveTask()); // avoid enemy
	}
}
