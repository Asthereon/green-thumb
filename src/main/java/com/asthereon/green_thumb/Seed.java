package com.asthereon.green_thumb;

import net.runelite.api.Client;
import net.runelite.api.Skill;
import net.runelite.client.util.ColorUtil;

import java.awt.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;

public enum Seed {

    POTATO_SEED("Potato seed","Allotment",8,0,9,4,10,1,3,"Compost x 2","Marigold or White lily","Cooking ingredient","Payment to protect onion plants (1 sack)","","","","",""),
    ONION_SEED("Onion seed","Allotment",9.5,0,10.5,4,10,5,3,"Potatoes(10) x 1","Marigold or White lily","Cooking ingredient","Payment to protect cabbage plants (1 sack)","Payment to protect Asgarnian hops (1 sack)","","","",""),
    CABBAGE_SEED("Cabbage seed","Allotment",10,0,11.5,4,10,7,3,"Onions(10) x 1","Rosemary or White lily","Garden pie ingredient","Payment to protect tomato plants (2 sacks)","Payment to protect Krandorian hops (3 sacks)","Payment to protect redberry bushes (4 sacks)","","",""),
    TOMATO_SEED("Tomato seed","Allotment",12.5,0,14,4,10,12,3,"Cabbages(10) x 2","Marigold or White lily","Pizza ingredient","Payment to protect Yanillian hops (1 basket)","Payment to protect oak trees (1 basket)","Payment to protect cadavaberry bushes (3 baskets)","","",""),
    SWEETCORN_SEED("Sweetcorn seed","Allotment",17,0,19,6,10,20,3,"Jute fibre x 10","Scarecrow or White lily","Cooking ingredient","Payment to protect apple tree (9 harvests)","","","","",""),
    STRAWBERRY_SEED("Strawberry seed","Allotment",26,0,29,6,10,31,3,"Apples(5) x 1","White lily","Summer pie ingredient","Payment to protect dwellberry bushes (3 baskets)","Payment to protect orange trees (3 baskets)","","","",""),
    WATERMELON_SEED("Watermelon seed","Allotment",48.5,0,54.5,8,10,47,3,"Curry leaf x 10","Nasturtiums or White lily","Summer pie ingredient","Used to make scarecrow","Payment to protect jangerberry bushes (6 harvests)","Payment to protect pineapple trees (10 harvests)","","",""),
    SNAPE_GRASS_SEED("Snape grass seed","Allotment",82,0,82,7,10,61,3,"Jangerberries x 5","White lily","","Used in the making of prayer potion and fishing potion","Used when making a hangover cure","Payment to protect Potato cactus(x8)","","",""),
    MARIGOLD_SEED("Marigold seed","Flower",8.5,0,47,4,5,2,1,"","","Protecting potato, onion, tomato plants","Payment to protect hammerstone hops. (1)","","","","",""),
    ROSEMARY_SEED("Rosemary seed","Flower",12,0,66.5,4,5,11,1,"","","Making Impling jars","Protecting cabbage plants","","","","",""),
    NASTURTIUM_SEED("Nasturtium seed","Flower",19.5,0,111,4,5,24,1,"","","Making Imp repellent","Protecting watermelon plants","Payment to protect wildblood hops. (1)","","","",""),
    WOAD_SEED("Woad seed","Flower",20.5,0,115.5,4,5,25,1,"","","Making various dyes","","","","","",""),
    LIMPWURT_SEED("Limpwurt seed","Flower",21.5,0,120,4,5,26,1,"","","(Super) Strength potion ingredient","","","","","",""),
    WHITE_LILY_SEED("White lily seed","Flower",42,0,250,4,5,58,1,"","","Protects all neighboring allotments from disease","","","","","",""),
    GUAM_SEED("Guam seed","Herb",11,0,12.5,4,20,9,1,"","","Ingredient of Attack potion","Ingredient of Guam tar","Ingredient of Guthix rest","","","",""),
    MARRENTILL_SEED("Marrentill seed","Herb",13.5,0,15,4,20,14,1,"","","Ingredient of Antipoison","Ingredient of Guthix rest","Burning incense","","","",""),
    TARROMIN_SEED("Tarromin seed","Herb",16,0,18,4,20,19,1,"","","Ingredient of Strength potion","Ingredient of Serum 207","Ingredient of Tarromin tar","","","",""),
    HARRALANDER_SEED("Harralander seed","Herb",21.5,0,24,4,20,26,1,"","","Ingredient of Guthix rest","Ingredient of Compost potion","Ingredient of Stat restore potion","Ingredient of Guthix balance","Ingredient of Energy potion","Ingredient of Combat potion","Ingredient of Harralander tar"),
    GOUT_TUBER("Gout tuber","Herb",105,0,45,4,20,29,1,"","","Making a gem-bladed machete","Exchange with Sanfew for random herbs","","","","",""),
    RANARR_SEED("Ranarr seed","Herb",27,0,30.5,4,20,32,1,"","","Ingredient of Defence potion","Ingredient of Prayer potion","","","","",""),
    TOADFLAX_SEED("Toadflax seed","Herb",34,0,38.5,4,20,38,1,"","","Ingredient of Agility potion","Ingredient of Antipoison+","Ingredient of Saradomin Brew","","","",""),
    IRIT_SEED("Irit seed","Herb",43,0,48.5,4,20,44,1,"","","Ingredient of Super attack","Ingredient of Super antipoison","Ingredient of Antipoison++","","","",""),
    AVANTOE_SEED("Avantoe seed","Herb",54.5,0,61.5,4,20,50,1,"","","Ingredient of Fishing potion","Ingredient of Super energy","Ingredient of Hunter potion","","","",""),
    KWUARM_SEED("Kwuarm seed","Herb",69,0,78,4,20,56,1,"","","Ingredient of Super strength","Ingredient of Weapon poison","","","","",""),
    SNAPDRAGON_SEED("Snapdragon seed","Herb",87.5,0,98.5,4,20,62,1,"","","Ingredient of Super restore","Ingredient of Sanfew serum","","","","",""),
    CADANTINE_SEED("Cadantine seed","Herb",106.5,0,120,4,20,67,1,"","","Ingredient of Super defence","","","","","",""),
    LANTADYME_SEED("Lantadyme seed","Herb",134.5,0,151.5,4,20,73,1,"","","Ingredient of Antifire potion","Ingredient of Magic potion","","","","",""),
    DWARF_WEED_SEED("Dwarf weed seed","Herb",170.5,0,192,4,20,79,1,"","","Ingredient of Ranging potion","","","","","",""),
    TORSTOL_SEED("Torstol seed","Herb",199.5,0,224.5,4,20,85,1,"","","Ingredient of Zamorak brew","Ingredient of Super combat potion","Ingredient of Anti venom+","","","",""),
    BARLEY_SEED("Barley seed","Hops",8.5,0,103.5,4,10,3,4,"Compost x 3","","Raw ingredient for brewing","Payment to protect jute plants (6)","","","","",""),
    HAMMERSTONE_SEED("Hammerstone seed","Hops",9,0,109,4,10,4,4,"Marigold x 1","","Dwarven stout ingredient ","","","","","",""),
    ASGARNIAN_SEED("Asgarnian seed","Hops",10.9,0,130.9,5,10,8,4,"Onions(10) x 1","","Asgarnian ale ingredient ","","","","","",""),
    JUTE_SEED("Jute seed","Hops",13,0,158,5,10,13,3,"Barley malt x 6","","Weaving an empty sack on a loom","Weaving drift nets for drift net fishing","Payment to protect sweetcorn allotment (10)","","","",""),
    YANILLIAN_SEED("Yanillian seed","Hops",14.5,0,174.5,6,10,16,4,"Tomatoes(5) x 1","","Wizard's mind bomb ingredient ","Payment to protect Mahogany Trees (25) ","","","","",""),
    KRANDORIAN_SEED("Krandorian seed","Hops",17.5,0,212.5,7,10,21,4,"Cabbage(10) x 3","","Dragon bitter ingredient ","","","","","",""),
    WILDBLOOD_SEED("Wildblood seed","Hops",23,0,283,8,10,28,4,"Nasturtiums x 1","","Slayer's respite ingredient ","","","","","",""),
    REDBERRY_SEED("Redberry seed","Bush",11.5,64,4.5,5,20,10,1,"Cabbages(10) x 4","","Redberry pie ingredient","Making red dye","","","","",""),
    CADAVABERRY_SEED("Cadavaberry seed","Bush",18,102.5,7,6,20,22,1,"Tomatoes(5) x 3","","Making Cadava potion","","","","","",""),
    DWELLBERRY_SEED("Dwellberry seed","Bush",31.5,177.5,12,7,20,36,1,"Strawberries(5) x 3","","Quest item - Plague City","Cooking ingredient","","","","",""),
    JANGERBERRY_SEED("Jangerberry seed","Bush",50.5,284.5,19,8,20,48,1,"Watermelon x 6","","Quest item - Watchtower","Zamorak brew ingredient","","","","",""),
    WHITEBERRY_SEED("Whiteberry seed","Bush",78,437.5,29,8,20,59,1,"Bittercap mushroom x 8","","Quest item - The Hand in the Sand","(Super) Defence potion ingredient","","","","",""),
    POISON_IVY_SEED("Poison ivy seed","Bush",120,675,45,8,20,70,1,"Immune to Disease","","Weapon poison++ ingredient","Payment for Calquat trees","","","","",""),
    ACORN("Acorn","Tree",14,467.3,0,5,40,15,1,"Tomatoes(5) x 1","","Source of oak logs","Axeman's folly ingredient (Roots)","","","","",""),
    OAK_SEEDLING("Oak seedling","Tree",14,467.3,0,5,40,15,1,"Tomatoes(5) x 1","","Source of oak logs","Axeman's folly ingredient (Roots)","","","","",""),
    OAK_SAPLING("Oak sapling","Tree",14,467.3,0,5,40,15,1,"Tomatoes(5) x 1","","Source of oak logs","Axeman's folly ingredient (Roots)","","","","",""),
    WILLOW_SEED("Willow seed","Tree",25,1456.5,0,7,40,30,1,"Apples(5) x 1","","Source of willow logs","Weaving a Basket on a loom (Branch)","Quest item - Enlightened Journey (Branch)","","","",""),
    WILLOW_SEEDLING("Willow seedling","Tree",25,1456.5,0,7,40,30,1,"Apples(5) x 1","","Source of willow logs","Weaving a Basket on a loom (Branch)","Quest item - Enlightened Journey (Branch)","","","",""),
    WILLOW_SAPLING("Willow sapling","Tree",25,1456.5,0,7,40,30,1,"Apples(5) x 1","","Source of willow logs","Weaving a Basket on a loom (Branch)","Quest item - Enlightened Journey (Branch)","","","",""),
    MAPLE_SEED("Maple seed","Tree",45,3403.4,0,8,40,45,1,"Oranges(5) x 1","","Source of Maple logs","","","","","",""),
    MAPLE_SEEDLING("Maple seedling","Tree",45,3403.4,0,8,40,45,1,"Oranges(5) x 1","","Source of Maple logs","","","","","",""),
    MAPLE_SAPLING("Maple sapling","Tree",45,3403.4,0,8,40,45,1,"Oranges(5) x 1","","Source of Maple logs","","","","","",""),
    YEW_SEED("Yew seed","Tree",81,7069.9,0,10,40,60,1,"Cactus Spine x 10","","Source of Yew logs","Antipoison+ ingredient (Roots)","","","","",""),
    YEW_SEEDLING("Yew seedling","Tree",81,7069.9,0,10,40,60,1,"Cactus Spine x 10","","Source of Yew logs","Antipoison+ ingredient (Roots)","","","","",""),
    YEW_SAPLING("Yew sapling","Tree",81,7069.9,0,10,40,60,1,"Cactus Spine x 10","","Source of Yew logs","Antipoison+ ingredient (Roots)","","","","",""),
    MAGIC_SEED("Magic seed","Tree",145.5,13768.3,0,12,40,75,1,"Coconut x 25","","Source of Magic logs","Making magic string (Roots)","Antipoison++ ingredient (Roots)","","","",""),
    MAGIC_SEEDLING("Magic seedling","Tree",145.5,13768.3,0,12,40,75,1,"Coconut x 25","","Source of Magic logs","Making magic string (Roots)","Antipoison++ ingredient (Roots)","","","",""),
    MAGIC_SAPLING("Magic sapling","Tree",145.5,13768.3,0,12,40,75,1,"Coconut x 25","","Source of Magic logs","Making magic string (Roots)","Antipoison++ ingredient (Roots)","","","",""),
    APPLE_TREE_SEED("Apple tree seed","Fruit Tree",22,1199.5,0,6,160,27,1,"Sweetcorn x 9","","Cooking ingredient","Payment to protect strawberry plants","Payment to protect willow trees","Payment to protect banana trees","","",""),
    APPLE_SEEDLING("Apple seedling","Fruit Tree",22,1199.5,0,6,160,27,1,"Sweetcorn x 9","","Cooking ingredient","Payment to protect strawberry plants","Payment to protect willow trees","Payment to protect banana trees","","",""),
    APPLE_SAPLING("Apple sapling","Fruit Tree",22,1199.5,0,6,160,27,1,"Sweetcorn x 9","","Cooking ingredient","Payment to protect strawberry plants","Payment to protect willow trees","Payment to protect banana trees","","",""),
    BANANA_TREE_SEED("Banana tree seed","Fruit Tree",28,1750.5,0,6,160,33,1,"Apples(5) x 4","","Cooking ingredient","Ape Atoll Teleport","Payment to protect curry trees","","","",""),
    BANANA_SEEDLING("Banana seedling","Fruit Tree",28,1750.5,0,6,160,33,1,"Apples(5) x 4","","Cooking ingredient","Ape Atoll Teleport","Payment to protect curry trees","","","",""),
    BANANA_SAPLING("Banana sapling","Fruit Tree",28,1750.5,0,6,160,33,1,"Apples(5) x 4","","Cooking ingredient","Ape Atoll Teleport","Payment to protect curry trees","","","",""),
    ORANGE_TREE_SEED("Orange tree seed","Fruit Tree",35.5,2470.2,0,6,160,39,1,"Strawberries(5) x 3","","Cooking ingredient","Payment to protect maple trees","","","","",""),
    ORANGE_SEEDLING("Orange seedling","Fruit Tree",35.5,2470.2,0,6,160,39,1,"Strawberries(5) x 3","","Cooking ingredient","Payment to protect maple trees","","","","",""),
    ORANGE_SAPLING("Orange sapling","Fruit Tree",35.5,2470.2,0,6,160,39,1,"Strawberries(5) x 3","","Cooking ingredient","Payment to protect maple trees","","","","",""),
    CURRY_TREE_SEED("Curry tree seed","Fruit Tree",40,2906.9,0,6,160,42,1,"Bananas(5) x 5","","Curry ingredient","Payment to protect watermelons","","","","",""),
    CURRY_SEEDLING("Curry seedling","Fruit Tree",40,2906.9,0,6,160,42,1,"Bananas(5) x 5","","Curry ingredient","Payment to protect watermelons","","","","",""),
    CURRY_SAPLING("Curry sapling","Fruit Tree",40,2906.9,0,6,160,42,1,"Bananas(5) x 5","","Curry ingredient","Payment to protect watermelons","","","","",""),
    PINEAPPLE_SEED("Pineapple seed","Fruit Tree",57,4605.7,0,6,160,51,1,"Watermelon x 10","","Cooking ingredient","Payment to protect papaya trees","Supercompost for Ironmen","","","",""),
    PINEAPPLE_SEEDLING("Pineapple seedling","Fruit Tree",57,4605.7,0,6,160,51,1,"Watermelon x 10","","Cooking ingredient","Payment to protect papaya trees","Supercompost for Ironmen","","","",""),
    PINEAPPLE_SAPLING("Pineapple sapling","Fruit Tree",57,4605.7,0,6,160,51,1,"Watermelon x 10","","Cooking ingredient","Payment to protect papaya trees","Supercompost for Ironmen","","","",""),
    PAPAYA_TREE_SEED("Papaya tree seed","Fruit Tree",72,6146.4,0,6,160,57,1,"Pineapple x 10","","Payment Method for Palm Tree","Restores Run Energy","","","","",""),
    PAPAYA_SEEDLING("Papaya seedling","Fruit Tree",72,6146.4,0,6,160,57,1,"Pineapple x 10","","Payment Method for Palm Tree","Restores Run Energy","","","","",""),
    PAPAYA_SAPLING("Papaya sapling","Fruit Tree",72,6146.4,0,6,160,57,1,"Pineapple x 10","","Payment Method for Palm Tree","Restores Run Energy","","","","",""),
    PALM_TREE_SEED("Palm tree seed","Fruit Tree",110.5,10150.1,0,6,160,68,1,"Papaya fruit x 15","","Used for making Coconut milk and Coconut shell","Payment to protect dragonfruit and magic trees","","","","",""),
    PALM_SEEDLING("Palm seedling","Fruit Tree",110.5,10150.1,0,6,160,68,1,"Papaya fruit x 15","","Used for making Coconut milk and Coconut shell","Payment to protect dragonfruit and magic trees","","","","",""),
    PALM_SAPLING("Palm sapling","Fruit Tree",110.5,10150.1,0,6,160,68,1,"Papaya fruit x 15","","Used for making Coconut milk and Coconut shell","Payment to protect dragonfruit and magic trees","","","","",""),
    DRAGONFRUIT_TREE_SEED("Dragonfruit tree seed","Fruit Tree",140,17335,0,6,160,81,1,"Coconut x 15","","They are an ingredient in dragonfruit pie","Used to create bottled dragonbreath","Redwood tree protection","","","",""),
    DRAGONFRUIT_SEEDLING("Dragonfruit seedling","Fruit Tree",140,17335,0,6,160,81,1,"Coconut x 15","","They are an ingredient in dragonfruit pie","Used to create bottled dragonbreath","Redwood tree protection","","","",""),
    DRAGONFRUIT_SAPLING("Dragonfruit sapling","Fruit Tree",140,17335,0,6,160,81,1,"Coconut x 15","","They are an ingredient in dragonfruit pie","Used to create bottled dragonbreath","Redwood tree protection","","","",""),
    SEAWEED_SPORE("Seaweed spore","Seaweed",19,0,21,4,10,23,1,"Numulite x 200","","Used to make soda ash for molten glass","","","","","",""),
    GRAPE_SEED("Grape seed","Vine",31.5,625,40,7,5,36,1,"","","Cooking ingredient","","","","","",""),
    MUSHROOM_SPORE("Mushroom spore","Mushroom",61.5,0,57.7,6,40,53,1,"","","Cooking ingredient","","","","","",""),
    BELLADONNA_SEED("Belladonna seed","Belladonna",91,0,512,4,80,63,1,"","","Weapon poison++ ingredient","","","","","",""),
    HESPORI_SEED("Hespori seed","Hespori",62,0,12600,3,640,65,1,"","","Spawns Hespori","","","","","",""),
    KRONOS_SEED("Kronos seed","Anima",100,0,0,8,640,76,1,"","","Provides a chance for farming patches to skip a growth stage.","","","","","",""),
    IASOR_SEED("Iasor seed","Anima",100,0,0,8,640,76,1,"","","Decreases the chance of farming patches becoming diseased.","","","","","",""),
    ATTAS_SEED("Attas seed","Anima",100,0,0,8,640,76,1,"","","Increases the yield of farming patches.","","","","","",""),
    TEAK_SEED("Teak seed","Hardwood",35,7290,0,7,640,35,1,"Limpwurt root x 15","","Source of teak logs","","","","","",""),
    TEAK_SEEDLING("Teak seedling","Hardwood",35,7290,0,7,640,35,1,"Limpwurt root x 15","","Source of teak logs","","","","","",""),
    TEAK_SAPLING("Teak sapling","Hardwood",35,7290,0,7,640,35,1,"Limpwurt root x 15","","Source of teak logs","","","","","",""),
    MAHOGANY_SEED("Mahogany seed","Hardwood",63,15720,0,8,640,55,1,"Yanillian hops x 25","","Source of mahogany logs","","","","","",""),
    MAHOGANY_SEEDLING("Mahogany seedling","Hardwood",63,15720,0,8,640,55,1,"Yanillian hops x 25","","Source of mahogany logs","","","","","",""),
    MAHOGANY_SAPLING("Mahogany sapling","Hardwood",63,15720,0,8,640,55,1,"Yanillian hops x 25","","Source of mahogany logs","","","","","",""),
    CALQUAT_TREE_SEED("Calquat tree seed","Calquat",129.5,12096,0,8,160,72,1,"Poison ivy berries x 8","","Making Calquat kegs","Damaging Broodoo victims","","","","",""),
    CALQUAT_SEEDLING("Calquat seedling","Calquat",129.5,12096,0,8,160,72,1,"Poison ivy berries x 8","","Making Calquat kegs","Damaging Broodoo victims","","","","",""),
    CALQUAT_SAPLING("Calquat sapling","Calquat",129.5,12096,0,8,160,72,1,"Poison ivy berries x 8","","Making Calquat kegs","Damaging Broodoo victims","","","","",""),
    CRYSTAL_ACORN("Crystal acorn","Crystal",126,13240,0,6,80,74,1,"Immune to Disease","","Source of Crystal shards","","","","","",""),
    CRYSTAL_SEEDLING("Crystal seedling","Crystal",126,13240,0,6,80,74,1,"Immune to Disease","","Source of Crystal shards","","","","","",""),
    CRYSTAL_SAPLING("Crystal sapling","Crystal",126,13240,0,6,80,74,1,"Immune to Disease","","Source of Crystal shards","","","","","",""),
    SPIRIT_SEED("Spirit seed","Spirit",199.5,19301.8,0,12,320,83,1,"Monkey nuts x 5, Monkey bar x 1, and Ground tooth x 1","","Spirit tree network","","","","","",""),
    SPIRIT_SEEDLING("Spirit seedling","Spirit",199.5,19301.8,0,12,320,83,1,"Monkey nuts x 5, Monkey bar x 1, and Ground tooth x 1","","Spirit tree network","","","","","",""),
    SPIRIT_SAPLING("Spirit sapling","Spirit",199.5,19301.8,0,12,320,83,1,"Monkey nuts x 5, Monkey bar x 1, and Ground tooth x 1","","Spirit tree network","","","","","",""),
    CELASTRUS_SEED("Celastrus seed","Celastrus",204,14130,0,5,160,85,1,"Potato cactus x 8","","Can be fletched into a battlestaff","","","","","",""),
    CELASTRUS_SEEDLING("Celastrus seedling","Celastrus",204,14130,0,5,160,85,1,"Potato cactus x 8","","Can be fletched into a battlestaff","","","","","",""),
    CELASTRUS_SAPLING("Celastrus sapling","Celastrus",204,14130,0,5,160,85,1,"Potato cactus x 8","","Can be fletched into a battlestaff","","","","","",""),
    REDWOOD_TREE_SEED("Redwood tree seed","Redwood",230,22450,0,10,640,90,1,"Dragonfruit x 6","","Source of redwood logs","","","","","",""),
    REDWOOD_SEEDLING("Redwood seedling","Redwood",230,22450,0,10,640,90,1,"Dragonfruit x 6","","Source of redwood logs","","","","","",""),
    REDWOOD_SAPLING("Redwood sapling","Redwood",230,22450,0,10,640,90,1,"Dragonfruit x 6","","Source of redwood logs","","","","","",""),
    CACTUS_SEED("Cactus seed","Cactus",66.5,374,25,7,80,55,1,"Cadava berries x 6","","Weapon poison+ ingredient","Payment to protect yew tree (10)","","","","",""),
    POTATO_CACTUS_SEED("Potato cactus seed","Cactus",68,230,68,7,10,64,1,"Snape grass x 8","","Magic potion ingredient","Payment to protect Celastrus tree (8)","","","","",""),;

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
    double plantXP;
    double checkXP;
    double harvestXP;
    int growthTicks;
    int growthTime;
    int level;
    int requiredAmount;
    String protectionPayment;
    String protectionFlowers;
    List<String> uses = new ArrayList<>();

    Seed(String name, String type, double plantXP, double checkXP, double harvestXP, int growthTicks, int growthTime, int level, int requiredAmount, String protectionPayment, String protectionFlowers, String... uses) {
        this.name = name;
        this.type = type;

        this.plantXP = plantXP;
        this.checkXP = checkXP;
        this.harvestXP = harvestXP;
        this.growthTicks = growthTicks;
        this.growthTime = growthTime;
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
        StringBuilder msg = new StringBuilder();

        boolean isFirstLine = true;

        if (config.showItemName()) {
            msg.append(ColorUtil.wrapWithColorTag(name + " ", config.itemNameColor()));
            isFirstLine = false;
        }

        if (config.showLevelRequirement()) {
            msg.append("(").append(getLevelDisplay(config, client)).append(")");
            isFirstLine = false;
        }

        if (config.showSeedType()) {
            isFirstLine = insertLineBreak(msg, isFirstLine);
            msg.append("Type: ").append(type);
        }

        if (config.showSeedsPerPatch()) {
            isFirstLine = insertLineBreak(msg, isFirstLine);
            msg.append("Seeds Per Patch: ").append(getRequiredAmountDisplay(config, itemAmount));
        }

        if (config.showGrowthTime()) {
            isFirstLine = insertLineBreak(msg, isFirstLine);
            msg.append(formatGrowthTime(config, growthTicks, growthTime));
        }

        if (config.showProtectionPayment() && protectionPayment.length() > 0) {
            isFirstLine = insertLineBreak(msg, isFirstLine);
            msg.append("Protection Payment: ").append(protectionPayment);
        }

        if (config.showProtectionFlowers() && protectionFlowers.length() > 0) {
            isFirstLine = insertLineBreak(msg, isFirstLine);
            msg.append("Protection Flowers: ").append(protectionFlowers);
        }

        if (config.showUses()) {
            isFirstLine = insertLineBreak(msg, isFirstLine);
            msg.append("Uses: ");
            for (String use : uses) {
                msg.append("</br>- ").append(use);
            }
        }

        DecimalFormat experienceFormat = new DecimalFormat("#,###.#");

        if (config.showPlantXP() && plantXP > 0) {
            isFirstLine = insertLineBreak(msg, isFirstLine);
            msg.append("Plant XP: ").append(experienceFormat.format(plantXP));
        }

        if (config.showCheckHealthXP() && checkXP > 0) {
            isFirstLine = insertLineBreak(msg, isFirstLine);
            msg.append("Check Health XP: ").append(experienceFormat.format(checkXP));
        }

        if (config.showHarvestXP() && harvestXP > 0) {
            isFirstLine = insertLineBreak(msg, isFirstLine);
            msg.append("Harvest XP: ").append(experienceFormat.format(harvestXP));
        }

        return msg.toString();
    }

    private boolean insertLineBreak(StringBuilder msg, boolean isFirstLine) {
        if (!isFirstLine) {
            msg.append("</br>");
        }
        return false;
    }

    /**
     * Converts the growth tick and growth time into the displayed message
     */
    private String formatGrowthTime(GreenThumbConfig config, int growthTicks, int growthTime) {
        String growthTimeText = "Growth Time: ";

        int minutes = growthTicks * growthTime;
        int hours = minutes / 60;

        if (hours >= 1) {
            growthTimeText += hours + " hour" + (hours > 1 ? "s" : "");
        }

        int leftoverMinutes = minutes - ((int) Math.floor(hours) * 60);

        growthTimeText += " " + leftoverMinutes + " minutes";

        if (config.showGrowthCycles()) {
            growthTimeText += " (" + growthTicks + " x " + growthTime + ")";
        }

        return growthTimeText;
    }
}

