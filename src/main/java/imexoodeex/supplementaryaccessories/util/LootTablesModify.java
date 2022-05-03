package imexoodeex.supplementaryaccessories.util;

import imexoodeex.supplementaryaccessories.registers.ItemRegister;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTablesModify {

    private static final Identifier MINESHAFT_CHEST_ID
            = new Identifier("minecraft", "chests/abandoned_mineshaft");

    private static final Identifier DESERT_CHEST_ID
            = new Identifier("minecraft", "chests/desert_pyramid");

    private static final Identifier BASTION_BRIDGE_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_bridge");

    private static final Identifier BASTION_HOGLIN_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_hoglin_stable");

    private static final Identifier BASTION_OTHER_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_other");

    private static final Identifier BASTION_TREASURE_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_treasure");

    private static final Identifier BURIED_TREASURE_CHEST_ID
            = new Identifier("minecraft", "chests/buried_treasure");

    private static final Identifier END_CITY_CHEST_ID
            = new Identifier("minecraft", "chests/end_city_treasure");

    private static final Identifier IGLOO_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");

    private static final Identifier JUNGLE_TEMPLE_CHEST_ID
            = new Identifier("minecraft", "chests/jungle_temple");

    private static final Identifier NETHER_BRIDGE_CHEST_ID
            = new Identifier("minecraft", "chests/nether_bridge");

    private static final Identifier PILLAGER_CHEST_ID
            = new Identifier("minecraft", "chests/pillager_outpost");

    private static final Identifier RUINED_PORTAL_CHEST_ID
            = new Identifier("minecraft", "chests/ruined_portal");

    private static final Identifier SHIPWRECK_MAP_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_map");

    private static final Identifier SHIPWRECT_SUPPLY_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_supply");

    private static final Identifier SHIPWRECT_TREASURE_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_treasure");

    private static final Identifier SIMPLE_DUNGEON_CHEST_ID
            = new Identifier("minecraft", "chests/simple_dungeon");

    private static final Identifier STRONGHOLD_CORRIDOR_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_corridor");

    private static final Identifier STRONGHOLD_CROSSING_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_crossing");

    private static final Identifier STRONGHOLD_LIBRARY_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_library");

    private static final Identifier UNDERWATER_RUIN_BIG_CHEST_ID
            = new Identifier("minecraft", "chests/underwater_ruin_big");

    private static final Identifier UNDERWATER_RUIN_SMALL_CHEST_ID
            = new Identifier("minecraft", "chests/underwater_ruin_small");

    private static final Identifier WOODLAND_MANSION_CHEST_ID
            = new Identifier("minecraft", "chests/woodland_mansion");

    // single item to chest loot
/*    private static void registerLoot(Identifier id, FabricLootSupplierBuilder supplier, float chance, Item item, float min, float max) {
        if (id.equals(id)) {
            FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(chance))
                    .with(ItemEntry.builder(item))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)).build());
            supplier.withPool(poolBuilder.build());
        }
    }*/

    // all items to chest loot
    private static void registerMultipleLoot(Identifier id, FabricLootSupplierBuilder supplier, Identifier name) {
        if (name.equals(id)) {
            FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(ConstantLootNumberProvider.create(1))

                    .with(ItemEntry.builder(ItemRegister.aglet))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.balloon))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.bandofregeneration))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.bezoar))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.blackbelt))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.blindfold))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.cloudinabottle))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.combatshield))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.feralclaws))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.flipper))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.frogleg))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.hamburgercap))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.horseshoe))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.mask))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.hermes_boots))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.rocket_boots))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.vitamins))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.warrioremblem))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.watch))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.gps))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build())

                    .with(ItemEntry.builder(ItemRegister.radar))
                    .withFunction(SetCountLootFunction.builder(UniformLootNumberProvider.create(1f, 1f)).build());

            supplier.withPool(poolBuilder.build());
        }
    }

    public static void modifyLootTables() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {

            registerMultipleLoot(id, supplier, STRONGHOLD_CROSSING_CHEST_ID);
            registerMultipleLoot(id, supplier, BASTION_BRIDGE_CHEST_ID);
            registerMultipleLoot(id, supplier, BASTION_HOGLIN_CHEST_ID);
            registerMultipleLoot(id, supplier, BASTION_OTHER_CHEST_ID);
            registerMultipleLoot(id, supplier, BASTION_TREASURE_CHEST_ID);
            registerMultipleLoot(id, supplier, BURIED_TREASURE_CHEST_ID);
            registerMultipleLoot(id, supplier, END_CITY_CHEST_ID);
            registerMultipleLoot(id, supplier, IGLOO_CHEST_ID);
            registerMultipleLoot(id, supplier, NETHER_BRIDGE_CHEST_ID);
            registerMultipleLoot(id, supplier, PILLAGER_CHEST_ID);
            registerMultipleLoot(id, supplier, JUNGLE_TEMPLE_CHEST_ID);
            registerMultipleLoot(id, supplier, RUINED_PORTAL_CHEST_ID);
            registerMultipleLoot(id, supplier, SHIPWRECK_MAP_CHEST_ID);
            registerMultipleLoot(id, supplier, SHIPWRECT_SUPPLY_CHEST_ID);
            registerMultipleLoot(id, supplier, SHIPWRECT_TREASURE_CHEST_ID);
            registerMultipleLoot(id, supplier, SIMPLE_DUNGEON_CHEST_ID);
            registerMultipleLoot(id, supplier, STRONGHOLD_CORRIDOR_CHEST_ID);
            registerMultipleLoot(id, supplier, STRONGHOLD_CROSSING_CHEST_ID);
            registerMultipleLoot(id, supplier, STRONGHOLD_LIBRARY_CHEST_ID);
            registerMultipleLoot(id, supplier, UNDERWATER_RUIN_SMALL_CHEST_ID);
            registerMultipleLoot(id, supplier, UNDERWATER_RUIN_BIG_CHEST_ID);
            registerMultipleLoot(id, supplier, WOODLAND_MANSION_CHEST_ID);
            registerMultipleLoot(id, supplier, MINESHAFT_CHEST_ID);
            registerMultipleLoot(id, supplier, DESERT_CHEST_ID);
        }));
    }

}