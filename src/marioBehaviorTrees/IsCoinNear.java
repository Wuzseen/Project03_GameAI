package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;
import ch.idsia.benchmark.mario.engine.sprites.Sprite;

public class IsCoinNear extends Task {

	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		int dist = 4;
		int egoCol = marioAgent.getMarioEgoCol();
		int egoRow = marioAgent.getMarioEgoRow();
		for(int i = egoCol + dist; i > egoCol; i--) {
			int cellVal = marioAgent.getReceptiveFieldCellValue(egoRow, i);
			if(cellVal == 2 || cellVal == Sprite.KIND_COIN_ANIM) { // 2 = coin?
				System.out.println("Coin dead ahead");
				return true;
			}
		}
		return false;
	}

}
