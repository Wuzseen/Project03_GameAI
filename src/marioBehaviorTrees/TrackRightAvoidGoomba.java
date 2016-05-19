package marioBehaviorTrees;

public class TrackRightAvoidGoomba extends Selector {
	public TrackRightAvoidGoomba() {
		super();
		this.AddTask(new JumpOverEnemy()); // avoid enemy
		this.AddTask(new JumpOnEnvironment()); // jump up environment if needed
		this.AddTask(new MoveRightTask()); // everything clear? Move to the right
	}
}
