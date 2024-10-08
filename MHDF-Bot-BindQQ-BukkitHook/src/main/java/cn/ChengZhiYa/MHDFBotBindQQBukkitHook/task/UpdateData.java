package cn.ChengZhiYa.MHDFBotBindQQBukkitHook.task;

import cn.ChengZhiYa.MHDFBotBindQQBukkitHook.util.DatabaseUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public final class UpdateData extends BukkitRunnable {
    @Override
    public void run() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            DatabaseUtil.updatePlayerData(player.getName());
            DatabaseUtil.updatePlayerVerify(player.getName());
            DatabaseUtil.updateDisableGroupHook(player.getName());
        }
    }
}
