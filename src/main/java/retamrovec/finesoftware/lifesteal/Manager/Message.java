package retamrovec.finesoftware.lifesteal.Manager;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retamrovec.finesoftware.lifesteal.LifeSteal;

public class Message {

    public String replace(String replace1, String replace2, String replace3, String replace4, String output1, String output2, String output3, String output4, String path, @NotNull LifeSteal lifesteal) {
        String format = lifesteal.getConfig().getString(path);

        return format != null ? format
                .replace(replace1, output1)
                .replace(replace2, output2)
                .replace(replace3, output3)
                .replace(replace4, output4): null;
    }

    public String replace(String replace1, String replace2, String output1, String output2, String path, @NotNull LifeSteal lifeSteal) {
        String format = lifeSteal.getConfig().getString(path);

        return format != null ? format
                .replace(replace1, output1)
                .replace(replace2, output2): null;
    }

    public String replace(String replace1, String replace2, String replace3, String output1, String output2, String output3, String path, @NotNull LifeSteal lifeSteal) {
        String format = String.valueOf(lifeSteal.getConfig().getStringList(path));

        return format != null ? format
                .replace(replace1, output1)
                .replace(replace2, output2)
                .replace(replace3, output3): null;
    }

    @Deprecated
    public void colorCodes(@NotNull CommandSender sender, @NotNull String message) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    public void colorCodes(@NotNull Player player, @NotNull String message) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

}