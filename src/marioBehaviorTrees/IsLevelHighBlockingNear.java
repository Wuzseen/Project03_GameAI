package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class IsLevelHighBlockingNear extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		if(marioAgent.isMarioOnGround() == false) { // sketchy, should get mario over bumps
			return true;
		}
		int dist = 3;
		int egoCol = marioAgent.getMarioEgoCol();
		int egoRow = marioAgent.getMarioEgoRow();
		for(int i = egoCol + dist; i > egoCol; i--) {
			int immediateRight = marioAgent.getReceptiveFieldCellValue(egoRow, i);
			int rightUp = marioAgent.getReceptiveFieldCellValue(egoRow - 1, i);
			if(immediateRight != 0 && Utility.doesSpriteBlock(rightUp)) {
				System.out.println("High hop");
				return true;
			}
		}
		return false;
	}
}
