package de.tamion.mc.commands;

import de.tamion.dc.DCChatDC;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class RestartBot implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if(sender.hasPermission("Bot.restart") || sender.hasPermission("DCChat.admin")) {
            DCChatDC.restart();
            sender.sendMessage("Bot Restarted. In case of error please check the console");
        } else {
            sender.sendMessage("You are not allowed to execute this Command!");
        }
        return false;
    }
}
