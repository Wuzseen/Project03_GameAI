package marioBehaviorTrees;

public class JumpOverEnemy extends Sequence {
	public JumpOverEnemy() {
		super();
		this.AddTask(new IsEnemyInJumpField());
		this.AddTask(new MoveRightTask());
		this.AddTask(new JumpTask());
	}
}
