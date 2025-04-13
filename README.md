# Algorithm

## DichotomousResearch

L'obiettivo di questo esercizio è replicare l'algoritmo della **ricerca dicotomica**.

Creare la classe `DichotomousResearch` con relativo JUnit di test `DichotomousResearchTest`.

### Input

L'algoritmo riceve in input un array ordinato (ASC) di 10 elementi di tipo **int**.

```java
class DichotomousResearch {
    int[] arr = {2, 5, 7, 8, 21, 30, 44, 60, 72, 98};
}
```

### Algoritmo

- Iterativamente avviene una divisione a metà dell'array.
- Verifico se il valore cercato potrebbe essere nella prima metà o nella seconda.
- Considero solo la parte di array che potrebbe contenere il valore ricercato.
- Continuo il processo fino a trovare il valore ricercato oppure fino ad arrivare al punto in cui non ci sono più partizionamenti da fare, quindi giungere alla conclusione che il valore non è presente.

### Output

Il metodo `dichotomousResearch()` ritorna un valore booleano.
> **true**: Il valore è all'interno della lista.
> **false**: Il valore non è stato trovato.

### Consigli

Quando dividi l'array, per capire in quale partizione potrebbe essere il valore ricercato, confronta esso stesso con l'ultimo elemento della prima partizione.
Se è minore vuol dire che si trova nella prima partizione, se è maggiore vuol dire che si trova nella seconda.
