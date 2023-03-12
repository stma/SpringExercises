
# JPA és Spring Data JPA témakőr feladatok

## Entitások kialakítása

1. Hozz létre egy Entitást, Ember névvel ahol név, születés idő, [rassz](https://hu.wikipedia.org/wiki/Nagyrassz) tároljuk.
2. Hozz létre egy Entitást, Kutya névvel ahol név, születés idő, fajta tároljuk.

## Kapcsolatok kialakítása

1. emberek és kutyák közötti kapcsolat egy a többhöz, azaz egy kutyának
egy gazdája lehet, de egy embernek több kutyája is. Hozzd létre ezt a kapcsolatot
úgy, hogy mindkét irányből el lehessen érni a szereplőket.
1. emberek és emberek közötti kapcsolat több a többhöz kapcsolat,
ahol a kapcsolatot a családtagi kapcsolat megvalósítása.

## Extra (ílyen kérés nem lesz a témazáróban)

1. emberek és emberek közötti kapcsolat több a többhöz kapcsolat,
ahol a kapcsolat többféle kapcsolatot is leírhat. Hozz létre egy
Kapcsolat felsorolást pl. család, munkatárs, házastárs, stb.
Itt a kapcsolótáblát külön entitásként kezeld és a megfelelő kapcsolatokat
hozd létre a kapcsolódó ember entitáshoz.
