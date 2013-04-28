package com.ox.team9.mazedash;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import com.ox.team9.mazedash.model.World;
import com.ox.team9.mazedash.model.WorldGenerator;

public class MazeDash implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Texture sprites;
	
	private World world;
	
	private WorldGenerator worldGenerator;
	
	@Override
	public void create() {		
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 780, 480);
		
		batch = new SpriteBatch();
		
		sprites = new Texture(Gdx.files.internal("sprites.png"));
		
		worldGenerator = new WorldGenerator(12, 8, sprites);
		
		world = worldGenerator.getWorld();
		
		/*
		for (int i = 0; i < 25; i += 1) {
			for (int j = 0; j < 10; j += 1) {
				environment[i][j] = new Sprite(sprites, 330, 115, 32, 55);
				environment[i][j].setPosition(i * 32, j * 27);
			}
		}*/
		
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		
		world.draw();
		
		batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
