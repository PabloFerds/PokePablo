package com.pokepablo.factory;

import com.pokepablo.enums.PokemonType;

public enum PokemonData {

    BULBASAUR(1, "Bulbasaur", PokemonType.GRASS, 1, 100, 49, 49),
    IVYSAUR(2, "Ivysaur", PokemonType.GRASS, 16, 140, 62, 63),
    VENUSAUR(3, "Venusaur", PokemonType.GRASS, 32, 180, 82, 83),

    CHARMANDER(4, "Charmander", PokemonType.FIRE, 1, 95, 52, 43),
    CHARMELEON(5, "Charmeleon", PokemonType.FIRE, 16, 140, 64, 58),
    CHARIZARD(6, "Charizard", PokemonType.FIRE, 36, 200, 84, 78),

    SQUIRTLE(7, "Squirtle", PokemonType.WATER, 1, 105, 48, 65),
    WARTORTLE(8, "Wartortle", PokemonType.WATER, 16, 150, 63, 80),
    BLASTOISE(9, "Blastoise", PokemonType.WATER, 36, 220, 83, 100),

    CATERPIE(10, "Caterpie", PokemonType.BUG, 3, 60, 30, 35),
    METAPOD(11, "Metapod", PokemonType.BUG, 7, 80, 20, 55),
    BUTTERFREE(12, "Butterfree", PokemonType.BUG, 10, 120, 45, 50),

    WEEDLE(13, "Weedle", PokemonType.BUG, 3, 60, 35, 30),
    KAKUNA(14, "Kakuna", PokemonType.BUG, 7, 80, 25, 50),
    BEEDRILL(15, "Beedrill", PokemonType.BUG, 10, 130, 90, 40),

    PIDGEY(16, "Pidgey", PokemonType.FLYING, 4, 80, 45, 40),
    PIDGEOTTO(17, "Pidgeotto", PokemonType.FLYING, 18, 130, 60, 55),
    PIDGEOT(18, "Pidgeot", PokemonType.FLYING, 36, 180, 80, 75),

    RATTATA(19, "Rattata", PokemonType.NORMAL, 4, 75, 56, 35),
    RATICATE(20, "Raticate", PokemonType.NORMAL, 20, 140, 81, 60),

    SPEAROW(21, "Spearow", PokemonType.FLYING, 5, 80, 60, 30),
    FEAROW(22, "Fearow", PokemonType.FLYING, 20, 160, 90, 65),

    EKANS(23, "Ekans", PokemonType.POISON, 6, 90, 60, 44),
    ARBOK(24, "Arbok", PokemonType.POISON, 22, 170, 95, 69),

    PIKACHU(25, "Pikachu", PokemonType.ELECTRIC, 5, 100, 55, 30),
    RAICHU(26, "Raichu", PokemonType.ELECTRIC, 22, 170, 90, 55),

    SANDSHREW(27, "Sandshrew", PokemonType.GROUND, 6, 100, 75, 85),
    SANDSLASH(28, "Sandslash", PokemonType.GROUND, 22, 190, 100, 110),

    NIDORAN_F(29, "Nidoran F", PokemonType.POISON, 5, 90, 47, 52),
    NIDORINA(30, "Nidorina", PokemonType.POISON, 16, 140, 62, 67),
    NIDOQUEEN(31, "Nidoqueen", PokemonType.POISON, 36, 210, 92, 87),

    NIDORAN_M(32, "Nidoran M", PokemonType.POISON, 5, 90, 57, 40),
    NIDORINO(33, "Nidorino", PokemonType.POISON, 16, 140, 72, 57),
    NIDOKING(34, "Nidoking", PokemonType.POISON, 36, 210, 102, 77),

    CLEFAIRY(35, "Clefairy", PokemonType.NORMAL, 8, 140, 45, 48),
    CLEFABLE(36, "Clefable", PokemonType.NORMAL, 28, 220, 70, 73),

    VULPIX(37, "Vulpix", PokemonType.FIRE, 8, 100, 41, 40),
    NINETALES(38, "Ninetales", PokemonType.FIRE, 28, 180, 76, 75),

    JIGGLYPUFF(39, "Jigglypuff", PokemonType.NORMAL, 8, 180, 45, 20),
    WIGGLYTUFF(40, "Wigglytuff", PokemonType.NORMAL, 28, 260, 70, 45),

    ZUBAT(41, "Zubat", PokemonType.FLYING, 6, 80, 45, 35),
    GOLBAT(42, "Golbat", PokemonType.FLYING, 22, 170, 80, 70),

    ODDISH(43, "Oddish", PokemonType.GRASS, 6, 90, 50, 55),
    GLOOM(44, "Gloom", PokemonType.GRASS, 21, 140, 65, 70),
    VILEPLUME(45, "Vileplume", PokemonType.GRASS, 36, 190, 80, 85),

    PARAS(46, "Paras", PokemonType.BUG, 7, 85, 70, 55),
    PARASECT(47, "Parasect", PokemonType.BUG, 24, 170, 95, 80),

    VENONAT(48, "Venonat", PokemonType.BUG, 8, 100, 55, 50),
    VENOMOTH(49, "Venomoth", PokemonType.BUG, 31, 180, 65, 60),

    DIGLETT(50, "Diglett", PokemonType.GROUND, 6, 60, 55, 25),
    DUGTRIO(51, "Dugtrio", PokemonType.GROUND, 26, 140, 100, 50),

    MEOWTH(52, "Meowth", PokemonType.NORMAL, 8, 85, 45, 35),
    PERSIAN(53, "Persian", PokemonType.NORMAL, 28, 170, 70, 60),

    PSYDUCK(54, "Psyduck", PokemonType.WATER, 8, 100, 52, 48),
    GOLDUCK(55, "Golduck", PokemonType.WATER, 33, 190, 82, 78),

    MANKEY(56, "Mankey", PokemonType.FIGHTING, 7, 90, 80, 35),
    PRIMEAPE(57, "Primeape", PokemonType.FIGHTING, 28, 180, 105, 60),

    GROWLITHE(58, "Growlithe", PokemonType.FIRE, 10, 110, 70, 45),
    ARCANINE(59, "Arcanine", PokemonType.FIRE, 36, 240, 110, 80),

    POLIWAG(60, "Poliwag", PokemonType.WATER, 8, 90, 50, 40),
    POLIWHIRL(61, "Poliwhirl", PokemonType.WATER, 25, 160, 65, 65),
    POLIWRATH(62, "Poliwrath", PokemonType.WATER, 40, 230, 95, 95),

    ABRA(63, "Abra", PokemonType.PSYCHIC, 8, 70, 20, 15),
    KADABRA(64, "Kadabra", PokemonType.PSYCHIC, 16, 120, 35, 30),
    ALAKAZAM(65, "Alakazam", PokemonType.PSYCHIC, 36, 170, 50, 45),

    MACHOP(66, "Machop", PokemonType.FIGHTING, 10, 120, 80, 50),
    MACHOKE(67, "Machoke", PokemonType.FIGHTING, 28, 190, 100, 70),
    MACHAMP(68, "Machamp", PokemonType.FIGHTING, 40, 260, 130, 80),

    BELLSPROUT(69, "Bellsprout", PokemonType.GRASS, 10, 90, 75, 35),
    WEEPINBELL(70, "Weepinbell", PokemonType.GRASS, 21, 150, 90, 50),
    VICTREEBEL(71, "Victreebel", PokemonType.GRASS, 36, 210, 105, 65),

    TENTACOOL(72, "Tentacool", PokemonType.WATER, 10, 90, 40, 35),
    TENTACRUEL(73, "Tentacruel", PokemonType.WATER, 30, 190, 70, 65),

    GEODUDE(74, "Geodude", PokemonType.ROCK, 10, 110, 80, 100),
    GRAVELER(75, "Graveler", PokemonType.ROCK, 25, 180, 95, 115),
    GOLEM(76, "Golem", PokemonType.ROCK, 40, 250, 120, 130),

    PONYTA(77, "Ponyta", PokemonType.FIRE, 12, 100, 85, 55),
    RAPIDASH(78, "Rapidash", PokemonType.FIRE, 40, 190, 100, 70),

    SLOWPOKE(79, "Slowpoke", PokemonType.WATER, 12, 160, 65, 65),
    SLOWBRO(80, "Slowbro", PokemonType.WATER, 37, 260, 75, 110),

    MAGNEMITE(81, "Magnemite", PokemonType.ELECTRIC, 10, 90, 35, 70),
    MAGNETON(82, "Magneton", PokemonType.ELECTRIC, 30, 180, 60, 95),

    FARFETCHD(83, "Farfetch'd", PokemonType.FLYING, 20, 150, 90, 55),

    DODUO(84, "Doduo", PokemonType.FLYING, 10, 100, 85, 45),
    DODRIO(85, "Dodrio", PokemonType.FLYING, 31, 200, 110, 70),

    SEEL(86, "Seel", PokemonType.WATER, 12, 120, 45, 55),
    DEWGONG(87, "Dewgong", PokemonType.ICE, 34, 220, 70, 80),

    GRIMER(88, "Grimer", PokemonType.POISON, 15, 160, 80, 50),
    MUK(89, "Muk", PokemonType.POISON, 38, 260, 105, 75),

    SHELLDER(90, "Shellder", PokemonType.WATER, 12, 70, 65, 100),
    CLOYSTER(91, "Cloyster", PokemonType.ICE, 36, 160, 95, 180),

    GASTLY(92, "Gastly", PokemonType.GHOST, 12, 80, 35, 30),
    HAUNTER(93, "Haunter", PokemonType.GHOST, 25, 140, 50, 45),
    GENGAR(94, "Gengar", PokemonType.GHOST, 40, 220, 65, 60),

    ONIX(95, "Onix", PokemonType.ROCK, 20, 120, 45, 160),

    DROWZEE(96, "Drowzee", PokemonType.PSYCHIC, 12, 120, 48, 45),
    HYPNO(97, "Hypno", PokemonType.PSYCHIC, 32, 220, 73, 70),

    KRABBY(98, "Krabby", PokemonType.WATER, 12, 90, 105, 90),
    KINGLER(99, "Kingler", PokemonType.WATER, 28, 170, 130, 115),

    VOLTORB(100, "Voltorb", PokemonType.ELECTRIC, 14, 80, 30, 50),
    ELECTRODE(101, "Electrode", PokemonType.ELECTRIC, 30, 160, 50, 70),

    EXEGGCUTE(102, "Exeggcute", PokemonType.GRASS, 14, 120, 40, 80),
    EXEGGUTOR(103, "Exeggutor", PokemonType.GRASS, 38, 240, 95, 85),

    CUBONE(104, "Cubone", PokemonType.GROUND, 14, 100, 50, 95),
    MAROWAK(105, "Marowak", PokemonType.GROUND, 28, 190, 80, 110),

    HITMONLEE(106, "Hitmonlee", PokemonType.FIGHTING, 30, 170, 120, 55),
    HITMONCHAN(107, "Hitmonchan", PokemonType.FIGHTING, 30, 180, 105, 79),

    LICKITUNG(108, "Lickitung", PokemonType.NORMAL, 25, 220, 55, 75),

    KOFFING(109, "Koffing", PokemonType.POISON, 15, 120, 65, 95),
    WEEZING(110, "Weezing", PokemonType.POISON, 35, 220, 90, 120),

    RHYHORN(111, "Rhyhorn", PokemonType.ROCK, 18, 160, 85, 95),
    RHYDON(112, "Rhydon", PokemonType.ROCK, 42, 260, 130, 120),

    CHANSEY(113, "Chansey", PokemonType.NORMAL, 30, 400, 5, 5),

    TANGELA(114, "Tangela", PokemonType.GRASS, 22, 150, 55, 115),

    KANGASKHAN(115, "Kangaskhan", PokemonType.NORMAL, 28, 260, 95, 80),

    HORSEA(116, "Horsea", PokemonType.WATER, 15, 90, 40, 70),
    SEADRA(117, "Seadra", PokemonType.WATER, 32, 180, 65, 95),

    GOLDEEN(118, "Goldeen", PokemonType.WATER, 12, 100, 67, 60),
    SEAKING(119, "Seaking", PokemonType.WATER, 30, 190, 92, 65),

    STARYU(120, "Staryu", PokemonType.WATER, 15, 90, 45, 55),
    STARMIE(121, "Starmie", PokemonType.WATER, 38, 190, 75, 85),

    MR_MIME(122, "Mr Mime", PokemonType.PSYCHIC, 30, 160, 45, 65),

    SCYTHER(123, "Scyther", PokemonType.BUG, 30, 180, 110, 80),

    JYNX(124, "Jynx", PokemonType.ICE, 30, 170, 50, 35),

    ELECTABUZZ(125, "Electabuzz", PokemonType.ELECTRIC, 32, 180, 83, 57),

    MAGMAR(126, "Magmar", PokemonType.FIRE, 32, 180, 95, 57),

    PINSIR(127, "Pinsir", PokemonType.BUG, 35, 200, 125, 100),

    TAUROS(128, "Tauros", PokemonType.NORMAL, 35, 210, 100, 95),

    MAGIKARP(129, "Magikarp", PokemonType.WATER, 5, 50, 10, 55),
    GYARADOS(130, "Gyarados", PokemonType.WATER, 20, 260, 125, 79),

    LAPRAS(131, "Lapras", PokemonType.ICE, 35, 280, 85, 80),

    DITTO(132, "Ditto", PokemonType.NORMAL, 25, 140, 48, 48),

    EEVEE(133, "Eevee", PokemonType.NORMAL, 12, 110, 55, 50),
    VAPOREON(134, "Vaporeon", PokemonType.WATER, 36, 280, 65, 60),
    JOLTEON(135, "Jolteon", PokemonType.ELECTRIC, 36, 180, 65, 60),
    FLAREON(136, "Flareon", PokemonType.FIRE, 36, 200, 130, 60),

    PORYGON(137, "Porygon", PokemonType.NORMAL, 28, 160, 60, 70),

    OMANYTE(138, "Omanyte", PokemonType.ROCK, 20, 110, 40, 100),
    OMASTAR(139, "Omastar", PokemonType.ROCK, 40, 220, 60, 125),

    KABUTO(140, "Kabuto", PokemonType.ROCK, 20, 100, 80, 90),
    KABUTOPS(141, "Kabutops", PokemonType.ROCK, 40, 210, 115, 105),

    AERODACTYL(142, "Aerodactyl", PokemonType.ROCK, 40, 220, 105, 65),

    SNORLAX(143, "Snorlax", PokemonType.NORMAL, 35, 320, 110, 65),

    ARTICUNO(144, "Articuno", PokemonType.ICE, 50, 300, 85, 100),
    ZAPDOS(145, "Zapdos", PokemonType.ELECTRIC, 50, 300, 90, 85),
    MOLTRES(146, "Moltres", PokemonType.FIRE, 50, 300, 100, 90),

    DRATINI(147, "Dratini", PokemonType.DRAGON, 20, 120, 64, 45),
    DRAGONAIR(148, "Dragonair", PokemonType.DRAGON, 35, 220, 84, 65),
    DRAGONITE(149, "Dragonite", PokemonType.DRAGON, 55, 320, 134, 95),

    MEWTWO(150, "Mewtwo", PokemonType.PSYCHIC, 70, 400, 154, 90);

    private final int id;
    private final String name;
    private final PokemonType type;
    private final int level;
    private final int maxHp;
    private final int attack;
    private final int defense;

    PokemonData(int id,
                String name,
                PokemonType type,
                int level,
                int maxHp,
                int attack,
                int defense) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.level = level;
        this.maxHp = maxHp;
        this.attack = attack;
        this.defense = defense;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PokemonType getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}

