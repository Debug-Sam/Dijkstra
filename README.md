# Dijkstra
De bekende Nederlandse informaticus Dijkstra heeft een beroemd algoritme ontwikkeld om het kortste pad te bepalen tussen twee plaatsen. Bijvoorbeeld een treinreis tussen Utrecht en Enschede, wel of niet via Amersfoort, een autorit tussen Amsterdam en Marseille, via Brussel of Maastricht, maar je kunt "kortste" ook lezen als goedkoopste, bijvoorbeeld bij vliegreizen, of beste, bijvoorbeeld de minste kans op vertragingen. Je kunt het Dijkstra algoritme uitstekend gebruiken om te laten zien dat je OO programmeren goed begrijpt.


# hoe het werkt
Ik heb van Stap een super class gemaakt waar de trein, auto en vlucht gebruik van maken. Elke Stap heeft een begin en een eind. Deze stap heeft ook een waarde afhankelijk van het 
type stap dat het is (trein, auto of vlucht). 
De reis is de combinatie van stappen. je geeft een begin en eind punt van je reis op en gebruikt dan de functie dijkstra die dan de kortste route kiest van de aangegeven punten.
Het dijkstra algoritme berekent van de waardes die die binnen krijgt welke waarde het kleinste is. en kiest dan die route.
