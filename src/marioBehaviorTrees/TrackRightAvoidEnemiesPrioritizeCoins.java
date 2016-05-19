package marioBehaviorTrees;

public class TrackRightAvoidEnemiesPrioritizeCoins extends Selector {
	public TrackRightAvoidEnemiesPrioritizeCoins() {
		super();
		this.AddTask(new JumpOverEnemy()); // avoid enemy
		this.AddTask(new PrioritizeBelowCoinsSequence()); // coins below us are not as important to the ones on the right
		this.AddTask(new PrioritizeCoinSequence()); // yum coin
		this.AddTask(new JumpOnEnvironment()); // jump up environment if needed
		this.AddTask(new ShootEnemySequence()); // if enemy is in way, also shoot!
		this.AddTask(new MoveRightTask()); // everything clear? Move to the right
	}
}
