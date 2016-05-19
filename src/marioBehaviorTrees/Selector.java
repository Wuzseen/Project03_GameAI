package marioBehaviorTrees;

import java.util.ArrayList;
import java.util.List;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class Selector extends Task {
	public List<Task> selectorTasks;
	
	public Selector(){
		this.selectorTasks = new ArrayList<Task>();
	}
	
	public Selector(List<Task> givenTasks, Task sequenceCondition) {
		this.selectorTasks = givenTasks;
	}
	
	public void AddSelectorTask(Task t) {
		this.selectorTasks.add(t);
	}

	// Selectors return on the first node that evaluates true so they only execute the node that was true
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		for(Task t : this.selectorTasks) {
			if(t.run(marioAgent) == true) {
				return true;
			}
		}
		return false;
	}
}
