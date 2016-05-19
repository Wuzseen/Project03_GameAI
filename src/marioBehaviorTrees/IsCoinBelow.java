package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;
import ch.idsia.benchmark.mario.engine.sprites.Sprite;

public class IsCoinBelow extends Task {

	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		int xdist = 2;
		int ydist = 8;
		int egoCol = marioAgent.getMarioEgoCol();
		int egoRow = marioAgent.getMarioEgoRow();
		for(int i = egoCol + xdist; i > egoCol; i--) {
			for(int y = egoRow + ydist; y > egoRow; y--) {
				int cellVal = marioAgent.getReceptiveFieldCellValue(y, i);
				if(cellVal == 2 || cellVal == Sprite.KIND_COIN_ANIM) { // 2 = coin?
					System.out.println("Coin dead ahead");
					return true;
				}
			}
		}
		return false;
	}

}
