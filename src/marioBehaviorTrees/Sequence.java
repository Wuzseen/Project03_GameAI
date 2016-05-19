package marioBehaviorTrees;

import java.util.ArrayList;
import java.util.List;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class Sequence extends Task {
	
	public List<Task> sequenceTasks;
	
	public Sequence(){
		this.sequenceTasks = new ArrayList<Task>();
	}
	
	public Sequence(List<Task> givenTasks, Task sequenceCondition) {
		this.sequenceTasks = givenTasks;
	}
	
	public void AddSequenceTask(Task t) {
		this.sequenceTasks.add(t);
	}

	// Sequences end on the first node that returns false otherwise they completely execute all the tasks
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		for(Task t : this.sequenceTasks) {
			if(t.run(marioAgent) == false) {
				return false;
			}
		}
		return true;
	}
}
