package marioBehaviorTrees;

import ch.idsia.agents.controllers.*;

public class MoveLeftTask extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		marioAgent.moveLeft(true);
		return true;
	}
}
