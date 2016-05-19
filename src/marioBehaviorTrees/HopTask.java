package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class HopTask extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		marioAgent.hop();
		return true;
	}
}
