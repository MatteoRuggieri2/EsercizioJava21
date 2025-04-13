package esercizi;

// SPIEGAZIONE FUNZIONAMENTO ALGORITMO
/* Questo esercizio serve a creare un algoritmo di ricerca dicotomica.
 * In pratica, partiamo con un array di valori ordinati. Per ottimizzare
 * e velocizzare la ricerca, divido l'array in 2. Se l'ultimo valore della partizione è
 * maggiore di quello che sto cercando, vuol dire che si troverà in quella
 * metà di array, altrimenti vuol dire che devo prendere in considerazione 
 * la metà successiva. Se il numero è uguale vuol dire che l'ho trovato, 
 * altrimenti continuo con lo stesso metodo, divido per 2 l'array e faccio
 * gli stessi controlli. A forza di dividere per 2 arriverai al valore ricercato.
 * Se l'ultimo valore non è quello che cerchi, vuol dire che non è presente nell'array. */

public class RicercaDicotomica {
	
	private int[] valuesArr;
	private int searchedValue;
	private int arrLength;
	private int startPartition;
	private int endPartition;
	private int arrMiddle; // L'indice centrale della partizione

	public static void main(String[] args) {
		RicercaDicotomica rd = new RicercaDicotomica();
		rd.run();
	}
	
	private void run() {
		int[] testArray = {2, 5, 7, 8, 21, 30, 44, 60, 72, 98};
		this.searchedValue = 72;
		System.out.println(this.dichotomousResearch(this.searchedValue, testArray));
	}

	public boolean dichotomousResearch(int valueToFind, int[] array) {
		this.valuesArr = array;
		this.arrLength = array.length;
		this.startPartition = 0; 
		this.endPartition = this.arrLength - 1;
		this.arrMiddle = this.endPartition / 2;
 
		while (startPartition < endPartition) {
			int firstValue = array[this.startPartition];
			int middleValue = array[this.arrMiddle];
			int lastValue = array[this.endPartition];
			
			/* Se il primo valore della partizione è uguale al middle, vuol dire che sono arrivato alla fine,
			e se middleValue (ovvero il puntatore) è diverso dal numero cercato, vuol dire che il numero non è
			presente, quindi ritorno false. */
			if (firstValue == middleValue && middleValue != valueToFind) {
				System.out.println("Numero non presente!");
				return false;
			}
			
			// Se uno dei valori è uguale a quello cercato, vuol dire che è presente, quindi torno true.
			if (firstValue == valueToFind || middleValue == valueToFind || lastValue == valueToFind) {
				System.out.println("Numero trovato!");
				return true;
				
			} else if (middleValue > valueToFind) {
				this.movePartitionSX();

			} else {
				this.movePartitionDX();
			}
		}
		
		return false;  // valore non trovato nell'array
	}
	
	private void movePartitionSX() {
		System.out.println("Cerca nella parte a sinistra!");
		this.endPartition = this.arrMiddle;
		this.arrMiddle = this.endPartition / 2;
	}
	
	private void movePartitionDX() {
		System.out.println("Cerca nella parte a destra!");
		this.startPartition = this.arrMiddle + 1;
		this.arrMiddle = (this.endPartition + this.startPartition) / 2;
	}

}
















