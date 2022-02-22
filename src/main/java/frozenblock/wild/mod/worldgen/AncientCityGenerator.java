package frozenblock.wild.mod.worldgen;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import frozenblock.wild.mod.registry.RegisterWorldgen;
import net.minecraft.structure.Structure;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.pool.StructurePools;
import net.minecraft.structure.processor.StructureProcessorLists;
import net.minecraft.util.Identifier;

public class AncientCityGenerator {
    public static final StructurePool STRUCTURE_POOLS;

    public AncientCityGenerator() {
    }

    public static void init() {
        AncientCityData.init();
    }

    static {
        STRUCTURE_POOLS = StructurePools.register(new StructurePool(new Identifier("ancient_city/city_center"), new Identifier("empty"), ImmutableList.of(Pair.of(StructurePoolElement.ofProcessedSingle("ancient_city/city_center/city_center", RegisterWorldgen.ANCIENT_CITY_START_DEGRADATION), 1)), StructurePool.Projection.RIGID));
    }
}
