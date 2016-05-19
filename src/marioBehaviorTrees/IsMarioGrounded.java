package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class IsMarioGrounded extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		return marioAgent.isMarioOnGround();
	}
}
