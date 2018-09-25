
ELTE Informatikai Kar
Webprogramozás
ALKALMAZÁSOK FEJLESZTÉSE
ÁLTALÁNOS INFORMÁCIÓK

Célkitűzés
A hagyományos asztali egyfelhasználós alkalmazásoktól továbblépve ebben a tárgyban a hallgatók megismerkedhetnek a kliens-szerver architektúrákkal, annak is egy igen népszerű ágával, a webes protokollokat és technológiákat használó alkalmazások fejlesztésével. A webes alkalmazások készítéséhez felhasználjuk a programozási technológiákon megismert modellezési eszközöket, és azokat webes környezetre ültetjük át. A tantárgy célja, hogy kiindulási ponttul szolgálhasson azok számára, akik modern webes alkalmazásokat szeretnének fejleszteni.
Környezet
Az órai munkákat a lokális gépeken telepített futtató- és fejlesztőkörnyezetek segítségével igyekszünk megoldani. A használt környezetek és szerkesztőprogramok a választott technológiáktól is függenek. Bizonyos esetekben felhőalkalmazások segítségét is igénybe vehetjük.
TEMATIKA
2018.09.10.-i hét: Alapok: HTTP, JSON, architektúrák, REST
2018.09.17.-i hét: Java REST API – adatbázis, modellek és vezérlők (Spring Boot cheat sheet, Issue tracker alkalmazás)
2018.09.24.-i hét: Java REST API – modellek közötti relációk, valamint hitelesítés és jogosultságkezelés
2018.10.01.-i hét: HTML és CSS alapok
2018.10.08.-i hét: TypeScript
2018.10.15.-i hét: Angular – telepítés, komponensek, stílusok, menü
2018.10.22.-i hét: 1. bemutató
2018.10.29.-i hét: Őszi szünet
2018.11.05.-i hét: Angular – dinamikus adatok, komponensek kapcsolata
2018.11.12.-i hét: Angular – űrlapkezelés, service-ek
2018.11.19.-i hét: Angular – aszinkronitás kezelése, REST API használata
2018.11.26.-i hét: Angular – hitelesítés
2018.12.03.-i hét: Konzultáció
2018.12.10.-i hét: 2. bemutató
SZÁMONKÉRÉS
Az értékelés összetevői
Összetett webes feladat készítése az órán tanult technológiákkal
Határidők:
Projektötlet
4. tanulmányi hét (2017.10.01.)
Backend megvalósítása és 1. bemutató
7. tanulmányi hét (2018.10.22)
Működő prototípus megvalósítása
10. tanulmányi hét (2017.11.12)
Kész alkalmazás, dokumentáció, bemutatás
14. tanulmányi hét (2018.12.10., utolsó gyakorlat)
A beadandó feladat
A félév során egyetlen feladat lépésenkénti elkészítése lesz a cél. A feladatot kétfős csoportok végzik el. A fejlesztéshez git verziókövető rendszert kell használni, az egyes fázisokat megfelelően rögzítve a rendszerben (azaz nem a teljes fejlesztést követően kell a kódtárat feltölteni). Az alkalmazást publikus Github kódtárként kell közzétenni a csoporttagok egyikének azonosítója alatt. A csoport másik tagja közreműködőként van a kódtárhoz rendelve. A feladathoz dokumentáció írása is szükséges. Végül az elkészült alkalmazást a dokumentációval együtt be kell mutatni. A fejlesztés egyes fázisait a megfelelő határidőre el kell készíteni, és erről a gyakorlatvezetőt értesíteni kell.

A fejlesztendő alkalmazásnak hasonló komplexitásúnak kell lennie, mint ami a webes alkalmazások fejlesztése tárgynál elvárnak. A feladatnak tartalmaznia kell:

Adatbázis
legalább 4 táblát
legyen benne 1-sok kapcsolat
legyen benne sok-sok kapcsolat
az adatbázis-kezelő az órán megismert h2 rendszer lehet
Szerveroldal
Java Spring Boot technológia használata
MVC modell
REST API
authorizált végpontokkal
Kliensoldal
technológiát illetően az órán megismert Angular keretrendszert kell használni (6+ verzió).
legalább három tábla adatait szerkeszteni kell tudni a felületen: lista, új, módosít, töröl (vagy inaktívvá tesz)
legyenek benne csak hitelesítés után elérhető funkciók (autentikáció)
ügyelni kell, hogy csak a megfelelő adatokhoz férjen hozzá a megfelelő felhasználó (autorizáció)
a szerverrel AJAX kérésekkel történjen a kommunikáció
További feladatötletek:

Receptek és hozzávalók
Tantárgyak felvétele (mini Neptun)
Raktár bevételezés
Családi todo
Családi büdzsé
Névjegyek kezelése
Munkaidő nyilvántartás
Projektötlet
Első lépésként egy rövid feladatleírást kell megadni a projekt Github főoldalán a README.md állományban. A feladatleírásnak a következő elemeket kell tartalmaznia rövid leírás vagy felsorolás formájában:

feladat funkcionális követelményeit
feladat nem funkcionális követelményei
szakterületi fogalomjegyzék (azon fogalmak definiálása, ami köré az alkalmazás épül)
szerepkörök
Backend megvalósítása
Első fejlesztési fázisként a Java backend és az adatbázis elkészítése szükséges az órán tanult módszerekkel, illetve – ha szükséges – további megoldásokkal. Az elkészült munkának meg kell felelnie a feladatleírásnál fentebb leírt követelményeknek. Az elkészült kód mellé szükséges elkészíteni az adott réteg aktuális dokumentációját, ami a következőket tartalmazza:

fejlesztői környezet bemutatása, beállítása, használt technológiák
adatbázis-terv: táblák kapcsolati UML diagramja
alkalmazott könyvtárstruktúra bemutatása
Végpont-tervek és leírások
1 db végpont működésének leírása, mi történik, milyen lépések követik egymást (szekvenciadiagram)
fontosabb specifikumok bemutatása (ha van ilyen)
Működő prototípus
A következő lépésben a felhasználói felület kialakítása a cél backend szolgáltatások nélkül. Egy olyan, komponensekből, oldalakból és végpontokból álló alkalmazást kell készíteni, amely működik, de egyelőre statikus, beégetett adatokkal dolgozik. A dokumentációt a következő elemekkel szükséges bővíteni:

használati eset diagram: melyik szerepkör mely felületekhez fér hozzá
fejlesztői környezet bemutatása, beállítása, használt technológiák
az alkalmazott könyvtárstruktúra bemutatása
(felületi tervek, oldalvázlatok)
Kész alkalmazás
Utolsó fázisban összekötjük a backendet a frontenddel, a felületek működését a szerveren tárolt adatokkal biztosítjuk, az alkalmazást végső állapotra csiszoljuk. A dokumentáció a következőket tartalmazza:

kliensoldali szolgáltatások listája, rövid leírással
kapcsolat a szerverrel
állapotdiagram (ha szükséges)
egy funkció folyamatának leírása, azaz mi történik kattintástól a visszajelzésig
tesztelés
felhasználói dokumentáció
Bemutatás
A bemutatás két fázisban történik: a félév közepén és a félév végén. Félév közepén az első két határidőhöz tartozó munka bemutatása történik, azaz a szerveroldali komponensek bemutatása. A teljes alkalmazás bemutatására az utolsó gyakorlaton kerül sor. 20 fős gyakorlatokkal számolva minden csapatra kb. 9 perc jut, de számítsunk arra, hogy bemutatókkor alkalomadtán túlléphetjük a gyakorlat időkeretét. A bemutatónak tartalmaznia kell:

a feladat ismertetését (fél perc)
az alkalmazás bemutatását (2 perc)
az alkalmazás működésének részleteit (1 perc)
a dokumentáció gyors bemutatását (1 perc)
fejlesztési tapasztalatokat (fél perc)
a csapatmunka részleteit (fél perc)
A bemutatás után a gyakorlatvezető és a csoporttagok is kérdéseket tehetnek fel, megjegyzéseket fűzhetnek a munkához. Az értékelés helyben történik.

Jegyszerzés feltételei
Részvétel a gyakorlatok legalább 75%-án (maximum 3 hiányzás)
Minden “milestone” beadása időben
Elkészített és bemutatott alkalmazás
Kérdőív kitöltése
Értékelés
Mindkét bemutatóra 0-10 pont kapható, ezt a csoport két tagja saját belátása szerint osztja el egymás között (1-5). Félév végén ezek átlagból alakul ki a jegy.
SEGÉDANYAGOK
HTML tananyag (Abonyi-Tóth Andor): A weblapkészítés technikája (HTML5, CSS3) és ergonómiája
A böngésző mint alkalmazásfejlesztési platform (elektronikus tananyag)
Dinamikus weboldalak előállítása szerveroldali technológiákkal (elektronikus tananyag)
Bevezetés a kliens- és szerveroldali webalkalmazások készítésébe (elektronikus tananyag)
Webadatbázis-programozás (elektronikus tananyag, PHP alapokon, de a tervezés, az MNV-minta bemutatása és a kliensoldali fejlesztés része itt is aktuális)
A tárgy tavalyi Github oldala
Segítség a dokumentációhoz
Mintadokumentációk
Képgalériás alkalmazás (Bartalos Gábor)
Szerepjáték (Teleki Miklós)
OKTATÓK
Tárgyfelelős
Horváth Győző

