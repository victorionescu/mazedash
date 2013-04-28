package com.ox.team9.mazedash.model;

import com.badlogic.gdx.graphics.Texture;

public abstract class HighBlock extends Block {
	public HighBlock(Texture sprites) {
		super(sprites);
	}
	
	@Override
	public int getHeight() {
		return 2;
	}

}
