package marioBehaviorTrees;

public class ShootEnemySequence extends Sequence {
	public ShootEnemySequence() {
		super();
		this.AddTask(new IsEnemyInShootRange());
		this.AddTask(new ShootTask());
	}
}
