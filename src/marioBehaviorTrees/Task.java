package marioBehaviorTrees;

import ch.idsia.agents.controllers.*;

public abstract class Task {
	public Task() {}
	
	public abstract Boolean run(BehaviorTreeAgent marioAgent);
}
