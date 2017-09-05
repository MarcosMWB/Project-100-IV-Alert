import java.lang.Math.pow
import java.lang.Math.toIntExact

fun main(args : Array<String>) {

    var atk: Double? = 0.0
    var def: Double? = 0.0
    var hp: Double? = 0.0

        print("nome do pokemon:")

        var (pkm: String) = readLine()!!.split(delimiters = ' ')

        do{ //repetição para ajudar no tst cp == 0 sai do loop

        print("CP do pokemon:")

        var CP: Int = readLine()!!.toInt()

        if (pkm == "Bulbasaur") {
            atk = 118.0 + 15.0
            def = 118.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Ivysaur") {
            atk = 151.0 + 15.0
            def = 151.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Venusaur") {
            atk = 198.0 + 15.0
            def = 198.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Charmander") {
            atk = 116.0 + 15.0
            def = 96.0 + 15.0
            hp = 78.0 + 15.0
        }

        if (pkm == "Charmeleon") {
            atk = 158.0 + 15.0
            def = 129.0 + 15.0
            hp = 116.0 + 15.0
        }

        if (pkm == "Charizard") {
            atk = 223.0 + 15.0
            def = 176.0 + 15.0
            hp = 156.0 + 15.0
        }

        if (pkm == "Squirtle") {
            atk = 94.0 + 15.0
            def = 122.0 + 15.0
            hp = 88.0 + 15.0
        }

        if (pkm == "Wartortle") {
            atk = 126.0 + 15.0
            def = 155.0 + 15.0
            hp = 118.0 + 15.0
        }

        if (pkm == "Blastoise") {
            atk = 171.0 + 15.0
            def = 210.0 + 15.0
            hp = 158.0 + 15.0
        }

        if (pkm == "caterpie") {
            atk = 55.0 + 15.0
            def = 62.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Metapod") {
            atk = 45.0 + 15.0
            def = 94.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Butterfree") {
            atk = 167.0 + 15.0
            def = 151.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Weedle") {
            atk = 63.0 + 15.0
            def = 55.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Kakuna") {
            atk = 46.0 + 15.0
            def = 86.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Beedrill") {
            atk = 169.0 + 15.0
            def = 150.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Pidgey") {
            atk = 85.0 + 15.0
            def = 76.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Pidgeotto") {
            atk = 117.0 + 15.0
            def = 108.0 + 15.0
            hp = 126.0 + 15.0
        }

        if (pkm == "Pidgeot") {
            atk = 166.0 + 15.0
            def = 157.0 + 15.0
            hp = 166.0 + 15.0
        }

        if (pkm == "Rattata") {
            atk = 103.0 + 15.0
            def = 70.0 + 15.0
            hp = 60.0 + 15.0
        }

        if (pkm == "Raticate") {
            atk = 161.0 + 15.0
            def = 144.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Spearow") {
            atk = 112.0 + 15.0
            def = 61.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Fearow") {
            atk = 182.0 + 15.0
            def = 135.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Ekans") {
            atk = 110.0 + 15.0
            def = 102.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Arbok") {
            atk = 167.0 + 15.0
            def = 158.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Pikachu") {
            atk = 112.0 + 15.0
            def = 101.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Raichu") {
            atk = 193.0 + 15.0
            def = 165.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Sandshrew") {
            atk = 126.0 + 15.0
            def = 145.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Sandslash") {
            atk = 182.0 + 15.0
            def = 202.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "NidoranF") {
            atk = 86.0 + 15.0
            def = 94.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Nidorina") {
            atk = 117.0 + 15.0
            def = 126.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Nidoqueen") {
            atk = 180.0 + 15.0
            def = 174.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "NidoranM") {
            atk = 105.0 + 15.0
            def = 76.0 + 15.0
            hp = 92.0 + 15.0
        }

        if (pkm == "Nidorino") {
            atk = 137.0 + 15.0
            def = 112.0 + 15.0
            hp = 122.0 + 15.0
        }

        if (pkm == "Nidoking") {
            atk = 204.0 + 15.0
            def = 157.0 + 15.0
            hp = 162.0 + 15.0
        }

        if (pkm == "Clefairy") {
            atk = 107.0 + 15.0
            def = 116.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Clefable") {
            atk = 178.0 + 15.0
            def = 171.0 + 15.0
            hp = 190.0 + 15.0
        }

        if (pkm == "Vulpix") {
            atk = 96.0 + 15.0
            def = 122.0 + 15.0
            hp = 76.0 + 15.0
        }

        if (pkm == "Ninetales") {
            atk = 169.0 + 15.0
            def = 204.0 + 15.0
            hp = 146.0 + 15.0
        }

        if (pkm == "Jigglypuff") {
            atk = 80.0 + 15.0
            def = 44.0 + 15.0
            hp = 230.0 + 15.0
        }

        if (pkm == "Wigglytuff") {
            atk = 156.0 + 15.0
            def = 93.0 + 15.0
            hp = 280.0 + 15.0
        }

        if (pkm == "Zubat") {
            atk = 83.0 + 15.0
            def = 76.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Golbat") {
            atk = 161.0 + 15.0
            def = 153.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Oddish") {
            atk = 131.0 + 15.0
            def = 116.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Gloom") {
            atk = 153.0 + 15.0
            def = 139.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Vileplume") {
            atk = 202.0 + 15.0
            def = 170.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Paras") {
            atk = 121.0 + 15.0
            def = 99.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Parasect") {
            atk = 165.0 + 15.0
            def = 146.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Venonat") {
            atk = 100.0 + 15.0
            def = 102.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Venomoth") {
            atk = 179.0 + 15.0
            def = 150.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Diglett") {
            atk = 109.0 + 15.0
            def = 88.0 + 15.0
            hp = 20.0 + 15.0
        }

        if (pkm == "Dugtrio") {
            atk = 167.0 + 15.0
            def = 147.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Meowth") {
            atk = 92.0 + 15.0
            def = 81.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Persian") {
            atk = 150.0 + 15.0
            def = 139.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Psyduck") {
            atk = 122.0 + 15.0
            def = 96.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Golduck") {
            atk = 191.0 + 15.0
            def = 163.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Mankey") {
            atk = 148.0 + 15.0
            def = 87.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Primeape") {
            atk = 207.0 + 15.0
            def = 144.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Growlithe") {
            atk = 136.0 + 15.0
            def = 96.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Arcanine") {
            atk = 227.0 + 15.0
            def = 166.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Poliwag") {
            atk = 101.0 + 15.0
            def = 82.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Poliwhirl") {
            atk = 130.0 + 15.0
            def = 130.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Poliwrath") {
            atk = 182.0 + 15.0
            def = 187.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Abra") {
            atk = 195.0 + 15.0
            def = 103.0 + 15.0
            hp = 50.0 + 15.0
        }

        if (pkm == "Kadabra") {
            atk = 232.0 + 15.0
            def = 138.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Alakazam") {
            atk = 271.0 + 15.0
            def = 194.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Machop") {
            atk = 137.0 + 15.0
            def = 88.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Machoke") {
            atk = 177.0 + 15.0
            def = 130.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Machamp") {
            atk = 234.0 + 15.0
            def = 162.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Bellsprout") {
            atk = 139.0 + 15.0
            def = 64.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Weepinbell") {
            atk = 172.0 + 15.0
            def = 95.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Victreebel") {
            atk = 207.0 + 15.0
            def = 138.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Tentacool") {
            atk = 97.0 + 15.0
            def = 182.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Tentacruel") {
            atk = 166.0 + 15.0
            def = 237.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Geodude") {
            atk = 132.0 + 15.0
            def = 163.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Graveler") {
            atk = 164.0 + 15.0
            def = 196.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Golem") {
            atk = 211.0 + 15.0
            def = 229.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Ponyta") {
            atk = 170.0 + 15.0
            def = 132.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Rapidash") {
            atk = 207.0 + 15.0
            def = 167.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Slowpoke") {
            atk = 109.0 + 15.0
            def = 109.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Slowbro") {
            atk = 177.0 + 15.0
            def = 194.0 + 15.0
            hp = 190.0 + 15.0
        }

        if (pkm == "Magnemite") {
            atk = 165.0 + 15.0
            def = 128.0 + 15.0
            hp = 50.0 + 15.0
        }

        if (pkm == "Magneton") {
            atk = 223.0 + 15.0
            def = 182.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Farfetchd") {
            atk = 124.0 + 15.0
            def = 118.0 + 15.0
            hp = 104.0 + 15.0
        }

        if (pkm == "Doduo") {
            atk = 158.0 + 15.0
            def = 88.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Dodrio") {
            atk = 218.0 + 15.0
            def = 145.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Seel") {
            atk = 85.0 + 15.0
            def = 128.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Dewgong") {
            atk = 139.0 + 15.0
            def = 184.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Grimer") {
            atk = 135.0 + 15.0
            def = 90.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Muk") {
            atk = 190.0 + 15.0
            def = 184.0 + 15.0
            hp = 210.0 + 15.0
        }

        if (pkm == "Shellder") {
            atk = 116.0 + 15.0
            def = 168.0 + 15.0
            hp = 60.0 + 15.0
        }

        if (pkm == "Cloyster") {
            atk = 186.0 + 15.0
            def = 323.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Gastly") {
            atk = 186.0 + 15.0
            def = 70.0 + 15.0
            hp = 60.0 + 15.0
        }

        if (pkm == "Haunter") {
            atk = 223.0 + 15.0
            def = 112.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Gengar") {
            atk = 261.0 + 15.0
            def = 156.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Onix") {
            atk = 85.0 + 15.0
            def = 288.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Drowzee") {
            atk = 89.0 + 15.0
            def = 158.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Hypno") {
            atk = 144.0 + 15.0
            def = 215.0 + 15.0
            hp = 170.0 + 15.0
        }

        if (pkm == "Krabby") {
            atk = 181.0 + 15.0
            def = 156.0 + 15.0
            hp = 60.0 + 15.0
        }

        if (pkm == "Kingler") {
            atk = 240.0 + 15.0
            def = 214.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Voltorb") {
            atk = 109.0 + 15.0
            def = 114.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Electrode") {
            atk = 173.0 + 15.0
            def = 179.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Exeggcute") {
            atk = 107.0 + 15.0
            def = 140.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Exeggutor") {
            atk = 233.0 + 15.0
            def = 158.0 + 15.0
            hp = 190.0 + 15.0
        }

        if (pkm == "Cubone") {
            atk = 90.0 + 15.0
            def = 165.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Marowak") {
            atk = 144.0 + 15.0
            def = 200.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Hitmonlee") {
            atk = 224.0 + 15.0
            def = 211.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Hitmonchan") {
            atk = 193.0 + 15.0
            def = 212.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Lickitung") {
            atk = 108.0 + 15.0
            def = 137.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Koffing") {
            atk = 119.0 + 15.0
            def = 164.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Weezing") {
            atk = 174.0 + 15.0
            def = 221.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Rhyhorn") {
            atk = 140.0 + 15.0
            def = 157.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Rhydon") {
            atk = 222.0 + 15.0
            def = 206.0 + 15.0
            hp = 210.0 + 15.0
        }

        if (pkm == "Chansey") {
            atk = 60.0 + 15.0
            def = 176.0 + 15.0
            hp = 500.0 + 15.0
        }

        if (pkm == "Tangela") {
            atk = 183.0 + 15.0
            def = 205.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "kangaskhan") {
            atk = 181.0 + 15.0
            def = 165.0 + 15.0
            hp = 210.0 + 15.0
        }

        if (pkm == "Horsea") {
            atk = 129.0 + 15.0
            def = 125.0 + 15.0
            hp = 60.0 + 15.0
        }

        if (pkm == "Seadra") {
            atk = 187.0 + 15.0
            def = 182.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Goldeen") {
            atk = 123.0 + 15.0
            def = 115.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Seaking") {
            atk = 175.0 + 15.0
            def = 154.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Staryu") {
            atk = 137.0 + 15.0
            def = 112.0 + 15.0
            hp = 60.0 + 15.0
        }

        if (pkm == "Starmie") {
            atk = 210.0 + 15.0
            def = 184.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "MR.Mime") {
            atk = 192.0 + 15.0
            def = 233.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Scyther") {
            atk = 218.0 + 15.0
            def = 170.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Jynx") {
            atk = 223.0 + 15.0
            def = 182.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Electabuzz") {
            atk = 198.0 + 15.0
            def = 173.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Magmar") {
            atk = 206.0 + 15.0
            def = 169.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Pinsir") {
            atk = 238.0 + 15.0
            def = 197.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Tauros") {
            atk = 198.0 + 15.0
            def = 197.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Magikarp") {
            atk = 29.0 + 15.0
            def = 102.0 + 15.0
            hp = 40.0 + 15.0
        }

        if (pkm == "Gyarados") {
            atk = 237.0 + 15.0
            def = 197.0 + 15.0
            hp = 190.0 + 15.0
        }

        if (pkm == "Lapras") {
            atk = 165.0 + 15.0
            def = 180.0 + 15.0
            hp = 260.0 + 15.0
        }

        if (pkm == "Ditto") {
            atk = 91.0 + 15.0
            def = 91.0 + 15.0
            hp = 96.0 + 15.0
        }

        if (pkm == "Eevee") {
            atk = 104.0 + 15.0
            def = 121.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Vaporeon") {
            atk = 205.0 + 15.0
            def = 177.0 + 15.0
            hp = 260.0 + 15.0
        }

        if (pkm == "Jolteon") {
            atk = 232.0 + 15.0
            def = 201.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Flareon") {
            atk = 246.0 + 15.0
            def = 204.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Porygon") {
            atk = 153.0 + 15.0
            def = 139.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Omanyte") {
            atk = 155.0 + 15.0
            def = 174.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Omastar") {
            atk = 207.0 + 15.0
            def = 227.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Kabuto") {
            atk = 148.0 + 15.0
            def = 162.0 + 15.0
            hp = 60.0 + 15.0
        }

        if (pkm == "Kabutops") {
            atk = 220.0 + 15.0
            def = 203.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Aerodactyl") {
            atk = 221.0 + 15.0
            def = 164.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Snorlax") {
            atk = 190.0 + 15.0
            def = 190.0 + 15.0
            hp = 320.0 + 15.0
        }

        if (pkm == "Articuno") {
            atk = 192.0 + 15.0
            def = 249.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Zapdos") {
            atk = 253.0 + 15.0
            def = 188.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Moltres") {
            atk = 251.0 + 15.0
            def = 184.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Dratini") {
            atk = 119.0 + 15.0
            def = 94.0 + 15.0
            hp = 82.0 + 15.0
        }

        if (pkm == "Dragonair") {
            atk = 163.0 + 15.0
            def = 138.0 + 15.0
            hp = 122.0 + 15.0
        }

        if (pkm == "Dragonite") {
            atk = 263.0 + 15.0
            def = 201.0 + 15.0
            hp = 182.0 + 15.0
        }

        if (pkm == "Mewtwo") {
            atk = 300.0 + 15.0
            def = 182.0 + 15.0
            hp = 192.0 + 15.0
        }

        if (pkm == "Mew") {
            atk = 210.0 + 15.0
            def = 210.0 + 15.0
            hp = 200.0 + 15.0
        }

        if (pkm == "Chikorita") {
            atk = 92.0 + 15.0
            def = 122.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Bayleef") {
            atk = 122.0 + 15.0
            def = 155.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Meganium") {
            atk = 168.0 + 15.0
            def = 202.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Cyndaquil") {
            atk = 116.0 + 15.0
            def = 96.0 + 15.0
            hp = 78.0 + 15.0
        }

        if (pkm == "Quilava") {
            atk = 158.0 + 15.0
            def = 129.0 + 15.0
            hp = 116.0 + 15.0
        }

        if (pkm == "Typhlosion") {
            atk = 223.0 + 15.0
            def = 176.0 + 15.0
            hp = 156.0 + 15.0
        }

        if (pkm == "Totodile") {
            atk = 117.0 + 15.0
            def = 116.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Croconaw") {
            atk = 150.0 + 15.0
            def = 151.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Feraligatr") {
            atk = 205.0 + 15.0
            def = 197.0 + 15.0
            hp = 170.0 + 15.0
        }

        if (pkm == "Sentret") {
            atk = 79.0 + 15.0
            def = 77.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Furret") {
            atk = 148.0 + 15.0
            def = 130.0 + 15.0
            hp = 170.0 + 15.0
        }

        if (pkm == "Hoothoot") {
            atk = 67.0 + 15.0
            def = 101.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Noctowl") {
            atk = 145.0 + 15.0
            def = 179.0 + 15.0
            hp = 200.0 + 15.0
        }

        if (pkm == "Ledyba") {
            atk = 72.0 + 15.0
            def = 142.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Ledian") {
            atk = 107.0 + 15.0
            def = 209.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Spinarak") {
            atk = 105.0 + 15.0
            def = 73.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Ariados") {
            atk = 161.0 + 15.0
            def = 128.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Crobat") {
            atk = 194.0 + 15.0
            def = 178.0 + 15.0
            hp = 170.0 + 15.0
        }

        if (pkm == "Chinchou") {
            atk = 106.0 + 15.0
            def = 106.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Lanturn") {
            atk = 146.0 + 15.0
            def = 146.0 + 15.0
            hp = 250.0 + 15.0
        }

        if (pkm == "Pichu") {
            atk = 77.0 + 15.0
            def = 63.0 + 15.0
            hp = 40.0 + 15.0
        }

        if (pkm == "Cleffa") {
            atk = 75.0 + 15.0
            def = 91.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Igglybuff") {
            atk = 69.0 + 15.0
            def = 34.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Togepi") {
            atk = 67.0 + 15.0
            def = 116.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Togetic") {
            atk = 139.0 + 15.0
            def = 191.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Natu") {
            atk = 134.0 + 15.0
            def = 89.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Xatu") {
            atk = 192.0 + 15.0
            def = 146.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Mareep") {
            atk = 114.0 + 15.0
            def = 82.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Flaaffy") {
            atk = 145.0 + 15.0
            def = 112.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Ampharos") {
            atk = 211.0 + 15.0
            def = 172.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Bellossom") {
            atk = 169.0 + 15.0
            def = 189.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Marill") {
            atk = 37.0 + 15.0
            def = 93.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Azumarill") {
            atk = 112.0 + 15.0
            def = 152.0 + 15.0
            hp = 200.0 + 15.0
        }

        if (pkm == "Sudowoodo") {
            atk = 167.0 + 15.0
            def = 198.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Politoed") {
            atk = 174.0 + 15.0
            def = 192.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Hoppip") {
            atk = 67.0 + 15.0
            def = 101.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Skiploom") {
            atk = 91.0 + 15.0
            def = 127.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Jumpluff") {
            atk = 118.0 + 15.0
            def = 197.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Aipom") {
            atk = 136.0 + 15.0
            def = 112.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Sunkern") {
            atk = 55.0 + 15.0
            def = 55.0 + 15.0
            hp = 60.0 + 15.0
        }

        if (pkm == "Sunflora") {
            atk = 185.0 + 15.0
            def = 148.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Yanma") {
            atk = 154.0 + 15.0
            def = 94.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Wooper") {
            atk = 75.0 + 15.0
            def = 75.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Quagsire") {
            atk = 152.0 + 15.0
            def = 152.0 + 15.0
            hp = 190.0 + 15.0
        }

        if (pkm == "Espeon") {
            atk = 261.0 + 15.0
            def = 194.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Umbreon") {
            atk = 126.0 + 15.0
            def = 250.0 + 15.0
            hp = 190.0 + 15.0
        }

        if (pkm == "Murkrow") {
            atk = 175.0 + 15.0
            def = 87.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Slowking") {
            atk = 177.0 + 15.0
            def = 194.0 + 15.0
            hp = 190.0 + 15.0
        }

        if (pkm == "Unown") {
            atk = 136.0 + 15.0
            def = 91.0 + 15.0
            hp = 96.0 + 15.0
        }

        if (pkm == "Wobbuffet") {
            atk = 60.0 + 15.0
            def = 106.0 + 15.0
            hp = 380.0 + 15.0
        }

        if (pkm == "Girafarig") {
            atk = 182.0 + 15.0
            def = 133.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Pineco") {
            atk = 108.0 + 15.0
            def = 146.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Forretress") {
            atk = 161.0 + 15.0
            def = 242.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Dunsparce") {
            atk = 131.0 + 15.0
            def = 131.0 + 15.0
            hp = 200.0 + 15.0
        }

        if (pkm == "Gligar") {
            atk = 143.0 + 15.0
            def = 204.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Steelix") {
            atk = 148.0 + 15.0
            def = 333.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Snubbull") {
            atk = 137.0 + 15.0
            def = 89.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Granbull") {
            atk = 212.0 + 15.0
            def = 137.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Quilfish") {
            atk = 184.0 + 15.0
            def = 148.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Scizor") {
            atk = 236.0 + 15.0
            def = 191.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Shuckle") {
            atk = 17.0 + 15.0
            def = 396.0 + 15.0
            hp = 40.0 + 15.0
        }

        if (pkm == "Heracross") {
            atk = 234.0 + 15.0
            def = 189.0 + 15.0
            hp = 160.0 + 15.0
        }

        if (pkm == "Sneasel") {
            atk = 189.0 + 15.0
            def = 157.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Teddiursa") {
            atk = 142.0 + 15.0
            def = 93.0 + 15.0
            hp = 120.0 + 15.0
        }

        if (pkm == "Ursaring") {
            atk = 236.0 + 15.0
            def = 144.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Slugma") {
            atk = 118.0 + 15.0
            def = 71.0 + 15.0
            hp = 80.0 + 15.0
        }

        if (pkm == "Magcargo") {
            atk = 139.0 + 15.0
            def = 209.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Swinub") {
            atk = 90.0 + 15.0
            def = 74.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Piloswine") {
            atk = 181.0 + 15.0
            def = 147.0 + 15.0
            hp = 200.0 + 15.0
        }

        if (pkm == "Corsola") {
            atk = 118.0 + 15.0
            def = 156.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Remoraid") {
            atk = 127.0 + 15.0
            def = 69.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Octillery") {
            atk = 197.0 + 15.0
            def = 141.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Delibird") {
            atk = 128.0 + 15.0
            def = 90.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Mantine") {
            atk = 148.0 + 15.0
            def = 260.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Skarmory") {
            atk = 148.0 + 15.0
            def = 260.0 + 15.0
            hp = 130.0 + 15.0
        }

        if (pkm == "Houndour") {
            atk = 152.0 + 15.0
            def = 93.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Houndoom") {
            atk = 224.0 + 15.0
            def = 159.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Kingdra") {
            atk = 194.0 + 15.0
            def = 194.0 + 15.0
            hp = 150.0 + 15.0
        }

        if (pkm == "Phanpy") {
            atk = 107.0 + 15.0
            def = 107.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Donphan") {
            atk = 214.0 + 15.0
            def = 214.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Porygon2") {
            atk = 198.0 + 15.0
            def = 183.0 + 15.0
            hp = 170.0 + 15.0
        }

        if (pkm == "Stantler") {
            atk = 192.0 + 15.0
            def = 132.0 + 15.0
            hp = 146.0 + 15.0
        }

        if (pkm == "Smeargle") {
            atk = 40.0 + 15.0
            def = 88.0 + 15.0
            hp = 110.0 + 15.0
        }

        if (pkm == "Tyrogue") {
            atk = 64.0 + 15.0
            def = 64.0 + 15.0
            hp = 70.0 + 15.0
        }

        if (pkm == "Hitmontop") {
            atk = 173.0 + 15.0
            def = 214.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Smoochum") {
            atk = 153.0 + 15.0
            def = 116.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Elekid") {
            atk = 135.0 + 15.0
            def = 110.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Magby") {
            atk = 151.0 + 15.0
            def = 108.0 + 15.0
            hp = 90.0 + 15.0
        }

        if (pkm == "Miltank") {
            atk = 157.0 + 15.0
            def = 211.0 + 15.0
            hp = 190.0 + 15.0
        }

        if (pkm == "Blissey") {
            atk = 129.0 + 15.0
            def = 229.0 + 15.0
            hp = 510.0 + 15.0
        }

        if (pkm == "Raikou") {
            atk = 241.0 + 15.0
            def = 210.0 + 15.0
            hp = 180.0 + 15.0
        }

        if (pkm == "Entei") {
            atk = 235.0 + 15.0
            def = 176.0 + 15.0
            hp = 230.0 + 15.0
        }

        if (pkm == "Suicune") {
            atk = 180.0 + 15.0
            def = 235.0 + 15.0
            hp = 200.0 + 15.0
        }

        if (pkm == "Larvitar") {
            atk = 115.0 + 15.0
            def = 93.0 + 15.0
            hp = 100.0 + 15.0
        }

        if (pkm == "Pupitar") {
            atk = 155.0 + 15.0
            def = 133.0 + 15.0
            hp = 140.0 + 15.0
        }

        if (pkm == "Tyranitar") {
            atk = 251.0 + 15.0
            def = 212.0 + 15.0
            hp = 200.0 + 15.0
        }

        if (pkm == "Lugia") {
            atk = 193.0 + 15.0
            def = 323.0 + 15.0
            hp = 212.0 + 15.0
        }

        if (pkm == "Ho-oh") {
            atk = 263.0 + 15.0
            def = 301.0 + 15.0
            hp = 212.0 + 15.0
        }

        if (pkm == "Celebi") {
            atk = 210.0 + 15.0
            def = 210.0 + 15.0
            hp = 200.0 + 15.0
        }

        var cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.094, 2.0) / 10
        if (cp < 10) cp = 10.0
        if (cp.toInt() == CP) print("\n$pkm 100% lv1 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.16639787, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv2 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.21573247, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv3 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.25572005, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv4 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.29024988, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv5 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.3210876, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv6 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.34921268, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv7 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.37523559, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv8 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.39956728, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv9 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.42250001, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv10 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.44310755, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv11 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.46279839, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv12 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.48168495, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv13 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.49985844, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv14 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.51739395, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv15 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.53435433, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv16 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.55079269, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv17 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.56675452, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv18 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.58227891, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv19 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.59740001, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv20 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.61215729, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv21 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.62656713, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv22 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.64065295, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv23 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.65443563, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv24 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.667934, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv25 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.68116492, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv26 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.69414365, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv27 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.70688421, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv28 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.71939909, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv29 = " + cp.toInt())
        cp = atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(0.7317, 2.0) / 10
        if (cp.toInt() == CP) print("\n$pkm 100% lv30 = " + cp.toInt())

    }while(CP != 0)
}
