package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class IsLevelHighBlockingNear extends Task {

	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		int dist = 3;
		int egoCol = marioAgent.getMarioEgoCol();
		int egoRow = marioAgent.getMarioEgoRow();
		for(int i = egoCol + dist; i > egoCol; i--) {
			int immediateRight = marioAgent.getReceptiveFieldCellValue(egoRow, egoCol + dist);
			int rightUp = marioAgent.getReceptiveFieldCellValue(egoRow - 1, egoCol + dist);
			if(immediateRight != 0 && rightUp != 0) {
				return true;
			}
		}
		return false;
	}

}
