package ac.grim.grimac.commands;

import ac.grim.grimac.GrimAPI;
import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

@CommandAlias("grim|grimac|sac")
public class GrimVerbose extends BaseCommand {
    @Subcommand("verbose")
    @CommandPermission("grim.verbose")
    public void onVerbose(Player player) {
        GrimAPI.INSTANCE.getAlertManager().toggleVerbose(player);
    }
}
