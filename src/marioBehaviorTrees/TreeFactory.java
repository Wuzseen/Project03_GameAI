package marioBehaviorTrees;

public class TreeFactory {
	public Task defaultMarioBehaviorTree() {
		Task ret;
		ret = new MarioAgentSequence();
		return ret;
	}
}
