package techtoolbox.YagaDaMaga.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class GuildMemberLeave extends ListenerAdapter {
    String [] messages = {
            "It will be rubbish here without [member]!","I'll miss [member]",
            "Wishing [member] all the best with everything.","Thank you [member] for everything and good luck!",
            "So sorry you're leaving[member] – you will be missed.","Wherever you're going, they're lucky to have you [member]!"

    };
    public void onGuildMemberLeave(GuildMemberLeaveEvent event){
        Random rand = new Random();
        int number= rand.nextInt(messages.length);
        EmbedBuilder join1 = new EmbedBuilder();
        join1.setColor(0xf48342);
        join1.setDescription(messages[number].replace("[member]",event.getMember().getAsMention()));
        event.getGuild().getDefaultChannel().sendMessage(join1.build()).queue();
    }

}
