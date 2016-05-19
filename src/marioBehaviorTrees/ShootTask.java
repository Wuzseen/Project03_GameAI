package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class ShootTask extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		marioAgent.shoot(true);
		return true;
	}
	
}
