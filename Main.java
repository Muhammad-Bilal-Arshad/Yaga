package techtoolbox.YagaDaMaga;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import techtoolbox.YagaDaMaga.Commands.Commands;
import techtoolbox.YagaDaMaga.Events.GuildMemberJoin;
import techtoolbox.YagaDaMaga.Events.GuildMemberLeave;
//import techtoolbox.YagaDaMaga.Events.GuildMessageReactionAdd;
//import techtoolbox.YagaDaMaga.Events.GuildMessageReceived;

public class Main {
    public static String prefix = "~";

    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("ODYxOTQzMjI1ODkxMTYwMDc1.YORJLw.TbvXu9l6xzMVpVmoWYaXE2XGamM").build();
        jda.getPresence().setStatus(OnlineStatus.ONLINE);
        jda.getPresence().setActivity(Activity.playing("I am just kidding i am not playing i am doing Yaga's chores"));
        jda.addEventListener(new Commands());
        jda.addEventListener(new GuildMemberJoin());
        jda.addEventListener(new GuildMemberLeave());
        //jda.addEventListener(new GuildMessageReceived());
        //jda.addEventListener(new GuildMessageReactionAdd());
    }
}
