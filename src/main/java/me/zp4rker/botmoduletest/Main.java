package me.zp4rker.botmoduletest;

import me.zp4rker.botmodulestest.Module;
import net.dv8tion.jda.core.JDA;

/**
 * @author ZP4RKER
 */
@Module(name = "Test Module", version = "1.0")
public class Main {

    public void onLoad(JDA jda) {
        System.out.println("Successfully loaded module Test Module v1.0!");
    }

}
