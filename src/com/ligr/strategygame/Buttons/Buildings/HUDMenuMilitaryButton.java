package com.ligr.strategygame.Buttons.Buildings;

import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.color.Color;

import com.ligr.strategygame.House;
import com.ligr.strategygame.MainActivity;
import com.ligr.strategygame.PlaceBuilding;

public class HUDMenuMilitaryButton extends Sprite {

	private static String currentbuilding;
	
	public HUDMenuMilitaryButton(float pX, float pY, ITextureRegion pTextureRegion,
			VertexBufferObjectManager pVertexBufferObjectManager) {
		super(pX, pY, pTextureRegion, pVertexBufferObjectManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onManagedUpdate(final float pSecondsElapsed){
		if(MainActivity.menu=="Military")
			this.setAlpha(0.5f);
		else
			this.setAlpha(1);
	}
	
	@Override
    public boolean onAreaTouched(TouchEvent pSceneTouchEvent, float pTouchAreaLocalX, float pTouchAreaLocalY) {
		
		if(pSceneTouchEvent.isActionUp() && this.getAlpha()!=0){
				
			MainActivity.menu="Military";
			// Set the image of our placebuilding to the House image
			MainActivity.MakeToast("This menu contains military buildings");
			MainActivity.MoreInfoText.setColor(Color.BLACK);
			MainActivity.unRegisterBuildingButtons();
			MainActivity.menuhudmilitary();
		}
		return true;
	
	}
	
	
}
