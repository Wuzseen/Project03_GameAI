package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class IsLevelShortBlockingNear extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		int dist = 2;
		int egoCol = marioAgent.getMarioEgoCol();
		int egoRow = marioAgent.getMarioEgoRow();
		for(int i = egoCol + dist; i > egoCol; i--) {
			int immediateRight = marioAgent.getReceptiveFieldCellValue(egoRow, i);
			int rightUp = marioAgent.getReceptiveFieldCellValue(egoRow - 1, i);
			if(Utility.doesSpriteBlock(immediateRight) && !Utility.doesSpriteBlock(rightUp)) { // something is blocking dist to the right, but not right up
				System.out.println("Short hop");
				return true;
			}
		}
		return false;
	}
}
