package ca.camerxn.thewalls.Events;

import ca.camerxn.thewalls.Utils;
import ca.camerxn.thewalls.Walls.World;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class TNTSpawn extends Event {
    public TNTSpawn(String eventName) {
        super(eventName);
    }

    @Override
    public void run() {
        for (Player p : Bukkit.getOnlinePlayers()) {
            p.sendMessage(Utils.formatText("&c&lYikes! Watch out for the TNT..."));
            p.playSound(p.getLocation(), Sound.ENTITY_TNT_PRIMED, 255, 1);
            for (int i = 0; i < 5; i++) {
                World.world.spawnEntity(p.getLocation(), EntityType.PRIMED_TNT);
            }
        }
    }
}
