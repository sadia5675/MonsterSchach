# MonsterSchach
Dieses Spiel wurde im Rahmen des Fachs "Softwaretechnik" an der Hochschule RheinMain entwickelt. Die Aufgabe habe ich zusammen mit zwei weiteren Kommilitonen entwickelt.
**MonsterSchach** ist ein strategisches Brettspiel, bei dem zwei Spieler mit unterschiedlichen Figuren und besonderen Spielmechaniken gegeneinander antreten. Jede Figur hat eigene Bewegungsregeln, und durch Wettkämpfe und Items wird das Spiel dynamischer als klassisches Schach.

## Spielübersicht

Das Spielfeld besteht aus 8x8 quadratischen Feldern, auf denen zwei Spieler gegeneinander antreten. Jeder Spieler kontrolliert vier Spielfiguren: zwei „Bauern“, eine „Königin“ und eine „Turmfigur“. Jede Figur hat einzigartige Bewegungsregeln und Fähigkeiten. Ziel des Spiels ist es, alle Figuren des Gegners vom Spielfeld zu entfernen.

## Spielfiguren

- **Bauer**: Kann sich diagonal, horizontal und vertikal bewegen, jedoch nur um 1 Feld. Erreicht der Bauer die gegnerische Anfangsreihe, verwandelt er sich in einen Turm.
- **Turm**: Kann sich beliebig weit horizontal und vertikal bewegen.
- **Königin**: Kann sich diagonal, horizontal und vertikal bewegen und beliebig viele Felder vorrücken.

## Wettstreit-Mechanik

Wenn zwei Figuren auf dasselbe Feld ziehen, startet ein Wettstreit. Der Angreifer wählt eines der Minispiele:

- **Rechenspiel**: Wer die Rechenaufgabe schneller löst, gewinnt.
- **Klick die Kreise**: Wer die meisten Kreise in einer bestimmten Zeit anklickt, gewinnt.

## Items

- **Schild**: Verhindert einmalig das Verlieren eines Wettstreits.
- **Rang Upgrade/Downgrade**: Erhöht oder senkt den Rang einer Figur.
- **Fallen**: Beeinträchtigen gegnerische Figuren, z.B. durch Bewegungsunfähigkeit oder Teleportation.

## Spielziel

Das Spiel ist gewonnen, wenn alle gegnerischen Spielfiguren vom Spielfeld genommen wurden.

## Technologien

Dieses Projekt verwendet:
- **Java**
- **JavaFX**
- **FXML**

## Anwendungsvorschau

Hier sind GIFs, die eine Vorschau der Anwendung zeigen:

![item GIF](https://github.com/sadia5675/MonsterSchach/blob/main/item.gif)
![clickGame GIF](https://github.com/sadia5675/MonsterSchach/blob/main/clickGame.gif)
![calculationGame GIF](https://github.com/sadia5675/MonsterSchach/blob/main/calculationGame.gif)

