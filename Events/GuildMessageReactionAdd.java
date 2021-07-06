package techtoolbox.YagaDaMaga.Events;


import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildMessageReactionAdd extends ListenerAdapter {
    public void onGuildMessageReactionAdd(GuildMessageReactionAddEvent event){
        if(event.getReactionEmote().getName().equals("❌")&& !event.getMember().getUser().equals(event.getJDA().getSelfUser())){
            if(event.getMember().getUser().equals(event.getChannel().getLatestMessageId())){
                // if its the author
                event.getChannel().deleteMessageById(event.getMessageId()).complete();

            }
            else{}

        }
    }

}
