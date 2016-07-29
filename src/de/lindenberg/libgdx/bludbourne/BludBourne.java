package de.lindenberg.libgdx.bludbourne;

import com.badlogic.gdx.Game;

import de.lindenberg.libgdx.bludbourne.screens.MainGameScreen;

public class BludBourne extends Game {
	public static final MainGameScreen mainGameScreen = new MainGameScreen();

	@Override
	public void create() {
		setScreen(mainGameScreen);
		
	}
	
	@Override
	public void dispose() {
		mainGameScreen.dispose();
		
	}
}


/*
SpriteBatch batch;
Texture img;

@Override
public void create () {
	batch = new SpriteBatch();
	img = new Texture("badlogic.jpg");
}

@Override
public void render () {
	Gdx.gl.glClearColor(1, 1, 0, 1);
	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	batch.begin();
	batch.draw(img, 0, 0);
	batch.end();
}

@Override
public void dispose () {
	batch.dispose();
	img.dispose();
}*/