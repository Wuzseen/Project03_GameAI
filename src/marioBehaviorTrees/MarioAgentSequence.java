package marioBehaviorTrees;

public class MarioAgentSequence extends Sequence {
	public MarioAgentSequence() {
		super();
		//this.AddTask(new ShootTask());
		this.AddTask(new ResetJumpTask());
		this.AddTask(new TrackRightAvoidEnemiesPrioritizeCoins());
	}
}
