package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;
import ch.idsia.benchmark.mario.engine.sprites.Sprite;

public class IsEnemyInJumpField extends Task {

	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		int dist = 3;
		int egoCol = marioAgent.getMarioEgoCol();
		int egoRow = marioAgent.getMarioEgoRow();
		int behindVal = marioAgent.getEnemiesCellValue(egoRow, egoCol - 2);
		if(behindVal != 0) {
			System.out.println("Enemy detected behind");
			return true;
		}
		for(int i = egoCol + dist; i > egoCol; i--) {
			int cellVal = marioAgent.getEnemiesCellValue(egoRow, i);
			if(cellVal != 0) {
				System.out.println("Enemy In Jump Range");
				return true;
			}
		}
		return false;
	}

}
