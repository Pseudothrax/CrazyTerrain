package edu.unca.atjones.CrazyTerrain;

import java.io.File;

import org.bukkit.block.Biome;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class CrazyTerrain extends JavaPlugin {

	CrazyTerrainLogger logger = new CrazyTerrainLogger(this);
	
	public void onEnable(){
		logger.info("Enabling");
	}
	
	public void onDisable(){
		logger.info("Disabling");
	}
	
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String uid){

		return new CrazyTerrainGenerator(this);
	}
}