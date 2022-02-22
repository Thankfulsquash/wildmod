package frozenblock.wild.mod.worldgen;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.structure.Structure;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorType;
import net.minecraft.tag.Tag;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class ReplaceInTagProcessor extends StructureProcessor {
    public static final Codec<ReplaceInTagProcessor> CODEC = RecordCodecBuilder.create((instance) -> {
        return instance.group(Tag.codec(() -> {
            return SerializationTags.getInstance().getOrEmpty(Registry.BLOCK);
        }).fieldOf("rottable_blocks").forGetter((replaceInTagProcessor) -> {
            return replaceInTagProcessor.rottableBlocks;
        }), Codec.FLOAT.fieldOf("integrity").forGetter((replaceInTagProcessor) -> {
            return replaceInTagProcessor.integrity;
        })).apply(instance, ReplaceInTagProcessor::new);
    });
    private final Tag<Block> rottableBlocks;
    private final float integrity;

    public ReplaceInTagProcessor(Tag<Block> tag, float f) {
        this.integrity = f;
        this.rottableBlocks = tag;
    }

    @Nullable
    public Structure.StructureBlockInfo process(WorldView world, BlockPos pos, BlockPos pivot, Structure.StructureBlockInfo blockInfo, Structure.StructureBlockInfo relativeBlockInfo, StructurePlacementData data) {
        Random random = data.getRandom(relativeBlockInfo.pos);
        return blockInfo.state.isIn(this.rottableBlocks) && !(this.integrity >= 1.0F) && !(random.nextFloat() <= this.integrity) ? null : relativeBlockInfo;
    }

    protected StructureProcessorType<?> getType() {
        return StructureProcessorType.REPLACE_IN_TAG;
    }
}
