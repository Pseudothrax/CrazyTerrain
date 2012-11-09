package edu.unca.atjones.CrazyTerrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.plugin.PluginDescriptionFile;

import edu.unca.atjones.CrazyTerrain.CrazyTerrain;

public class CrazyTerrainLogger {

	private final CrazyTerrain plugin;
	private final Logger logger;

	public CrazyTerrainLogger(CrazyTerrain plugin) {
		this.plugin = plugin;
		logger = Logger.getLogger("Minecraft");
	}
	
	private String buildMessage(String message) {
		PluginDescriptionFile yml = plugin.getDescription();
		String output = yml.getName() + yml.getVersion() + ": " + message;
		return output;
	}

	public void info(String msg) {
		logger.info(this.buildMessage(msg));
	}

	public void warn(String msg) {
		logger.warning(this.buildMessage(msg));
	}
}
