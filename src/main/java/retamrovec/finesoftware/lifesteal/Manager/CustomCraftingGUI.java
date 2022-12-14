package retamrovec.finesoftware.lifesteal.Manager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import retamrovec.finesoftware.lifesteal.LifeSteal;

public class CustomCraftingGUI {
	
	LifeSteal l;
	public CustomCraftingGUI(LifeSteal l) {
		this.l = l;
	}
	
	public Inventory CreateHeartInventory() {
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ChatColor.translateAlternateColorCodes('&', "&cHeart &arecipe"));

		inv.setItem(1, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.ingredients.first"))));
		inv.setItem(2, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.ingredients.second"))));
		inv.setItem(3, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.ingredients.third"))));
		inv.setItem(4, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.ingredients.fourth"))));
		inv.setItem(5, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.ingredients.fifth"))));
		inv.setItem(6, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.ingredients.sixth"))));
		inv.setItem(7, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.ingredients.seventh"))));
		inv.setItem(8, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.ingredients.eighth"))));
		inv.setItem(9, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.ingredients.ninth"))));
		
		return inv;
	}

	public Inventory CreateBeaconInventory() {
		Inventory inv = Bukkit.createInventory(null, InventoryType.WORKBENCH, ChatColor.translateAlternateColorCodes('&', "&9Beacon &arecipe"));

		inv.setItem(1, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.revive.beacon.ingredients.first"))));
		inv.setItem(2, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.revive.beacon.ingredients.second"))));
		inv.setItem(3, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.revive.beacon.ingredients.third"))));
		inv.setItem(4, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.revive.beacon.ingredients.fourth"))));
		inv.setItem(5, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.revive.beacon.ingredients.fifth"))));
		inv.setItem(6, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.revive.beacon.ingredients.sixth"))));
		inv.setItem(7, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.revive.beacon.ingredients.seventh"))));
		inv.setItem(8, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.revive.beacon.ingredients.eighth"))));
		inv.setItem(9, new ItemStack(Material.matchMaterial(l.getConfig().getString("recipe.revive.beacon.ingredients.ninth"))));

		return inv;
	}

	public void OpenHeartInventory(Player p) {
		p.openInventory(CreateHeartInventory());
	}
	public void OpenBeaconInventory(Player p) {
		p.openInventory(CreateBeaconInventory());
	}

}
