package marioBehaviorTrees;

import ch.idsia.agents.controllers.*;

public class JumpTask extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		marioAgent.jump();
		return true;
	}
}
