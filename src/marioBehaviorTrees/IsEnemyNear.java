package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;
import ch.idsia.benchmark.mario.engine.sprites.Sprite;

public class IsEnemyNear extends Task {

	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		int dist = 3;
		int egoCol = marioAgent.getMarioEgoCol();
		int egoRow = marioAgent.getMarioEgoRow();
		for(int i = egoCol + dist; i > egoCol; i--) {
			int cellVal = marioAgent.getEnemiesCellValue(egoRow, egoCol + dist);
			if(cellVal != 0) {
				return true;
			}
		}
		return false;
	}

}
