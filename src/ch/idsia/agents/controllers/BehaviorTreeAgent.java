/*
 * Copyright (c) 2009-2010, Sergey Karakovskiy and Julian Togelius
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the Mario AI nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package ch.idsia.agents.controllers;

import ch.idsia.agents.Agent;
import ch.idsia.benchmark.mario.engine.sprites.Mario;
import ch.idsia.benchmark.mario.environments.Environment;
import marioBehaviorTrees.*;

/**
 * Created by IntelliJ IDEA.
 * User: Sergey Karakovskiy, sergey.karakovskiy@gmail.com
 * Date: Apr 8, 2009
 * Time: 4:03:46 AM
 */

public class BehaviorTreeAgent extends BasicMarioAIAgent implements Agent
{
	int trueJumpCounter = 0;
	int trueSpeedCounter = 0;
	Task behaviorTree;
	
	public BehaviorTreeAgent()
	{
	    super("BehaviorTreeAgent");
	    reset();
	    TreeFactory fact = new TreeFactory();
	    behaviorTree = fact.defaultMarioBehaviorTree();
	}
	
	public void reset()
	{
	    action = new boolean[Environment.numberOfKeys];
	    trueJumpCounter = 0;
	    trueSpeedCounter = 0;
	}
	
	private boolean DangerOfAny()
	{
	
	        if ((getReceptiveFieldCellValue(marioEgoRow + 2, marioEgoCol + 1) == 0 &&
	            getReceptiveFieldCellValue(marioEgoRow + 1, marioEgoCol + 1) == 0) ||
	            getReceptiveFieldCellValue(marioEgoRow, marioEgoCol + 1) != 0 ||
	            getReceptiveFieldCellValue(marioEgoRow, marioEgoCol + 2) != 0 ||
	            getEnemiesCellValue(marioEgoRow, marioEgoCol + 1) != 0 ||
	            getEnemiesCellValue(marioEgoRow, marioEgoCol + 2) != 0)
	            return true;
	        else
	            return false;
	}
	
	public boolean[] getAction()
	{
		behaviorTree.run(this);
	    return action;
	}
	
	public void moveRight(Boolean on)
	{
		action[Mario.KEY_RIGHT] = on;
	}
	
	public void moveLeft(Boolean on) {
		action[Mario.KEY_LEFT] = on;
	}
	
	public void hop() {
		action[Mario.KEY_JUMP] = isMarioAbleToJump;
	}
	
	public void jump() {
		action[Mario.KEY_JUMP] = isMarioAbleToJump || !isMarioOnGround;
	}
	
	public Boolean isMarioOnGround() {
		return this.isMarioOnGround;
	}
}