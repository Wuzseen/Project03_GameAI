package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;

public class IsLevelShortBlockingNear extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		int dist = 1;
		int egoCol = marioAgent.getMarioEgoCol();
		int egoRow = marioAgent.getMarioEgoRow();
		for(int i = egoCol + dist; i > egoCol; i--) {
			int immediateRight = marioAgent.getReceptiveFieldCellValue(egoRow, egoCol + dist);
			int rightUp = marioAgent.getReceptiveFieldCellValue(egoRow - 1, egoCol + dist);
			if(immediateRight != 0 && !Utility.doesSpriteBlock(rightUp)) { // something is blocking dist to the right, but not right up
				System.out.println("Short hop");
				return true;
			} else {
				System.out.println(rightUp);
			}
		}
		return false;
	}
}
