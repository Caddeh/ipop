package gamepackage;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.entity.Entity;
import gamepackage.MenuScene;

public class Game extends GameApplication {


    private Entity player;

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("Prince of Jank");
        settings.setVersion("0.1");
        settings.setMainMenuEnabled(true);
    }

    public FXGLMenu newMainmenu(){
        return new MenuScene();
    }

    @Override
    protected void initGame(){

    }

    public static void main(String[] args) {
        launch(args);
    }
}
