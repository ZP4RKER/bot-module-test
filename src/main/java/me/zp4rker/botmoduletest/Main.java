package me.zp4rker.botmoduletest;

import me.zp4rker.botmodulestest.Module;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Game;

/**
 * @author ZP4RKER
 */
public class Main extends Module {

    Main() {
        super("Test Module", "1.0");
    }

    public static void onLoad(JDA jda) {
        System.out.println("Successfully loaded module Test Module v1.0!");
        jda.getPresence().setGame(new Game() {
            @Override
            public String getName() {
                return "Test Module v1.0";
            }

            @Override
            public String getUrl() {
                return null;
            }

            @Override
            public GameType getType() {
                return GameType.DEFAULT;
            }
        });
    }

}