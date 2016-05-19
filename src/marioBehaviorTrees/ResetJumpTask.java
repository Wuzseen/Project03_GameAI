package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class ResetJumpTask extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		marioAgent.resetJump();
		return true;
	}

}
