package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class StopMoveTask extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		marioAgent.stop();
		return true;
	}
}
