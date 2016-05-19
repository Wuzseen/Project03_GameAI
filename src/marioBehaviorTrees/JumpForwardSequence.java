package marioBehaviorTrees;

import java.util.ArrayList;

public class JumpForwardSequence extends Sequence {
	public JumpForwardSequence() {
		super();
		this.AddTask(new IsMarioGrounded());
		this.AddTask(new JumpTask());
		this.AddTask(new MoveRightTask());
	}
}
