package me.thayt.geyserpvp;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.common.value.qual.IntRange;
import org.geysermc.api.Geyser;
import org.geysermc.cumulus.form.Form;
import org.geysermc.cumulus.form.util.FormBuilder;
import org.geysermc.geyser.api.GeyserApi;
import org.geysermc.geyser.api.connection.GeyserConnection;
import org.geysermc.geyser.api.entity.type.GeyserEntity;
import org.geysermc.geyser.api.entity.type.player.GeyserPlayerEntity;
import org.geysermc.geyser.api.event.EventBus;
import org.geysermc.geyser.api.event.EventRegistrar;
import org.geysermc.geyser.api.extension.ExtensionManager;
import org.geysermc.geyser.api.network.BedrockListener;
import org.geysermc.geyser.api.network.RemoteServer;
import org.geysermc.geyser.api.util.PlatformType;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public final class GeyserPvP extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(this, this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    @EventHandler
    public void Playerjoin(PlayerJoinEvent e){
        if (GeyserApi.api().isBedrockPlayer(e.getPlayer().getUniqueId())){
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ocm mode old " + e.getPlayer().getName());
        }else{
            e.getPlayer().sendMessage("You are a java player");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "ocm mode new " + e.getPlayer().getName());
        }




    }

}

