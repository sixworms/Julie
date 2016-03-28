package com.sixworms.julie;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Julie extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, img2;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("super_julie.png");
		img2 = new Texture("super_julie_appname.png");
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 10, img2.getHeight()+20);
		batch.draw(img2, 10, 10);
		batch.end();
	}
}
