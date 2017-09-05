import java.lang.Math.*

fun main(args : Array<String>) {

    var atk: Double? = 0.0
    var def: Double? = 0.0
    var hp: Double? = 0.0
    var lvl: Int? = 1
    var cp = 0.0
    val cpm: Array<Double> = arrayOf(0.094,0.16639787,0.21573247,0.25572005,0.29024988,0.3210876,0.34921268,0.37523559,0.39956728,0.42250001,0.44310755,0.46279839,0.48168495,0.49985844,0.51739395,0.53435433,0.55079269,0.56675452,0.58227891,0.59740001,0.61215729,0.62656713,0.64065295,0.65443563,0.667934,0.68116492,0.69414365,0.70688421,0.71939909,0.7317)

    print("nome do pokemon:")

    var (pkm: String) = readLine()!!.split(delimiters = ' ')
    pkm = pkm.toLowerCase() //trata lEtRAs MinUsCUlas E maIuSCulAS
    pkm = pkm.capitalize() //Finaliza o tratamento ex: Bulbasaur

    loop@ do{ //repetição para ajudar no tst cp == 0 sai do loop

    print("CP do pokemon:")

    var CP: Int = readLine()!!.toInt()

        when { //insere os dados do pokemon escolido
            pkm == ("Bulbasaur") -> {
                atk = 118.0 + 15.0
                def = 118.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Ivysaur") -> {
                atk = 151.0 + 15.0
                def = 151.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Venusaur") -> {
                atk = 198.0 + 15.0
                def = 198.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Charmander") -> {
                atk = 116.0 + 15.0
                def = 96.0 + 15.0
                hp = 78.0 + 15.0
            }
            pkm == ("Charmeleon") -> {
                atk = 158.0 + 15.0
                def = 129.0 + 15.0
                hp = 116.0 + 15.0
            }
            pkm == ("Charizard") -> {
                atk = 223.0 + 15.0
                def = 176.0 + 15.0
                hp = 156.0 + 15.0
            }
            pkm == ("Squirtle") -> {
                atk = 94.0 + 15.0
                def = 122.0 + 15.0
                hp = 88.0 + 15.0
            }
            pkm == ("Wartortle") -> {
                atk = 126.0 + 15.0
                def = 155.0 + 15.0
                hp = 118.0 + 15.0
            }
            pkm == ("Blastoise") -> {
                atk = 171.0 + 15.0
                def = 210.0 + 15.0
                hp = 158.0 + 15.0
            }
            pkm == ("caterpie") -> {
                atk = 55.0 + 15.0
                def = 62.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Metapod") -> {
                atk = 45.0 + 15.0
                def = 94.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Butterfree") -> {
                atk = 167.0 + 15.0
                def = 151.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Weedle") -> {
                atk = 63.0 + 15.0
                def = 55.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Kakuna") -> {
                atk = 46.0 + 15.0
                def = 86.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Beedrill") -> {
                atk = 169.0 + 15.0
                def = 150.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Pidgey") -> {
                atk = 85.0 + 15.0
                def = 76.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Pidgeotto") -> {
                atk = 117.0 + 15.0
                def = 108.0 + 15.0
                hp = 126.0 + 15.0
            }
            pkm == ("Pidgeot") -> {
                atk = 166.0 + 15.0
                def = 157.0 + 15.0
                hp = 166.0 + 15.0
            }
            pkm == ("Rattata") -> {
                atk = 103.0 + 15.0
                def = 70.0 + 15.0
                hp = 60.0 + 15.0
            }
            pkm == ("Raticate") -> {
                atk = 161.0 + 15.0
                def = 144.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Spearow") -> {
                atk = 112.0 + 15.0
                def = 61.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Fearow") -> {
                atk = 182.0 + 15.0
                def = 135.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Ekans") -> {
                atk = 110.0 + 15.0
                def = 102.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Arbok") -> {
                atk = 167.0 + 15.0
                def = 158.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Pikachu") -> {
                atk = 112.0 + 15.0
                def = 101.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Raichu") -> {
                atk = 193.0 + 15.0
                def = 165.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Sandshrew") -> {
                atk = 126.0 + 15.0
                def = 145.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Sandslash") -> {
                atk = 182.0 + 15.0
                def = 202.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("NidoranF") -> {
                atk = 86.0 + 15.0
                def = 94.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Nidorina") -> {
                atk = 117.0 + 15.0
                def = 126.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Nidoqueen") -> {
                atk = 180.0 + 15.0
                def = 174.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("NidoranM") -> {
                atk = 105.0 + 15.0
                def = 76.0 + 15.0
                hp = 92.0 + 15.0
            }
            pkm == ("Nidorino") -> {
                atk = 137.0 + 15.0
                def = 112.0 + 15.0
                hp = 122.0 + 15.0
            }
            pkm == ("Nidoking") -> {
                atk = 204.0 + 15.0
                def = 157.0 + 15.0
                hp = 162.0 + 15.0
            }
            pkm == ("Clefairy") -> {
                atk = 107.0 + 15.0
                def = 116.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Clefable") -> {
                atk = 178.0 + 15.0
                def = 171.0 + 15.0
                hp = 190.0 + 15.0
            }
            pkm == ("Vulpix") -> {
                atk = 96.0 + 15.0
                def = 122.0 + 15.0
                hp = 76.0 + 15.0
            }
            pkm == ("Ninetales") -> {
                atk = 169.0 + 15.0
                def = 204.0 + 15.0
                hp = 146.0 + 15.0
            }
            pkm == ("Jigglypuff") -> {
                atk = 80.0 + 15.0
                def = 44.0 + 15.0
                hp = 230.0 + 15.0
            }
            pkm == ("Wigglytuff") -> {
                atk = 156.0 + 15.0
                def = 93.0 + 15.0
                hp = 280.0 + 15.0
            }
            pkm == ("Zubat") -> {
                atk = 83.0 + 15.0
                def = 76.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Golbat") -> {
                atk = 161.0 + 15.0
                def = 153.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Oddish") -> {
                atk = 131.0 + 15.0
                def = 116.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Gloom") -> {
                atk = 153.0 + 15.0
                def = 139.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Vileplume") -> {
                atk = 202.0 + 15.0
                def = 170.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Paras") -> {
                atk = 121.0 + 15.0
                def = 99.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Parasect") -> {
                atk = 165.0 + 15.0
                def = 146.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Venonat") -> {
                atk = 100.0 + 15.0
                def = 102.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Venomoth") -> {
                atk = 179.0 + 15.0
                def = 150.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Diglett") -> {
                atk = 109.0 + 15.0
                def = 88.0 + 15.0
                hp = 20.0 + 15.0
            }
            pkm == ("Dugtrio") -> {
                atk = 167.0 + 15.0
                def = 147.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Meowth") -> {
                atk = 92.0 + 15.0
                def = 81.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Persian") -> {
                atk = 150.0 + 15.0
                def = 139.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Psyduck") -> {
                atk = 122.0 + 15.0
                def = 96.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Golduck") -> {
                atk = 191.0 + 15.0
                def = 163.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Mankey") -> {
                atk = 148.0 + 15.0
                def = 87.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Primeape") -> {
                atk = 207.0 + 15.0
                def = 144.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Growlithe") -> {
                atk = 136.0 + 15.0
                def = 96.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Arcanine") -> {
                atk = 227.0 + 15.0
                def = 166.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Poliwag") -> {
                atk = 101.0 + 15.0
                def = 82.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Poliwhirl") -> {
                atk = 130.0 + 15.0
                def = 130.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Poliwrath") -> {
                atk = 182.0 + 15.0
                def = 187.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Abra") -> {
                atk = 195.0 + 15.0
                def = 103.0 + 15.0
                hp = 50.0 + 15.0
            }
            pkm == ("Kadabra") -> {
                atk = 232.0 + 15.0
                def = 138.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Alakazam") -> {
                atk = 271.0 + 15.0
                def = 194.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Machop") -> {
                atk = 137.0 + 15.0
                def = 88.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Machoke") -> {
                atk = 177.0 + 15.0
                def = 130.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Machamp") -> {
                atk = 234.0 + 15.0
                def = 162.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Bellsprout") -> {
                atk = 139.0 + 15.0
                def = 64.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Weepinbell") -> {
                atk = 172.0 + 15.0
                def = 95.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Victreebel") -> {
                atk = 207.0 + 15.0
                def = 138.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Tentacool") -> {
                atk = 97.0 + 15.0
                def = 182.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Tentacruel") -> {
                atk = 166.0 + 15.0
                def = 237.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Geodude") -> {
                atk = 132.0 + 15.0
                def = 163.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Graveler") -> {
                atk = 164.0 + 15.0
                def = 196.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Golem") -> {
                atk = 211.0 + 15.0
                def = 229.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Ponyta") -> {
                atk = 170.0 + 15.0
                def = 132.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Rapidash") -> {
                atk = 207.0 + 15.0
                def = 167.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Slowpoke") -> {
                atk = 109.0 + 15.0
                def = 109.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Slowbro") -> {
                atk = 177.0 + 15.0
                def = 194.0 + 15.0
                hp = 190.0 + 15.0
            }
            pkm == ("Magnemite") -> {
                atk = 165.0 + 15.0
                def = 128.0 + 15.0
                hp = 50.0 + 15.0
            }
            pkm == ("Magneton") -> {
                atk = 223.0 + 15.0
                def = 182.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Farfetchd") -> {
                atk = 124.0 + 15.0
                def = 118.0 + 15.0
                hp = 104.0 + 15.0
            }
            pkm == ("Doduo") -> {
                atk = 158.0 + 15.0
                def = 88.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Dodrio") -> {
                atk = 218.0 + 15.0
                def = 145.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Seel") -> {
                atk = 85.0 + 15.0
                def = 128.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Dewgong") -> {
                atk = 139.0 + 15.0
                def = 184.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Grimer") -> {
                atk = 135.0 + 15.0
                def = 90.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Muk") -> {
                atk = 190.0 + 15.0
                def = 184.0 + 15.0
                hp = 210.0 + 15.0
            }
            pkm == ("Shellder") -> {
                atk = 116.0 + 15.0
                def = 168.0 + 15.0
                hp = 60.0 + 15.0
            }
            pkm == ("Cloyster") -> {
                atk = 186.0 + 15.0
                def = 323.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Gastly") -> {
                atk = 186.0 + 15.0
                def = 70.0 + 15.0
                hp = 60.0 + 15.0
            }
            pkm == ("Haunter") -> {
                atk = 223.0 + 15.0
                def = 112.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Gengar") -> {
                atk = 261.0 + 15.0
                def = 156.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Onix") -> {
                atk = 85.0 + 15.0
                def = 288.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Drowzee") -> {
                atk = 89.0 + 15.0
                def = 158.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Hypno") -> {
                atk = 144.0 + 15.0
                def = 215.0 + 15.0
                hp = 170.0 + 15.0
            }
            pkm == ("Krabby") -> {
                atk = 181.0 + 15.0
                def = 156.0 + 15.0
                hp = 60.0 + 15.0
            }
            pkm == ("Kingler") -> {
                atk = 240.0 + 15.0
                def = 214.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Voltorb") -> {
                atk = 109.0 + 15.0
                def = 114.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Electrode") -> {
                atk = 173.0 + 15.0
                def = 179.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Exeggcute") -> {
                atk = 107.0 + 15.0
                def = 140.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Exeggutor") -> {
                atk = 233.0 + 15.0
                def = 158.0 + 15.0
                hp = 190.0 + 15.0
            }
            pkm == ("Cubone") -> {
                atk = 90.0 + 15.0
                def = 165.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Marowak") -> {
                atk = 144.0 + 15.0
                def = 200.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Hitmonlee") -> {
                atk = 224.0 + 15.0
                def = 211.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Hitmonchan") -> {
                atk = 193.0 + 15.0
                def = 212.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Lickitung") -> {
                atk = 108.0 + 15.0
                def = 137.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Koffing") -> {
                atk = 119.0 + 15.0
                def = 164.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Weezing") -> {
                atk = 174.0 + 15.0
                def = 221.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Rhyhorn") -> {
                atk = 140.0 + 15.0
                def = 157.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Rhydon") -> {
                atk = 222.0 + 15.0
                def = 206.0 + 15.0
                hp = 210.0 + 15.0
            }
            pkm == ("Chansey") -> {
                atk = 60.0 + 15.0
                def = 176.0 + 15.0
                hp = 500.0 + 15.0
            }
            pkm == ("Tangela") -> {
                atk = 183.0 + 15.0
                def = 205.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("kangaskhan") -> {
                atk = 181.0 + 15.0
                def = 165.0 + 15.0
                hp = 210.0 + 15.0
            }
            pkm == ("Horsea") -> {
                atk = 129.0 + 15.0
                def = 125.0 + 15.0
                hp = 60.0 + 15.0
            }
            pkm == ("Seadra") -> {
                atk = 187.0 + 15.0
                def = 182.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Goldeen") -> {
                atk = 123.0 + 15.0
                def = 115.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Seaking") -> {
                atk = 175.0 + 15.0
                def = 154.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Staryu") -> {
                atk = 137.0 + 15.0
                def = 112.0 + 15.0
                hp = 60.0 + 15.0
            }
            pkm == ("Starmie") -> {
                atk = 210.0 + 15.0
                def = 184.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("MR.Mime") -> {
                atk = 192.0 + 15.0
                def = 233.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Scyther") -> {
                atk = 218.0 + 15.0
                def = 170.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Jynx") -> {
                atk = 223.0 + 15.0
                def = 182.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Electabuzz") -> {
                atk = 198.0 + 15.0
                def = 173.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Magmar") -> {
                atk = 206.0 + 15.0
                def = 169.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Pinsir") -> {
                atk = 238.0 + 15.0
                def = 197.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Tauros") -> {
                atk = 198.0 + 15.0
                def = 197.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Magikarp") -> {
                atk = 29.0 + 15.0
                def = 102.0 + 15.0
                hp = 40.0 + 15.0
            }
            pkm == ("Gyarados") -> {
                atk = 237.0 + 15.0
                def = 197.0 + 15.0
                hp = 190.0 + 15.0
            }
            pkm == ("Lapras") -> {
                atk = 165.0 + 15.0
                def = 180.0 + 15.0
                hp = 260.0 + 15.0
            }
            pkm == ("Ditto") -> {
                atk = 91.0 + 15.0
                def = 91.0 + 15.0
                hp = 96.0 + 15.0
            }
            pkm == ("Eevee") -> {
                atk = 104.0 + 15.0
                def = 121.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Vaporeon") -> {
                atk = 205.0 + 15.0
                def = 177.0 + 15.0
                hp = 260.0 + 15.0
            }
            pkm == ("Jolteon") -> {
                atk = 232.0 + 15.0
                def = 201.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Flareon") -> {
                atk = 246.0 + 15.0
                def = 204.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Porygon") -> {
                atk = 153.0 + 15.0
                def = 139.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Omanyte") -> {
                atk = 155.0 + 15.0
                def = 174.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Omastar") -> {
                atk = 207.0 + 15.0
                def = 227.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Kabuto") -> {
                atk = 148.0 + 15.0
                def = 162.0 + 15.0
                hp = 60.0 + 15.0
            }
            pkm == ("Kabutops") -> {
                atk = 220.0 + 15.0
                def = 203.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Aerodactyl") -> {
                atk = 221.0 + 15.0
                def = 164.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Snorlax") -> {
                atk = 190.0 + 15.0
                def = 190.0 + 15.0
                hp = 320.0 + 15.0
            }
            pkm == ("Articuno") -> {
                atk = 192.0 + 15.0
                def = 249.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Zapdos") -> {
                atk = 253.0 + 15.0
                def = 188.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Moltres") -> {
                atk = 251.0 + 15.0
                def = 184.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Dratini") -> {
                atk = 119.0 + 15.0
                def = 94.0 + 15.0
                hp = 82.0 + 15.0
            }
            pkm == ("Dragonair") -> {
                atk = 163.0 + 15.0
                def = 138.0 + 15.0
                hp = 122.0 + 15.0
            }
            pkm == ("Dragonite") -> {
                atk = 263.0 + 15.0
                def = 201.0 + 15.0
                hp = 182.0 + 15.0
            }
            pkm == ("Mewtwo") -> {
                atk = 300.0 + 15.0
                def = 182.0 + 15.0
                hp = 192.0 + 15.0
            }
            pkm == ("Mew") -> {
                atk = 210.0 + 15.0
                def = 210.0 + 15.0
                hp = 200.0 + 15.0
            }
            pkm == ("Chikorita") -> {
                atk = 92.0 + 15.0
                def = 122.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Bayleef") -> {
                atk = 122.0 + 15.0
                def = 155.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Meganium") -> {
                atk = 168.0 + 15.0
                def = 202.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Cyndaquil") -> {
                atk = 116.0 + 15.0
                def = 96.0 + 15.0
                hp = 78.0 + 15.0
            }
            pkm == ("Quilava") -> {
                atk = 158.0 + 15.0
                def = 129.0 + 15.0
                hp = 116.0 + 15.0
            }
            pkm == ("Typhlosion") -> {
                atk = 223.0 + 15.0
                def = 176.0 + 15.0
                hp = 156.0 + 15.0
            }
            pkm == ("Totodile") -> {
                atk = 117.0 + 15.0
                def = 116.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Croconaw") -> {
                atk = 150.0 + 15.0
                def = 151.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Feraligatr") -> {
                atk = 205.0 + 15.0
                def = 197.0 + 15.0
                hp = 170.0 + 15.0
            }
            pkm == ("Sentret") -> {
                atk = 79.0 + 15.0
                def = 77.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Furret") -> {
                atk = 148.0 + 15.0
                def = 130.0 + 15.0
                hp = 170.0 + 15.0
            }
            pkm == ("Hoothoot") -> {
                atk = 67.0 + 15.0
                def = 101.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Noctowl") -> {
                atk = 145.0 + 15.0
                def = 179.0 + 15.0
                hp = 200.0 + 15.0
            }
            pkm == ("Ledyba") -> {
                atk = 72.0 + 15.0
                def = 142.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Ledian") -> {
                atk = 107.0 + 15.0
                def = 209.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Spinarak") -> {
                atk = 105.0 + 15.0
                def = 73.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Ariados") -> {
                atk = 161.0 + 15.0
                def = 128.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Crobat") -> {
                atk = 194.0 + 15.0
                def = 178.0 + 15.0
                hp = 170.0 + 15.0
            }
            pkm == ("Chinchou") -> {
                atk = 106.0 + 15.0
                def = 106.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Lanturn") -> {
                atk = 146.0 + 15.0
                def = 146.0 + 15.0
                hp = 250.0 + 15.0
            }
            pkm == ("Pichu") -> {
                atk = 77.0 + 15.0
                def = 63.0 + 15.0
                hp = 40.0 + 15.0
            }
            pkm == ("Cleffa") -> {
                atk = 75.0 + 15.0
                def = 91.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Igglybuff") -> {
                atk = 69.0 + 15.0
                def = 34.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Togepi") -> {
                atk = 67.0 + 15.0
                def = 116.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Togetic") -> {
                atk = 139.0 + 15.0
                def = 191.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Natu") -> {
                atk = 134.0 + 15.0
                def = 89.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Xatu") -> {
                atk = 192.0 + 15.0
                def = 146.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Mareep") -> {
                atk = 114.0 + 15.0
                def = 82.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Flaaffy") -> {
                atk = 145.0 + 15.0
                def = 112.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Ampharos") -> {
                atk = 211.0 + 15.0
                def = 172.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Bellossom") -> {
                atk = 169.0 + 15.0
                def = 189.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Marill") -> {
                atk = 37.0 + 15.0
                def = 93.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Azumarill") -> {
                atk = 112.0 + 15.0
                def = 152.0 + 15.0
                hp = 200.0 + 15.0
            }
            pkm == ("Sudowoodo") -> {
                atk = 167.0 + 15.0
                def = 198.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Politoed") -> {
                atk = 174.0 + 15.0
                def = 192.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Hoppip") -> {
                atk = 67.0 + 15.0
                def = 101.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Skiploom") -> {
                atk = 91.0 + 15.0
                def = 127.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Jumpluff") -> {
                atk = 118.0 + 15.0
                def = 197.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Aipom") -> {
                atk = 136.0 + 15.0
                def = 112.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Sunkern") -> {
                atk = 55.0 + 15.0
                def = 55.0 + 15.0
                hp = 60.0 + 15.0
            }
            pkm == ("Sunflora") -> {
                atk = 185.0 + 15.0
                def = 148.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Yanma") -> {
                atk = 154.0 + 15.0
                def = 94.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Wooper") -> {
                atk = 75.0 + 15.0
                def = 75.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Quagsire") -> {
                atk = 152.0 + 15.0
                def = 152.0 + 15.0
                hp = 190.0 + 15.0
            }
            pkm == ("Espeon") -> {
                atk = 261.0 + 15.0
                def = 194.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Umbreon") -> {
                atk = 126.0 + 15.0
                def = 250.0 + 15.0
                hp = 190.0 + 15.0
            }
            pkm == ("Murkrow") -> {
                atk = 175.0 + 15.0
                def = 87.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Slowking") -> {
                atk = 177.0 + 15.0
                def = 194.0 + 15.0
                hp = 190.0 + 15.0
            }
            pkm == ("Unown") -> {
                atk = 136.0 + 15.0
                def = 91.0 + 15.0
                hp = 96.0 + 15.0
            }
            pkm == ("Wobbuffet") -> {
                atk = 60.0 + 15.0
                def = 106.0 + 15.0
                hp = 380.0 + 15.0
            }
            pkm == ("Girafarig") -> {
                atk = 182.0 + 15.0
                def = 133.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Pineco") -> {
                atk = 108.0 + 15.0
                def = 146.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Forretress") -> {
                atk = 161.0 + 15.0
                def = 242.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Dunsparce") -> {
                atk = 131.0 + 15.0
                def = 131.0 + 15.0
                hp = 200.0 + 15.0
            }
            pkm == ("Gligar") -> {
                atk = 143.0 + 15.0
                def = 204.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Steelix") -> {
                atk = 148.0 + 15.0
                def = 333.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Snubbull") -> {
                atk = 137.0 + 15.0
                def = 89.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Granbull") -> {
                atk = 212.0 + 15.0
                def = 137.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Quilfish") -> {
                atk = 184.0 + 15.0
                def = 148.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Scizor") -> {
                atk = 236.0 + 15.0
                def = 191.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Shuckle") -> {
                atk = 17.0 + 15.0
                def = 396.0 + 15.0
                hp = 40.0 + 15.0
            }
            pkm == ("Heracross") -> {
                atk = 234.0 + 15.0
                def = 189.0 + 15.0
                hp = 160.0 + 15.0
            }
            pkm == ("Sneasel") -> {
                atk = 189.0 + 15.0
                def = 157.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Teddiursa") -> {
                atk = 142.0 + 15.0
                def = 93.0 + 15.0
                hp = 120.0 + 15.0
            }
            pkm == ("Ursaring") -> {
                atk = 236.0 + 15.0
                def = 144.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Slugma") -> {
                atk = 118.0 + 15.0
                def = 71.0 + 15.0
                hp = 80.0 + 15.0
            }
            pkm == ("Magcargo") -> {
                atk = 139.0 + 15.0
                def = 209.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Swinub") -> {
                atk = 90.0 + 15.0
                def = 74.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Piloswine") -> {
                atk = 181.0 + 15.0
                def = 147.0 + 15.0
                hp = 200.0 + 15.0
            }
            pkm == ("Corsola") -> {
                atk = 118.0 + 15.0
                def = 156.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Remoraid") -> {
                atk = 127.0 + 15.0
                def = 69.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Octillery") -> {
                atk = 197.0 + 15.0
                def = 141.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Delibird") -> {
                atk = 128.0 + 15.0
                def = 90.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Mantine") -> {
                atk = 148.0 + 15.0
                def = 260.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Skarmory") -> {
                atk = 148.0 + 15.0
                def = 260.0 + 15.0
                hp = 130.0 + 15.0
            }
            pkm == ("Houndour") -> {
                atk = 152.0 + 15.0
                def = 93.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Houndoom") -> {
                atk = 224.0 + 15.0
                def = 159.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Kingdra") -> {
                atk = 194.0 + 15.0
                def = 194.0 + 15.0
                hp = 150.0 + 15.0
            }
            pkm == ("Phanpy") -> {
                atk = 107.0 + 15.0
                def = 107.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Donphan") -> {
                atk = 214.0 + 15.0
                def = 214.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Porygon2") -> {
                atk = 198.0 + 15.0
                def = 183.0 + 15.0
                hp = 170.0 + 15.0
            }
            pkm == ("Stantler") -> {
                atk = 192.0 + 15.0
                def = 132.0 + 15.0
                hp = 146.0 + 15.0
            }
            pkm == ("Smeargle") -> {
                atk = 40.0 + 15.0
                def = 88.0 + 15.0
                hp = 110.0 + 15.0
            }
            pkm == ("Tyrogue") -> {
                atk = 64.0 + 15.0
                def = 64.0 + 15.0
                hp = 70.0 + 15.0
            }
            pkm == ("Hitmontop") -> {
                atk = 173.0 + 15.0
                def = 214.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Smoochum") -> {
                atk = 153.0 + 15.0
                def = 116.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Elekid") -> {
                atk = 135.0 + 15.0
                def = 110.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Magby") -> {
                atk = 151.0 + 15.0
                def = 108.0 + 15.0
                hp = 90.0 + 15.0
            }
            pkm == ("Miltank") -> {
                atk = 157.0 + 15.0
                def = 211.0 + 15.0
                hp = 190.0 + 15.0
            }
            pkm == ("Blissey") -> {
                atk = 129.0 + 15.0
                def = 229.0 + 15.0
                hp = 510.0 + 15.0
            }
            pkm == ("Raikou") -> {
                atk = 241.0 + 15.0
                def = 210.0 + 15.0
                hp = 180.0 + 15.0
            }
            pkm == ("Entei") -> {
                atk = 235.0 + 15.0
                def = 176.0 + 15.0
                hp = 230.0 + 15.0
            }
            pkm == ("Suicune") -> {
                atk = 180.0 + 15.0
                def = 235.0 + 15.0
                hp = 200.0 + 15.0
            }
            pkm == ("Larvitar") -> {
                atk = 115.0 + 15.0
                def = 93.0 + 15.0
                hp = 100.0 + 15.0
            }
            pkm == ("Pupitar") -> {
                atk = 155.0 + 15.0
                def = 133.0 + 15.0
                hp = 140.0 + 15.0
            }
            pkm == ("Tyranitar") -> {
                atk = 251.0 + 15.0
                def = 212.0 + 15.0
                hp = 200.0 + 15.0
            }
            pkm == ("Lugia") -> {
                atk = 193.0 + 15.0
                def = 323.0 + 15.0
                hp = 212.0 + 15.0
            }
            pkm == ("Ho-oh") -> {
                atk = 263.0 + 15.0
                def = 301.0 + 15.0
                hp = 212.0 + 15.0
            }
            pkm == ("Celebi") -> {
                atk = 210.0 + 15.0
                def = 210.0 + 15.0
                hp = 200.0 + 15.0
            }
            else -> break@loop
        }

        lvl = 1
        while(lvl!! < 31){
            cp = cpformula(atk,def,hp,cpm[lvl-1])
            if (cp < 10) cp = 10.0
            if (cp.toInt() == CP) print("$pkm pode ser 100% se lvl = $lvl e cp:" + cp.toInt() + "\n")
            lvl++
        }
    }while(CP != 0)
}

/*fun cpmformula(lvl:Double,cpm:Double): Double // funcao a ser feita
{
    var step: Double? = 0.0
    when {
        lvl < 10 -> step = 0.009426125469
        lvl > 9.5 && lvl < 	20 -> step = 0.008919025675
        lvl > 19.5 && lvl < 30 -> step = 0.008924905903
        lvl > 29.5 && lvl < 40 -> step = 0.00445946079
    }
    sqrt((2.0 * step!!)*pow(cpm, 2.0))
}*/

fun cpformula(atk:Double,def:Double,hp:Double,cpm:Double): Double
{
    return atk!! * pow(def!!, 0.5) * pow(hp!!, 0.5) * pow(cpm, 2.0) / 10
}
