package dev.west.realnmod.block.custom;


import dev.west.realnmod.RealmLayers;
import net.fabricmc.fabric.api.block.v1.FabricBlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;


public class RealmHalf extends RealmLayers {
    public RealmHalf(Properties properties) {
        super(properties);
    }

    public static VoxelShape makeShape() {
        return Shapes.or(
                Shapes.box(0, 0, 0, 0.25, 0.25, 1),
                Shapes.box(0, 0, 0.25, 0.25, 0.25, 1.25)
        );
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState onState, Entity entity) {
        super.stepOn(level, pos, onState, entity);
    }

    @Override
    protected VoxelShape getOcclusionShape(BlockState state) {
        return super.getOcclusionShape(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        //smth here
        //snow layers use BlockStateProperties.LAYERS
        //really, read snowLayerBlock. Even if the shape is different, that's just changing the shape, most of other stuff remains the same, unless u want it to be different
    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rotation) {
        return super.rotate(state, rotation);
    }

    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return super.mirror(state, mirror);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return makeShape();
    }

    @Override
    protected VoxelShape getBlockSupportShape(BlockState state, BlockGetter level, BlockPos pos) {
        return super.getBlockSupportShape(state, level, pos);
    }
    @Override
    protected VoxelShape getCollisionShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return makeShape();
    }
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        BlockState blockState = blockPlaceContext.getLevel().getBlockState(blockPlaceContext.getClickedPos());
        if (blockState.is(this)) {
            int i = blockState.getValue(LAYERS);
            return blockState.setValue(LAYERS, Math.min(MAX_HEIGHT, i + 1));
        } else {
            return super.getStateForPlacement(blockPlaceContext);
        }
    }
}