package com.asthereon.green_thumb.ItemType;

import com.asthereon.green_thumb.GreenThumbConfig;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.ItemComposition;
import net.runelite.api.Skill;
import net.runelite.client.game.ItemManager;
import net.runelite.client.util.ColorUtil;

import java.awt.*;
import java.util.*;
import java.util.List;

public enum Seed {

    POTATO_SEED("Potato seed","Allotment",1,3,"Compost x 2","Marigold or White lily","Cooking ingredient","Payment to protect onion plants (1 sack)"),
    ONION_SEED("Onion seed","Allotment",5,3,"Potatoes(10) x 1","Marigold or White lily","Cooking ingredient","Payment to protect cabbage plants (1 sack)","Payment to protect Asgarnian hops (1 sack)"),
    CABBAGE_SEED("Cabbage seed","Allotment",7,3,"Onions(10) x 1","Rosemary or White lily","Garden pie ingredient","Payment to protect tomato plants (2 sacks)","Payment to protect Krandorian hops (3 sacks)","Payment to protect redberry bushes (4 sacks)"),
    TOMATO_SEED("Tomato seed","Allotment",12,3,"Cabbages(10) x 2","Marigold or White lily","Pizza ingredient","Payment to protect Yanillian hops (1 basket)","Payment to protect oak trees (1 basket)","Payment to protect cadavaberry bushes (3 baskets)"),
    SWEETCORN_SEED("Sweetcorn seed","Allotment",20,3,"Jute fibre x 10","Scarecrow or White lily","Cooking ingredient","Payment to protect apple tree (9 harvests)"),
    STRAWBERRY_SEED("Strawberry seed","Allotment",31,3,"Apples(5) x 1","White lily","Summer pie ingredient","Payment to protect dwellberry bushes (3 baskets)","Payment to protect orange trees (3 baskets)"),
    WATERMELON_SEED("Watermelon seed","Allotment",47,3,"Curry leaf x 10","Nasturtiums or White lily","Summer pie ingredient","Used to make scarecrow","Payment to protect jangerberry bushes (6 harvests)","Payment to protect pineapple trees (10 harvests)"),
    SNAPE_GRASS_SEED("Snape grass seed","Allotment",61,3,"Jangerberries x 5","White lily","Used in the making of prayer potion and fishing potion","Used when making a hangover cure","Payment to protect Potato cactus(x8)"),
    MARIGOLD_SEED("Marigold seed","Flower",2,1,"","","Protecting potato, onion, tomato plants","Payment to protect hammerstone hops. (1)"),
    ROSEMARY_SEED("Rosemary seed","Flower",11,1,"","","Making Impling jars","Protecting cabbage plants"),
    NASTURTIUM_SEED("Nasturtium seed","Flower",24,1,"","","Making Imp repellent","Protecting watermelon plants","Payment to protect wildblood hops. (1)"),
    WOAD_SEED("Woad seed","Flower",25,1,"","","Making various dyes"),
    LIMPWURT_SEED("Limpwurt seed","Flower",26,1,"","","(Super) Strength potion ingredient"),
    WHITE_LILY_SEED("White lily seed","Flower",58,1,"","","Protects all neighboring allotments from disease"),
    GUAM_SEED("Guam seed","Herb",9,1,"","","Ingredient of Attack potion","Ingredient of Guam tar","Ingredient of Guthix rest"),
    MARRENTILL_SEED("Marrentill seed","Herb",14,1,"","","Ingredient of Antipoison","Ingredient of Guthix rest","Burning incense"),
    TARROMIN_SEED("Tarromin seed","Herb",19,1,"","","Ingredient of Strength potion","Ingredient of Serum 207","Ingredient of Tarromin tar"),
    HARRALANDER_SEED("Harralander seed","Herb",26,1,"","","Ingredient of Guthix rest","Ingredient of Compost potion","Ingredient of Stat restore potion","Ingredient of Guthix balance","Ingredient of Energy potion","Ingredient of Combat potion","Ingredient of Harralander tar")
    ,GOUT_TUBER("Gout tuber","Herb",29,1,"","","Making a gem-bladed machete","Exchange with Sanfew for random herbs"),
    RANARR_SEED("Ranarr seed","Herb",32,1,"","","Ingredient of Defence potion","Ingredient of Prayer potion"),
    TOADFLAX_SEED("Toadflax seed","Herb",38,1,"","","Ingredient of Agility potion","Ingredient of Antipoison+","Ingredient of Saradomin Brew"),
    IRIT_SEED("Irit seed","Herb",44,1,"","","Ingredient of Super attack","Ingredient of Super antipoison","Ingredient of Antipoison++"),
    AVANTOE_SEED("Avantoe seed","Herb",50,1,"","","Ingredient of Fishing potion","Ingredient of Super energy","Ingredient of Hunter potion"),
    KWUARM_SEED("Kwuarm seed","Herb",56,1,"","","Ingredient of Super strength","Ingredient of Weapon poison"),
    SNAPDRAGON_SEED("Snapdragon seed","Herb",62,1,"","","Ingredient of Super restore","Ingredient of Sanfew serum"),
    CADANTINE_SEED("Cadantine seed","Herb",67,1,"","","Ingredient of Super defence"),
    LANTADYME_SEED("Lantadyme seed","Herb",73,1,"","","Ingredient of Antifire potion","Ingredient of Magic potion"),
    DWARF_WEED_SEED("Dwarf weed seed","Herb",79,1,"","","Ingredient of Ranging potion"),
    TORSTOL_SEED("Torstol seed","Herb",85,1,"","","Ingredient of Zamorak brew","Ingredient of Super combat potion","Ingredient of Anti venom+"),
    BARLEY_SEED("Barley seed","Hops",3,4,"Compost x 3","","Raw ingredient for brewing","Payment to protect jute plants (6)"),
    HAMMERSTONE_SEED("Hammerstone seed","Hops",4,4,"Marigold x 1","","Dwarven stout ingredient "),
    ASGARNIAN_SEED("Asgarnian seed","Hops",8,4,"Onions(10) x 1","","Asgarnian ale ingredient "),
    JUTE_SEED("Jute seed","Hops",13,3,"Barley malt x 6","","Weaving an empty sack on a loom","Weaving drift nets for drift net fishing","Payment to protect sweetcorn allotment (10)"),
    YANILLIAN_SEED("Yanillian seed","Hops",16,4,"Tomatoes(5) x 1","","Wizard's mind bomb ingredient ","Payment to protect Mahogany Trees (25) "),
    KRANDORIAN_SEED("Krandorian seed","Hops",21,4,"Cabbage(10) x 3","","Dragon bitter ingredient "),
    WILDBLOOD_SEED("Wildblood seed","Hops",28,4,"Nasturtiums x 1","","Slayer's respite ingredient "),
    REDBERRY_SEED("Redberry seed","Bush",10,1,"Cabbages(10) x 4","","Redberry pie ingredient","Making red dye"),
    CADAVABERRY_SEED("Cadavaberry seed","Bush",22,1,"Tomatoes(5) x 3","","Making Cadava potion"),
    DWELLBERRY_SEED("Dwellberry seed","Bush",36,1,"Strawberries(5) x 3","","Quest item - Plague City","Cooking ingredient"),
    JANGERBERRY_SEED("Jangerberry seed","Bush",48,1,"Watermelon x 6","","Quest item - Watchtower","Zamorak brew ingredient"),
    WHITEBERRY_SEED("Whiteberry seed","Bush",59,1,"Bittercap mushroom x 8","","Quest item - The Hand in the Sand","(Super) Defence potion ingredient"),
    POISON_IVY_SEED("Poison ivy seed","Bush",70,1,"Immune to Disease","","Weapon poison++ ingredient","Payment for Calquat trees"),
    ACORN("Acorn","Tree",15,1,"Tomatoes(5) x 1","","Source of oak logs","Axeman's folly ingredient (Roots)"),
    OAK_SEEDLING("Oak seedling","Tree",15,1,"Tomatoes(5) x 1","","Source of oak logs","Axeman's folly ingredient (Roots)"),
    OAK_SAPLING("Oak sapling","Tree",15,1,"Tomatoes(5) x 1","","Source of oak logs","Axeman's folly ingredient (Roots)"),
    WILLOW_SEED("Willow seed","Tree",30,1,"Apples(5) x 1","","Source of willow logs","Weaving a Basket on a loom (Branch)","Quest item - Enlightened Journey (Branch)"),
    WILLOW_SEEDLING("Willow seedling","Tree",30,1,"Apples(5) x 1","","Source of willow logs","Weaving a Basket on a loom (Branch)","Quest item - Enlightened Journey (Branch)"),
    WILLOW_SAPLING("Willow sapling","Tree",30,1,"Apples(5) x 1","","Source of willow logs","Weaving a Basket on a loom (Branch)","Quest item - Enlightened Journey (Branch)"),
    MAPLE_SEED("Maple seed","Tree",45,1,"Oranges(5) x 1","","Source of Maple logs"),
    MAPLE_SEEDLING("Maple seedling","Tree",45,1,"Oranges(5) x 1","","Source of Maple logs"),
    MAPLE_SAPLING("Maple sapling","Tree",45,1,"Oranges(5) x 1","","Source of Maple logs"),
    YEW_SEED("Yew seed","Tree",60,1,"Cactus Spine x 10","","Source of Yew logs","Antipoison+ ingredient (Roots)"),
    YEW_SEEDLING("Yew seedling","Tree",60,1,"Cactus Spine x 10","","Source of Yew logs","Antipoison+ ingredient (Roots)"),
    YEW_SAPLING("Yew sapling","Tree",60,1,"Cactus Spine x 10","","Source of Yew logs","Antipoison+ ingredient (Roots)"),
    MAGIC_SEED("Magic seed","Tree",75,1,"Coconut x 25","","Source of Magic logs","Making magic string (Roots)","Antipoison++ ingredient (Roots)"),
    MAGIC_SEEDLING("Magic seedling","Tree",75,1,"Coconut x 25","","Source of Magic logs","Making magic string (Roots)","Antipoison++ ingredient (Roots)"),
    MAGIC_SAPLING("Magic sapling","Tree",75,1,"Coconut x 25","","Source of Magic logs","Making magic string (Roots)","Antipoison++ ingredient (Roots)"),
    APPLE_TREE_SEED("Apple tree seed","Fruit Tree",27,1,"Sweetcorn x 9","","Cooking ingredient","Payment to protect strawberry plants","Payment to protect willow trees","Payment to protect banana trees"),
    APPLE_SEEDLING("Apple seedling","Fruit Tree",27,1,"Sweetcorn x 9","","Cooking ingredient","Payment to protect strawberry plants","Payment to protect willow trees","Payment to protect banana trees"),
    APPLE_SAPLING("Apple sapling","Fruit Tree",27,1,"Sweetcorn x 9","","Cooking ingredient","Payment to protect strawberry plants","Payment to protect willow trees","Payment to protect banana trees"),
    BANANA_TREE_SEED("Banana tree seed","Fruit Tree",33,1,"Apples(5) x 4","","Cooking ingredient","Ape Atoll Teleport","Payment to protect curry trees"),
    BANANA_SEEDLING("Banana seedling","Fruit Tree",33,1,"Apples(5) x 4","","Cooking ingredient","Ape Atoll Teleport","Payment to protect curry trees"),
    BANANA_SAPLING("Banana sapling","Fruit Tree",33,1,"Apples(5) x 4","","Cooking ingredient","Ape Atoll Teleport","Payment to protect curry trees"),
    ORANGE_TREE_SEED("Orange tree seed","Fruit Tree",39,1,"Strawberries(5) x 3","","Cooking ingredient","Payment to protect maple trees"),
    ORANGE_SEEDLING("Orange seedling","Fruit Tree",39,1,"Strawberries(5) x 3","","Cooking ingredient","Payment to protect maple trees"),
    ORANGE_SAPLING("Orange sapling","Fruit Tree",39,1,"Strawberries(5) x 3","","Cooking ingredient","Payment to protect maple trees"),
    CURRY_TREE_SEED("Curry tree seed","Fruit Tree",42,1,"Bananas(5) x 5","","Curry ingredient","Payment to protect watermelons"),
    CURRY_SEEDLING("Curry seedling","Fruit Tree",42,1,"Bananas(5) x 5","","Curry ingredient","Payment to protect watermelons"),
    CURRY_SAPLING("Curry sapling","Fruit Tree",42,1,"Bananas(5) x 5","","Curry ingredient","Payment to protect watermelons"),
    PINEAPPLE_SEED("Pineapple seed","Fruit Tree",51,1,"Watermelon x 10","","Cooking ingredient","Payment to protect papaya trees","Supercompost for Ironmen"),
    PINEAPPLE_SEEDLING("Pineapple seedling","Fruit Tree",51,1,"Watermelon x 10","","Cooking ingredient","Payment to protect papaya trees","Supercompost for Ironmen"),
    PINEAPPLE_SAPLING("Pineapple sapling","Fruit Tree",51,1,"Watermelon x 10","","Cooking ingredient","Payment to protect papaya trees","Supercompost for Ironmen"),
    PAPAYA_TREE_SEED("Papaya tree seed","Fruit Tree",57,1,"Pineapple x 10","","Payment Method for Palm Tree","Restores Run Energy"),
    PAPAYA_SEEDLING("Papaya seedling","Fruit Tree",57,1,"Pineapple x 10","","Payment Method for Palm Tree","Restores Run Energy"),
    PAPAYA_SAPLING("Papaya sapling","Fruit Tree",57,1,"Pineapple x 10","","Payment Method for Palm Tree","Restores Run Energy"),
    PALM_TREE_SEED("Palm tree seed","Fruit Tree",68,1,"Papaya fruit x 15","","Used for making Coconut milk and Coconut shell","Payment to protect dragonfruit and magic trees"),
    PALM_SEEDLING("Palm seedling","Fruit Tree",68,1,"Papaya fruit x 15","","Used for making Coconut milk and Coconut shell","Payment to protect dragonfruit and magic trees"),
    PALM_SAPLING("Palm sapling","Fruit Tree",68,1,"Papaya fruit x 15","","Used for making Coconut milk and Coconut shell","Payment to protect dragonfruit and magic trees"),
    DRAGONFRUIT_TREE_SEED("Dragonfruit tree seed","Fruit Tree",81,1,"Coconut x 15","","They are an ingredient in dragonfruit pie","Used to create bottled dragonbreath","Redwood tree protection"),
    DRAGONFRUIT_SEEDLING("Dragonfruit seedling","Fruit Tree",81,1,"Coconut x 15","","They are an ingredient in dragonfruit pie","Used to create bottled dragonbreath","Redwood tree protection"),
    DRAGONFRUIT_SAPLING("Dragonfruit sapling","Fruit Tree",81,1,"Coconut x 15","","They are an ingredient in dragonfruit pie","Used to create bottled dragonbreath","Redwood tree protection"),
    SEAWEED_SPORE("Seaweed spore","Seaweed",23,1,"Numulite x 200","","Used to make soda ash for molten glass"),
    GRAPE_SEED("Grape seed","Vine",36,1,"","","Cooking ingredient"),
    MUSHROOM_SPORE("Mushroom spore","Mushroom",53,1,"","","Cooking ingredient"),
    BELLADONNA_SEED("Belladonna seed","Belladonna",63,1,"","","Weapon poison++ ingredient"),
    HESPORI_SEED("Hespori seed","Hespori",65,1,"","","Spawns Hespori"),
    KRONOS_SEED("Kronos seed","Anima",76,1,"","","Provides a chance for farming patches to skip a growth stage."),
    IASOR_SEED("Iasor seed","Anima",76,1,"","","Decreases the chance of farming patches becoming diseased."),
    ATTAS_SEED("Attas seed","Anima",76,1,"","","Increases the yield of farming patches."),
    TEAK_TREE_SEED("Teak tree seed","Hardwood",35,1,"Limpwurt root x 15","","Source of teak logs"),
    TEAK_SEEDLING("Teak seedling","Hardwood",35,1,"Limpwurt root x 15","","Source of teak logs"),
    TEAK_SAPLING("Teak sapling","Hardwood",35,1,"Limpwurt root x 15","","Source of teak logs"),
    MAHOGANY_TREE_SEED("Mahogany tree seed","Hardwood",55,1,"Yanillian hops x 25","","Source of mahogany logs"),
    MAHOGANY_SEEDLING("Mahogany seedling","Hardwood",55,1,"Yanillian hops x 25","","Source of mahogany logs"),
    MAHOGANY_SAPLING("Mahogany sapling","Hardwood",55,1,"Yanillian hops x 25","","Source of mahogany logs"),
    CALQUAT_TREE_SEED("Calquat tree seed","Calquat",72,1,"Poison ivy berries x 8","","Making Calquat kegs","Damaging Broodoo victims"),
    CALQUAT_SEEDLING("Calquat seedling","Calquat",72,1,"Poison ivy berries x 8","","Making Calquat kegs","Damaging Broodoo victims"),
    CALQUAT_SAPLING("Calquat sapling","Calquat",72,1,"Poison ivy berries x 8","","Making Calquat kegs","Damaging Broodoo victims"),
    CRYSTAL_ACORN("Crystal acorn","Crystal",74,1,"Immune to Disease","","Source of Crystal shards"),
    CRYSTAL_SEEDLING("Crystal seedling","Crystal",74,1,"Immune to Disease","","Source of Crystal shards"),
    CRYSTAL_SAPLING("Crystal sapling","Crystal",74,1,"Immune to Disease","","Source of Crystal shards"),
    SPIRIT_SEED("Spirit seed","Spirit",83,1,"Monkey nuts x 5, Monkey bar x 1, and Ground tooth x 1","","Spirit tree network"),
    SPIRIT_SEEDLING("Spirit seedling","Spirit",83,1,"Monkey nuts x 5, Monkey bar x 1, and Ground tooth x 1","","Spirit tree network"),
    SPIRIT_SAPLING("Spirit sapling","Spirit",83,1,"Monkey nuts x 5, Monkey bar x 1, and Ground tooth x 1","","Spirit tree network"),
    CELASTRUS_SEED("Celastrus seed","Celastrus",85,1,"Potato cactus x 8","","Can be fletched into a battlestaff"),
    CELASTRUS_SEEDLING("Celastrus seedling","Celastrus",85,1,"Potato cactus x 8","","Can be fletched into a battlestaff"),
    CELASTRUS_SAPLING("Celastrus sapling","Celastrus",85,1,"Potato cactus x 8","","Can be fletched into a battlestaff"),
    REDWOOD_TREE_SEED("Redwood tree seed","Redwood",90,1,"Dragonfruit x 6","","Source of redwood logs"),
    REDWOOD_SEEDLING("Redwood seedling","Redwood",90,1,"Dragonfruit x 6","","Source of redwood logs"),
    REDWOOD_SAPLING("Redwood sapling","Redwood",90,1,"Dragonfruit x 6","","Source of redwood logs"),
    CACTUS_SEED("Cactus seed","Cactus",55,1,"Cadava berries x 6","","Weapon poison+ ingredient","Payment to protect yew tree (10)"),
    POTATO_CACTUS_SEED("Potato cactus seed","Cactus",64,1,"Snape grass x 8","","Magic potion ingredient","Payment to protect Celastrus tree (8)");

    private static final Map<String, Seed> itemNameToSeed = new HashMap<>();

    static {
        Arrays.stream(values()).forEach(seed -> {
            itemNameToSeed.put(seed.getName(), seed);
        });
    }

    public static Seed getSeedFromItemName(String itemName) {
        return itemNameToSeed.get(itemName);
    }

    String name;
    String type;
    int level;
    int requiredAmount;
    String protectionPayment;
    String protectionFlowers;
    List<String> uses = new ArrayList<>();

    Seed(String name, String type, int level, int requiredAmount, String protectionPayment, String protectionFlowers, String... uses) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.requiredAmount = requiredAmount;
        this.protectionPayment = protectionPayment;
        this.protectionFlowers = protectionFlowers;
        this.uses.addAll(Arrays.asList(uses));
    }

    public String getName() {
        return name;
    }

    public String getLevelDisplay(GreenThumbConfig config, Client client) {
        Color levelColor = (client.getBoostedSkillLevel(Skill.FARMING) >= level) ? config.metRequirementColor() : config.notMetRequirementColor();
        return ColorUtil.wrapWithColorTag("Lvl. " + level + " Farming", levelColor);
    }

    public String getRequiredAmountDisplay(GreenThumbConfig config, int itemAmount) {
        Color levelColor = (itemAmount >= requiredAmount) ? config.metRequirementColor() : config.notMetRequirementColor();
        return ColorUtil.wrapWithColorTag(String.valueOf(requiredAmount), levelColor);
    }

    public String getTooltip(GreenThumbConfig config, Client client, int itemAmount) {
        StringBuilder msg = new StringBuilder(ColorUtil.wrapWithColorTag(name, Color.WHITE));

        if (config.showLevelRequirement()) {
            msg.append(" (").append(getLevelDisplay(config, client)).append(")");
        }

        if (config.showSeedType()) {
            msg.append("</br>Type: ").append(type);
        }

        if (config.showSeedsPerPatch()) {
            msg.append("</br>Seeds Per Patch: ").append(getRequiredAmountDisplay(config, itemAmount));
        }

        if (config.showProtectionPayment() && protectionPayment.length() > 0) {
            msg.append("</br>Protection Payment: ").append(protectionPayment);
        }

        if (config.showProtectionFlowers() && protectionFlowers.length() > 0) {
            msg.append("</br>Protection Flowers: ").append(protectionFlowers);
        }

        if (config.showUses()) {
            msg.append("</br>Uses: ");
            for (String use : uses) {
                msg.append("</br>- ").append(use);
            }
        }

        return msg.toString();
    }
}

