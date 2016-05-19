package marioBehaviorTrees;

public class JumpOverEnemy extends Sequence {
	public JumpOverEnemy() {
		super();
		this.AddTask(new IsEnemyNear());
		this.AddTask(new MoveRightTask());
		this.AddTask(new JumpTask());
	}
}
