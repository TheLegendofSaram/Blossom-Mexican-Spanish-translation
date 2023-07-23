package dev.yurisuika.blossom.mixin.world.biome;

import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Intrinsic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Biome.class)
public interface BiomeAccessor {

    @Intrinsic
    @Accessor("weather")
    Biome.Weather getWeather();

}