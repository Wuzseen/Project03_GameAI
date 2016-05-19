package marioBehaviorTrees;

import java.util.ArrayList;

public class JumpForwardSequence extends Sequence {
	public JumpForwardSequence() {
		super();
		this.AddSequenceTask(new IsMarioGrounded());
		this.AddSequenceTask(new JumpTask());
		this.AddSequenceTask(new MoveRightTask());
	}
}
