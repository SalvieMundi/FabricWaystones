package wraith.waystones.registries;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import wraith.waystones.util.Utils;
import wraith.waystones.block.WaystoneBlockEntity;

public final class BlockEntityRegistry {

    public static final BlockEntityType<WaystoneBlockEntity> WAYSTONE_BLOCK_ENTITY = FabricBlockEntityTypeBuilder.create(WaystoneBlockEntity::new,
            BlockRegistry.WAYSTONE,
            BlockRegistry.DESERT_WAYSTONE,
            BlockRegistry.STONE_BRICK_WAYSTONE,
            BlockRegistry.RED_DESERT_WAYSTONE,
            BlockRegistry.RED_NETHER_BRICK_WAYSTONE,
            BlockRegistry.NETHER_BRICK_WAYSTONE,
            BlockRegistry.ENDSTONE_BRICK_WAYSTONE,
            BlockRegistry.DEEPSLATE_BRICK_WAYSTONE,
            BlockRegistry.BLACKSTONE_BRICK_WAYSTONE
    ).build(null);

    public static  void registerBlockEntities() {
        Registry.register(Registry.BLOCK_ENTITY_TYPE, Utils.ID("waystone"), WAYSTONE_BLOCK_ENTITY);
    }

}
