# Lab 1 - Documentation

Toutes nos expériences ont été réalisées avec k = 3. 

## Cas : LRU Gagne
Liste de données : "A", "G", "A", "C", "A", "C", "E", "B", "D", "D", "E", "F", "G", "E"

### Explications 

La stratégie LRU est plus performante lorsqu'on visite les mêmes pages fréquemment. 

Dans notre exemple, la différence se fait sur la lettre E. La stratégie LRU l'emporte sur la fin car, lors du dernier appel du E, ça sera le seul 
algorithme qui se souviendra de cette donnée. En effet, L'espace entre les appels de la lettre E est juste assez grand pour que le LRU garde cette page en mémoire à l'inverse des autres stratégies de gestion du cache.


## Cas : Fifo Gagne
Liste de données : "A", "F", "B", "F", "B", "F", "B", "E", "E", "F", "A", "B", "C","E", "A", "B", "A", "E", "D", "C"

### Explications 



## Cas : Clock Gagne
Liste de données : "A", "G", "E", "F", "B", "C", "H", "E", "B", "E", "H", "I", "G", "E", "F", "G", "E", "A", "G"

### Explications 

