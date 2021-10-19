package frozenblock.wild.mod.registry.mangrove;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;

public class StrippedMangroveWood extends Block {
    public StrippedMangroveWood() {
        super(FabricBlockSettings
                .of(Material.WOOD)
                .sounds(BlockSoundGroup.WOOD)
                .strength(1f, 10f)
        );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.AXIS);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(Properties.AXIS, ctx.getSide().getAxis());
    }
}
