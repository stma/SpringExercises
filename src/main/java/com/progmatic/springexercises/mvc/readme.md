
# Spring MVC és REST témakőr feladatok

## Controller kialakítása

1. Hozz létre egy controllert ami majd a
felhasználókkal kapcsolatos kéréseket fogja fogadni.
2. Hozz létre egy controllert ami majd a
   termékekkel kapcsolatos kéréseket fogja fogadni.
3. Hozz létre egy rest controllert ami majd a
   termékekkel kapcsolatos kéréseket fogja fogadni.

## Kérések kezelői létrehozása

1. Hozz létre a felhasználói kéréseket kezelő controllerben
(későbbiekben FC) a `/user` útvonalra érkező `GET` kérést kiszolgáló
kezelőt ahol egy temlate név lesz a visszatérési érték.
2. Az előző feladatban létrehozott útvonal-kezelőben használt template
hozd létre egy egyszerű tartalommal:
    ```
        Profil oldal
        
        üdv a gyakorló oldalunkon.
        
        [Aliz oldala]
    ```
   - a `Profil oldal` egy fejléc
   - a `üdv a gyakorló oldalunkon.` egy paragrafus
   - a `[Aliz oldala]` egy link ami a `/user/aliz` útvonalra irányítson

1. Az előző feladatban létrehozott linket kiszolgáló kérés-kezelőt
alakítsd ki ahol a `/user/{name}` útvonalra érkező `GET` kérésekte
egy egyszerű nyers szöveggel térsz vissza a HTTP válaszban. `Hello Aliz!`
Itt a név mindig az utvonalban szereplő `name` változóval megegyezző legyen.

1. Hozz létre formokat az egyes entitások felviteléhez
2. Hozz létre a formokhoz kapcsolódó validálásokat, hogy ha azok nem teljesülnek akkor megjelenjen a formban a hiba
