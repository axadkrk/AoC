fun main() {
    val testData = "be cfbegad cbdgef fgaecd cgeb fdcge agebfd fecdb fabcd edb | fdgacbe cefdb cefbgd gcbe\n" +
            "edbfga begcd cbg gc gcadebf fbgde acbgfd abcde gfcbed gfec | fcgedb cgb dgebacf gc\n" +
            "fgaebd cg bdaec gdafb agbcfd gdcbef bgcad gfac gcb cdgabef | cg cg fdcagb cbg\n" +
            "fbegcd cbd adcefb dageb afcb bc aefdc ecdab fgdeca fcdbega | efabcd cedba gadfec cb\n" +
            "aecbfdg fbg gf bafeg dbefa fcge gcbea fcaegb dgceab fcbdga | gecf egdcabf bgf bfgea\n" +
            "fgeab ca afcebg bdacfeg cfaedg gcfdb baec bfadeg bafgc acf | gebdcfa ecba ca fadegcb\n" +
            "dbcfg fgd bdegcaf fgec aegbdf ecdfab fbedc dacgb gdcebf gf | cefg dcbef fcge gbcadfe\n" +
            "bdfegc cbegaf gecbf dfcage bdacg ed bedf ced adcbefg gebcd | ed bcgafe cdgba cbgef\n" +
            "egadfb cdbfeg cegd fecab cgb gbdefca cg fgcdab egfdb bfceg | gbdfcae bgc cg cgb\n" +
            "gcafb gcf dcaebfg ecagb gf abcdeg gaef cafbge fdbac fegbdc | fgae cfgab fg bagce"

    val realData = "ec cabfe afebd dbagef afbcg feabcd cdef eafdcbg ecb caegdb | ceb ecb febac ec\n" +
            "acfdg ea baec dgbafec cfebg efa cfebgd dfbaeg egcaf abecfg | bgcdfe ebac cadgf dceagfb\n" +
            "gfed caefd dcegaf ge daegc bcdag dfagbce cfbead gce afbegc | ceadg edfg gdbca fcead\n" +
            "ea dgfcae feba cae efbcagd cagfb gedcb gbfcad gebca afbceg | facbgde cegdbaf cgabe degcb\n" +
            "gcbfed bdf cbdfgea fgeabc dcfab caefb db caebdf abde fgdca | fdb fabce dbacf afceb\n" +
            "bacf afg egfab dcbgef bcegdaf efgbac efcgda fa gbfce gebad | edgba bfacged af fdacbeg\n" +
            "adgef bagcf cdea adfebg dfgca adfgec cd fcdgbe cdf cdfegab | afgdbe facdg gdfbeac dcea\n" +
            "cdgeb cd cdb gfecbda adgcbe bcdfag aecd bfceg edbfga agdbe | bdc dbeacg dceabg gcedb\n" +
            "ae cdbeg gefcdb eca ebgfac dcbafeg deag abcde facbd becadg | aec cbaedg aec deag\n" +
            "gabfc cdfbe ea dbcfeag aebfgc befagd ebfac aeb gaec bagdfc | ea gbadfc dgbfca decbf\n" +
            "bcad cd cfbge cegabdf fcdeb defabc gebadf fdc adfbe ecadfg | dc fcd egdcfa dc\n" +
            "begcda cbf egacb fc ebcaf baefd gabdfc gfce gaecfb acgdfeb | bdegfca cf fc acbdeg\n" +
            "fbgce dagcbe eafcbg bcgdfe geacdfb efdb dcgaf dge de gfdec | cgbfe bagced daecbgf bfde\n" +
            "fdgae fce cdeab gcfd fc efdca eadfgb fcgdae efdcbag gaefcb | efbdag fgeda adbfeg befagc\n" +
            "cfag cadgfb cf cfd cdbgf gaebdc bgfde cgbfead befacd cadbg | gcbda fcd bfged dcf\n" +
            "gebf edbcga edcabgf cfabed aeg agcfeb fgaec ge cgadf ebafc | abcgdfe gafbce cfagbe bgfe\n" +
            "aegbfcd gbacef bfea bfg efcag cfbge bf fcdega bedgc gbacfd | bcagedf bfea acdbefg faceg\n" +
            "dcf df aedf ebacf egabfcd fcdbge acfbd adbgc dfabec afgceb | caebf dcf dcf ebcagf\n" +
            "bgad abcge dbcfgae bcfae gecdab eagcfd ag cgdbe gae bcedfg | adbg gdba ga aeg\n" +
            "cega begfdca bdcfea febcg bec fbadcg fgbeac ec bfgac fgbed | ec gadbfc cbgfa bgcadef\n" +
            "fegbac debg bgc cadbg gdefca efbagcd dbgcea dfbca caegd bg | gb edgbcaf gbc cbg\n" +
            "gbefc badecfg acgeb ecfgba cfbgd bef ef acbged caebdf afeg | gefa ecdbafg gbdfc cegfb\n" +
            "gbefca gcdba dbfeag ec gbfae becf gdafce fegadcb aegcb aec | gebafc befcga gfadbe cgeab\n" +
            "cegadf cafg gdeca fdbcae fadcgbe gdc gc cbefdg ebgad fcdea | acdef gbcdef agcf cgbdaef\n" +
            "gcdbef eagdbc ecbdg afecgb bfc fbecd geabfdc fb fbgd fdcae | bcf cfdegba fb dfcbe\n" +
            "gafed badfce db dcgb dab dbaeg dgafceb acegb cabedg aebgcf | afdge db bcgaed cbaefd\n" +
            "bgcda gdfb fecbda gb cbg bafcgd gacbdef bfeagc cbafd dagce | gadec cgb efgdacb gdacb\n" +
            "cbefd dfegba bcfead db aebcfdg deacf bdf dbac fcbeg geadcf | gbefda efacd bd dfb\n" +
            "agdfbe gfcbeda egcad cegbd bgafce gcfead gfade acfd ac cea | afdge eac gaefd cdega\n" +
            "ebfad fde edbca gbfdce feag gaebfd ef adgfb bgcfad cbdfgae | gfabdc edf fage cdabe\n" +
            "bdce cefabdg bafdge afced cd cad badfce gdbfac aefcg ebdaf | ecagf bedc dac dc\n" +
            "cgebf gba ecadb ebcdfa gcad adgcbfe dbecga ga gbeca eagbdf | ag bfgec ag cdbeaf\n" +
            "dbcf dgecf ebcgd gbcea gebdcf bed dfacbge gceadf ebafgd bd | db dbe faecdbg dbe\n" +
            "gdea fed aedbf efadgb de fbega bgaecf gaecbdf egbcdf cdfab | ed cfeabg aged dgecabf\n" +
            "afebc fdeacb egf cfgb daceg egbcaf cafge gf ebadcfg egfbda | fge afceb eacfg agecd\n" +
            "ecfad deabcf cagfe gc degfca dgcf dabcge gac gabcefd ebfag | cga afgce gdfc agc\n" +
            "eac gbaec cfeb acefgb afebg ce dacbg bdegaf egafdc bgceafd | eadcfgb aec ace aec\n" +
            "gefba afb af gacbe ecbgaf dagfcb feca deabgc fbdceag dfbge | befdcga aegfbc efbcag baf\n" +
            "bdg ecdgf fbagc ebdafg db cbgfd cebd baegcfd fedcag dcegbf | db eacfdbg bdce bd\n" +
            "cfeab ebdgca agb ga aecbg cgda eafgdb ebcgdf cbfaegd dgbce | cbdfega ecafb gdac bga\n" +
            "caed gcdfa ac bfcedg edagfc eabcfg caf dagcfbe gbfda dfcge | degfacb fbcaged cfa dgafbce\n" +
            "bgcefda eagdbf acdbe gdfbe abgf aedcfg cedfbg fea fdeab fa | aef bcead fgbdae abfdeg\n" +
            "cbd cgdaeb gaebd dfceg cgbde cbefgda bfcgda eafbgd cbae bc | baegd bc aceb gbdeca\n" +
            "fbaegc dcbaf dbcae abcfg adbcegf bcdfga dfa cdfg fgdaeb df | fcgaedb fd fd begcaf\n" +
            "bcdeg ea fbaegdc eag eafgbc dgaeb bgafdc feda adbfg gdabfe | gdbea eag ea aeg\n" +
            "beacfd bead dafce cea edfagcb ea gadfc bfecd aecfgb fcdbeg | ae cgefab adcef aebd\n" +
            "dcefgb agfdce bgdfe agfdbe fad bdafe ceadb fa fbag dgcafbe | abefd ebfdgac fa dbgef\n" +
            "cbdfg cgeabfd fe fge bfgdca gfacde becgdf bdef ebcga egbfc | ef bgfcaed egbfc gaebcfd\n" +
            "adcge fcad bagced cf cef fegcd edacgbf cafegd febgd aecgbf | fec agefdc dacf egcabdf\n" +
            "fagbd bgec fdcbea be eacgf eba dceafg faebg adbecfg baefgc | gfcaedb ebfga bea fabgd\n" +
            "dbecfa bfcga begdfa cgdebf ge fge gbcef cegd dcfeabg fdceb | cbegfad eg gdec bgacf\n" +
            "cae ebcf ce gcfad bdefag fcaeg cgfdbae abdegc acbgef faegb | fegac ec cdgaf bcaedgf\n" +
            "bcfae cbgedf agdfcbe gdca fgc gcdfba bagfd gbafed gc bgafc | fcg edfbcga feadgbc adgc\n" +
            "cfdgab fdg dbcfa gf efgdac afgdb decagfb edfbca cgbf abged | fagdceb bdagf cebdgaf edcbaf\n" +
            "bcefg bafge ebadgfc cfe ec dcgfb bafgec edbgfa caeg dcebfa | afgeb cefbga dcbgf fegba\n" +
            "fbc gbced edcbfg fb dbgf befgc fgace degabc bcafdeg fbaced | aefgcbd fedagbc bfc fb\n" +
            "gd gbd eabfcdg egad cgbda eagbc cdgabe feabgc dcebgf adbfc | cadfbeg daeg bcgefa gd\n" +
            "edafb dagfb agd ecbgda dgbfc edgbcf fcga geafbdc cfdbga ag | gcfa gda gfdebca gda\n" +
            "edabg bcafgd gacfd dgfcae bfa fb dafbecg edcfab fgbc dafgb | fba fdcgeab fb badge\n" +
            "ebfd gbdaef gafcbe efadg agfdb bf gcadbfe fab cbdga cfgead | fab aebgfcd fb debf\n" +
            "geadcf cadgfb ab cbagf acgdf dfcegab adbcge fbgec abfd abc | acfdeg acgfdb bcfga dgcfa\n" +
            "dacfbe cbga ebdfga bc ecbfadg agfeb ecgfd bfc eagcfb bfegc | fecdab cfegb bfecg decgf\n" +
            "cgdabf ecdfab ecgf ecfdb bgf febgcd gf gdbef abged gdefbac | afgcdb gefc gf adfcgbe\n" +
            "cgda gcfedb cbdage aedfbgc cd cgaebf eadbc bceag dbc defba | abgedc cdb cdb fgcebda\n" +
            "dafbgce agd fcdage gd afecg edgc egabfc efdab dabgfc afedg | beafgc dgec gad gecd\n" +
            "dbgecf faedbg dgfea dacfge fcaed dagc dc dfc febca abfgced | fedag dfeagc dgfacbe cd\n" +
            "fbgc gcbadf dafcg gdaeb gfdace bf bafgd defbca bfa gfbecda | fba fb cgfb cfdabg\n" +
            "abfceg adgfbe cba cfea cbega abgef dbfgca ca cebgd ebgdafc | ac ca acb bca\n" +
            "bafg decfa feabdg cafbged ga gea fgedb dbcage fadge fedbgc | eacdgb ega bfga cefbdg\n" +
            "cbafg fe debga bgfea ecfa efb dfbegc afcbdg fbecga dcgbfea | bgdfcae fcbga bgaecf fe\n" +
            "gdfa eagbc gdc bdfeca cdfbga dg afcdebg cagbd bfdceg fbcad | dgaf dg dgc cgd\n" +
            "egbcdf gdbeafc fcd cafde abfdge adfebc gecda fbead fc bcfa | dagce gdaefbc cf fdc\n" +
            "eca cgafdb afeb gecba febdgca gadfce fcagb ea dbceg cgbfea | cafegd cae ecbdfag cgbea\n" +
            "ge cfbead abefgc acfbe ceafdg fbge abcge badgc gec caefbgd | efbca egc dbgafec dafbgec\n" +
            "dc gaefc deafgb fdc dfeba adbc efdca dfgacbe fdegcb dcbafe | fcd afecg efcgbda feadb\n" +
            "dcbfe bfe efdacb afcebg cebda gcefd afgbcde bdfa fb edbcag | gecdf fb bfe bf\n" +
            "ecbfa febagc bf dbagfe edgcab fcgdeab afb eacgb ecafd gcfb | acbefg gaebdc cgbf fbcage\n" +
            "begcda fcedba gadefbc cgeaf dce bfdc dacfe cd afebd abedgf | ecdabg gdfeba afbcged afgcbde\n" +
            "ae ebcgd dcfgaeb becagd dbeacf afbgc ecbag eca gcbdfe edag | cea becga gbecad ae\n" +
            "cgbafed geafdc ebacfg cde bdcfg gfced dafe acfeg ed agdbce | daef eafd edc cfegd\n" +
            "fdceag ecdabgf bfgcd fgdba fag daebg beaf af egcabd daefgb | afdcebg beaf af dfegbca\n" +
            "bc caeb adgfcb gfbde aedgcf gefabc adcfgeb bgc fagce cfegb | bc cb fegca bc\n" +
            "agecbd gaefbc gefdc bgfdac bdgca ae age edabgcf decga edab | dacefgb dafgecb ega ae\n" +
            "egbad debfa dfag bgaecf abgdce fba fa cgbefad agedfb cdbef | fgbead fagd becgda af\n" +
            "bgc edgbfca bfgce agdcfe acgefb efcbd cafeg bg bage bagfdc | gb bgea bgcef dcbef\n" +
            "gab cfeab gdcea facgbe adbfcg cafdebg dfaceb begac egfb gb | dcgfba bg gb bag\n" +
            "bgfceda gcafed egfd eadcg abgdce gfaec bdfagc eabfc gf fgc | egdf agdce cgf cafged\n" +
            "bacfegd egbad adgce adcb dbagec acgfed bag ba ebdfg gafebc | bacdeg badc efgbdac bdac\n" +
            "bfcdg bdgcfe cfb cb becd gfdec eacgdf bfecgad fbgda cfegab | cbf bfc cb cafbegd\n" +
            "cebgf gbeda fa fedcab cdegfb cgbeaf bafdegc fgeab eaf gcfa | gcebfd fagcebd af fcga\n" +
            "cefba eg fecbag adebcg aebcdgf dbagf cgef abecdf egb fgaeb | fadceb bafcegd bfeac gcfe\n" +
            "acgd fadgb edcfbga afgcbd cdfbe gc bfgdc cfg gfaecb ebgfad | cbdgefa bfaecgd bfcaedg fcdeb\n" +
            "dgbe aedbcfg bfegdc agcbdf dcgfe fcdgb fed ed efbcad efgca | edgb fgcbd bdge edgb\n" +
            "gfadc geacf gdf fd dgafcb gaecbd bdcag cgdebf bafd fdbaceg | bedgacf gdebfc fbagced fdba\n" +
            "dcbefa eadfbcg ab eadcg fegbda dba fgebd gabf gbcdfe bdage | afbg bfcdae bgaf bda\n" +
            "cbf cf edgcba fdcabg ebgdf gacdb bgfcea cgbdf fbgecda acdf | egdbf fc fbc fdbagc\n" +
            "ebdcgf edgba ef afce aefgdc edf edfag bcagdf gfaebdc gfdca | def edcgaf fdeagc fe\n" +
            "bdaef fbcgae ae dcae dgcfab fbcda bae dbgfe badcgef dfeacb | aeb cbgfae bafced ae\n" +
            "ebacf gebfa gbfaed edfga bg ebdg edgacf bdcafg gba cgabefd | abg edgb dgbe fecabdg\n" +
            "faged ba gaefb abcf abfecg gefbc edagcb dafbcge gab cbfegd | ba gfbae gbadfce cabdgfe\n" +
            "dbag cgdbe ebg dbaefc gebcfa geabcd daebgfc gfdce dbeca gb | abdg bg geb gebadc\n" +
            "bcegda egcd ecfgdba edagb dgfbea abcfd cg bgacd ebgfca gcb | efgabc bgeda degc egadbc\n" +
            "bagecfd geadbf debaf dfge abegf fecbga fbd df abfgcd edabc | cbefgad faegdb dfebga df\n" +
            "ecdabf gbdfa eabfc bedc cdf gcfaebd cgbfea cd dfagce abfcd | dcaegf becd cd dbfcea\n" +
            "egac fdabce faedg fdceag gfe dgafb defac daecfbg ge bgdecf | geafd fcdea cedgaf gbfceda\n" +
            "facebgd ebcgaf afecdb eba egaf ae cdegb agfbc bdfcag bgeac | ecgbd egfa ea fgae\n" +
            "dgfbce dfa fbedga bgadf cdgab af gefa aecdbf ebfdg bafgcde | febdg fega acbfdge abefdg\n" +
            "bcdae aebcg dacf gefbda cbefd badcegf begfdc adb ad efcbad | ad adcf acfdbe bad\n" +
            "fgbcda dgcfeab gdcae fabge dgb bdfgea bd adbeg bceagf fbed | bgd db db bd\n" +
            "dgb cbfgaed bdeafc bfacdg gbdef gd agde adfeb dbgafe fgceb | egbafdc bagefd egda agde\n" +
            "fegbdc eabfgd edfbgac ad fdgbe bade agcfe gadef dfa dacfgb | da eadb dgfae ad\n" +
            "dbfag fbgac adfeg cfdb gdbeca dab fcabdg db ebgfca gecabfd | adb bgceadf dfaeg cgaefbd\n" +
            "ebgca ecdbfa bcafg ge cgbefad agde edbca geb ebdcgf dgabce | bdcfgae ebg ge bge\n" +
            "gcadbef fgbd gcd gd aecgb bcdefg afdebc cbfde afcdeg dcebg | gcd dgc gdc befacd\n" +
            "fdabge ab gdeca fagcbed gba dgbefc eafb bgcfda gdbae fgdeb | adceg abef efab eafb\n" +
            "cfgdba cd abecd cfbadge dcb adbfe agfbde bcafde egabc dcfe | aecdb defbag eadfbc dc\n" +
            "dgcaeb acfdbg ge dgecfb gdbecaf gace aedbf adbcg dge gbdea | edabf cgdfbe eg dgaeb\n" +
            "egbfac ceg geacd ecbda ebgd dbceag dbgcfea dbacef gadfc ge | egc dcbaegf acfgd aegbdc\n" +
            "gd fcgbad abegdf gbed feabcd acdfgbe efacg gfead feadb fdg | dg egcfa aedgf ebdcaf\n" +
            "gf defcg gefb gfecdb fgc ebacgfd gbdcfa facedb ebfcd degca | efbg eadbfgc fgc fgecbd\n" +
            "acgfb febgda dgfabec fa fab gdeacb eafc cbgdf fbegac ebgca | af acef beagfc fcbga\n" +
            "fb fbec dgacbef fagecd fabdeg fbdcg dgecf fegbdc bdf bagcd | cebf fb efcb fb\n" +
            "ebgfc cbefdg adgfbc edbfg gadfbce fbd adebg fd gbfeac efcd | fd dfegbca bgecfa df\n" +
            "ceafd abdfc dbgcf gdaecb eabcdf cegfda abfe abd ba cbefadg | ab edfac fbea cegdfab\n" +
            "bgdce aedfbc agecb egfcad ab abe cafge gbefca bfcgaed abgf | acbeg cgeabf ecafgd fdgabec\n" +
            "faegd eb fabe efbdag egb fgbed cbgdea dcfgb cbgefad gfecad | adbgcef agfed ebg fbegda\n" +
            "agbcd cfgabe gca dfcegab agdbf gc gdfc dbfcga eacdb faedgb | cbafdg abdce fdbga cabfgde\n" +
            "bdaec bfgde ga agdbce gdca gceafbd abdeg gae cfabeg edacfb | deacb adgbcfe becda ecagdbf\n" +
            "efagdcb edgbac bfcea cfagb dfecb bae fagcbe aefg ea cdafbg | afge afge dcebgfa fega\n" +
            "bgaec geadb fgbdec gefdba fbacg cbdage aedc gce dfaegcb ec | ecg adec acfdgbe cdae\n" +
            "egad dgcbf fcbeag eg cgaedf ceafd cbfead cegfd acfgbde cge | fgdec afdbce fbecda gefbcad\n" +
            "cdegb dbea gbdcae dgfecab febcga cbaeg ed fdbgc cde cadfeg | dce ecd adgbec gbacef\n" +
            "efbgdca cbafg gfdbce egbafd ecbaf ag gadc abgfdc bag gcfbd | bcgfd ag gebafd gabfed\n" +
            "gfac gfdbca gba degbc bcfad agdbfe ebdgcfa efcadb ag bdgca | aebgfcd afecbd gab acgbedf\n" +
            "dfeagc ecfd abegdc bcdfga eca geacf fgacebd gfeab ce dgcfa | bgcfda egcaf dfbcaeg agefb\n" +
            "efbdag ecgbaf dcgafb dacbe fdgacbe dfgc df fda acbdf cgbfa | fda afbgc cdabgf df\n" +
            "edcagb bdgac eagb ga bcgfd ecdab acgefd cafedb abgefdc dag | ag gbdca ga bgcda\n" +
            "dafbecg cgead fcbd agbedf db bde becad cbeaf bfgeac dfbeca | abgefd fecba fbcd cbdf\n" +
            "edg bfdace agebc ebdcf dgfabe cbged dg bgdefc gdcf bdgceaf | fcgd fdcg fdcg ged\n" +
            "fcabd bcde dfcbaeg efdbac cfbage bdfag fadec afecdg cb bca | cfdea dabfec cbafeg dafce\n" +
            "gbeafd agcb cefbg gdaecf bg gbf bcdfe fceag bagcef afecdgb | gb efgadb cgab caefg\n" +
            "cegbadf gaed dcafeg feacg gd fcbagd dgfec bfegca gcd cebdf | gd gd aecfdg cgd\n" +
            "gfecd gedba dceagbf fdage gedafc afd fcbgad becdfg feac af | cgdeafb fgcebda edgaf gfedca\n" +
            "fdbgcea fedbgc agdcfe debcag deba bcgde dga bfcga dcabg ad | dcagb cfgbdae dcgebfa dbae\n" +
            "abd debcfg caegdb da bcafgd acdf ebgfa fagcedb gabfd fbdcg | bgefa da cgdefb edcgabf\n" +
            "ea fgace egafbc dfegabc fbae fgcbe cegbad ega dbcfge gdacf | bfea cgdfa ea bdacfge\n" +
            "ecba eadcg eb edb fbagd gdcebf gbceda dacfge gbaed fagdbec | aefgcd bdceafg gbfdeac afdgb\n" +
            "ed dgeb dfacbg dbcgf gbdcfae efbdgc dec deafcg bfaec efdbc | fbgdce gadbfec fdgcbe gadfce\n" +
            "dgec gafbcde bcgdfa dacefg efcda cegaf acd cegafb cd eafdb | gaecdfb fcdgae dc gdcebaf\n" +
            "fdbgca abfc cbadg cf fcg edfgb cdgbae cgaedf abcefgd dcgfb | badegc cf adgceb fc\n" +
            "eb fgcde bafcgd cbfeda cegdba becgd bce baeg dagcb ceabfgd | adgceb debgafc be gacdb\n" +
            "ebcafd dgfeb befdgca gce egabdc adecb egdcb cbegaf gc cgda | bfaedc gbecaf egc dgbecfa\n" +
            "gafdbc cfaeg aecbd efbd fcegadb fcb bacfe cagebd bf fcbade | fb bcf bdef gdeacb\n" +
            "ce gedc afbdgce abdfc dcbgea cae abcde afgbec edgbfa bgade | dfaegb baced cfadebg cea\n" +
            "bagf bge dfgce fdbae egadbf dgbcae fdgbe fabcgde gb facbed | bfga gfab bg gbe\n" +
            "cb fabc cfedb fdcge fdbeca gedbca bce abgfdce adfeb ebfagd | cabfde abfc ebc ebcfd\n" +
            "edbf bafeg cadfgb cgeab fba bf agfed cgbfaed fgacde gfbaed | cedbagf bf bf fba\n" +
            "bceadgf begfac gfedab gabdcf cegf caf efgab bcade cbaef fc | efgc fbcgdae gbcfda bdgafe\n" +
            "bafdg agedf dbgecaf fge dcefa bafcge ge eafbcd gcdaef egdc | eg fdcebga ecgd egf\n" +
            "afbdeg abfceg ecg afgeb bfce fgcae fcadg gcdebaf ce dbcega | befag dabcgfe eagbdc egc\n" +
            "fbga dabeg debcf dgafbe fea bfdea gdbfcea agcfde fa egbacd | edgfac eaf fa fae\n" +
            "bafec cf cfadgb faebd bcf beacg eadgbf bdceafg cdfe dfabec | fcb afcdgb cfb bfcae\n" +
            "ebfacd geafbc cgdfbe gabfd ceag cg cabfe bgcfa bgc fdeagcb | febdgc gbc gc dcefgab\n" +
            "egacf cadb efdcab cfedb gfabde dea feadc decbgf fbadecg da | gcfbed acbgdfe bcedf becfad\n" +
            "bfgcad cebaf fabgc afgbec egfb fe abdce efc fdagce baedcfg | fec gbfca fe bdefacg\n" +
            "gbfedca bega bcdef fgeadc bgcad ea bcfgda gdcabe acdeb ace | ea dgbcae afbdcge ae\n" +
            "fcadebg gbecd adc fdbag bdagc aedbfc ecgfbd ac bdceag geca | eacg cgae adc ca\n" +
            "afdgec cfgdab fbedag eabcf agb cgfdeba dgeb gb afged abegf | bg fbgea badfge gdeb\n" +
            "edgab adfcg cedabgf ce edbgcf daecbg ecd dgcae ebac fbgaed | ec ec ecba eagbd\n" +
            "cebf eadbg bc degfbca cbg gcfbda agfce bgcae cbgfae efcdga | cbef badcfg gcb bcfe\n" +
            "cafbde cbfg abgef gacedf gf edbag faedgcb bfeac gbefca fga | gcfb fceab gaf beadg\n" +
            "edfab feag dag bgdfc adgbf gbfaed ga egdcabf cadgbe bacdef | gefabcd aegf afge eagf\n" +
            "cdfeab cdg efdbc fcbdga dcgaebf dbge eagfc debfcg gd cgfde | fabcgde dgc egbd cgd\n" +
            "cagbef gcb fbgead cfdg cbdea bdegc cg ebgdfc fgedacb bdgef | bfegda gc gc cfegdab\n" +
            "edcgf be feagcd dbcfa ecbagdf bfgcea cbfged fedcb feb gbed | bef fdceg egbd bfe\n" +
            "egbf fdgcab dbage edafc degabf fgd gaefd cbdage afedbcg fg | gdf acebdgf gdf gafdeb\n" +
            "acfegb cabed fbdacg afb gafec gadecbf cbfae efbg bf egdfac | fegb abf cebda egfb\n" +
            "caegfd faebcgd dfeag cg cafbge fbdega gca ceadg caebd fgcd | gc agc gafebc fdega\n" +
            "fbgda dfebg bde eb fgdce dfegabc edcfba egbc cdbgfe faegcd | be eb dcbgfae gadbecf\n" +
            "fbgadc efac ce caedb badfce bce ebadg bdgfce cdbfa fbcagde | ec ebc efac ecb\n" +
            "edagcf ecdga facbeg fcdge ca begad gca bdgfcea cgdebf afdc | adcf fdgaec edcgf acg\n" +
            "feacg cdfb eadfbg adcbfg bf bfg aecgdb fdgceab gcdab bcafg | gfb bcfag fb afceg\n" +
            "fbdgea fcae abgecdf deafg gfceda gec cgdef gbdfc ec aecgbd | caef afec dfcgae ecaf\n" +
            "geadfc afbcegd eadc abdfeg ac agdfe cgefa gac gfebc cgbfad | faedg gabfde ca eadc\n" +
            "dcaeg afc ecgf edbcag fcdeba gcfdea abgfd adgcf cf dcebfga | dfegac fceg facdg afc\n" +
            "fbacged egc ecfgb cegadb efdg eg efbdc bcfga deabfc bfcegd | ceg fgedbca fged eg\n" +
            "bfceag egbcad debgaf dbegf febga edfgabc cdfeb gd fdag gde | egfdcba gaecfb ecdfb dagfbe\n" +
            "eadfgc gc bgdfcae bgcdf fbdeac cadgbf cgd gebfd badfc cagb | gc agcfed efdcga gefadbc\n" +
            "gcbe feagb caegf adfce agc cg egfbca dafbeg acfdgb acdfbge | beagf gcdafb egabf abfegd\n" +
            "abfce dafcbe eg gbe fecgab agec eacgbdf gcbdf fcegb gdbaef | bgedfa geca eg bgfec\n" +
            "bfadg befdgc defgb cafgeb de fced edg adgceb gacedbf bfcge | efcd bgceda de de\n" +
            "efdcba efgcdb efcbd ba bae cbaf geadc afgbde decab bgecdaf | cfba daegbcf dbafec bcedgaf\n" +
            "dfeab eb cgfbaed aecfgd efadgb gcdefb agbe cdbaf bfe edfag | dgeacfb cgdebf be bgae\n" +
            "dcfbea dagfeb dfgceba agfdc gcef gecfad abgcd deafc gdf gf | bgacd cefg efcg dfaceg\n" +
            "egfdb ecbgd fade cdfbega bfaeg gfbacd gdf df becfag dfabge | dgf geadbcf gacefdb df\n" +
            "fcdbga egdabf ca bcdfa cdbef befdgac gfbda acgf adc bdgeac | aebdgc gadbfce cda dagfb\n" +
            "dgce adfbecg eafcdb cfgda cfage gbafd ceafgb fcd dc aedcgf | egdcfba fcd fcadg gdbcfae\n" +
            "dae dacgfe fceab fcabge cbdeg daecb ad bcadef dbfa gefcdab | geacdfb egacfb fdab da\n" +
            "gcebf cdebaf gafc agbecf daebgc gcfabde cg ecg efacb edbgf | cgafdeb cegbda cg dcgeba\n" +
            "befcag cefdga ebaf ba bgfcdae fcaeg ecbdg cab fdbacg aecgb | bafe cfgbda geacb acebg"
    // Part 1
//    calc1(testData)
//    calc1(realData)

    // Part 2
    calc2(testData)
    calc2(realData)
}

fun calc1(testData: String) {
    val lines = testData.split("\n");

    val counter = IntArray(10) { 0 }
    lines.forEach { line ->
        val sides = line.split(" | ")
        val rightSide = sides[1]

        val digits = rightSide.split(" ");
        digits.forEach { digit ->
            when (digit.length) {
                2 -> counter[1]++
                3 -> counter[7]++
                4 -> counter[4]++
                7 -> counter[8]++
            }
        }

    }
    counter.forEach { value -> print("$value ") }
    println(" " + counter.sum())
}

fun calc2(testData: String) {

    var sum = 0;
    val lines = testData.split("\n");

    lines.forEach { line ->
        val intPos = IntArray(4)
        val sides = line.split(" | ")
        val leftSide = sides[0]
        val rightSide = sides[1]

        val digits = leftSide.split(" ");
        val sign1 = digits.filter { digit -> digit.length == 2 }[0]
        val sign4 = digits.filter { digit -> digit.length == 4 }[0]
        val sign13 = sign4.filter { char -> !sign1.contains(char) }

        val signs = Array(10) { "" }


        digits.forEach { digit ->
            when (digit.length) {
                5 -> {
                    if (digit.contains(sign1[0]) && digit.contains(sign1[1])) {
                        signs[3] = digit
                    } else if (digit.contains(sign13[0]) && digit.contains(sign13[1])) {
                        signs[5] = digit
                    } else {
                        signs[2] = digit
                    }
                }
                6 -> {
                    if (digit.contains(sign1[0]) && digit.contains(sign1[1])) {
                        if (digit.contains(sign13[0]) && digit.contains(sign13[1])) {
                            signs[9] = digit
                        } else {
                            signs[0] = digit
                        }
                    } else {
                        signs[6] = digit
                    }
                }
            }
        }
        val sortedSigns = signs.map { sign -> sorted(sign) }

        val digitsRight = rightSide.split(" ")
        digitsRight.forEachIndexed { index, digit ->
            when (digit.length) {
                2 -> intPos[index] = 1
                3 -> intPos[index] = 7
                4 -> intPos[index] = 4
                5 -> intPos[index] = sortedSigns.indexOf(sorted(digit))
                6 -> intPos[index] = sortedSigns.indexOf(sorted(digit))
                7 -> intPos[index] = 8
            }
        }
        var lineSum = 0.0;
        intPos.forEachIndexed{i, value ->
            val pos = 3 - i;
            lineSum +=  value * ( Math.pow(10.0, pos.toDouble()) )
        }
        sum += lineSum.toInt();
    }
//    counter.forEach { value -> print("$value ") }
    println(" $sum")
}

private fun sorted(sign: String): String {
    val arr = sign.toCharArray()
    return arr.sorted().joinToString("")
}

