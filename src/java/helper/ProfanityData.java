/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robin
 */
public class ProfanityData {
    
    
    private String profanities = "dikzak\n" +
"flikker\n" +
"godver\n" +
"godverdomme\n" +
"hou je fokking bek\n" +
"ik neuk je zusje d'r kontje\n" +
"kankerlul\n" +
"kankerwijf\n" +
"kloten\n" +
"krijg de pleuris\n" +
"kut\n" +
"kutding\n" +
"kutwijf\n" +
"kutzooi\n" +
"lul\n" +
"mongool\n" +
"oetlul\n" +
"pot\n" +
"praat geen poep\n" +
"prammen\n" +
"memmen\n" +
"tyfushond\n" +
"zuig mijn lul\n" +
"klootzak\n" +
"hoer\n" +
"hoerenjong\n" +
"hoerenzoo\n" +
"kak\n" +
"stront\n" +
"kanker nerd\n" +
"kloot zak\n" +
"paardelul\n" +
"reet\n" +
"rotzak\n" +
"schele\n" +
"slet\n" +
"sloerie\n" +
"snol\n" +
"del\n" +
"prostituee\n" +
"stoephoer\n" +
"sukkel\n" +
"teef\n" +
"tepels\n" +
"tieten\n" +
"tyfusslet\n" +
"achterlijk\n" +
"debiel\n" +
"idioot\n" +
"kanker\n" +
"kankeren\n" +
"kankerlijer\n" +
"klere\n" +
"klerelijer\n" +
"kolere\n" +
"krijg de\n" +
"lazarus\n" +
"lijer\n" +
"pest\n" +
"pestkop\n" +
"pleuris\n" +
"pleuritis\n" +
"pleurislijer\n" +
"pokkelijer\n" +
"pokkenlijer\n" +
"stom\n" +
"takke\n" +
"tering\n" +
"teringlijer\n" +
"tyfus\n" +
"tyfuslijer\n" +
"vinkentering\n" +
"krijg de ziekte\n" +
"gatverdamme\n" +
"getverderrie\n" +
"hel\n" +
"jezus christus\n" +
"verdomme\n" +
"verdorie\n" +
"bek\n" +
"bitch\n" +
"chips\n" +
"eikel\n" +
"fok\n" +
"fuck\n" +
"homo\n" +
"huppelkut\n" +
"kattenkop\n" +
"klote\n" +
"kop\n" +
"kreng\n" +
"lullen\n" +
"matennaaier\n" +
"mierenneuker\n" +
"muil\n" +
"muts\n" +
"neuken\n" +
"neukertje\n" +
"nicht\n" +
"ouwehoeren\n" +
"peniskop\n" +
"pissig\n" +
"poep\n" +
"poes\n" +
"poot\n" +
"trut\n" +
"tut\n" +
"rot-\n" +
"schijt\n" +
"shit\n" +
"slons\n" +
"zak\n" +
"aap\n" +
"bosneger\n" +
"geitenneuker\n" +
"kaaskop\n" +
"kakker\n" +
"lijp\n" +
"mocro\n" +
"mof\n" +
"nikker\n" +
"roetmop\n" +
"spaghettivreter\n" +
"spleetoog\n" +
"tatta\n" +
"zandneger\n" +
"nsb'er\n" +
"oelewapper\n" +
"smeerlap\n" +
"sul\n" +
"vreten\n" +
"vuil\n" +
"wijf\n" +
"zooi\n" +
"kankerflikker\n" +
"eet stront\n" +
"hou je bek\n" +
"je moeder's schaamlipcorrectie\n" +
"kanker aap\n" +
"kankerhoer\n" +
"kontebonker\n" +
"kontneuken kut\n" +
"kus mijn hol\n" +
"lik mijn reet\n" +
"kus mijn kloten\n" +
"loop naar de maan\n" +
"ga fietsen\n" +
"moeder neuker\n" +
"nerd\n" +
"neuk je moeder\n" +
"paard lul minnaar\n" +
"schijtlaars\n" +
"schijterd\n" +
"smoel dicht\n" +
"bek houwe\n" +
"stuk stront\n" +
"teringeikel\n" +
"val dood\n" +
"aapje\n" +
"achterlijke gladiool\n" +
"addergebroed\n" +
"apenkop\n" +
"baggermuil\n" +
"balgehakt\n" +
"barbaar\n" +
"belatafeld\n" +
"belhamel\n" +
"bengel\n" +
"bimbo\n" +
"blaag\n" +
"blaaskaak\n" +
"boef\n" +
"boeman\n" +
"boerenkinkel\n" +
"boerenpummel\n" +
"boerentrien\n" +
"boevekop\n" +
"boeventronie\n" +
"bonestaak\n" +
"booswicht\n" +
"bosaap\n" +
"bosbaviaan\n" +
"botterik\n" +
"branieschopper\n" +
"brompot\n" +
"brulaap\n" +
"brulboei\n" +
"bruut\n" +
"builenkop\n" +
"bullebak\n" +
"chappie\n" +
"cocosmacroon\n" +
"dakhaas\n" +
"deksels jong\n" +
"dekzwabber\n" +
"deugniet\n" +
"doerak\n" +
"dombo\n" +
"domme gans\n" +
"domoor\n" +
"dondersteen\n" +
"donderstraal\n" +
"draak\n" +
"drammer\n" +
"drankorgel\n" +
"drats\n" +
"drengel\n" +
"driftkikker\n" +
"droeftoeter\n" +
"drollenvanger\n" +
"drommels\n" +
"dropveter\n" +
"druiloor\n" +
"duivelsgebroed\n" +
"duivelsjong\n" +
"dwaas\n" +
"eigenheimer\n" +
"ellendeling\n" +
"eppo\n" +
"etter\n" +
"etterbak\n" +
"ezel\n" +
"feeks\n" +
"fiel\n" +
"flapdrol\n" +
"flapoor\n" +
"flierefluiter\n" +
"flip fluitketel\n" +
"gajes\n" +
"galbak\n" +
"galgebroed\n" +
"galgenaas\n" +
"galgoog\n" +
"garnaal\n" +
"gatenkaas\n" +
"geboefte\n" +
"gebroed\n" +
"geinponem\n" +
"geitenbreier\n" +
"gepeupel\n" +
"gespuis\n" +
"geteisem\n" +
"gladjanus\n" +
"gluiperd\n" +
"goochemerd\n" +
"gossiemikkie\n" +
"graftak\n" +
"gribus\n" +
"guppekop\n" +
"haaibaai\n" +
"halve gare\n" +
"halve zool\n" +
"hangebroek\n" +
"hannes\n" +
"hansworst\n" +
"heikneuter\n" +
"helleveeg\n" +
"hondekop\n" +
"hork\n" +
"hotemetoot\n" +
"hufter\n" +
"huilebalk\n" +
"jan doedel\n" +
"janjurk\n" +
"jankebal\n" +
"jokkebrok\n" +
"judas\n" +
"kaffer\n" +
"kakhiel\n" +
"kakmadam\n" +
"kannibaal\n" +
"kenau\n" +
"kenkel\n" +
"ketelbink\n" +
"kinkel\n" +
"kip zonder kop\n" +
"klaploper\n" +
"klier\n" +
"klojo\n" +
"kluns\n" +
"kneus\n" +
"kneuter\n" +
"kniesoor\n" +
"knijter\n" +
"knuppel\n" +
"knurdel\n" +
"knurft\n" +
"krentenkakker\n" +
"krijg de rambam\n" +
"krotenkoker\n" +
"kukel\n" +
"kwajongen\n" +
"kwal\n" +
"kwast\n" +
"kwee\n" +
"kwelgeest\n" +
"kwezel\n" +
"kwibus\n" +
"laaielichter\n" +
"lamlendeling\n" +
"lamstraal\n" +
"lamzak\n" +
"landloper\n" +
"lanterfanter\n" +
"lapzwans\n" +
"lastpak\n" +
"leeghoofd\n" +
"leiperik\n" +
"lellebel\n" +
"lichtekooi\n" +
"liegebeest\n" +
"lillikerd\n" +
"linkmiegel\n" +
"loeder\n" +
"lomperik\n" +
"lorrebaal\n" +
"losbol\n" +
"luie hond\n" +
"luilak\n" +
"luizenbol\n" +
"lulletje rozenwater\n" +
"lummel\n" +
"mafkees\n" +
"mafketel\n" +
"malle pietje\n" +
"mallerd\n" +
"malloot\n" +
"minkukel\n" +
"misbaksel\n" +
"miskleun\n" +
"mispunt\n" +
"mormel\n" +
"muggenzifter\n" +
"muilezel\n" +
"murm\n" +
"naarling\n" +
"natnek\n" +
"neulerd\n" +
"nietsnut\n" +
"niksnut\n" +
"nippy\n" +
"nondeju\n" +
"nozem\n" +
"oen\n" +
"oliebol\n" +
"onbenul\n" +
"ondankbare hond\n" +
"onderkruipsel\n" +
"ondeugd\n" +
"onmens\n" +
"onverlaat\n" +
"opdonder\n" +
"paljas\n" +
"pias\n" +
"pielemans\n" +
"piem\n" +
"pierenpamper\n" +
"pierenwaaier\n" +
"pietlut\n" +
"pispaal\n" +
"pleeborstel\n" +
"ploert\n" +
"plurk\n" +
"podverdriedubbeltjes\n" +
"ponem\n" +
"potjandosie\n" +
"proletariër\n" +
"prutser\n" +
"pummel\n" +
"rabauw\n" +
"raddraaier\n" +
"rakker\n" +
"rekel\n" +
"rotjong\n" +
"sapperloot\n" +
"schandknaap\n" +
"schandvlek\n" +
"scharminkel\n" +
"schavuit\n" +
"schele kakketoe\n" +
"schelhamel\n" +
"schelm\n" +
"schijtlijster\n" +
"schijtluis\n" +
"schlemiel\n" +
"schmuck\n" +
"schobbedebonk\n" +
"schobbejak\n" +
"schoft\n" +
"schooier\n" +
"schorem\n" +
"schorriemorrie\n" +
"schuinsmarcheerder\n" +
"schurk\n" +
"secreet\n" +
"serpent\n" +
"sjappie\n" +
"slampamper\n" +
"slapjanus\n" +
"slijmbak\n" +
"sloddervos\n" +
"sloeber\n" +
"slome duikelaar\n" +
"smeerkees\n" +
"smeerpijp\n" +
"smeerpoets\n" +
"smiecht\n" +
"snertjong\n" +
"snoeshaan\n" +
"snotaap\n" +
"snotjong\n" +
"snotneus\n" +
"snuiter\n" +
"snullebol\n" +
"soeduk\n" +
"soepkip\n" +
"soepstengel\n" +
"stakker\n" +
"stoethaspel\n" +
"streng\n" +
"stroel\n" +
"stronthommel\n" +
"struikrover\n" +
"stuk chagrijn\n" +
"stuk onverlaat\n" +
"stuk verdriet\n" +
"stuk vreten\n" +
"stumper\n" +
"sufferd\n" +
"sufkop\n" +
"tang\n" +
"treurwilg\n" +
"trien\n" +
"triest figuur\n" +
"troel\n" +
"troela\n" +
"truttebol\n" +
"tuig van de richel\n" +
"tuthola\n" +
"tuttebel\n" +
"uilenbal\n" +
"uilskuiken\n" +
"uitvreter\n" +
"verdikkie\n" +
"verdulleme\n" +
"verdult\n" +
"viswijf\n" +
"vlegel\n" +
"vlerk\n" +
"vod\n" +
"voddebaal\n" +
"voetveeg\n" +
"vogelverschrikker\n" +
"vrek\n" +
"vuilak\n" +
"vuile huichelaar\n" +
"vuilspuiter\n" +
"wicht\n" +
"zak patat\n" +
"zakkenwasser\n" +
"zaktabak\n" +
"zeikstraal\n" +
"zeurkous\n" +
"zeurpiet\n" +
"zot\n" +
"zuipschuit\n" +
"zuurpruim\n" +
"aalskakker\n" +
"aambeienbeffer\n" +
"aambeienlikker\n" +
"aambeienschoffelaar\n" +
"aambeihaarwasser\n" +
"aansteller\n" +
"aapjesviller\n" +
"aapmens\n" +
"aaprikaan\n" +
"aardappelhoer\n" +
"aardappelluis\n" +
"aardbanaan\n" +
"aardgeest\n" +
"aardpiraat\n" +
"aardvarken\n" +
"aardworm\n" +
"aardworst\n" +
"aars\n" +
"aarsaap\n" +
"aarsatleet\n" +
"aarsbaard\n" +
"aarsbaars\n" +
"aarsbanaan\n" +
"aarsbeer\n" +
"aarsbeffer\n" +
"aarselaar\n" +
"aarsfreter\n" +
"aarsgarnaal\n" +
"aarshaar\n" +
"aarshaarfohner\n" +
"aarshaarknabbelaar\n" +
"aarshaarluis\n" +
"aarshaarverzamelaar\n" +
"aarsketser\n" +
"aarskind\n" +
"aarsklodder\n" +
"aarslander\n" +
"aarslikker\n" +
"aarslog\n" +
"aarsneger\n" +
"aarsridder\n" +
"aarsmaad\n" +
"aarsmade\n" +
"aarsslijm\n" +
"aarsvijand\n" +
"aarsvis\n" +
"aarsworm\n" +
"aartschurk\n" +
"aasgier\n" +
"abortuskind\n" +
"absjaar\n" +
"achterbaksestoephoer\n" +
"achterlader\n" +
"achterlijke\n" +
"achterlijk gebakkie\n" +
"achterpoter\n" +
"achterbuurtfossiel\n" +
"adderengebroedsels\n" +
"afbak hoer\n" +
"afgebakken frikandelhoofd\n" +
"afgebefte del\n" +
"anuspapegaai\n" +
"anuspenetreerder\n" +
"anuspieper\n" +
"anuspiloot\n" +
"anuspiraat\n" +
"anuspuntverknetteraar\n" +
"anusreflector\n" +
"anusridder\n" +
"anussabbelaar\n" +
"anussap-verzuring\n" +
"anustoerist\n" +
"anusuitscheiding\n" +
"anusvreter\n" +
"apekloot\n" +
"apekop\n" +
"apenkut\n" +
"apengaper\n" +
"apenbatser\n" +
"apenflikkerneuker\n" +
"apenhaar\n" +
"apenrukker\n" +
"apeneuker\n" +
"apenwaffel\n" +
"appelzwijn\n" +
"archeologisch kontfossiel\n" +
"armoedverspreider\n" +
"armoedzaaier\n" +
"arrefakker\n" +
"arroganteklitzuigende wrattenhoofd\n" +
"asbestmuis\n" +
"asfaltridder\n" +
"asielzoeker\n" +
"aso-big\n" +
"asperge\n" +
"asshole\n" +
"augurkenneuker\n" +
"augurkenturk\n" +
"augurklul\n" +
"autocraat\n" +
"autodidact\n" +
"autokraat\n" +
"avocadoneuker\n" +
"azteek\n" +
"baanduivel\n" +
"baardaap\n" +
"baarmoeder\n" +
"baarmoederscheefgepoept-kuttekind\n" +
"baarmoederbuikwandschimmel\n" +
"baarmoeder discokip\n" +
"baarmoederslijmvlieg\n" +
"baarvader\n" +
"babaloekoe\n" +
"babbalipviskikker\n" +
"baby\n" +
"babypoedersnuiver\n" +
"baccilledrager\n" +
"badaap\n" +
"badjufbeffer\n" +
"bafaap\n" +
"baffer\n" +
"bruinwerker\n" +
"cabaretlul\n" +
"camperhoer\n" +
"campesneurdo\n" +
"campinghoer\n" +
"campingslet\n" +
"campusnerd\n" +
"camslet\n" +
"carnavals-inca\n" +
"carnavalskaper\n" +
"carnavals-mussolini\n" +
"capsoneslijer\n" +
"capsonestrut\n" +
"caveman\n" +
"centenschraper\n" +
"daaglaker\n" +
"dagblinde\n" +
"dakduif\n" +
"damhoer\n" +
"darmafval\n" +
"darmcoureur\n" +
"darmflora flikker\n" +
"darmfloraflirter\n" +
"darmgas wildebras\n" +
"darmkikker\n" +
"darmneuker\n" +
"darmtoerist\n" +
"ebverzuiper\n" +
"ectoplasma\n" +
"edeldarm\n" +
"edammer\n" +
"eeltneus\n" +
"eendeneikel\n" +
"eendekweker\n" +
"eerstekamer nerd\n" +
"éénoog\n" +
"egocentrischebullebak\n" +
"egoist\n" +
"eiermix-imitatie\n" +
"eierzak\n" +
"eikelbijter\n" +
"eikelkluiver\n" +
"eikellikker\n" +
"fabricagefout\n" +
"facadeklasher\n" +
"falliete tiet\n" +
"familycocktail\n" +
"farmer\n" +
"fatsich\n" +
"fatsige spekhond\n" +
"fietsendief zonder hersens\n" +
"fietspompenlullegezicht\n" +
"fileklever\n" +
"flamingo\n" +
"flapkut\n" +
"flappie\n" +
"flathoer\n" +
"flatslet\n" +
"flauwerd\n" +
"gabber\n" +
"gadoodengeefmijbrood\n" +
"gajeskop\n" +
"galgengebroed\n" +
"galkankerdebiel\n" +
"galsmoel\n" +
"gambaslet\n" +
"gamefreak\n" +
"gangster\n" +
"ganzeboard\n" +
"haagse wim\n" +
"hakker\n" +
"halvegare\n" +
"halve maan-rover\n" +
"halvezool\n" +
"hammehapper\n" +
"hamerhomo\n" +
"hamsteraar\n" +
"hamsterpamper\n" +
"hamsterpijper\n" +
"handelaar in 2hands vogelmest\n" +
"hangbuikvarkenkonteneuker\n" +
"hangbuikzwijn\n" +
"indoending\n" +
"ingeblikte atlas\n" +
"ingeblikte knakworst\n" +
"ingeblikte moeraskikker\n" +
"ingeblikte pinguinscheet\n" +
"ingegroeide konthaar\n" +
"ingeblikte kamerscheet\n" +
"ingevroren visstick\n" +
"ini-mini scheefgepoepte pornokabouter\n" +
"infanterist\n" +
"infantiele kraaienkut\n" +
"inktfis\n" +
"inktlul\n" +
"inktviskut\n" +
"insekt\n" +
"internetslet\n" +
"internetverslaafde neuker\n" +
"invertebraat\n" +
"jaap de aap\n" +
"jambekslikker\n" +
"jandoedel\n" +
"janettescheter\n" +
"janksnor\n" +
"janlul\n" +
"jantje shit\n" +
"jenevertrut\n" +
"jam-bek\n" +
"jetonslikker\n" +
"jetslet\n" +
"kaalgeschoren bouvier\n" +
"kaalhoofdige kontebonker\n" +
"kaalkop\n" +
"kaapstander\n" +
"kaashaas\n" +
"kaasknobbel\n" +
"kaasnicht\n" +
"kaasrandknabbelaar\n" +
"kadaver\n" +
"kakbal\n" +
"kakboer\n" +
"kakbroek\n" +
"kakkerlak\n" +
"kakkie\n" +
"kakkige kakkerlak\n" +
"kakteef\n" +
"kringspiermusketier\n" +
"lafaard\n" +
"lafbek\n" +
"lamagezicht\n" +
"lambak\n" +
"lamlul\n" +
"lampekap\n" +
"lampenhoer\n" +
"lampelul\n" +
"langharige beftekkel\n" +
"langstaart\n" +
"lantaarnpaalhoer\n" +
"lantarenslet\n" +
"latexnicht\n" +
"lauwbikker\n" +
"lauwwaterdrinker\n" +
"lavabosmoel\n" +
"lawaaipapegaai\n" +
"leeg broekje\n" +
"leipo\n" +
"maaghoer\n" +
"maaghond\n" +
"maangezicht\n" +
"maan rovers\n" +
"maf\n" +
"mafkaas\n" +
"mafklapper\n" +
"mafkikker\n" +
"makaak\n" +
"makak\n" +
"makako\n" +
"mikrodebiel\n" +
"naadhopper\n" +
"naadschurftsmurfigebeftekkel\n" +
"naaiaap\n" +
"naar diaree stinkende snol\n" +
"nageboorte\n" +
"nageboortegezwel\n" +
"nakko\n" +
"nanoneuker\n" +
"nasivreter\n" +
"oelepoeper\n" +
"oelewap\n" +
"oesterkut\n" +
"oezo\n" +
"offroadie\n" +
"okselhaas\n" +
"okselharenbillereetzweetzuur\n" +
"okselschimmelhoer\n" +
"olalul\n" +
"olifantebabyface\n" +
"olifantenlul\n" +
"olifantenschimmelslurf\n" +
"paardebeffer\n" +
"paardebrei\n" +
"paardekloot\n" +
"paardekut\n" +
"paardelid\n" +
"paardelullo\n" +
"paardenlul\n" +
"paardenanus\n" +
"paardenpenis\n" +
"paardenpijper\n" +
"paardenpikkenpoetser\n" +
"paardenpenislikker\n" +
"paardenpikkerslikker\n" +
"paardenplasserwasser\n" +
"paardenneuker\n" +
"paarsedruiveneikel\n" +
"paashaasneuker\n" +
"paashaasschaamhaarverzamelaar\n" +
"pad\n" +
"padoog\n" +
"pakhuisrat\n" +
"palenlaaier\n" +
"palingkop\n" +
"palingstekker\n" +
"palmboomneuker\n" +
"pantoffelneuker\n" +
"pandapikkenpijper\n" +
"pantyneuker\n" +
"papabaf\n" +
"papegaai\n" +
"papagaaiekuttenbefkonijn\n" +
"papzak\n" +
"penis aqua rosa\n" +
"penis papierus plaksus\n" +
"lul de behanger\n" +
"papomslag\n" +
"pappige luller\n" +
"parasiet\n" +
"parelridder\n" +
"parkeerkut\n" +
"parkinghomo\n" +
"parkschijter\n" +
"passoaslet\n" +
"passoatrut\n" +
"patjepeeër\n" +
"patser\n" +
"pazop\n" +
"pedo\n" +
"pedomaan\n" +
"pedomeester\n" +
"pedocyclomasturbant\n" +
"pedofiele concierge\n" +
"pedopenis\n" +
"pedopyrofilatomaan\n" +
"pekelharing\n" +
"pekelteef\n" +
"penishoofd\n" +
"peniskoker\n" +
"peniskokerlikker\n" +
"penisleier\n" +
"penislekker\n" +
"penislikker\n" +
"penislijder\n" +
"penispijper\n" +
"penispukkelpuist\n" +
"penisspuiter\n" +
"penisworstelaar\n" +
"peniszuiger\n" +
"pennelikker\n" +
"pensklepper\n" +
"perebek\n" +
"perenplukker\n" +
"pestbek\n" +
"pestboer\n" +
"peukenneuker\n" +
"pezewever\n" +
"phenomeen\n" +
"piaprisma\n" +
"picorniekop\n" +
"pielesnuiver\n" +
"piemel\n" +
"piemelaar\n" +
"piemelboxer\n" +
"piemelbrie\n" +
"piemelgymmer\n" +
"piemelhoofdje\n" +
"piemelpatser\n" +
"piemelpiraat\n" +
"piemelpuist\n" +
"piemelpunt\n" +
"piemelteef\n" +
"piemelwijf\n" +
"pierewipper\n" +
"pietje de dood\n" +
"pietje pikhaar\n" +
"piezer\n" +
"piggel\n" +
"piggelmee\n" +
"pijpbek\n" +
"pijpdeuramateur\n" +
"pijpendemonkyboy\n" +
"pijpenkoplikker\n" +
"pijpelullebakkes\n" +
"pijpert\n" +
"pijpgeit\n" +
"pijphoer\n" +
"pijphomo\n" +
"pijpmond\n" +
"pijpmonk\n" +
"pijppiloot\n" +
"pijpslet\n" +
"pijpslet met hazenlip\n" +
"pijpzuiger\n" +
"pijverse hoer\n" +
"pik\n" +
"pik omhoog\n" +
"quartrozo\n" +
"quasimodo\n" +
"quasimodom\n" +
"quist\n" +
"quikhoer\n" +
"quikteef\n" +
"qwarf\n" +
"raamneger\n" +
"rabauter\n" +
"rabbezak van een wief\n" +
"racechinees\n" +
"racesjinees\n" +
"raceplee\n" +
"ragkut\n" +
"ragnicht\n" +
"railnicht\n" +
"raketpiraat\n" +
"ramenlikker\n" +
"rammelhoofd\n" +
"rampdebiel\n" +
"rampenbek\n" +
"randdebiel\n" +
"ransaap\n" +
"rapenschijter\n" +
"sabberkut\n" +
"satan\n" +
"satraap\n" +
"satéboer\n" +
"satehoer\n" +
"schaamhaarepilerende kontvingeraar\n" +
"schaamhaaretendebaffer\n" +
"schaamhaarverzamelaar\n" +
"schaamlikkerkip\n" +
"schaamlipgezwel\n" +
"schaamliplikker\n" +
"schaamluis\n" +
"schaamluisbedrieger\n" +
"schaampik\n" +
"schaap\n" +
"schadewijf\n" +
"taboetstabiske\n" +
"takenboeker\n" +
"takkehoer\n" +
"takkenteef\n" +
"takkentrut\n" +
"takketrol\n" +
"takketut\n" +
"tamponkut\n" +
"tampontrekker\n" +
"tampony\n" +
"tandloze versnellingsbak\n" +
"tangelteef\n" +
"tankreet\n" +
"tampontoerist\n" +
"uienreet\n" +
"uiersnuiver\n" +
"uitgekotstekamelenkut\n" +
"uitgebakken varkenssluitspier\n" +
"uitgelekte theezak\n" +
"uit-de-baarmoeder-gerukte-mislukte-kuttekop\n" +
"uit de baarmoeder gescheten kut ventje\n" +
"uit de kut gepoepte homofiele tinkie winkie\n" +
"uit-de-baarmoeder-gerukte-tien-tepelige-kut-trut\n" +
"uit-de-baarmoeder-gerukte-tien-tepelige-koeie-stront\n" +
"uit-de-baarmoeder-gerukte-tien-tepelige-homofiel\n" +
"uit-de-baarmoeder-geruktedeurknop\n" +
"vaginaal schimmeltje\n" +
"vaginavarken\n" +
"vaginavochtabsorbeerder\n" +
"vagina inplantaat\n" +
"vaginale afscheiding\n" +
"vaginalehangflapper\n" +
"vampier\n" +
"van de baarmoeder afgerukte tietloze cabaretslet\n" +
"van de potgerukte...\n" +
"vandaal\n" +
"varken\n" +
"varkenshol\n" +
"varkenskop\n" +
"vaselinevriend\n" +
"waailap\n" +
"wabipi\n" +
"walvisganger\n" +
"wandelende asbak\n" +
"wandelende-reklame-voor-kachelglans\n" +
"wandelend virus\n" +
"wanhopigedarmrukker\n" +
"wannabee\n" +
"wasbakkenpisser\n" +
"waterdrinker\n" +
"waterhoofd\n" +
"xylofoonneuker\n" +
"yogoteef\n" +
"yvesmoeder\n" +
"yoyolul\n" +
"yoghurtventje\n" +
"yoghurtpisser\n" +
"zaadbal\n" +
"zaadcontainer\n" +
"zaadhamsteraar\n" +
"zaadheks\n" +
"zaadhoer\n" +
"zaadnaad\n" +
"zaadschieter\n" +
"zaadslikker\n" +
"zaadslet\n" +
"zaadsnuiver\n" +
"zaadspuitende\n" +
"zaadstaafteler\n" +
"zaadstengel\n" +
"zaadzwerver\n" +
"zaadvarken\n" +
"zaadvrager\n" +
"zaadvragende-budcontainer\n" +
"zaadvreter\n" +
"zadelruiker\n" +
"zakcel\n" +
"zaksel\n" +
"zakkendroller\n" +
"zakrat\n" +
"zandhaas\n" +
"zandloper\n" +
"zandvlo\n" +
"zanikert\n" +
"zapoteek\n" +
"zatmuil\n" +
"zattekop\n" +
"zeekbakkes\n" +
"zeekbos\n" +
"zeekmem\n" +
"aangekleed nageboorte\n" +
"aarsvochtlikkendevlooi\n" +
"aarszweetsmurf\n" +
"achterlijke zoetwatermossel\n" +
"afgebefde legoman\n" +
"afgedankte kuthoer\n" +
"afgedankte pornofotograaf\n" +
"afgedankte wcbril\n" +
"afgebrokkelde teenheks\n" +
"afgekakte muizenstront\n" +
"afgekakte bosaap\n" +
"afgekeurd komkommertijd product\n" +
"afgekeurd kutje\n" +
"afgekeurd stuk kadaver\n" +
"afgekeurde baby\n" +
"afgekeurde kuttige flubberkont\n" +
"afgekeurde straathoer\n" +
"afgekloofde discohippie\n" +
"afgekloven afwasborstel\n" +
"afgekloven hamsterkut\n" +
"afgelebberd brood\n" +
"afgelebberde flubberkut\n" +
"afgelebberde kutcondoom\n" +
"afgelebberde luldebehanger\n" +
"afgelebberde negerinnentiet\n" +
"afgelebberdekippencondoom\n" +
"afgelebberde paardenkut\n" +
"afgelebberde paardenpenis\n" +
"afgelekte koeiekak\n" +
"afgelikteboterham\n" +
"afgelikteboterhammenlikker\n" +
"afgeliktehoerenmatras\n" +
"afgeliktekuttekop\n" +
"afgeliktelolly\n" +
"afgelikte palingrukker\n" +
"afgeliktestraatsnol\n" +
"afgeliktstuksperma\n" +
"afgelebberde paardenpik\n" +
"afgelebberde penispijper\n" +
"afgelebberde negerinnetieten\n" +
"afgeneukte hondenbeffer\n" +
"afgeneukte palingdrol\n" +
"afgestudeerdemierenpijper\n" +
"afgetrokken trektiet\n" +
"afgetrokkenturk\n" +
"afgezjabberde dicoslets\n" +
"afrikaanse zeekomkommer\n" +
"afstoot\n" +
"aftreksel\n" +
"afvallige\n" +
"afvalturk\n" +
"afzakker\n" +
"afzuigroodkappie\n" +
"akadildosnoeper\n" +
"albinoreetkever\n" +
"allesneuker\n" +
"allochtoon\n" +
"amateurklusser\n" +
"amfitryon\n" +
"anaalaaiendebefkut\n" +
"anaalafgezogen slettenbak\n" +
"anaalgeneraal\n" +
"anaalgarnaal\n" +
"anaalist\n" +
"anaaljager\n" +
"anaalbkabaal\n" +
"anaalkameraad\n" +
"anaalkanaal\n" +
"anaalkanibaal\n" +
"anaalkoraal\n" +
"anaalkanaalkannibaal\n" +
"anaalkever\n" +
"anaalnemende flubberkut\n" +
"anaalpaal\n" +
"anaalridder\n" +
"anaaltoerist\n" +
"anakoloet\n" +
"anale arbeider\n" +
"analfabeet\n" +
"ankerboer\n" +
"anorexia slet\n" +
"anthraciet\n" +
"anthropopithecanthropus\n" +
"anus\n" +
"anus likkende frikandellen pijper\n" +
"anusacrobaat\n" +
"anusastronout\n" +
"anusbikker\n" +
"anusbuisvergruiser\n" +
"anuscoureur\n" +
"anusgezwel\n" +
"anusgezicht\n" +
"anusgitaar\n" +
"anushaargrabbelaar\n" +
"anushaarslingeraar\n" +
"anushaarvreter\n" +
"anushaarknabbelaar\n" +
"anushoofd\n" +
"anushopper\n" +
"anuskanaalninja\n" +
"anuskringspiermusketierdier - slingerpier\n" +
"anuslikkendekontkever\n" +
"anuslikker\n" +
"anusnicht\n" +
"anusontkalker\n" +
"apekut\n" +
"apegaper\n" +
"apenflikerneuker\n" +
"apewaffel\n" +
"argeologisch kontfossiel\n" +
"armoedversprijder\n" +
"baarmoederwandschimmel\n" +
"bafferik\n" +
"bafkoning\n" +
"bafstaaf\n" +
"baggerbult\n" +
"baggeraap\n" +
"baggeraar\n" +
"baggerbeer\n" +
"baggerboer\n" +
"baggerhoer\n" +
"baggerlip\n" +
"baggerslet\n" +
"bakhoer\n" +
"baklap\n" +
"bakslet\n" +
"bakvis\n" +
"balgehaktmethaar\n" +
"balhaar\n" +
"baliekluiver\n" +
"balkan-hork\n" +
"ballebaars\n" +
"ballekratser\n" +
"ballenbatser\n" +
"ballenbeuker\n" +
"ballenhoofd\n" +
"ballenlikker\n" +
"ballenstamper\n" +
"ballonnekenskop\n" +
"balneuker\n" +
"baloog\n" +
"balzak\n" +
"balzak vreter\n" +
"bamboebal\n" +
"bamboebuiger\n" +
"bamibal\n" +
"bamiboer\n" +
"bamikanariewenkbrauw\n" +
"banaan\n" +
"banaanaapje\n" +
"bananendief\n" +
"banaanspuitslet\n" +
"banaanspruitslet\n" +
"banaliteit\n" +
"bananenbeffer\n" +
"bananenfretter\n" +
"bananenhoofd\n" +
"bananenschil\n" +
"bananenzuiger\n" +
"bandenlip\n" +
"bandiet\n" +
"bange bladluis\n" +
"bangerd\n" +
"bangerik\n" +
"banjer\n" +
"barbiebeffendekutaap\n" +
"barbiekut\n" +
"barbietrut\n" +
"barebacker\n" +
"basji-boezoek\n" +
"basji-boezoek uit de karpaten\n" +
"bassierassie\n" +
"bastaardkind\n" +
"batsslet\n" +
"battyboy\n" +
"baviaan\n" +
"bavianenbeffer\n" +
"bavianenkuthoofd\n" +
"bavianenkop\n" +
"bavianenneuker\n" +
"bavianenrukker\n" +
"beast\n" +
"beddepisser\n" +
"beeldenstormer\n" +
"bengelende piemel pik\n" +
"beer\n" +
"beers\n" +
"beerputworm\n" +
"bef\n" +
"bef16\n" +
"befaap\n" +
"befbanaan\n" +
"befbek\n" +
"befbeugel\n" +
"befbever\n" +
"beffende berggeit\n" +
"beffende schaamlip\n" +
"befgaaius\n" +
"befgeit\n" +
"befkoe\n" +
"beflap\n" +
"beflapje\n" +
"beflijster\n" +
"beflulhanger\n" +
"befhenk\n" +
"befhoer\n" +
"befkever\n" +
"befkikker\n" +
"befkoning\n" +
"befman\n" +
"befschaap\n" +
"befslet\n" +
"befslurper\n" +
"befsmurf\n" +
"befsnol\n" +
"beftackle\n" +
"beftekkel\n" +
"befvlees\n" +
"bejaardehoer\n" +
"bekakteneuker\n" +
"bekkenbeul\n" +
"bekschurft\n" +
"berber\n" +
"bereden politieagent\n" +
"berenanus\n" +
"berenneuker\n" +
"berenlul\n" +
"berggeitballer\n" +
"berggeitneuker\n" +
"bergkwabaal\n" +
"bermslet\n" +
"beroepskoe\n" +
"beroepswww'er\n" +
"beschetendakvenster\n" +
"beschimmeldefriekandel\n" +
"beschimmeldepaardenlul\n" +
"beschuitlul\n" +
"besmettelijke tongblaar\n" +
"betonrot\n" +
"beul\n" +
"beulemanser\n" +
"beunhaas\n" +
"beverbeffer\n" +
"bezopen kokosmakroon\n" +
"bidonviller\n" +
"bierbeul\n" +
"bietjesbakker\n" +
"big\n" +
"bigbaffer\n" +
"bigbeffer\n" +
"biggebilbeffer\n" +
"biggebraaksel\n" +
"biggelikker\n" +
"biggenbilbeffer\n" +
"biggenbraaksel\n" +
"biggenneuker\n" +
"biggy-wiggy\n" +
"behaardekloteapenanus\n" +
"behaardekutapenanus\n" +
"behaarde adhd trekkende kut\n" +
"biggenviool\n" +
"biggenwipper\n" +
"bijbal-eter\n" +
"bijbal-bijter\n" +
"bijbalontsteking\n" +
"bijgoochem\n" +
"bijprodukt\n" +
"bikkel\n" +
"bilbeuker\n" +
"bilcrosser\n" +
"bilkrokodil\n" +
"billekip\n" +
"billepik\n" +
"billenbatser\n" +
"billenbeffer\n" +
"billenrijder\n" +
"billiefretter\n" +
"billpijper\n" +
"bilnaadbeklimmer\n" +
"bilnaadfanaat\n" +
"bilnaadkamaraad\n" +
"bilnaadkandidaat\n" +
"bilnaadpiraat\n" +
"bilnaadskier\n" +
"bilracer\n" +
"bilridder\n" +
"bilspiermusketier\n" +
"bilspleetatleet\n" +
"bilspleetoprekker\n" +
"bilspeetragger\n" +
"bilspeetsamoerai\n" +
"bipsbaviaan\n" +
"bipsdipper\n" +
"bipsvingeraar\n" +
"bisexuelenecrofiel\n" +
"bitchkomkommer\n" +
"bladharker\n" +
"blafaap\n" +
"blafbal\n" +
"blaftering\n" +
"blalo-lijer\n" +
"blauwbaard\n" +
"bleekscheet\n" +
"bleetscheet\n" +
"blikkenhater\n" +
"bloedhoer\n" +
"bloedhond\n" +
"bloedkop\n" +
"bloedkut\n" +
"bloedpoepende indianenhoer\n" +
"bloedpoeper\n" +
"blondeaarshaarvlechter\n" +
"blondehoer\n" +
"blotekloteloper\n" +
"blotekontengezicht\n" +
"blubberkut\n" +
"bluestar\n" +
"blufhufter\n" +
"blubzak\n" +
"blurb\n" +
"bobbelkont\n" +
"bobbelkut\n" +
"bobbelnazi\n" +
"bobbelnek\n" +
"bochel\n" +
"boelahoepa\n" +
"boemelebassen\n" +
"boenjoel\n" +
"boekenworm\n" +
"boekenwurm\n" +
"boeler\n" +
"boelkind\n" +
"boer\n" +
"boeregabber\n" +
"boerenhoofd\n" +
"boerenkut\n" +
"boerenlul\n" +
"boerenpuistenknijper\n" +
"boerentriene\n" +
"boerenworst\n" +
"bokkeketser\n" +
"bokkekut\n" +
"bokkel\n" +
"bokkenlul\n" +
"bokkepenis\n" +
"bokkepok\n" +
"bokkerbeffer\n" +
"bokko\n" +
"bolleke petvet\n" +
"bolletjepretvet\n" +
"bollusdraaier\n" +
"boominfanterist\n" +
"boomkutreetkever\n" +
"boomschatter\n" +
"bombardeerkever\n" +
"bonkstreuf\n" +
"bonzai kutje\n" +
"bosbeffer\n" +
"bosbes\n" +
"bosbonker\n" +
"bosjesneger\n" +
"boskut\n" +
"boskameel\n" +
"boskoe\n" +
"bosmongool\n" +
"bosprotter\n" +
"boterlul\n" +
"braakhut\n" +
"bralaap\n" +
"breedbekzoeloe\n" +
"breezerslet\n" +
"breibitch\n" +
"breuker\n" +
"brilleflikker\n" +
"brilsmoel\n" +
"brinkie-aap\n" +
"brintanicht\n" +
"broccoliehoofd\n" +
"broccoliekop\n" +
"broekkakker\n" +
"brogem\n" +
"brontosaurus\n" +
"broodmongool\n" +
"brubbelkut\n" +
"brugkut\n" +
"brugpieper\n" +
"bruidsuikertemeijer\n" +
"bruinduiker\n" +
"bruinekruisruiker\n" +
"bruinridder\n" +
"brulkip\n" +
"bse-drager\n" +
"buffelbutser\n" +
"buffelleuter\n" +
"buitenlander\n" +
"bukeend\n" +
"bulexmule\n" +
"bult\n" +
"bultezel\n" +
"bultrug\n" +
"bultrugkonijn\n" +
"bunkerhoer\n" +
"bunzig\n" +
"bushalt-hoertje\n" +
"but\n" +
"buttfucker\n" +
"campingreed\n" +
"centernschraper\n" +
"centromeerloze chromatiet\n" +
"cocosmattevreter\n" +
"champignonkoppeke\n" +
"chatnicht\n" +
"choco\n" +
"chocobakbeest\n" +
"chocodipper\n" +
"chocohoer\n" +
"chocoladeridder\n" +
"chocoladesjofel\n" +
"chokoladeridder\n" +
"chocopotjesdipper\n" +
"chocopotjeslikker\n" +
"chocoprins\n" +
"cholerabacterie\n" +
"choleravlinder\n" +
"clipse\n" +
"cliteter\n" +
"clausjanis\n" +
"clubkut\n" +
"cobra\n" +
"cobrakut\n" +
"cocksucker\n" +
"coloradokever\n" +
"completaan\n" +
"computerteletubie\n" +
"condoom\n" +
"condoomcoureur\n" +
"coolzaeter\n" +
"cousum\n" +
"crackhoer\n" +
"currieknijper\n" +
"curry kop\n" +
"cut\n" +
"cutekak\n" +
"cutkruiper\n" +
"cuvry\n" +
"cyberhoer\n" +
"cyberslet\n" +
"cybersnol\n" +
"cycloon\n" +
"cyclotron\n" +
"cyrano\n" +
"cyrano op vier poten\n" +
"dashond\n" +
"deegsliert\n" +
"deis\n" +
"dekhengst\n" +
"dekslet\n" +
"delege\n" +
"dendorfiel\n" +
"deprikut\n" +
"diarreegorgelaar\n" +
"diareedrol\n" +
"diareekop\n" +
"diareedruppel\n" +
"dierofiel\n" +
"dijkhoer\n" +
"dikbeer\n" +
"dikhoofd\n" +
"dikkedrek\n" +
"dikkepad\n" +
"dikke loopse takkenteef\n" +
"dikke vieze vatzige vuile kut big\n" +
"dildoeend\n" +
"dildohapper\n" +
"dildo kip\n" +
"dikkekop\n" +
"diktong\n" +
"dikkiedik\n" +
"dikkop\n" +
"dildo\n" +
"dildodel\n" +
"dildotrekker\n" +
"diplodocus\n" +
"dipstick\n" +
"dismonetarier\n" +
"dixiuitzuiger\n" +
"dobby\n" +
"doe-het-zelf-hoer\n" +
"dominante sm-teef\n" +
"dommerat\n" +
"doodgestampte-rat\n" +
"doodrijder\n" +
"doodvlees\n" +
"doolhofschijter\n" +
"doorgelekteprikker\n" +
"doos\n" +
"dopoog\n" +
"drakenbaby\n" +
"drempelkut\n" +
"drankkar\n" +
"dreugkleut\n" +
"driedubbeldoorgedraaide kontenneuker\n" +
"driedubbel uitdepotgerukte kutpedofiel\n" +
"drilboorpastoor\n" +
"droge visjes eter\n" +
"drol\n" +
"drolduiker\n" +
"drollebak\n" +
"drolleman\n" +
"drollendeuker\n" +
"drolleneuker\n" +
"drollendouwer\n" +
"drollenjanus\n" +
"drollenpijper\n" +
"drollendraaier\n" +
"drolletjedrie\n" +
"dromedarisruftverzamelaar\n" +
"dronkelap\n" +
"drooggepomptevogelneuker\n" +
"droogkloot\n" +
"dropjojo\n" +
"dropkut\n" +
"droplul\n" +
"dropwater\n" +
"druifluis\n" +
"druiper\n" +
"druipscheet\n" +
"drullik\n" +
"dubbeldoorgehaalde neukfout\n" +
"duckfucker\n" +
"duikbootcommissaris\n" +
"duinbewoner\n" +
"duyvejonck\n" +
"dundas\n" +
"dwarrel\n" +
"dwergpapegaai\n" +
"ectoplastisch bijprodukt\n" +
"endeldarmkannonier\n" +
"endeldarmtouroperator\n" +
"eekhoornneuker\n" +
"egoistischekrentenkakker\n" +
"eikelschijf\n" +
"eikelspleet\n" +
"eikeltumor\n" +
"eikenhoutekoeienkut\n" +
"ellendelaar\n" +
"emmerkut\n" +
"endeldarmbeklimmer\n" +
"endeldarmexploitant\n" +
"endeldarmkruiper\n" +
"endeldarmoprekker\n" +
"endeldarmschoffelaar\n" +
"endeldarmtoerist\n" +
"ersatzmatroos\n" +
"espressonicht\n" +
"etalagesloerie\n" +
"everzwijnenpoeper\n" +
"exeempikkie\n" +
"ezelskop\n" +
"ezelskut\n" +
"ezelslul\n" +
"ezelsoor\n" +
"fietsbeldief\n" +
"fietsendief zonder herssens\n" +
"flapscooter\n" +
"flemmietok\n" +
"flerkie\n" +
"flipperkastflikker\n" +
"flippoot\n" +
"fibo\n" +
"fish fucker\n" +
"flitspoeper\n" +
"flubberkut\n" +
"flubberkutje\n" +
"fluitketel\n" +
"flutkut\n" +
"floepeend\n" +
"floeptiet\n" +
"floskop\n" +
"flowhoofd\n" +
"fluotrut\n" +
"foetus\n" +
"folteraar\n" +
"fout\n" +
"foutje\n" +
"franskiljon\n" +
"fratsekop\n" +
"freak\n" +
"friemel\n" +
"friemelhoofd\n" +
"frikandel\n" +
"foor-aap\n" +
"fucker\n" +
"fuckface\n" +
"fuck you\n" +
"fuckingkutkop\n" +
"fucionfucker\n" +
"fuffizeeers\n" +
"fluimekop\n" +
"gatbatser\n" +
"gatlarf\n" +
"gatbal\n" +
"gatgarnaal\n" +
"gatracer\n" +
"gatridder\n" +
"gatspier musketier\n" +
"gatzitter\n" +
"gebalde balbabber\n" +
"gebalde kwelkwabber\n" +
"gebefte anuskanibaal\n" +
"geblondeerde strontbosaap\n" +
"geblondeerde kuthoer\n" +
"gebochelte\n" +
"gebrandefrikandel\n" +
"gebreide teletubbie rietje\n" +
"gecastreerde gorilla in de mist\n" +
"gedrogt\n" +
"geek\n" +
"geflambeerde boomschorsbeffer\n" +
"geflambeerde landrot\n" +
"geflipte pingvogel\n" +
"gehaktbal\n" +
"geile aap\n" +
"geit\n" +
"geitebeffer\n" +
"geitegewei\n" +
"geitegezicht\n" +
"geitekut\n" +
"geitelul\n" +
"geitepijper\n" +
"geitenbaffer\n" +
"geitenbeffer\n" +
"geitenbek\n" +
"geitendekker\n" +
"geitenhoer\n" +
"geitennakker\n" +
"geitenwipper\n" +
"geit-op-skies\n" +
"gek\n" +
"gele vla pissebed\n" +
"gelukte abortus\n" +
"genetische fout\n" +
"geperforeerd geufdier\n" +
"gepekop\n" +
"gepijpte tepelhaarlikker\n" +
"gepoepte-baarmoederschimmel\n" +
"geschorenbefpoedel\n" +
"geschuurdecondoom kutkind\n" +
"gespierde handdoek\n" +
"gespierde spijker\n" +
"gezaaide bloembolknop\n" +
"gier\n" +
"gierkut\n" +
"gierputsnuiver\n" +
"gillendezweinendrol\n" +
"gladiool\n" +
"gladjakker\n" +
"gleufdier\n" +
"gleufdierschaamlipspier\n" +
"gleufdoos\n" +
"gleufgeiler\n" +
"gleufgladiool\n" +
"gleufjesruuker\n" +
"gleufridder\n" +
"glibberkut\n" +
"gluipdeken\n" +
"gnoe\n" +
"goddeloze\n" +
"goedkope circushoer\n" +
"goof\n" +
"gootsteenneuker\n" +
"gordijnenkut\n" +
"gore marmot\n" +
"gorgeldrank\n" +
"graaikraai\n" +
"grafbak\n" +
"grafhengst\n" +
"grafhoer\n" +
"grafjanhomokankerfiel\n" +
"grafkop\n" +
"grafkut\n" +
"graflul\n" +
"grafmongool\n" +
"grafpegel\n" +
"graftiefusdebiel\n" +
"grafzerk\n" +
"granenkut met weerhaken\n" +
"granolsnol\n" +
"graskaffer\n" +
"graszuiger\n" +
"gratekut\n" +
"gratenkut\n" +
"gratenkut met weerhaken\n" +
"gratenpakhuis\n" +
"greppelbeffer\n" +
"greppeldel\n" +
"greppelheks\n" +
"greppelhoer\n" +
"greppelslet\n" +
"greppelsletten\n" +
"griezel\n" +
"grindtegel\n" +
"groeiknuppel\n" +
"groningsebijstandshoer\n" +
"grotjeskicker\n" +
"gulpenruiker\n" +
"gulpenrukker\n" +
"gulpensnuiver\n" +
"gyroscoop\n" +
"halfuitgekakte kwallendrol\n" +
"halve tamme\n" +
"hanenwipper\n" +
"hanglaaf\n" +
"hangoor\n" +
"hangtietzeug\n" +
"hangzakschaap\n" +
"hapschaar\n" +
"haringvulva\n" +
"harlekijn\n" +
"harrie\n" +
"harslijer\n" +
"hatseflats\n" +
"hazenbroek\n" +
"hazentand\n" +
"hazenwinkel\n" +
"heaumeaux\n" +
"heggeneuker\n" +
"heggewipper\n" +
"heidene\n" +
"hemahoer\n" +
"hemelpiloot\n" +
"hemelpiraat\n" +
"henkjansmit\n" +
"hermafrodiet\n" +
"heroinehoerenkankerkind\n" +
"herre\n" +
"hersenloze zaadcel\n" +
"hersenschim\n" +
"hertensnikkel\n" +
"hielenlikker\n" +
"hieperkinetische plasbek\n" +
"hipperkinetische hondendrol\n" +
"hippie\n" +
"hippy\n" +
"hindoeridder\n" +
"hinnepoeper\n" +
"hitsige aap\n" +
"hittepetit\n" +
"hobbyhoer\n" +
"hoerebok\n" +
"hoerejong\n" +
"hoerenkots\n" +
"hoerenkut\n" +
"hoerenloper\n" +
"hoerenzoon\n" +
"hoerenzwam\n" +
"hoerepoeper\n" +
"hoerezak\n" +
"hoerperser\n" +
"hoerslijper\n" +
"holbewoner\n" +
"holjokker\n" +
"holmaat\n" +
"holstrontverklonteraar\n" +
"holstrontverklontering\n" +
"holtor\n" +
"holtorneuker\n" +
"homofiel\n" +
"homofielebewaker\n" +
"homofielebroodpoot\n" +
"homogenetische kameleon\n" +
"homojager\n" +
"homohoer\n" +
"homokut\n" +
"homolesbieseflikker\n" +
"homonaaier\n" +
"homopatische genotsflikker\n" +
"homofiele varkensboer\n" +
"homo sapiën\n" +
"hond\n" +
"hondekut\n" +
"hondelul\n" +
"hondenfacker\n" +
"hondenkrikker\n" +
"hondenneuker\n" +
"hondenpoependelul\n" +
"hondenwipper\n" +
"hondenzak\n" +
"hondestront\n" +
"hondneukende paardenlul\n" +
"hondsbolheid\n" +
"hondsvod\n" +
"hornox\n" +
"houtworm\n" +
"huisaan huisslet\n" +
"huiself\n" +
"huisjesmelker\n" +
"humushond\n" +
"hunky dunky\n" +
"huppelende kamelenkut\n" +
"huppelde kuttemefrutteslut\n" +
"huppelkutje\n" +
"huppelkutter\n" +
"huppelmuts\n" +
"huppeltrut\n" +
"hupperkutter\n" +
"hupsel\n" +
"hurksnol\n" +
"hutkoffer op wielen\n" +
"hypocriet\n" +
"hyperkinetische hondendrol\n" +
"hyperkinetische plasbek\n" +
"ibbeltje\n" +
"idikut\n" +
"ijskoningin\n" +
"ijslul\n" +
"imbiciel\n" +
"imitatie-carnavals-mussolini\n" +
"impotente lul\n" +
"impotentietor\n" +
"inboorling\n" +
"indianus\n" +
"iniminimale homoseksuele ingepakte kamelenscheet\n" +
"indekontgeneuktescheltrompet\n" +
"iniminimaximale homosexuele afgelakte peombaksmoel\n" +
"ingedeukte vetrol\n" +
"ingegroeidekonthaar\n" +
"jatskont\n" +
"jam-bek\n" +
"jeukkut\n" +
"javaanse beftekkel\n" +
"jobsex\n" +
"jodenkoek\n" +
"jodenneuker\n" +
"judatiger\n" +
"juleslikker\n" +
"kakgarnaal\n" +
"kale inktvisdrol\n" +
"kameel\n" +
"kamelenlul\n" +
"kamelenpijper\n" +
"kamelenridder\n" +
"kamelenvanger\n" +
"kamelenteen\n" +
"kamelenzuurvleesoog\n" +
"kamerolifant\n" +
"kamperhoer\n" +
"kampschreur\n" +
"kanaak\n" +
"kanalenveger\n" +
"kanarieneuker\n" +
"kannekijker\n" +
"kansloze muizenbeffer\n" +
"kaper\n" +
"kapitein breedbeer\n" +
"karpaten-papoea\n" +
"kasplant\n" +
"katoenplukker\n" +
"kattenkontneuker\n" +
"kattenkrikker\n" +
"kebabflap\n" +
"keeskop\n" +
"keilewegslet\n" +
"kelderdel\n" +
"kenobi\n" +
"kerkhoefhoer\n" +
"kerkhofslet\n" +
"kermisfritbarak\n" +
"kermissletje\n" +
"ketsdwerg\n" +
"ketser\n" +
"ketter\n" +
"keutelbaviaan\n" +
"keuteldeuker\n" +
"keutelduiker\n" +
"keutelkauwer\n" +
"keutelkop\n" +
"keuteltikker\n" +
"kever\n" +
"keverkut\n" +
"kidnapper\n" +
"kieken\n" +
"kiewiekut\n" +
"kikkerbil\n" +
"kikkerkop\n" +
"killerzaad\n" +
"kilometervreter\n" +
"kinderlikker\n" +
"kinderlokker\n" +
"kinderpedofoon\n" +
"kinkut\n" +
"kip\n" +
"kippekut\n" +
"kippenneuker\n" +
"kip zonder kop\n" +
"kistenkut\n" +
"kistkalf\n" +
"kittelikker\n" +
"klaphark\n" +
"klapkut\n" +
"kiwikut\n" +
"klappekut\n" +
"klapperkut\n" +
"klapperzak\n" +
"kleefkut\n" +
"kleffe teelbal\n" +
"klepzeiker\n" +
"klereflikker\n" +
"kleurspoeling\n" +
"kleuterschool\n" +
"kliekkop\n" +
"kliekkind\n" +
"klieklijer\n" +
"klimwand(puisten)\n" +
"klitlikker\n" +
"klittekut\n" +
"kloefkapper\n" +
"kloekepik\n" +
"kloekhorst\n" +
"klokkeluier\n" +
"klokkenbeffer\n" +
"klompenkut\n" +
"klont\n" +
"klonterkak\n" +
"kloot\n" +
"klootbek\n" +
"klootbever\n" +
"kloothommel\n" +
"kloothoofd\n" +
"klootjavaan\n" +
"klootjebijter\n" +
"klootkip\n" +
"klootoog\n" +
"klootspiraal\n" +
"klootstrijker\n" +
"klootveter\n" +
"klootviool\n" +
"klootvis\n" +
"klotebibber\n" +
"klotefucker\n" +
"klotehufter\n" +
"kloteklapper\n" +
"klotelikker\n" +
"klotelul\n" +
"klotenklapper\n" +
"klotenklopper\n" +
"klotenkusser\n" +
"klotige fucker\n" +
"klotser\n" +
"klotskop\n" +
"klut\n" +
"klutser\n" +
"knalbal\n" +
"knalkop\n" +
"knalkut\n" +
"knakworst\n" +
"knaning\n" +
"knasterhuis\n" +
"knetterkakker\n" +
"knevelkut\n" +
"knikkerhoofd\n" +
"knipnicht\n" +
"knobbelkop\n" +
"knol\n" +
"knuppelfenomeen\n" +
"knuppelrukker\n" +
"knurftschurft\n" +
"koala\n" +
"koe\n" +
"koebeer\n" +
"koei\n" +
"koeiekut\n" +
"koeienflatswerver\n" +
"koeienkop\n" +
"koeienkut\n" +
"koeienlul\n" +
"koeienneuker\n" +
"koeienswans\n" +
"koeistront\n" +
"koeienuier\n" +
"koekepan\n" +
"koekbek\n" +
"koekwous\n" +
"koelie\n" +
"koelkastlampie\n" +
"koepok\n" +
"kofferhoer\n" +
"kokkelende kakkerlak\n" +
"kokosnoot\n" +
"kolokwint\n" +
"komkommer\n" +
"komkommerkut\n" +
"kommaneuker\n" +
"konijnennaaier\n" +
"konijnenneuker\n" +
"kont\n" +
"kontbonker\n" +
"kontcoureur\n" +
"kontcrossende\n" +
"kontegezicht\n" +
"konteketser\n" +
"kontekleverkever\n" +
"konteklimmer\n" +
"kontekratser\n" +
"kontekroeper\n" +
"kontekuiser\n" +
"kontenbonker\n" +
"kontenketser\n" +
"kontenkruiper\n" +
"kontenkuiser\n" +
"kontenlikker\n" +
"kontenneuker\n" +
"kontenpakker\n" +
"kontgat\n" +
"kontgatmusketier\n" +
"konthaar\n" +
"konthaareter\n" +
"konthaarkorrel\n" +
"konthaarknipper\n" +
"konthaarkrabber\n" +
"konthaarpilaar\n" +
"konthaarverzamelaar\n" +
"konthaarvlechter\n" +
"konthoer\n" +
"kontie\n" +
"kontjebroezer\n" +
"kontkever\n" +
"kontklontenbonker\n" +
"kontklosser\n" +
"klontkors\n" +
"kontkorst\n" +
"kontkorsthaar\n" +
"kontkorstkrabber\n" +
"kontkorstkrauwer\n" +
"kontkorstkrabbelaar\n" +
"kontkrauwer\n" +
"kontkrol\n" +
"kontkruimel\n" +
"kontlikker\n" +
"kontlikkendeslijmbalongool\n" +
"kontmaatje\n" +
"kontridder\n" +
"kontspiermusketier\n" +
"kontvocht\n" +
"koolhydraat\n" +
"koolwaterstof-extract\n" +
"koopavondteef\n" +
"koopman\n" +
"koorddanser\n" +
"kopkaasknabbelaar\n" +
"kopkaassoufflé\n" +
"kopkaasvreter\n" +
"kopkluiver\n" +
"koppensneller\n" +
"korrelvreter\n" +
"kotskop\n" +
"kotszakophaler\n" +
"kotvarken\n" +
"krapuul\n" +
"kreeftenkutlikker\n" +
"krekelpijper\n" +
"krentenbaard\n" +
"krikhoer\n" +
"kringspier\n" +
"kringspierklever\n" +
"kringspierturner\n" +
"kroesgeit\n" +
"kroeskop\n" +
"kroeskut\n" +
"krokante gabber\n" +
"krokettor\n" +
"kropdrager\n" +
"kropdrager uit de appenijnen\n" +
"kropmens\n" +
"krotekoker\n" +
"kruikenkop\n" +
"kruikenkruiper\n" +
"kruipneger\n" +
"kruizensnuiver\n" +
"krukkel\n" +
"krulparasiet\n" +
"kuft\n" +
"ku-klux-klanner\n" +
"kusmekloteamateur\n" +
"kutaap\n" +
"kutbeffer\n" +
"kutbelg\n" +
"kutboer\n" +
"kut clitoris\n" +
"kutdeksel\n" +
"kutfluit\n" +
"kutfricandel\n" +
"kutgast\n" +
"kutgezicht\n" +
"kutgitaar\n" +
"kuthaarflosser\n" +
"kuthoer\n" +
"kuthommel\n" +
"kuthond\n" +
"kuthoofd\n" +
"kutjandosie\n" +
"kutjanus\n" +
"kutje-pik-andijvie\n" +
"kutjebef\n" +
"kutjebefbef\n" +
"kutje de bruin\n" +
"kutje pikandijfie\n" +
"kutjekleier\n" +
"kutjeplof\n" +
"kutjeskin\n" +
"kutjeslurper\n" +
"kutkabauter\n" +
"kutkachel\n" +
"kutkak\n" +
"kutkind\n" +
"kutkip\n" +
"kutklusser\n" +
"kutknabbelaar\n" +
"kutkop\n" +
"kutkorst\n" +
"kutkrekel\n" +
"kutlap\n" +
"kutleier\n" +
"kutlul\n" +
"kuttekop\n" +
"kuttekoper\n" +
"kuttelikker\n" +
"kuttelikkertje\n" +
"kuttesneuver\n" +
"kuttintelijer\n" +
"kutlip\n" +
"kutlullo\n" +
"kutlurker\n" +
"kutmadam\n" +
"kutmatroos\n" +
"kutmeloen\n" +
"kut met weerhaken\n" +
"kutmongool\n" +
"kutontstopper\n" +
"kutsapslurper\n" +
"kutslet\n" +
"kuttekrabber\n" +
"kunnteknopers\n" +
"kuttekoppen\n" +
"kuttenlikkendesroeikever\n" +
"kuttenlikker\n" +
"kuttenneuker\n" +
"kuttenstamper\n" +
"kuttewapper\n" +
"kuttezakker\n" +
"kuttezuiger\n" +
"kutveger\n" +
"kutviool\n" +
"kutvloeistof\n" +
"kutwrijver\n" +
"kutzak\n" +
"kutzwabber\n" +
"kwaekert\n" +
"kwakbak\n" +
"kwakbol\n" +
"kwakslikbakbeest\n" +
"kwakzalver\n" +
"kwalkut\n" +
"kwallekop\n" +
"kwalschijter\n" +
"kwanto\n" +
"kween\n" +
"kwijlwortel\n" +
"kwispelkont\n" +
"kwistenbiebel\n" +
"laagvliegendestrondbaviaan\n" +
"lasagnelul\n" +
"labbekak\n" +
"labellopotjes pijper\n" +
"lambal\n" +
"lekkerbek\n" +
"lelijk\n" +
"lelijkerd\n" +
"lepellikker\n" +
"leprakind\n" +
"leprasnikkel\n" +
"lesbie\n" +
"lesbische konijnenkut\n" +
"lesbische vingerplant\n" +
"leuningbijter\n" +
"lichtgevend eendagsvliegje\n" +
"lijkenlikker\n" +
"lijkenneuker\n" +
"lijkenprikker\n" +
"lijkenwipper\n" +
"lijpe\n" +
"lijpo\n" +
"lijpedildo\n" +
"lijpe-dodo\n" +
"likbaard\n" +
"likhond\n" +
"likkende baardaap\n" +
"likvis\n" +
"linksdraaiende biogardehufter\n" +
"lintwormlikker\n" +
"liplama\n" +
"locomotrutfant\n" +
"loempialul\n" +
"loempiavouwer\n" +
"loerak\n" +
"lompe\n" +
"lompeezel\n" +
"lompelul\n" +
"longlijer\n" +
"longpleur\n" +
"lookalike\n" +
"lord of the strings\n" +
"lorejas\n" +
"lorrekut\n" +
"loser\n" +
"losgeslaagde aap\n" +
"losgeslaagde idioot\n" +
"loslopende soa\n" +
"loslopende vaginale infectie\n" +
"luihoofd\n" +
"luis\n" +
"luizenlul\n" +
"luizigaard\n" +
"lulblubber\n" +
"luldebehanger\n" +
"lulhannes\n" +
"lulhoofd\n" +
"lulijzer\n" +
"luljanus\n" +
"lullebadje\n" +
"lullelikker\n" +
"lulleloper\n" +
"lullenbijter\n" +
"lullenknabbelaar\n" +
"lullenkotser\n" +
"lullenvreter\n" +
"lullepijp\n" +
"lulvinger\n" +
"lullewatten\n" +
"lulzuiger\n" +
"lullo\n" +
"lulskie\n" +
"lummeltol\n" +
"luster\n" +
"maagdelijke pornoactrice\n" +
"maagpens\n" +
"malerd\n" +
"maltdrinker\n" +
"mameluk\n" +
"mamaslieverdje\n" +
"mama'skindje\n" +
"mamasexer\n" +
"mannelijke nudist\n" +
"mannenprakker\n" +
"manusje van alles\n" +
"manverzachter\n" +
"manwijf\n" +
"mapamapa\n" +
"mapima\n" +
"marginaal\n" +
"marinoschaap\n" +
"maskerade-inca\n" +
"maskeradevrijbuiter\n" +
"masturbarie\n" +
"mastrubeer\n" +
"mau-mauer\n" +
"maximilia\n" +
"mayomuil\n" +
"meeëter\n" +
"meeloper\n" +
"meeroller\n" +
"meeuwenflats\n" +
"megacycle\n" +
"megafallus\n" +
"megalomaan\n" +
"melkmuil\n" +
"mellow-teef\n" +
"meloen\n" +
"mensaap\n" +
"menseneter\n" +
"mestbek\n" +
"metadon-snol\n" +
"microfiel\n" +
"micromini mierentietje\n" +
"middelbaar gefrustreerd wijf\n" +
"miepkadet\n" +
"mierennaaier\n" +
"miereneter\n" +
"mierenmelker\n" +
"mierkut\n" +
"mietje\n" +
"minimasnol\n" +
"minimumloonhoer\n" +
"minipik\n" +
"miskraam\n" +
"miskraamkop\n" +
"mislukte barbiepop\n" +
"mislukteembrio\n" +
"misluktemiskraam\n" +
"mislukt product van de hedendaagse maatschapij\n" +
"mislukte handelaar in tweedehands vogelmest\n" +
"mislukte zaadlozing\n" +
"mislukt varkenslapje\n" +
"mismaaksel\n" +
"misneuker\n" +
"mispel\n" +
"mobifiel\n" +
"modekut\n" +
"modetrut\n" +
"modetrutje\n" +
"moederkoekje\n" +
"moederkoekkut\n" +
"moederkoekslijm\n" +
"moederneuker\n" +
"moederneukendeaap\n" +
"moederskindje\n" +
"moffrikaan\n" +
"mokkagrotbezoeker\n" +
"molenteef\n" +
"mombakkes\n" +
"mongolekut\n" +
"mongolenbeffer\n" +
"mongolenkut\n" +
"monk\n" +
"monkyboy monnik\n" +
"moordenaar\n" +
"moraalridder\n" +
"moslip\n" +
"mossel\n" +
"mosselbakkes\n" +
"mosterdgast\n" +
"mosterdpap\n" +
"motherfucker\n" +
"mountendeldarmbeklimmer\n" +
"muis\n" +
"muppet\n" +
"muppetlolly\n" +
"murfgeluldedaewoorijder\n" +
"murk\n" +
"mutsenplukker\n" +
"mutten\n" +
"natbal\n" +
"natje\n" +
"natkut\n" +
"nattekut\n" +
"nazibal\n" +
"nazihoer\n" +
"nazikont\n" +
"neanderthaler\n" +
"necrofiel\n" +
"necrosorofiel\n" +
"neger\n" +
"negerlul\n" +
"net gecastreerde\n" +
"netverslaafde\n" +
"netwerkfout\n" +
"neukbijbel\n" +
"neukendewipaap\n" +
"neukfout\n" +
"neukgleuf\n" +
"neukhoofd\n" +
"neukkabouter\n" +
"neukkonijn\n" +
"neuknaad\n" +
"neuknicht\n" +
"neukroomzuiger\n" +
"neukslet\n" +
"neukstengel\n" +
"neukterrorist\n" +
"neuktruffel\n" +
"neusaap\n" +
"neusneuker\n" +
"nichtebal\n" +
"nitraatmaat\n" +
"nevergonnebee\n" +
"nikkerwipper\n" +
"no-liver\n" +
"no-nek\n" +
"nogaspekulant\n" +
"nul\n" +
"oeroeboeroefoeki\n" +
"oliefantebabyface\n" +
"omabeffer\n" +
"omhooggevallengratenkut\n" +
"omhooggevallenolifant\n" +
"omhooggevallentrut\n" +
"omgezakte poot\n" +
"onafgelebberde spermadruipende penis\n" +
"onderbroekenverzamelaar\n" +
"onderontwikkelde-zeekomkommer\n" +
"ondergescheten vuilnisvrouw\n" +
"ondeugend knaapje\n" +
"ondeugende tienerhoer\n" +
"ongebruikte-omakut\n" +
"ongeliktebeer\n" +
"ongelikte berggeit\n" +
"ongeluk\n" +
"ongeschoren befchef\n" +
"ongestelde bloedworst\n" +
"ongestelde parkeend\n" +
"ongewassen bilnaad\n" +
"onnozel\n" +
"onnozelle\n" +
"onnozelaar\n" +
"ontbindend addergebroed\n" +
"ontdekkingsreiziger\n" +
"ontplofde bavianenlul\n" +
"onwelriekende gleuvenbrigade\n" +
"oomneuker\n" +
"oorbelmusketier\n" +
"oorsmeerworst\n" +
"oorwurm\n" +
"oorwurmneuker\n" +
"oorzak\n" +
"oostgoot\n" +
"opapijper\n" +
"opgeblazen-kamelenscheet\n" +
"opgepistepornopaal\n" +
"opperdombo\n" +
"opperwaus\n" +
"optiekhoer\n" +
"oraalkoraal\n" +
"ornithotynchus\n" +
"orgasmus\n" +
"orgelpijper\n" +
"osnicht\n" +
"osseknots\n" +
"ossenkut\n" +
"otter\n" +
"oudgepoeptezak\n" +
"ouwerukker\n" +
"ouwe trekezel\n" +
"overbijter\n" +
"overlekte peer\n" +
"overgepierste negerinnentet\n" +
"overmaasehazewindhonden\n" +
"korenmolenpestpokken\n" +
"overrijpepuist\n" +
"paardepenisneuker\n" +
"paashaasschaamhaar\n" +
"patatzak\n" +
"peepje\n" +
"penisafhakker\n" +
"penisleier penislekker\n" +
"pieleflats\n" +
"pielemuis\n" +
"pielewielie\n" +
"pielewieps\n" +
"piemelhoofdje\n" +
"piemelemoosje\n" +
"pietje piemelhoofd\n" +
"pijnboombeffer\n" +
"pikbroek\n" +
"pikgatjager\n" +
"pikhoofd\n" +
"pikkie\n" +
"pikkelikker\n" +
"pikkenlikker\n" +
"pikkentrekker\n" +
"pikkepoelie\n" +
"pikketrekker\n" +
"pikknopbult\n" +
"pikomhoog\n" +
"pikoog\n" +
"pikstok\n" +
"pikvocht\n" +
"pikzuiger\n" +
"pilbil\n" +
"pindaplukker\n" +
"pindavreter\n" +
"pinguinscheet\n" +
"pino\n" +
"pinopijper\n" +
"pinopijpvogel\n" +
"pintenman\n" +
"pipo\n" +
"piraat\n" +
"pisbakkenpoot\n" +
"pisbakneuker\n" +
"pisbuisje\n" +
"pisbuismug\n" +
"pisbuisuitzuiger\n" +
"pisgatneuker\n" +
"pisgezicht\n" +
"pishoofd\n" +
"piskabouter\n" +
"piskonijn\n" +
"piskont\n" +
"piskut\n" +
"pislama\n" +
"pislul\n" +
"pisklit\n" +
"pisnicht\n" +
"pispanty\n" +
"pissebed\n" +
"pisvinger\n" +
"pisvink\n" +
"pisvlek\n" +
"pithecantropus\n" +
"pkt-je\n" +
"plakhaas\n" +
"plakhoer\n" +
"plakkenamer\n" +
"plak-plaatjes-volk\n" +
"plas\n" +
"plasnicht\n" +
"plaspop\n" +
"plasser\n" +
"platborst\n" +
"platjesvreter\n" +
"platvoeter\n" +
"platzak\n" +
"plee\n" +
"pleerol\n" +
"pleeteef\n" +
"pleister op een houten been\n" +
"pleures\n" +
"ploeg\n" +
"ploertah\n" +
"ploerten\n" +
"plofdrek\n" +
"plofkip\n" +
"plofkop\n" +
"plork\n" +
"pluimezel\n" +
"pluruskut\n" +
"poedel\n" +
"poedelpijper\n" +
"poedelneuker\n" +
"poepchinees\n" +
"poepdooshoofd\n" +
"poepduim\n" +
"poepekrulhaar\n" +
"poeperd\n" +
"poepgat\n" +
"poephaan\n" +
"poephapper\n" +
"poephoer\n" +
"poephoofd\n" +
"poepkop\n" +
"poepkut\n" +
"poepkwab\n" +
"poepneger\n" +
"peopnerd\n" +
"poepneuker\n" +
"poepneukzak\n" +
"poepschijtendeanuslikker\n" +
"poepsexhomo\n" +
"poepslet\n" +
"poepsnoeper\n" +
"poepsnol\n" +
"poepstamper\n" +
"poepsterrenoprekker\n" +
"poepturk\n" +
"poepvinger\n" +
"poepvlek\n" +
"poepvreter\n" +
"poepzak\n" +
"poesiewaus\n" +
"poesjeslikker\n" +
"poeta\n" +
"pokkejong\n" +
"pokkemokkel\n" +
"pokkenteef\n" +
"pokketeringtakkewijf\n" +
"pokkewijf\n" +
"polderindiaan\n" +
"polderkoe\n" +
"poldersnol\n" +
"politieagent\n" +
"pollepol\n" +
"polstokpoldersnol\n" +
"pombaksmoel\n" +
"pompbakfreter\n" +
"pompslet\n" +
"ponchohoer\n" +
"ponkiewonkie\n" +
"ponylul\n" +
"poppennaaier\n" +
"poppenneuker\n" +
"pornokabouter\n" +
"pornomonster\n" +
"porno pedofiel\n" +
"portiekhoerslet\n" +
"portieksnol\n" +
"postpukkel\n" +
"portretslet\n" +
"pothoer\n" +
"potsenmaker\n" +
"potter\n" +
"potverdorie\n" +
"powerprulletje\n" +
"praatjesmaker\n" +
"pretletter\n" +
"pretslet\n" +
"preut\n" +
"preutelekker\n" +
"preutsesuet\n" +
"preutsekut\n" +
"preutse slet\n" +
"primitieveling\n" +
"printernaaier\n" +
"proefbuisbaby\n" +
"profiteur\n" +
"proleet\n" +
"prolurk\n" +
"promillageverlager\n" +
"prosessorneuker\n" +
"protozoen\n" +
"protput\n" +
"prottekop\n" +
"pruimtabak\n" +
"pruumenlikker\n" +
"pruthoofd\n" +
"prutlip\n" +
"psv'er\n" +
"puber\n" +
"puienzeiker\n" +
"puist\n" +
"puistekop\n" +
"puistekutje\n" +
"puistenhomo\n" +
"puistenknobbel\n" +
"puistenkut\n" +
"puistenreet\n" +
"puistlikkende stoephoer\n" +
"pukkelkop\n" +
"pukkelnek\n" +
"pukrukker\n" +
"punniktrut\n" +
"punthond\n" +
"punthoofd\n" +
"puntpiel\n" +
"puntvleugelschijtvogel\n" +
"pusbak\n" +
"pusemmer\n" +
"pushoer\n" +
"puskop\n" +
"puskut\n" +
"puslikker\n" +
"puslip\n" +
"pusnaad\n" +
"puspik\n" +
"puta\n" +
"putjesschepper\n" +
"putlul\n" +
"pyromaan\n" +
"raseikel\n" +
"rat\n" +
"rasgedrocht\n" +
"ratelslang\n" +
"rattenkruid\n" +
"rattenneuker\n" +
"raveteef\n" +
"reclame voor kachelglans\n" +
"rectumslikker\n" +
"reedkever\n" +
"reefteef\n" +
"reetatleet\n" +
"reethengelaar\n" +
"reetketelsteen\n" +
"reetkever\n" +
"reetkikker\n" +
"reetkogel\n" +
"reetgeboorte\n" +
"reetkevereikel\n" +
"reetkeververzamelaar\n" +
"reetneus\n" +
"reetracer\n" +
"reetridder\n" +
"reetroeier\n" +
"reetveeg\n" +
"reetveter\n" +
"reetvereterversleter\n" +
"reetverschuivende strontfanaat\n" +
"reetveterkever\n" +
"reetzweet-scheet\n" +
"regelneef\n" +
"regenknakken\n" +
"rektum\n" +
"rekvet\n" +
"relnicht\n" +
"remmerist\n" +
"remspoorbroek\n" +
"renegaat\n" +
"reptielengezicht\n" +
"retekever\n" +
"retekind\n" +
"retelteef\n" +
"reuzelkont\n" +
"reuzelragger\n" +
"richelvet\n" +
"ridder van de bruine dreef\n" +
"ridder van de stijve kloot\n" +
"rimboekikker\n" +
"rimboe-sprinter\n" +
"rimmboy\n" +
"rimmer\n" +
"rimpelkut\n" +
"rimpelrad\n" +
"rimpelsaurus\n" +
"rimpelzwijn\n" +
"rioolfox\n" +
"rioolpinguin\n" +
"rioolkruizer\n" +
"rioolridder met kringspierplezier\n" +
"rioolverschimmelaar\n" +
"rodekool\n" +
"roekoerd-roekoerd\n" +
"rolaap\n" +
"rolmops\n" +
"rolstoelbaviaan\n" +
"rolstoelterrorist\n" +
"ronde-tafel-conferentie-houder\n" +
"roodbilbaviaan\n" +
"rood drapje\n" +
"rood flapje\n" +
"roodreetbaviaan\n" +
"rooie dakduif\n" +
"rooie kippendief\n" +
"rotmof\n" +
"rottigje\n" +
"roze-ridder\n" +
"rubbernicht\n" +
"ruft\n" +
"ruftende reetaap\n" +
"ruftende rukeend\n" +
"ruftende rukslet\n" +
"ruftknikker\n" +
"ruggekrabber\n" +
"ruggekruiper\n" +
"ruggentuffer\n" +
"ruggentikker\n" +
"ruggetuffer\n" +
"rugklimmer\n" +
"rugkoning\n" +
"rugridder\n" +
"rugrunner\n" +
"rugtoerist\n" +
"ruigridder\n" +
"ruilnicht\n" +
"rukbeer\n" +
"rukduck\n" +
"rukeend\n" +
"rukfreak\n" +
"rukfriek\n" +
"rukhoer\n" +
"rukkameel\n" +
"rukker\n" +
"rukmuts\n" +
"ruktijger\n" +
"russisch ei\n" +
"russische berg geit\n" +
"russische heroine hoer\n" +
"schaamhaaracrobaat\n" +
"schaamhaarlikker\n" +
"schapekut\n" +
"schapenhoeder van de balkan\n" +
"schapenneuker\n" +
"schaaldierpijper\n" +
"schapezak\n" +
"scharrelaar\n" +
"scheefgeneukte aarsworm\n" +
"scheefgeneukte bizonscheet\n" +
"scheefgeneukte flubberkut\n" +
"scheefgeneukte schaamluis\n" +
"scheefgepoepthoerenkind\n" +
"scheefgepoepte krokodil\n" +
"scheefgepoepte lavabo\n" +
"scheel\n" +
"scheel-geneukte-bosaap\n" +
"scheelgezaktepatatzak\n" +
"scheefgeneukte lavaborukker\n" +
"scheefgeneukte tramrails\n" +
"scheefgepoepte lantaarnpaal\n" +
"scheefgescheten tramrails\n" +
"scheef - uit - de - baarmoeder - gerukte - afgaanse - grepelteef\n" +
"scheepsjongen\n" +
"scheepskanon\n" +
"scheepskelderaar\n" +
"scheettoerist\n" +
"schreeuwlelijk\n" +
"scheidsrechter\n" +
"schelle-holbewoner\n" +
"schelecycloop\n" +
"schele dakduif\n" +
"schelejoodsehomoneger\n" +
"schetemollebezeke\n" +
"scheve aap\n" +
"scheve kutneuker\n" +
"scheve lavabo\n" +
"scheve schele holter\n" +
"schijndode\n" +
"schijnzwangerschap\n" +
"schijtbek\n" +
"schijter\n" +
"schijthoer\n" +
"schijthomo\n" +
"schijtkameel\n" +
"schijtkut\n" +
"schijtmongool\n" +
"schijtsmoel\n" +
"schijtsnuiver\n" +
"schijtwijf\n" +
"schijtzak\n" +
"schildknaap\n" +
"schildvleugelige\n" +
"schimmelkaas\n" +
"schimmelkont\n" +
"schimmelkut\n" +
"schimmelpik\n" +
"schimmelteen\n" +
"schimmelige diareevlek\n" +
"schimmelige kaaskop\n" +
"schminkduus\n" +
"schoelje\n" +
"schoolhoer\n" +
"schoolhoertje\n" +
"schoolkamphoer\n" +
"schoonmaakturk\n" +
"schoonmoederneuker\n" +
"schoorsteenvegersragebol\n" +
"schrurftkop\n" +
"schubbekut\n" +
"schuimbatser\n" +
"schuimhoer\n" +
"schuimzak\n" +
"schurftbek\n" +
"schurftenlul\n" +
"schurfthond\n" +
"schurftkonijn\n" +
"schurftkut\n" +
"schutkut\n" +
"schuurdoos\n" +
"scootersnol\n" +
"scrotum betaster\n" +
"sek om 'e reet\n" +
"semafoonneuker\n" +
"senseozuiper\n" +
"seropositive dwerg\n" +
"sesamhoofd\n" +
"seut\n" +
"seutigebarbiepop\n" +
"sexeend\n" +
"sexer\n" +
"sexuele schaamhaarvreter\n" +
"seksslet\n" +
"sexterrorist\n" +
"shampoorukker\n" +
"sifilis\n" +
"sigarettenneuker\n" +
"sigarettenslet\n" +
"sillybilly-appelschillie\n" +
"sjacheraar\n" +
"sjembek\n" +
"sjonnie\n" +
"skaletterige haarbal\n" +
"skunkmajoor\n" +
"skuwe\n" +
"sladood\n" +
"slakut\n" +
"slappe aap\n" +
"slapswanz\n" +
"slangenbijter\n" +
"slavendrijver\n" +
"slavenhaler\n" +
"slavenhandelaar\n" +
"sleeplul\n" +
"slettebak\n" +
"slettebek\n" +
"slettekind\n" +
"sletteklep\n" +
"slettekop\n" +
"slettendekker\n" +
"slettepaket\n" +
"sleurhutverneuker\n" +
"slibworm\n" +
"sliederiel\n" +
"slikheks\n" +
"slikhoer\n" +
"slikslet\n" +
"slimmerik\n" +
"slingeraap\n" +
"slingerschijt\n" +
"slingersnikkel\n" +
"slipwijf\n" +
"slijksloeberaar\n" +
"slijmbal\n" +
"sloalippe\n" +
"sloeder\n" +
"sloekoe\n" +
"sloeriekop\n" +
"slome\n" +
"slomofiel\n" +
"slootkloot\n" +
"sluikhandelaar\n" +
"sluitspierbeul\n" +
"sluitspiergezicht\n" +
"sluitspiermusketier\n" +
"sluitspierpionier\n" +
"slungel\n" +
"smeerige heiligekut\n" +
"smeerpoes\n" +
"smefsnol\n" +
"smegmalikker\n" +
"smegmasnuiver\n" +
"smerrige das\n" +
"smetkut\n" +
"smoelknikker\n" +
"smootie\n" +
"smurfenlikker\n" +
"smurfenzuiger\n" +
"smurfenneuker\n" +
"smufenerohteekbezoeker\n" +
"sneeuwman-met-je-droge-lever\n" +
"sneeuwschuimer\n" +
"sneeuwvreter\n" +
"snertvogel\n" +
"snertsnikkel\n" +
"snifter\n" +
"snikkelbeer\n" +
"snikkeldier\n" +
"snikkel-sap-slikker\n" +
"snikkelschijter\n" +
"snikkelslikker\n" +
"snikkelwikkel\n" +
"snikkelzuiger\n" +
"snikkerskut\n" +
"snitzer\n" +
"snollekont\n" +
"snollenpoes\n" +
"snol van het hoerenpijpenbal\n" +
"snollebol\n" +
"snollekop\n" +
"snoodaard\n" +
"snorfietsmongool\n" +
"snorro\n" +
"snotkopbaviaan\n" +
"snotkut\n" +
"snotpork\n" +
"snottebel\n" +
"snotterkuiken\n" +
"snuifeekhoorn\n" +
"snuifkieken\n" +
"snuiver\n" +
"snul\n" +
"soalikker\n" +
"soalipjesslikker\n" +
"sodomist\n" +
"soepkieken\n" +
"soepkut\n" +
"soeplul\n" +
"soepmongool\n" +
"soepnel\n" +
"sokkenloper\n" +
"sorofiel\n" +
"sosio\n" +
"spagettievreter\n" +
"spammer\n" +
"spast\n" +
"spastenkut\n" +
"spatlaplikker\n" +
"speenvarken\n" +
"spekberg\n" +
"spekgat\n" +
"speklap\n" +
"speknek\n" +
"spekreet\n" +
"speldepik\n" +
"spermabal\n" +
"spermabekkie\n" +
"spermabandiet\n" +
"spermacel\n" +
"spermacontainer\n" +
"spermahoer\n" +
"spermakotser\n" +
"spermakut\n" +
"spermapegel\n" +
"spermaslikkende\n" +
"spermaslikker\n" +
"spermaspons\n" +
"spermaspugendeballenbatser\n" +
"spermakikker\n" +
"spermalul\n" +
"spermasnoet\n" +
"spermatepel\n" +
"spermatoïde\n" +
"spermazuiger\n" +
"spermazuiper\n" +
"sperzieboonmetkaassaus\n" +
"spetterlip\n" +
"spetterpoep\n" +
"spetterpukkel\n" +
"spinaziebeffer\n" +
"spinaziekut\n" +
"spiritist\n" +
"spitsboef\n" +
"splatman\n" +
"spleetruiter\n" +
"spleetscheet\n" +
"spraaktabletteef\n" +
"springgeit\n" +
"sprinkhaan\n" +
"springkanarie\n" +
"springpoot	spritzer\n" +
"sproeipoep\n" +
"sproeipoeper\n" +
"sproeivliegtuigfanaat\n" +
"spuitende steenpuistlul\n" +
"spuithoer\n" +
"spuitkut\n" +
"spuitsnol\n" +
"staatsmongool\n" +
"staketsel\n" +
"stalksloerie\n" +
"stamper\n" +
"steekneus\n" +
"steigerhoer\n" +
"stekelvarken\n" +
"stelletje schijtbakken\n" +
"stelletje stankkabauters\n" +
"steriaotiet\n" +
"stereomongool\n" +
"steroiet\n" +
"steromiet\n" +
"sterreneter\n" +
"stiefheks\n" +
"stierenbeffer\n" +
"stierenek\n" +
"stierenlul\n" +
"stinkaap\n" +
"stinkbeer\n" +
"stinkbek\n" +
"stinkbom\n" +
"stinkdeken\n" +
"stinkhol\n" +
"stinkhoer\n" +
"stinkhomo\n" +
"stinklul\n" +
"stinkmalloot\n" +
"stinkotter\n" +
"stinkpoepgat\n" +
"stinkslet\n" +
"stinkspleet\n" +
"stinkzak\n" +
"stinkzwam\n" +
"stoephaas\n" +
"stoephoer met straatgarantie\n" +
"stoepkabouter\n" +
"stoepslet\n" +
"stoepneuker\n" +
"stoepsnol\n" +
"stoeptegel\n" +
"stoeptegelhoer\n" +
"stofnol\n" +
"stofsnol\n" +
"stofzuiger\n" +
"stomkonijn\n" +
"stommebadgast\n" +
"stommeling\n" +
"stommerat\n" +
"stommerd\n" +
"stommerik\n" +
"stomme kat\n" +
"stopcontactneuker\n" +
"stouterik\n" +
"straalbulldozer\n" +
"straaljager\n" +
"straathoer\n" +
"straatjoekel\n" +
"straatprostituee\n" +
"straatnieuws\n" +
"straatslet\n" +
"straatsnol\n" +
"straatsnolletje\n" +
"strandhoer\n" +
"strandjeanet\n" +
"strandschuimer\n" +
"straussvogel\n" +
"stringwing\n" +
"strompstomper\n" +
"strontartiest\n" +
"strontbaffiaan\n" +
"strontbak\n" +
"strontboerke\n" +
"strontboorder\n" +
"strontbuffer\n" +
"strontcrosser\n" +
"stronteter\n" +
"strontfluit\n" +
"stronthapper\n" +
"stronthoer\n" +
"strontholverklontering\n" +
"strontkonthaar\n" +
"strontkorrel\n" +
"strontkut\n" +
"strontloempia\n" +
"strontmof\n" +
"strontmuilen\n" +
"strontpelicaan\n" +
"strontpot\n" +
"strontosaurus\n" +
"strontracer\n" +
"strontridderke\n" +
"strontstekker\n" +
"strontstamper\n" +
"strontstomper\n" +
"strontverdamper\n" +
"strontvlieg\n" +
"strontzaadvreter\n" +
"strontzabbelaar\n" +
"strontzak\n" +
"strontzakneuker\n" +
"strontzuiger\n" +
"strotgrondel\n" +
"strottekots\n" +
"struikelhaar\n" +
"struikenduiker\n" +
"struikneger\n" +
"studiehoofdje\n" +
"stuitermongool\n" +
"stuiterende teelbal\n" +
"stuk ectoplasma\n" +
"stuk straatvuil\n" +
"suckhead\n" +
"suet\n" +
"sufbubbel\n" +
"sufgeliktekankerhoer\n" +
"sufgerukte\n" +
"sufgeruktesloototter\n" +
"sufgerukt konijn\n" +
"sufkonijn\n" +
"sufkut\n" +
"suflul\n" +
"sukkelduck\n" +
"sukkelaar\n" +
"sukkelnerd\n" +
"sulwijf\n" +
"superkut\n" +
"supermongool\n" +
"swiebie\n" +
"takkesnol\n" +
"tapijtenventer\n" +
"tapijtenzwendelaar\n" +
"tapijtkever\n" +
"tarrelbaviaan\n" +
"technocraat\n" +
"teckel\n" +
"teelbal\n" +
"teeringhoer\n" +
"tegelteef\n" +
"tegelveger\n" +
"tekkelbeffer\n" +
"teletubbie\n" +
"teletubbiekut\n" +
"teletubielikker\n" +
"teletubbieneuker\n" +
"teletubiezuiger\n" +
"tempelslet\n" +
"tempohakker\n" +
"tepelbaviaan\n" +
"tepeldief\n" +
"tepelhaarbeffer\n" +
"tepellozepuistenzwijn\n" +
"tepellozetiet\n" +
"tepellozetietvlieg\n" +
"tepellozetientiterigevlieg\n" +
"tepeltrut\n" +
"tepelwrat\n" +
"tergdwerg\n" +
"teringdrol\n" +
"teringheftruck\n" +
"teringhond\n" +
"teringhufter\n" +
"teringlul\n" +
"teringneet\n" +
"teringslet\n" +
"teringtubbie\n" +
"teringtutje\n" +
"teringtyfushoer\n" +
"teringzooi\n" +
"teringzwans\n" +
"termieteneter\n" +
"terrorist\n" +
"testbeeld\n" +
"tettekop\n" +
"tetterslet\n" +
"tettezot\n" +
"fifushoer\n" +
"tibetaanse krabhamster\n" +
"tietenbek\n" +
"tietenlokker\n" +
"tietloze-terrorist\n" +
"tietgezicht\n" +
"tietmier\n" +
"tietvlieg\n" +
"tikkelhoofd\n" +
"tikteef\n" +
"tjappie\n" +
"tjoepenlikker\n" +
"tjoetn\n" +
"tjsoek-tjsoek van de karpaten\n" +
"tobbert\n" +
"tobogan\n" +
"toelie\n" +
"toiletbril\n" +
"toiletpapierzeveraar\n" +
"tokkie\n" +
"toogpisser\n" +
"toonbanksloerie\n" +
"touwtyfus\n" +
"touwtyphusleier\n" +
"traanpreut\n" +
"traliehoer\n" +
"transsexuele rukeend\n" +
"trapleuning\n" +
"travestiet\n" +
"travo\n" +
"travohoer\n" +
"travovarken\n" +
"trekgans\n" +
"trekpleister\n" +
"trekpop\n" +
"trekslet\n" +
"trektekkel\n" +
"trekvlek\n" +
"trekzak\n" +
"tringeltrangeltriangelkut\n" +
"trippeleend\n" +
"troelie\n" +
"trol\n" +
"troglodiet\n" +
"trotoir\n" +
"trottoir prostiuee\n" +
"truttekut\n" +
"tubby\n" +
"tube\n" +
"tuig\n" +
"tuinkabouter\n" +
"tulpentrut\n" +
"tunderkont\n" +
"tupperwaredoos\n" +
"turbotrut\n" +
"turfsteker\n" +
"turkenbeffer\n" +
"turkenlikker\n" +
"turkenneuker\n" +
"turkentrekker\n" +
"turnflikker\n" +
"tutneus\n" +
"twanyboy\n" +
"tyfusaap\n" +
"tweedehans-vaginaalschimmeltje\n" +
"tyfushoer\n" +
"tyfuslul\n" +
"tyfustubbie\n" +
"tyfustukker\n" +
"typhoon\n" +
"uitgeknepen perzik\n" +
"uit de gorila gerukte bokito kut kind\n" +
"uit de kut gerukte weeskind\n" +
"uit-de-baarmoeder-geslingerde-klapkut\n" +
"uitgeruktebaarmoedernaaier\n" +
"uit de baarmoeder geslingerde ondergrondsgevingerde strontlikker\n" +
"uit-de-baarmoeder-gerukte-kont-klep-kavia\n" +
"uit-de-baarmoeder-gelebberde-hangbuikzwijn-tiet\n" +
"uitdekleigetrokkenboerentrien\n" +
"uitdeholgekropenreetkever\n" +
"uitdebaarmoedergeruktkuttekind\n" +
"uitdebaarmoedergetrokken-tietlozecabaretslet\n" +
"uitdebaarmoedergeruktekippenneuker\n" +
"uitdekutgeruktehomoseksuelekutmof\n" +
"uitdebaarmoedergeslingerdetiet-losetietvlieg\n" +
"uitdebaarmoedergetrokken- -scheefgepistepoembaksmoel\n" +
"uitdebaarmoedergeslingerdekuttekind\n" +
"uit de baarmoeder ingeblikte klere- klote kut moeraskikker\n" +
"uit-de-frituur-ontsnapte-vetbal\n" +
"uitgedroogde mummie\n" +
"uitgeperstereetkever\n" +
"uitgepoepte schijtzak\n" +
"uitgerukte paardenkut\n" +
"uitgeruk-teteelbal\n" +
"uitgedroogd theezakje\n" +
"uit de baarmoedergeruckte tietvlieg\n" +
"uit de baarmoeder gerukt apenjong\n" +
"uit de baarmoeder gerukte kut komkommer\n" +
"uit-de-baarmoedergerukte-tepelslet\n" +
"uitdebaarmoeder-gerukte-vliegenzwam\n" +
"uit de naadgerukte pleeborstel\n" +
"uitgepoepte bananensplit\n" +
"uitgepoepte hoerendrol\n" +
"uitgeneukte muts\n" +
"uitgelepelde pisnicht\n" +
"uitgemergelt skeltet\n" +
"uitgeschetenkoudedrol\n" +
"uitgewoonde poepslet\n" +
"uitgewoonde stoephoer\n" +
"uitlaatneuker\n" +
"urinemonster\n" +
"urinespuiter\n" +
"urinoirlikker\n" +
"urger\n" +
"vaginaplakker\n" +
"valappel\n" +
"vastenavondzeeschuimer\n" +
"veenlijk\n" +
"veenslet\n" +
"veeverkrachter\n" +
"verkrachter\n" +
"verlepte pisnicht\n" +
"vermicelli-eter\n" +
"verneukte zeearend\n" +
"veronica-abbonee\n" +
"verrader\n" +
"verrekte kutknakker\n" +
"verekte trekvlek\n" +
"verrottestront\n" +
"verrotting\n" +
"versletenstofvot\n" +
"verwekfout\n" +
"vetkever\n" +
"vetnek\n" +
"vettige herder\n" +
"vettigeteef\n" +
"vetvlek\n" +
"vetzak\n" +
"vibratorpijper\n" +
"vibratorpijpster\n" +
"vies mormel\n" +
"vieze gefrituurde balzak\n" +
"vieze vuilde piklikker\n" +
"vieze mof\n" +
"viezerik\n" +
"vingerplant\n" +
"violenkut\n" +
"violenkutje\n" +
"vispastei\n" +
"vitesseneur\n" +
"vivisectionist\n" +
"vlahoofd\n" +
"vlakut\n" +
"vlamingo\n" +
"vlees\n" +
"vleesbeest\n" +
"vleesklak\n" +
"vleespet\n" +
"vleeswortel\n" +
"vlek\n" +
"vlojak\n" +
"vloklul\n" +
"vleugelmoer\n" +
"vliegend-befschaap\n" +
"vliegennaaier\n" +
"vliegenvanger\n" +
"vlieghoer\n" +
"vieze afgeneukte pielkenrood\n" +
"voetzoeker\n" +
"volgescheten palingvel\n" +
"volgevreten varken\n" +
"volkorenkut\n" +
"volleknolle\n" +
"voorhuidjogger\n" +
"vooruitstrevende bink\n" +
"vorkhapper\n" +
"vorrecrosser\n" +
"vrottepelikaan\n" +
"vrouwenprakker\n" +
"vreetzak\n" +
"vrijbuiter\n" +
"vtm'er\n" +
"vuillak\n" +
"vuilbakskarter\n" +
"vuile dief\n" +
"vuilegedruktesmoel\n" +
"vuile raamneger\n" +
"vuilereetscheet\n" +
"vuileslet\n" +
"vuile vibratorhoofden\n" +
"vuilnis\n" +
"vuistneukende schaapsdruif\n" +
"vulkaankop\n" +
"vuurtoren\n" +
"watje\n" +
"wc-borstel\n" +
"wc-bril\n" +
"wc-duiker\n" +
"wc-hoofd\n" +
"wc-pot\n" +
"websitegeiler\n" +
"weekdier\n" +
"weerhaakhoofd\n" +
"weerwolf\n" +
"wegdesperado\n" +
"wegduivel\n" +
"weggerotstukkadaver\n" +
"wegpiraat\n" +
"weg-werp-slet\n" +
"wentelteef\n" +
"wentelzak\n" +
"werkeikel\n" +
"wieberdink\n" +
"wietmiet\n" +
"wijf met kloten\n" +
"wijkgebondenstoepslet\n" +
"wigger\n" +
"wildeman\n" +
"windgeruithangbordlul\n" +
"wipkip\n" +
"wirdo\n" +
"witte\n" +
"witverlies snuiver\n" +
"woesteling\n" +
"woestijnvos\n" +
"woezzie\n" +
"wolf\n" +
"wollige wombad\n" +
"wormsteek\n" +
"wormrot\n" +
"wormvormig trollenaanhangsel\n" +
"wortelpotige\n" +
"wous\n" +
"wrattenkop\n" +
"wrattenkont\n" +
"wrattenschimmel\n" +
"zaadnek\n" +
"zak hooi\n" +
"zeekoe\n" +
"zeekomkommer\n" +
"zeekreeft\n" +
"zeemlap\n" +
"zeeolifant\n" +
"zeepok\n" +
"zeepsmoel\n" +
"zeerover\n" +
"zeeschuimer\n" +
"zeeslang\n" +
"zeeteef\n" +
"zeikmossel\n" +
"zeikseule\n" +
"zeiksnor\n" +
"zeldzame zaadschieter\n" +
"zelfontbrander\n" +
"zemelaar\n" +
"zeemelaar\n" +
"zemmer\n" +
"zeugbikkel\n" +
"zeverzak\n" +
"zichzelf-etalerende-parkhoer\n" +
"ziekepudding\n" +
"zigeuner\n" +
"zinksnijer\n" +
"zoeaaf\n" +
"zoeloe\n" +
"zoeloelip\n" +
"zoetwateradmiraal\n" +
"zoetwaterchinees\n" +
"zoetwaterkaper\n" +
"zoetwaterkosmonaut\n" +
"zoetwatermatroos\n" +
"zoetwaterpapoea\n" +
"zoetwaterpik\n" +
"zoetwaterpiraat\n" +
"zoetwaterpoliep\n" +
"zoldersnol\n" +
"zondagsrijder\n" +
"zondaar\n" +
"zonnebankfiguur\n" +
"zonnebankwijf\n" +
"zonnekind\n" +
"zoogdierpijper\n" +
"zooloog\n" +
"zoutwaternichten\n" +
"zuig\n" +
"zuiger\n" +
"zuigende zuigaap\n" +
"zuigkonijn\n" +
"zuigoffer\n" +
"zuigsnor\n" +
"zuigslet\n" +
"je zuigt\n" +
"zuigvis\n" +
"zulletje\n" +
"zulthoofd\n" +
"zultkop\n" +
"zultnek\n" +
"zulu\n" +
"zure lippeslikker\n" +
"zuurstogverpester\n" +
"zwabberhoofd\n" +
"zwakkeling\n" +
"zwamkip\n" +
"zwamneus\n" +
"zwangere-badsloef\n" +
"zwangere-soepstengel\n" +
"zwangere-stoeptegel\n" +
"zwans\n" +
"zwartjoekel\n" +
"zwarte bruingreppel\n" +
"zwartehond\n" +
"zwartetijgerneuker\n" +
"zwartgelakerde klereschoen\n" +
"zwartgelakerde schoenzool\n" +
"zwartzak\n" +
"zweefkees\n" +
"zweefteef\n" +
"zweer\n" +
"zweetaap\n" +
"zweetanus\n" +
"zweetballen\n" +
"zweetcees\n" +
"zweetjap\n" +
"zweetjoekel\n" +
"zweetkees\n" +
"zweetlex\n" +
"zweetkut\n" +
"zweetlul\n" +
"zweetnaad\n" +
"zweetneger\n" +
"zweetnek\n" +
"zweetpenis\n" +
"zweetpik\n" +
"zweetpruim\n" +
"zweetreet\n" +
"zweetzak\n" +
"zwendelaar\n" +
"zwijmelende stinkteef\n" +
"zwijn\n" +
"zwijnenbeffer\n" +
"zwoeft\n" +
"zwoelie\n" +
"wormstekige aardpeer\n" +
"armetierige\n" +
"aterling\n" +
"baldadige\n" +
"bastaard\n" +
"betweter\n" +
"beuzelaar\n" +
"bloodaard\n" +
"bolleboos\n" +
"bonenstaak\n" +
"broddelaar\n" +
"brokkenpiloot\n" +
"broodpoot\n" +
"brozem\n" +
"bullebijter\n" +
"canaille\n" +
"cententeller\n" +
"charlatan\n" +
"chicaneur\n" +
"crapuul\n" +
"dekselse\n" +
"dienstklopper\n" +
"doetje\n" +
"dolle mina\n" +
"dragonder\n" +
"duitenkliever\n" +
"duivelstoejager\n" +
"duvelstoejager\n" +
"dwingeland\n" +
"erbarmelijke\n" +
"falsaris\n" +
"farizeeër\n" +
"fatje\n" +
"femel\n" +
"fielt\n" +
"figuur\n" +
"floeperd\n" +
"furie\n" +
"galgenbrok\n" +
"gannef\n" +
"gans\n" +
"gedrocht\n" +
"gepebek\n" +
"gladakker\n" +
"glibber\n" +
"gnoom\n" +
"godsloochenaar\n" +
"gorlegooi\n" +
"grapjas\n" +
"grapjurk\n" +
"grauw\n" +
"guit\n" +
"onnozele hals\n" +
"hapsnurker\n" +
"harpij\n" +
"haveloze\n" +
"heerschap\n" +
"heiden\n" +
"hersenloze\n" +
"hobbezak\n" +
"hondsvot\n" +
"houwdegen\n" +
"iezegrim\n" +
"ijdeltuit\n" +
"ijskonijn\n" +
"imbeciel\n" +
"jakhals\n" +
"jandorie\n" +
"janhagel\n" +
"jansalie\n" +
"jantoeternuitje\n" +
"jatmoos\n" +
"jeeminee\n" +
"kakadoris\n" +
"kamizool\n" +
"kaneelduiker\n" +
"kapsoneslijer\n" +
"karikatuur\n" +
"karonje\n" +
"houten klaas\n" +
"klessebes\n" +
"kletskous\n" +
"kletsmajoor\n" +
"klikspaan\n" +
"klootjesvolk\n" +
"kloris\n" +
"klungel\n" +
"knakenpoetser\n" +
"rare knakker\n" +
"knapenschenner\n" +
"knar\n" +
"knoeipot\n" +
"knoest\n" +
"knoopjesverkoper\n" +
"knorrepot\n" +
"koddebeier\n" +
"koekoeroe\n" +
"krankjorum\n" +
"krent\n" +
"krentenweger\n" +
"kruikeduiker\n" +
"kuitenflikker\n" +
"kwallenbak\n" +
"dove kwartel\n" +
"rare kwast\n" +
"kwelduivel\n" +
"labberdoedas\n" +
"leperd\n" +
"liegbeest\n" +
"likmevestje\n" +
"linkeloetje\n" +
"lobbes\n" +
"loebas\n" +
"luilebol\n" +
"luiwammes\n" +
"luizebol\n" +
"miep\n" +
"miesgasser\n" +
"mopperpot\n" +
"mosselkop\n" +
"muzelman\n" +
"naaigarnituurtje\n" +
"nagel aan mijn doodskist\n" +
"neotoffelemoon\n" +
"oele\n" +
"oelepetoet\n" +
"olienoot\n" +
"oproerkraaier\n" +
"pappenheimer\n" +
"parvenu\n" +
"patjakker\n" +
"penose\n" +
"pielemaus\n" +
"pierewaaier\n" +
"plebs\n" +
"poetsenbakker\n" +
"keulse pot\n" +
"potentaat\n" +
"praalhans\n" +
"pugilist\n" +
"querulant\n" +
"rauwdouwer\n" +
"ravot\n" +
"satyr\n" +
"schalk\n" +
"schobber\n" +
"schorum\n" +
"schraalhans\n" +
"schrielhannes\n" +
"sijsjeslijmer\n" +
"sikkeneur\n" +
"sjoemelaar\n" +
"slijmjurk\n" +
"smeerkanis\n" +
"smulpaap\n" +
"snaak\n" +
"sneuerd\n" +
"rare snijboon\n" +
"sodeknetter\n" +
"soepjurk\n" +
"spillebeen\n" +
"spinhuisboef\n" +
"stouterd\n" +
"strontjong\n" +
"strontmagneet\n" +
"stuk falderappes\n" +
"stumperd\n" +
"sujet\n" +
"tegenstrever\n" +
"teutebel\n" +
"toddik\n" +
"toffelemoon\n" +
"totebel\n" +
"uitschot\n" +
"vagebond\n" +
"veile\n" +
"verdraaide\n" +
"vermaledijde\n" +
"vermalijde\n" +
"vermetele\n" +
"verschoppeling\n" +
"vetkees\n" +
"vetklep\n" +
"vileine\n" +
"vuige\n" +
"vulles\n" +
"vuns\n" +
"waaghals\n" +
"wangedrocht\n" +
"watjekouw\n" +
"wellusteling\n" +
"wijsneus\n" +
"windbuil\n" +
"woelwater\n" +
"zonderling\n" +
"scheit\n" +
"rotkind\n" +
"lamer\n" +
"slut\n" +
"pis\n" +
"penis\n" +
"pooier\n" +
"hondenlul\n" +
"anaal\n" +
"zaadcel\n" +
"melaats\n" +
"larf\n" +
"wrat\n" +
"gezwel\n" +
"naad\n" +
"neuk\n" +
"pus\n" +
"tiet\n" +
"spleet\n" +
"erectie\n" +
"billen\n" +
"braak\n" +
"clitoris\n" +
"zeik\n" +
"arrogante hufter\n" +
"hater\n" +
"moord\n" +
"verkracht\n" +
"hekel\n" +
"zanik\n" +
"duivel\n" +
"ashole\n" +
"dommert\n" +
"tifus\n" +
"weirdo\n" +
"creep\n" +
"leier\n" +
"rot\n" +
"a-merk\n" +
"aambeienplukker\n" +
"aambeienschaap\n" +
"aambeienshoffelaar\n" +
"aangeklede nageboorte\n" +
"aangeklede stopnaald\n" +
"aangestrande walrus\n" +
"aardvark\n" +
"aarsontstopper\n" +
"achter-de-rits-neuker\n" +
"adventjunk\n" +
"afgedankte hoer\n" +
"afgekeurde thunderbird\n" +
"afgelakte wcbril\n" +
"afhaal-hoer\n" +
"afhaalchinees\n" +
"afreageerbaby\n" +
"aldi-shopper\n" +
"alfred jodocus kak\n" +
"ali illegali\n" +
"amfibiel\n" +
"anaalplug\n" +
"anijsvreter\n" +
"anti-erectie\n" +
"anus veteraan\n" +
"anusexploitant\n" +
"anusje van alles\n" +
"anuskrabber\n" +
"anuskruipert\n" +
"anusplug\n" +
"apenzuiger\n" +
"appendixlikker\n" +
"ari behari\n" +
"arrogantje\n" +
"asbakviool\n" +
"aso\n" +
"azijnpisser\n" +
"baarmoederluis\n" +
"badgast\n" +
"bajesbilly\n" +
"bal gehakt\n" +
"balieslet\n" +
"ballekrabber\n" +
"ballenprakker\n" +
"bambixlul\n" +
"bamboelul\n" +
"bananengezicht\n" +
"barbapapa\n" +
"barbiepop\n" +
"bas van de homoplas\n" +
"basisbacterie\n" +
"batsekratser\n" +
"beautyfarmer\n" +
"beerput\n" +
"befbaviaan\n" +
"befdwerg\n" +
"beffallo bill\n" +
"befteling\n" +
"berggeit\n" +
"bermhoer\n" +
"bermlul\n" +
"beroepshufter\n" +
"bertrand van het homostrand\n" +
"beschermd dorpsgezicht\n" +
"beugelbek\n" +
"biggescrotum\n" +
"biggevanger\n" +
"biggewipper\n" +
"bijbalbijter\n" +
"bijstandzeug\n" +
"bilharenvlechter\n" +
"billenbijter\n" +
"billenmaat\n" +
"billenridder\n" +
"billenwasser\n" +
"billy de bibsridder\n" +
"bilnaadacrobaat\n" +
"bilnaatboener\n" +
"bilnaatfanaat\n" +
"bilzweetzwemmer\n" +
"binnenbroekse rukker\n" +
"biobakbeffer\n" +
"bipsridder\n" +
"blafkop\n" +
"blitskikker\n" +
"bloembakversierder\n" +
"bloemenschikker\n" +
"blonde bimbo\n" +
"blotebillengezicht\n" +
"blowkikker\n" +
"blubberbuik\n" +
"blubberpens\n" +
"boendoek\n" +
"bokkebek\n" +
"bokkelul\n" +
"bokkenteef\n" +
"bokkerijder\n" +
"bolle\n" +
"bolleboer\n" +
"bonkie\n" +
"bonktor\n" +
"boris clitoris\n" +
"bosgladiool\n" +
"bosheks\n" +
"bosje konthaar\n" +
"boskabouter\n" +
"bostrol\n" +
"botte knoest\n" +
"bouteend\n" +
"boutkever\n" +
"braakbal\n" +
"braakemmer\n" +
"bralkikker\n" +
"brasaap\n" +
"braskonijn\n" +
"braspik\n" +
"breedsmoelkikker\n" +
"brilsmurf\n" +
"brintabek\n" +
"brugsmurf\n" +
"brulscheur\n" +
"bse-koe\n" +
"bubbelbakkes\n" +
"buffelkut\n" +
"bukker\n" +
"bunzing\n" +
"bureauhoer\n" +
"burgertrut\n" +
"butsmuts\n" +
"butthead\n" +
"cafe-filosoof\n" +
"catherinekwijl\n" +
"cd-dom\n" +
"chat slet\n" +
"chef lege dozen\n" +
"chemogabber\n" +
"chemokar\n" +
"chocolade-lans\n" +
"cliniclown\n" +
"clitface\n" +
"clitoreus\n" +
"clitorisklapper\n" +
"clown\n" +
"cockmaster\n" +
"condoomkauwer\n" +
"copulatiekunstenaar\n" +
"cosmetische uitdaging\n" +
"costa-kut\n" +
"crea-bea\n" +
"cryptokaaskop\n" +
"cup d\n" +
"coureur\n" +
"daap\n" +
"daffy fuck\n" +
"dakgootrat\n" +
"damesfietszadel-ruiker\n" +
"darmdonderaar\n" +
"darmdreuner\n" +
"darmduiker\n" +
"darmkriebelaar\n" +
"darmwandabces\n" +
"debielo\n" +
"degenslikker\n" +
"dekdel\n" +
"dellebel\n" +
"dexter\n" +
"diepvrieskip\n" +
"diepzeekomkommer\n" +
"dikke dakduif\n" +
"dikke drol\n" +
"dikke dwerg\n" +
"dikkie slik\n" +
"dikko\n" +
"dildo dilbert\n" +
"dildomodel\n" +
"dioxine-olifant\n" +
"dobbelsteen met alleen maar nullen\n" +
"dokter snuggel\n" +
"dokus\n" +
"dolle monnik\n" +
"donald ruk\n" +
"doodgebefde mestkever\n" +
"dooie dakduif\n" +
"doorendoosje\n" +
"doos hopeloos\n" +
"doosbewoner\n" +
"dopkanon\n" +
"dork\n" +
"dorpsgek\n" +
"dramdruil\n" +
"drasnek\n" +
"dreknek\n" +
"dribbelkip\n" +
"drietietosaurus\n" +
"drietrapsdebiel\n" +
"drilbil\n" +
"drolledraaier\n" +
"drollevanger\n" +
"drolsmurf\n" +
"droplikker\n" +
"drububu\n" +
"drugs bunny\n" +
"druipert\n" +
"druipkaars\n" +
"drukfout\n" +
"duitse helm poetser\n" +
"dummy\n" +
"duts\n" +
"dwiebel\n" +
"dwiep\n" +
"ecokut\n" +
"eczeempuistenkweker\n" +
"ed kroket\n" +
"eendenkweker\n" +
"eikel-jogger\n" +
"eikelzuiger\n" +
"ejaculatiesponsor\n" +
"el lompo\n" +
"elekut\n" +
"emmer snot\n" +
"ep anaalklep\n" +
"eppie\n" +
"evolutieremmer\n" +
"exceemprobleem\n" +
"excuustruus\n" +
"fabrieksfout\n" +
"febo-fan\n" +
"federale peniszuiger\n" +
"feyenerd\n" +
"filatelist\n" +
"flapio\n" +
"flikkerfaxer\n" +
"flip hazewip\n" +
"flipper\n" +
"flippie\n" +
"flippo\n" +
"flipse\n" +
"flosser\n" +
"flubberpens\n" +
"fojstrekker\n" +
"fokzeug\n" +
"fopspeen\n" +
"freggel\n" +
"friemelaar\n" +
"friemelfreak\n" +
"frietzak\n" +
"frituurfiguur\n" +
"froisnois\n" +
"fruitmandverkoper\n" +
"frustro\n" +
"fucks funny\n" +
"furby\n" +
"fusionfucker\n" +
"gapende gutsgleuf\n" +
"garnalenpeller\n" +
"gaylord\n" +
"geblondeerde penis\n" +
"geblondeerde poedel\n" +
"gefileerde paardelul\n" +
"geflambeerde zee-egel\n" +
"gefrituurde sprinkhaan\n" +
"gegleufde kat\n" +
"geile baksteen\n" +
"geile gans\n" +
"geile gengbenger\n" +
"geile smurf\n" +
"geitekeutel\n" +
"gekkespek\n" +
"gekko\n" +
"gekloonde belg\n" +
"gekloonde joop\n" +
"gekrulde drol\n" +
"gelukte kubus\n" +
"gemanipuleerde schimmel\n" +
"genitiale wrat\n" +
"gepaneerde fazantenlul\n" +
"gereformeerde putdeksel\n" +
"geribbelde aarsvibrator\n" +
"gert de drollenvanger\n" +
"geth saaikema\n" +
"giergleuf\n" +
"gifsnikkel\n" +
"gigamientje\n" +
"gigantische wattenstaaf\n" +
"gleuveduiker\n" +
"glibberige badmuts\n" +
"glibbertiet\n" +
"goudgele pisvlek\n" +
"graaf zwaarvonzack\n" +
"grafbek\n" +
"grafgraver\n" +
"grafharses\n" +
"grafjong\n" +
"grashapper\n" +
"gratekut met weerhaken\n" +
"greffuslijer\n" +
"grititula\n" +
"grothork\n" +
"grottekruiper\n" +
"gsm atleet\n" +
"hapklare paardepenis\n" +
"happyclappy\n" +
"hardcore hansworst\n" +
"hare narigheid\n" +
"harige reet\n" +
"harry boterletter\n" +
"hazevanger\n" +
"heipaal\n" +
"held-op-kloten\n" +
"heliumzuiger\n" +
"hepatitis betweter\n" +
"herpeshoer\n" +
"heteroliebol\n" +
"hielelikker\n" +
"hitsige frits\n" +
"hockeykut\n" +
"hoer op locatie\n" +
"hoerenjoch\n" +
"hoerentoeter\n" +
"holbewonder\n" +
"holografische-eikel\n" +
"holterrorist\n" +
"holtol\n" +
"holwerker\n" +
"homofiele eenheid\n" +
"hoopje stront\n" +
"huifkarduwer\n" +
"huis-aan-huis-hoer\n" +
"humuslijer\n" +
"hunnebedslet\n" +
"hybernatiekut\n" +
"hyena\n" +
"hyperhoer\n" +
"hyperkut\n" +
"hypernerd\n" +
"iglo-architect\n" +
"imbecielo\n" +
"ingegroeide teennagel\n" +
"ini mini\n" +
"interslet\n" +
"jambek\n" +
"jan de wandelaar\n" +
"jan lul\n" +
"jankebalk\n" +
"jankgeit\n" +
"janksmurf\n" +
"jeltsin imitator\n" +
"joris driepinter\n" +
"jos kontecross\n" +
"jos uit het homobos\n" +
"kaap zonder hoop\n" +
"kaasboer\n" +
"kaaskutje\n" +
"kabouter flop\n" +
"kabouter ploep\n" +
"kakspaarder\n" +
"kakzak\n" +
"kamelenkut\n" +
"kankerlak\n" +
"kapitein longkanker\n" +
"kapitein plasbibs\n" +
"kapitein van de berenboot\n" +
"karel anaalparel\n" +
"karottentrekker\n" +
"kasplantje\n" +
"kassekakker\n" +
"kees-kontenrace\n" +
"keffer\n" +
"keienkop\n" +
"kelderzeug\n" +
"kerstbal\n" +
"kettingzeug\n" +
"kikkerkut\n" +
"kippeneuker\n" +
"kipposaurus\n" +
"klaas de paashaas\n" +
"klapstoelpedo\n" +
"klapstuk\n" +
"klefbeffer\n" +
"kleffe knuffelkanarie\n" +
"kleffe lerp\n" +
"klefjanbeetle\n" +
"klefkikker\n" +
"kleurentherapeut\n" +
"klikker\n" +
"klikovreter\n" +
"klitklapper\n" +
"klittenlikker\n" +
"klokkeluider\n" +
"klompendanser\n" +
"kloonschaap\n" +
"klootgieter\n" +
"klootmajoor\n" +
"klotenlikker\n" +
"klotskut\n" +
"knaakebukker\n" +
"knaakhoer\n" +
"knakker\n" +
"knarf\n" +
"knetterkut\n" +
"kneutebrijer\n" +
"knobbelteen\n" +
"knoeier\n" +
"knollenkop\n" +
"knollina\n" +
"knottekut\n" +
"knuppelknager\n" +
"knuppelkut\n" +
"knutseldoos\n" +
"koeiepens\n" +
"kokusmekroon\n" +
"kolereleijer\n" +
"kolossale anus klontering\n" +
"koning kansloos\n" +
"kont van een ezel\n" +
"kontboormajoor\n" +
"kontcrosser\n" +
"kontebonkert\n" +
"kontekijker\n" +
"kontgasdelver\n" +
"konthaarkapper\n" +
"kontkorrel\n" +
"kontkruiper\n" +
"koos kansloos\n" +
"koos vriendenloos\n" +
"kosmisch eitje\n" +
"kotskanon\n" +
"kotsmajoor\n" +
"kraaienaaier\n" +
"kralenkoning\n" +
"krijtkut\n" +
"kringspierbrigadier\n" +
"kringspierkietelnicht\n" +
"kroketten teef\n" +
"krokodildo\n" +
"krokutto\n" +
"kromme buffel\n" +
"kruimelzuiger\n" +
"kruip-op-al\n" +
"kruisruiker\n" +
"krul-kut\n" +
"kuddekut\n" +
"kut met klapdeuren\n" +
"kut op stelten\n" +
"kut-de-krep\n" +
"kutje bamboe\n" +
"kuttekijker\n" +
"kutti frutti\n" +
"kutto\n" +
"kwallebak\n" +
"kwijlkonijn\n" +
"kwijlkoning\n" +
"laagspringer\n" +
"labfout\n" +
"lamme tonnie\n" +
"lammetak\n" +
"lange dwerg\n" +
"lappenkut\n" +
"last der kampeerders\n" +
"lauwe doos\n" +
"lebberkont\n" +
"leijer\n" +
"lelijke draak\n" +
"leo de pedo\n" +
"lesbische klimgeit\n" +
"leuter\n" +
"leuterpeuteraar\n" +
"lijkewipper\n" +
"likmans\n" +
"lilliken drekstut\n" +
"linke loetje\n" +
"lintworm\n" +
"lintwormjager\n" +
"loezer\n" +
"lopend rampgebied\n" +
"lopende dildo\n" +
"losgebroken lijk\n" +
"lul met kaasrandjes\n" +
"lul met vingers\n" +
"lulletje rozewater\n" +
"lulmasseur\n" +
"lulmeiër\n" +
"majoor remspoor\n" +
"make-up doos\n" +
"mallert\n" +
"manke nelis\n" +
"mantelbaviaan\n" +
"marcel de zaadcel\n" +
"master bastard\n" +
"masturbator\n" +
"matenaaier\n" +
"mc kutski\n" +
"medische fout\n" +
"meelworm\n" +
"megalul\n" +
"mekkertante\n" +
"melaatse gifkikker\n" +
"melaatse tuingnoom\n" +
"melkgezicht\n" +
"mellonhead\n" +
"melulski\n" +
"mesthoop\n" +
"mestkever\n" +
"mestkoe\n" +
"mestvarken\n" +
"mien muts\n" +
"miereneuker\n" +
"milka-koe\n" +
"mini muts\n" +
"mislukte abortus\n" +
"mislukte paling\n" +
"mismaakte barbiepop\n" +
"misneuksel\n" +
"modder monster\n" +
"moeraskikker\n" +
"mooie distel\n" +
"motermuis\n" +
"mr lullemans\n" +
"mr. pleeborstel\n" +
"muggezifter\n" +
"multilul\n" +
"naadschrobber\n" +
"namaakmens\n" +
"natte gum\n" +
"natte nel\n" +
"natte poes\n" +
"natte reet\n" +
"natuurramp\n" +
"neeltje voor een geeltje\n" +
"neonicht\n" +
"nepvent\n" +
"nero de zero\n" +
"net uit bed slet\n" +
"neukepiet\n" +
"neukert\n" +
"neukinator\n" +
"neukmenietje\n" +
"neukstier\n" +
"neurdo\n" +
"neushaarvlechter\n" +
"nikser\n" +
"nokia neuker\n" +
"nokianeuker\n" +
"noorse bostrol\n" +
"nurdin\n" +
"okselschimmel\n" +
"onbesneden filistijn\n" +
"ontplofte mol\n" +
"ontplofte smurf\n" +
"ontsnapte abortus\n" +
"ontvanger van knietjes\n" +
"ontzettende frits\n" +
"opgewarmd lijk\n" +
"opmaakpop\n" +
"opperprutser\n" +
"ossekop\n" +
"paardenvijg\n" +
"paarse aarshaar\n" +
"paashaasschaamhaar-verzamelaar\n" +
"paddestoelnicht\n" +
"paddohoofd\n" +
"palenplanter\n" +
"papoea-rebel\n" +
"partnerruiler\n" +
"pascal éénbal\n" +
"pasta pik\n" +
"peenhoofd\n" +
"peer met haar\n" +
"penis agrarica\n" +
"penispleister\n" +
"penispomp\n" +
"penisprimeur\n" +
"penisproletarier\n" +
"pepslet\n" +
"peuterpenis\n" +
"picockio\n" +
"pieleplukker\n" +
"pielewapper\n" +
"pielewasser\n" +
"piemelemans\n" +
"piemelemosia\n" +
"piemelhoofd\n" +
"piemelo\n" +
"piemelwrat\n" +
"pieter de zaadschieter\n" +
"pijn-in-de-kont\n" +
"pijpelino\n" +
"pijpgans\n" +
"pijpkabouter\n" +
"pik met kuren\n" +
"pik-abces\n" +
"pik-in-blik\n" +
"pik-omhoog\n" +
"pikkedraaier\n" +
"pikkinavaga\n" +
"pilledraaier\n" +
"pindapeller\n" +
"pineukio\n" +
"pisbek\n" +
"pishommel\n" +
"pismuil\n" +
"pizza pik\n" +
"pjotr\n" +
"platbektekkel\n" +
"platte vis\n" +
"platvoet\n" +
"pleebewoner\n" +
"plintenpisser\n" +
"plintenwipper\n" +
"plofkut\n" +
"pluispenis\n" +
"pluizige bosaap\n" +
"plurko\n" +
"poedelpik\n" +
"poepsexlover\n" +
"polleke piekhaar\n" +
"porky penis\n" +
"pornoking\n" +
"pornokio\n" +
"pornopulleke\n" +
"portiekhoer\n" +
"potloodpik\n" +
"potloodventer\n" +
"pottenbakker\n" +
"pretvlek\n" +
"pretvlekproducent\n" +
"prins valium\n" +
"procrastinatieslet\n" +
"proletarier\n" +
"prozacboy\n" +
"pruimkauwer\n" +
"prullenbak\n" +
"prutsmuts\n" +
"pruttelkut\n" +
"psychonaut\n" +
"puddinglul\n" +
"puist2000\n" +
"puisteknijper\n" +
"puistenfokkerij\n" +
"pukkelkop 2001\n" +
"punaisepoetser\n" +
"punniker\n" +
"pusbek\n" +
"quark\n" +
"quarkhoofd\n" +
"quibuske\n" +
"quizmaster\n" +
"randgroepjongere\n" +
"raskut\n" +
"raslooser\n" +
"rasrukker\n" +
"reageerbuis baby\n" +
"rectumragger\n" +
"reetaap\n" +
"reetspleetatleet\n" +
"regelteef\n" +
"rekslet\n" +
"rektum verkenner\n" +
"rene van het gaycafee\n" +
"repelsneetje\n" +
"reservebelg\n" +
"retenlikker van rome\n" +
"reumarups\n" +
"riaggverslaafde\n" +
"ribbellul\n" +
"ridder schijtebroek\n" +
"ridder ven het ronde gat\n" +
"rioolrat\n" +
"rioolverstopper\n" +
"rioolzwemmer\n" +
"roestbek\n" +
"rolstoeltoerist\n" +
"roodkontbaviaan\n" +
"rooie dakduivel\n" +
"rossekut\n" +
"rotte bunzing\n" +
"rotte pel-pinda\n" +
"rotte rita\n" +
"rottende grotzwam\n" +
"roze rozetteracer\n" +
"rubberlul\n" +
"rubbertrut\n" +
"ruftkikker\n" +
"ruftpompoen\n" +
"rukkende robbie\n" +
"rukkende zeekoe\n" +
"runderkut\n" +
"sambal junk\n" +
"sambalgleuf\n" +
"schaamhaarvlechter\n" +
"schapenvoeg\n" +
"scheefgeneukte dildo\n" +
"scheetatleet\n" +
"schele cavia\n" +
"schijnzwangere huismus\n" +
"schijtfout\n" +
"schimmelkweker\n" +
"schimmelschaap\n" +
"schoenzoolsnikkel\n" +
"schubbenkop\n" +
"schurftekop\n" +
"schurftslet\n" +
"scrabble-del\n" +
"sherry hoer\n" +
"shitkikker\n" +
"siameese befbek\n" +
"siliconenlul\n" +
"sitostick\n" +
"sjaak trekhaak\n" +
"sjappadoelie\n" +
"sjorhaan\n" +
"sjorro\n" +
"slaapmuts\n" +
"slachtkoe\n" +
"slakjanus\n" +
"slaplullend\n" +
"slebberdel\n" +
"sletsel\n" +
"slikpik\n" +
"slikpony\n" +
"slingerschijter\n" +
"sloeberhoer\n" +
"sloerie uit de sloppen\n" +
"slomo\n" +
"sluitspier\n" +
"sm veteraan\n" +
"sm-kip\n" +
"smegma-konijn\n" +
"smurf\n" +
"snikkelbikker\n" +
"snikkellennelis\n" +
"snikkelsapslikker\n" +
"snodaard\n" +
"snokkel\n" +
"snotkoker\n" +
"snuggere dodo\n" +
"soa zaaier\n" +
"soa-dealer\n" +
"space-kabouter\n" +
"spaghettislikker\n" +
"sperma-dealer\n" +
"sperma-speciaalzaak\n" +
"spermatank\n" +
"sperminator\n" +
"spetteranus\n" +
"spoetnik\n" +
"spook\n" +
"spuitartiest\n" +
"stakkerlak\n" +
"statiefhoer\n" +
"steegjes teef\n" +
"steenpuist\n" +
"steffidebeffi\n" +
"stekkernek\n" +
"stereolul\n" +
"sterrekijker\n" +
"sterrekruidsnuiver\n" +
"sterrenkijker\n" +
"stieknek\n" +
"stigmalikker\n" +
"stinkkoe\n" +
"stinky winky\n" +
"stoeipoes\n" +
"stoeligan\n" +
"stofzuigermondje\n" +
"stombo\n" +
"stramme tuinkabouter\n" +
"strandjutter\n" +
"strandsexer\n" +
"stresskonijn\n" +
"stresssexer\n" +
"stronk\n" +
"strontbaal\n" +
"strontboer\n" +
"strontrijder\n" +
"stumperina\n" +
"stumpert\n" +
"suffe drol\n" +
"sufgerukte wally\n" +
"sufmuts\n" +
"sulleman\n" +
"sunuffabitsj\n" +
"supergrover\n" +
"superneuker\n" +
"supersukkel\n" +
"surfknurft\n" +
"takketeef\n" +
"tampondanser\n" +
"tapijthapper\n" +
"teennagel bijter\n" +
"telefoonterrorist\n" +
"tepelknager\n" +
"tepeltor\n" +
"tepelzeug\n" +
"termifucker\n" +
"testikel\n" +
"thundernerd\n" +
"tibetaansetrekeend\n" +
"tietenmaniak\n" +
"tikgeit\n" +
"tippeldeuske\n" +
"tippelteef\n" +
"tjernobiel\n" +
"tmf-doos\n" +
"tobbedanser\n" +
"toiletofficier\n" +
"toos tietloos\n" +
"tot leven gekomen belgemop\n" +
"transatlantische ruggetuffer\n" +
"trekeend\n" +
"trekpinguin\n" +
"trekridder\n" +
"treksmurf\n" +
"trekto\n" +
"trekzeug\n" +
"trollekop\n" +
"trut van troje\n" +
"tunderneurd\n" +
"turbo-eikel\n" +
"turbo-nerd\n" +
"turbo-trut\n" +
"twee meter stront\n" +
"tweede fase kind\n" +
"ubercocker\n" +
"uienkruier\n" +
"uilebek\n" +
"uitgedroogde luier\n" +
"uitgeknepen teelbal\n" +
"uitgewoonde doos\n" +
"ultieme loosheid\n" +
"vage barry\n" +
"van lulhoven\n" +
"van pikkesteijn\n" +
"vaselinesnuiver\n" +
"verrekte zak hooi\n" +
"verslaafde geit\n" +
"vervelia verwekfout\n" +
"vetgier\n" +
"vettige zweetkoe\n" +
"vetzilla\n" +
"vibra-tor\n" +
"vibrerende handveger\n" +
"viola holtor\n" +
"viruskweker\n" +
"vislip\n" +
"vliegdekkip\n" +
"vliegtuigvouwer\n" +
"volgekakte wc-pot\n" +
"volgesnoten zakdoek\n" +
"voorbinddildo\n" +
"voorhuidrukker\n" +
"voorhuidschavuit\n" +
"vozefien\n" +
"vrouw met snor\n" +
"vuilbaard\n" +
"vuile rukmuts\n" +
"vuilnislover\n" +
"vulvakanon\n" +
"w.c.-bril\n" +
"waggelende tak\n" +
"wandelende natuurfout\n" +
"wappie\n" +
"wasbakplasser\n" +
"waslap\n" +
"waterharses\n" +
"wazige dildo\n" +
"wazige waldo\n" +
"wazo\n" +
"wc-brillenzeiker\n" +
"wc-eend\n" +
"wc-minister\n" +
"webslet\n" +
"wegwerpsletje\n" +
"wehkampwatje\n" +
"whip-ass\n" +
"wibrawixer\n" +
"wiebelpiemel\n" +
"wieldop\n" +
"wijkagent\n" +
"willekepukkel\n" +
"willy bacilly\n" +
"witte salonhoer\n" +
"wokkel\n" +
"wormenneuker\n" +
"xila de gorilla\n" +
"yeti de sneeuwman\n" +
"zaadaap\n" +
"zadelschuimsnuiver\n" +
"zak tabak\n" +
"zandhapper\n" +
"zeepjesraper\n" +
"zeikert\n" +
"zeikwijf\n" +
"zelfbedienertje\n" +
"zepda\n" +
"zero\n" +
"zeurneus\n" +
"ziektekiem\n" +
"ziemel\n" +
"zilly zielig\n" +
"zinderende\n" +
"zombie\n" +
"zoon van 1000 vaders\n" +
"zoon van hans kazan\n" +
"zotte muts\n" +
"zottekop\n" +
"zuigende\n" +
"zuigzeug\n" +
"zwaargeschapen\n" +
"zwakkepiet\n" +
"zwangere huiskip\n" +
"zwavelnicht\n" +
"zweerteen\n" +
"zweethiel\n" +
"zweetknol\n" +
"zweetpiel\n" +
"zweetspleet\n" +
"zwerflul\n" +
"zwetende zeug\n" +
"kanker slet\n" +
"kankerzooi\n" +
"kankerjoch\n" +
"teringjoch\n" +
"tyfusjoch\n" +
"klerejoch\n" +
"krijg de kanker\n" +
"krijg de kenker\n" +
"krijg de tering\n" +
"krijg de tyfus\n" +
"krijg de klere\n" +
"krijg de vliegende tering\n" +
"krijg de vinkentering\n" +
"onnozele\n" +
"dikke\n" +
"puistenkop\n" +
"pukkelhoofd\n" +
"blinde hond\n" +
"brillenjood\n" +
"manke\n" +
"spriet\n" +
"krijg een strontoog\n" +
"krijg de stuipen\n" +
"krijg de syfilis\n" +
"krijg de sief\n" +
"krijg de siep\n" +
"krijg de takke\n" +
"kale\n" +
"snotje\n" +
"snikkel\n" +
"afgestompte barbaar\n" +
"bashi-bouzouk\n" +
"beddenplasser\n" +
"berliner bol\n" +
"beschimmeld theezakje\n" +
"bevrijder\n" +
"bikker\n" +
"bord lauwe pap\n" +
"borrelbuik\n" +
"bosneuker\n" +
"broekhoestbonbon\n" +
"bruidegom\n" +
"brutale hark\n" +
"brutale vlegel\n" +
"cyclopische doodrijder\n" +
"damplende paardevijg\n" +
"doolvogel\n" +
"doorregen baviaan\n" +
"driedubbel ovegehaalde boominfanterist\n" +
"driedubbel overgehaalde ezel\n" +
"driedubbele kwibus\n" +
"driedubbele overgehaalde kaffer\n" +
"driedubbelovergehaalde vetlap\n" +
"drollekop\n" +
"drollenruiker\n" +
"druilorige zoeaaf\n" +
"duitenpletter\n" +
"duivelse boominfanterist\n" +
"duizendbommige knuppelfenomeen\n" +
"ellendige aardworm\n" +
"emmer kots\n" +
"etterkop\n" +
"etterpuist\n" +
"foetuslokker\n" +
"frommelaar\n" +
"gebakken sprinkhaan\n" +
"gediplomeerde komkommer\n" +
"gehoornde slang\n" +
"gekielhaalde zeeschuimer\n" +
"gelderse knakworst\n" +
"gierigaard\n" +
"glibberige adder\n" +
"gloeilamp\n" +
"gluurder\n" +
"goorlap\n" +
"grim afleiding\n" +
"halve maan-rovers\n" +
"ingebeelde kwast\n" +
"intel inside\n" +
"jankende huichelachtige nerd\n" +
"kale kakkerlak\n" +
"kauwgom vreter\n" +
"keulsche pot\n" +
"kleine klikspaan\n" +
"kluizenaar\n" +
"knijpkat\n" +
"koksmaatje\n" +
"krantekop\n" +
"krentenbol\n" +
"krullebol\n" +
"lekke band in de regen\n" +
"lelijke apekop\n" +
"lelijke baliekluiver\n" +
"lelijke oude parkiet\n" +
"lompe griezel\n" +
"lullebehanger op wielen\n" +
"maffe dorpsgek\n" +
"met je varkensogen\n" +
"mislukte infanterist\n" +
"mislukte akrobaat\n" +
"mislukte koorddanser\n" +
"nsb-er\n" +
"nagelbijter\n" +
"neuspeuteraar\n" +
"nietesweets\n" +
"oehoeboeroe\n" +
"onbeschofte driedubbele kaffer\n" +
"onbeschofte vlegel\n" +
"ongefrankeerde brief\n" +
"ongekamde marinoschaap\n" +
"ongestelde aardbei\n" +
"opgeblazen blaaskaak\n" +
"opgeblazen doedelzak\n" +
"opgevulde tomaat\n" +
"oude koe\n" +
"overgehaald basji-bozoek\n" +
"overgehaalde jandoedel\n" +
"overgehaalde zandvlo\n" +
"paardevijg\n" +
"padvinder\n" +
"page fault\n" +
"paphoofd\n" +
"patagonische zoeloe\n" +
"patjepejer\n" +
"pijn aan de ogen\n" +
"pispot\n" +
"pleborstel\n" +
"plectomaan\n" +
"pleisterop eenhouten been\n" +
"pleitbezorger\n" +
"pojo\n" +
"praatzieke kaketoe\n" +
"praatzieke papegaai\n" +
"prehistorische prins bernard\n" +
"recycled condoom\n" +
"reteneuker\n" +
"rhinoceroide\n" +
"rund\n" +
"scheidsman\n" +
"schele kaalkop\n" +
"schele komkommer\n" +
"scheve tobogan\n" +
"schijnheilige mispel\n" +
"schruftige hond\n" +
"sinistere schoft\n" +
"slaafse inboorling\n" +
"slappe lul\n" +
"smosser\n" +
"spijbelaar\n" +
"steen des aanstoots\n" +
"stelletje ku-klux-klans\n" +
"stelletje anakoloeten\n" +
"stelletje uilskuikens\n" +
"stelletje vetkevers\n" +
"steuntrekker\n" +
"stiekemerd\n" +
"stijve hark\n" +
"stinkerd\n" +
"stom stuk ectoplasma\n" +
"stomme in egelvet gebraden gehaktbal\n" +
"stomme kanaak\n" +
"strontklep\n" +
"stuk stuk brontosaurus\n" +
"stuk koolwaterstof-extract\n" +
"stuk logaritme\n" +
"stuk ondeugd\n" +
"stuk ongeluk\n" +
"stuk snot\n" +
"stuk vetpudding\n" +
"stukje uranium\n" +
"suilorige ezelsneus\n" +
"uitgepoept kondoom\n" +
"urker visser\n" +
"valsspeler\n" +
"vastgelopen windmolen\n" +
"verdraaide verlopen bladluis\n" +
"vermolmd scheepskanon\n" +
"verroeste kaapstander\n" +
"verschrikkelijke sneeuwschorpioen\n" +
"versnaggel\n" +
"vetgemeste vogelverschrikker\n" +
"vierkant wiel\n" +
"vierpotige cyrano\n" +
"vieze flikker\n" +
"vijf jaar lang niet doorgetrokken wc\n" +
"vliegende monnik\n" +
"vuilbek\n" +
"vuile god\n" +
"vuile kippeneuker\n" +
"vuile wormsteek\n" +
"vulgaire kip\n" +
"wandelende cycloon\n" +
"wandelende reklame voor kachelglans\n" +
"ware wijnstok\n" +
"wasbakpisser\n" +
"wassen neus\n" +
"weekdier met grijphandjes\n" +
"worst\n" +
"xenofoob\n" +
"yuppie\n" +
"wangkramp veroorzakende kleffe deegbal\n" +
"zakkewasser\n" +
"zitteblijver\n" +
"zittenblijver\n" +
"zoetwater-papoea\n" +
"zweetvoet";
    
    private List<String> profanitiesList = new ArrayList<>();
    
    public ProfanityData() {
        for (String profanity : profanities.split("\\n")) {
            profanitiesList.add(profanity);
        }
    }
    
    public Double getScore(String text) {
        // Prepare string:
        text = text.trim();
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Double score = 0.0;
        for (String word : words) {
            if (profanitiesList.contains(word)) {
                score += 1.0/words.length;
            }
        }        return score;

    }
    
}
