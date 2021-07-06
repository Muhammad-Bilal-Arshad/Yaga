package techtoolbox.YagaDaMaga.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;

public class GuildMemberJoin extends ListenerAdapter {
    String[] messages = {
            "Hey! Listen! [member] has joined!",
            "Ha! [member] has joined! You activated my trap card!",
            "We've been expecting you, [member].",
            "It's dangerous to go alone, take [member]!",
            "Swoooosh. [member] just landed.",
            "Brace yourselves. [member] just joined the server.",
            "A wild [member] appeared.","My love [member] where have you been this whole time.",
            "Glad you could make it [member].","We are thrilled to have [member] at our office. ",
            "A very warm welcome to [member]! It is lovely to have you among us!"
    };
    public void onGuildMemberJoin(GuildMemberJoinEvent event){
        Random rand = new Random();
        int number= rand.nextInt(messages.length);
        EmbedBuilder join = new EmbedBuilder();
        join.setColor(0x66d8ff);
        join.setDescription(messages[number].replace("[member]",event.getMember().getAsMention()));
        event.getGuild().getDefaultChannel().sendMessage(join.build()).queue();
        // add role
        event.getGuild().addRoleToMember(event.getMember(), (Role) event.getGuild().getRolesByName("BOTS",true)).complete();


    }
}
