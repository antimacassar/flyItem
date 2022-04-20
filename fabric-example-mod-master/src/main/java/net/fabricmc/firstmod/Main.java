package net.fabricmc.firstmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.firstmod.items.NewItem;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

public class Main implements ModInitializer {

	public static final ItemGroup NEW_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("firstmod", "general"),
			() -> new ItemStack(Main.NEW_ITEM));
	public static final Item NEW_ITEM = new NewItem(new FabricItemSettings().group(Main.NEW_ITEM_GROUP));
	public static final Block DARK_PURPUR = new DarkPurpur();


	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("firstmod", "new_item"), NEW_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("firstmod", "dark_purpur"), DARK_PURPUR);
		Registry.register(Registry.ITEM, new Identifier("firstmod", "dark_purpur"), new BlockItem(DARK_PURPUR,
				new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}

}
