package com.ox.team9.mazedash.model;

import java.util.ArrayList;

import com.ox.team9.mazedash.visitor.WorldElementVisitor;

import com.badlogic.gdx.graphics.Texture;

public class Tree extends Obstacle {
	public Tree(Texture sprites) {
		super(sprites);
	}
	
	@Override
	public int spriteColumn() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int spriteRow() {
		// TODO Auto-generated method stub
		return 16;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public void accept(ArrayList<WorldElement> tower,
			WorldElementVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(tower, this);
	}

}
