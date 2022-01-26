package dev.jackaboi.advancedtech;

import dev.jackaboi.advancedtech.util.RegistryHandler;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AdvancedTech.MOD_ID)
public class AdvancedTech
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "advancedtech";

    public AdvancedTech() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RegistryHandler.init(eventBus);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    public static final CreativeModeTab TAB = new CreativeModeTab("advancedTech") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RegistryHandler.titan_shard.get());
        }
    };
}
