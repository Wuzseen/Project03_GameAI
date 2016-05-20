package marioBehaviorTrees;

import ch.idsia.agents.controllers.BehaviorTreeAgent;
import ch.idsia.benchmark.mario.engine.sprites.Sprite;

public class IsEnemyInShootRange extends Task {
	@Override
	public Boolean run(BehaviorTreeAgent marioAgent) {
		// TODO Auto-generated method stub
		int xdist = 4;
		int egoCol = marioAgent.getMarioEgoCol();
		int egoRow = marioAgent.getMarioEgoRow();
		//for(int z = egoRow)
		for(int i = egoCol + xdist; i > egoCol; i--) {
			int cellVal = marioAgent.getEnemiesCellValue(egoRow, i);
			int cellVal2 = marioAgent.getEnemiesCellValue(egoRow + 1, i);
			if(isCreature(cellVal) || isCreature(cellVal2)) {
				System.out.println("Enemy to shoot");
				return true;
			}
		}
		return false;
	}


	private boolean isCreature(int c)
	{
	    switch (c)
	    {
	        case Sprite.KIND_GOOMBA:
	        case Sprite.KIND_RED_KOOPA:
	        case Sprite.KIND_RED_KOOPA_WINGED:
	        case Sprite.KIND_GREEN_KOOPA_WINGED:
	        case Sprite.KIND_GREEN_KOOPA:
	            return true;
	    }
	    return false;
	}
}
