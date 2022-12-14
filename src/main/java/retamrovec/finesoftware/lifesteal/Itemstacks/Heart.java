package retamrovec.finesoftware.lifesteal.Itemstacks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import retamrovec.finesoftware.lifesteal.LifeSteal;

import java.util.ArrayList;
import java.util.List;

public class Heart {

    private ItemStack itemStack;
    private final LifeSteal l;
    public Heart(LifeSteal l) {
        this.l = l;
    }

    public NamespacedKey key(JavaPlugin plugin){
        return new NamespacedKey(plugin, "Heart");
    }
    public void register(JavaPlugin plugin){
        itemStack = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&cHeart"));
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', "&7Eat this to get heart!"));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        {
            ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "Heart"), itemStack);
            recipe.shape(
                    "fst",
                    "oix",
                    "egn");
            recipe.setIngredient('f', Material.matchMaterial(l.getConfig().getString("recipe.ingredients.first")));
            recipe.setIngredient('s', Material.matchMaterial(l.getConfig().getString("recipe.ingredients.second")));
            recipe.setIngredient('t', Material.matchMaterial(l.getConfig().getString("recipe.ingredients.third")));
            recipe.setIngredient('o', Material.matchMaterial(l.getConfig().getString("recipe.ingredients.fourth")));
            recipe.setIngredient('i', Material.matchMaterial(l.getConfig().getString("recipe.ingredients.fifth")));
            recipe.setIngredient('x', Material.matchMaterial(l.getConfig().getString("recipe.ingredients.sixth")));
            recipe.setIngredient('e', Material.matchMaterial(l.getConfig().getString("recipe.ingredients.seventh")));
            recipe.setIngredient('g', Material.matchMaterial(l.getConfig().getString("recipe.ingredients.eighth")));
            recipe.setIngredient('n', Material.matchMaterial(l.getConfig().getString("recipe.ingredients.ninth")));

            Bukkit.addRecipe(recipe);
        }
    }

    public void init(JavaPlugin plugin) {
        Bukkit.getServer().removeRecipe(this.key(plugin));
        register(plugin);
    }

    public ItemStack getHeart() {
        return itemStack;
    }

    public boolean isHeart(ItemStack item) {
        ItemStack heart = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
        return item == heart;
    }


}
