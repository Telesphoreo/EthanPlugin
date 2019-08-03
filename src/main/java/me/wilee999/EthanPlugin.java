package me.wilee999;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class EthanPlugin extends JavaPlugin {
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("ethan")) {
            if (args.length == 0) {
                sender.sendMessage("Kindly reminds the player that they are on thin ice.");
                sender.sendMessage("/ethan <player>");
                return true;
            }
            if (args.length == 1) {
                Player player = Bukkit.getPlayer(args[0]);
                if (player == null) {
                    sender.sendMessage(ChatColor.RED + "Player not found!");
                    return true;
                }
                Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> WHAT THE FUCK IS WRONG WITH YOU, YOU FUCKING DUMBASS?");
                Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> YOUR ON MOTHER FUCKING THIN ICE, YOU HEAR ME??");
                Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> I WILL RIP YOUR ENTIRE ASS APART, YOUR CLOSE TO PERMBAN!!!");
                Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE MOTHER FUCKING BLOCK, IT'S PERMBAN FUCKING BITCH!!!");
                Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> I BET YOU'RE NOT EVEN LISTENING, YOU PIECE OF FUCKING SHIT! YOU DO THAT SHIT AGAIN, IT'S PERMBAN!!!");
                Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> YOUR ON FUCKING THIN ICE!!!!");
                Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE FUCKING BLOCK ITS PERMBAN ILL TELL MARK TO PERMBAN YOU!!!!!");
                Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> NOW GET YOUR FUCKING SHIT TOGETHER!!!!");
                player.setHealth(0.0);
                return true;
            }
        }
        return true;
    }
}