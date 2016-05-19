package marioBehaviorTrees;

import ch.idsia.benchmark.mario.engine.sprites.Sprite;

public class Utility {
	public static Boolean doesSpriteBlock(int sprite) {
		return sprite != Sprite.KIND_NONE && sprite != Sprite.KIND_COIN_ANIM && sprite != -85; // 2 = coin, -85 = top of pipes?
	}
}
