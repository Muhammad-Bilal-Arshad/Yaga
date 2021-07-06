/*package techtoolbox.YagaDaMaga.Events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.management.relation.Role;
import java.lang.reflect.Member;


public class GuildMessageReceived extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
       String [] args = event.getMessage().getContentRaw().split("\\s+");
       if(args[0].equalsIgnoreCase("~mute")){
           if(args.length>1 && args.length<3){
               Member member = (Member) event.getGuild().getMemberById(args[1].replace("<@","").replace(">"," "));
                Role role = (Role) event.getGuild().getRoleById("");
                if(!member.getRcontains(role)){}
                else (){}
           }
           else if (args.length ==3){}
           else{
               event.getChannel().sendMessage("Incorrect command. Use '~mute[user mention] [time{optional}'").queue();
           }
       }
    }

}
*/