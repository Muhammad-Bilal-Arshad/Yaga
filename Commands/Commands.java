package techtoolbox.YagaDaMaga.Commands;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import techtoolbox.YagaDaMaga.Main;
import java.util.List;

// :fire:
public class Commands extends ListenerAdapter {
    public void onGuildMessageReceived (GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(Main.prefix+"ping")){
            event.getChannel().sendTyping().queue();
        event.getChannel().sendMessage("Yaga they are disturbing me again").queue();
        }
        if(args[0].equalsIgnoreCase("bsdk")){
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Yaddi deya twady peo da server ni aey. Tameez na reh").queue();
        }
        if(args[0].equalsIgnoreCase("gandu")){
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Yaddi deya twady peo da server ni aey. Tameez na reh").queue();
        }
        if(args[0].equalsIgnoreCase("fuck")){
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Yaddi deya twady peo da server ni aey. Tameez na reh").queue();
        }
        if(args[0].equalsIgnoreCase(Main.prefix+"dime")){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd \nHH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(dtf.format(now)).queue();
        }
        if(args[0].equalsIgnoreCase(Main.prefix+"cocomo")){
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Bht bara behn ka taka hy bsdk naam na lo us bc ka").queue();
        }
        if(args[0].equalsIgnoreCase(Main.prefix+"info")){
            EmbedBuilder creator = new EmbedBuilder();
            creator.setTitle("🦴 YAGA DA MAGA 🦴");
            creator.setDescription("The only piece of information i can give you is that i was created by Baba Yaga in the cold Gobi desert.");
            creator.setColor(0x03f0fc);
            creator.setFooter("Yo kid nice dp",event.getMember().getUser().getAvatarUrl());
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(creator.build()).queue();
            creator.clear();
        }
        if(args[0].equalsIgnoreCase(Main.prefix+"clear")){
            if(args.length<2){
                // error message
                EmbedBuilder usage = new EmbedBuilder();
                usage.setColor(0xff3923);
                usage.setTitle("Specify amount of messages to delete ");
                usage.setDescription("Usage: "+Main.prefix+"clear [no of messages]");
                event.getChannel().sendMessage(usage.build()).queue();
            }
            else{
                try{
                    List <Message> messages = event.getChannel().getHistory().retrievePast(Integer.parseInt(args[1])).complete();
                    event.getChannel().deleteMessages(messages).queue();
                    // success
                    EmbedBuilder usage1 = new EmbedBuilder();
                    usage1.setColor(0x22ff2a);
                    usage1.setTitle("✅ Successfully Deleted "+args[1]+" Messages.");
                    event.getChannel().sendMessage(usage1.build()).queue();
                }
                catch (IllegalArgumentException e){
                    if(e.toString().startsWith("java.lang.IllegalArgumentException: Message retrieval")){
                        // too many messages
                        EmbedBuilder error = new EmbedBuilder();
                        error.setColor(0xff3923);
                        error.setTitle("🔴 Too Many Messages Selected ");
                        error.setDescription("Message deletion limit is 1 - 100");
                        event.getChannel().sendMessage(error.build()).queue();
                    }
                    else{
                        EmbedBuilder error2 = new EmbedBuilder();
                        error2.setColor(0xff3923);
                        error2.setTitle("🔴 Old Messages ");
                        error2.setDescription("Message / Messages selected are older than 2 weeks");
                        event.getChannel().sendMessage(error2.build()).queue();

                    }

                }

            }
        }
    }
}
