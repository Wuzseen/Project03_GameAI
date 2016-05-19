package marioBehaviorTrees;

public class TreeFactory {
	public Task defaultMarioBehaviorTree() {
		Task ret;
		ret = new JumpForwardSequence();
		return ret;
	}
}
