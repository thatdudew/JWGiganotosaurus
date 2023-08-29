package net.mcreator.testsize.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class GiganotosaurusOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState clickedBlock = Blocks.AIR.defaultBlockState();
		double particleRadius = 0;
		double particleAmount = 0;
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() instanceof LiquidBlock) {
			clickedBlock = (world.getBlockState(BlockPos.containing(x, y, z)));
			world.setBlock(BlockPos.containing(x, y, z), (world.getFluidState(BlockPos.containing(x, y, z)).createLegacyBlock()), 3);
			if (world instanceof ServerLevel _level)
				FallingBlockEntity.fall(_level, BlockPos.containing(x + 0.5, y, z + 0.5), clickedBlock);
		}
	}
}
