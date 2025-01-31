
package arraylist_package;

class array_list<T> {
    Object[] elements;
    int size;
    int capacity;
   
   
    // Constructor cu valori initiale
    array_list() {
        capacity = 10;  // Asigură-te că capacity este setat înainte de a crea array-ul
        elements = new Object[capacity];
        size = 0;
    }
   
    // Când ajunge la 80% din capacitate, se dublează
    void double_capacity() {
        if (size >=(capacity * 0.8)) {
            int new_capacity = capacity * 2;
            Object[] new_elements = new Object[new_capacity];
            // Copierea elementelor vechi în noua capacitate
            for (int m = 0; m < size; m++) {
                new_elements[m] = elements[m];
            }
            elements = new_elements;
            capacity = new_capacity;
            System.out.println("Capacitatea s-a dublat, capacitatea veche era: " + capacity);
        }
    }

    // Metoda pentru a adăuga un element
    void add_element(T t) {
        if (size == capacity) {
            double_capacity();
        }
        elements[size] = t;
        size++;
    }
   
    // Metoda pentru a obține un element pe baza indexului
    T get_element(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("S-a accesat un index invalid: " + index);
        }
        return (T) elements[index];
    }

    // Metoda pentru a seta un element la un anumit index
    void set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("S-a indicat un index invalid: " + index + ", cu elementul: " + element);
        }
        elements[index] = element;
    }

    // Metoda pentru a șterge un element de pe un anumit index
    void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Accesarea unui index invalid!");
        } else {
            // Mută toate elementele după indexul șters cu o poziție spre stânga
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
    }

    // Metoda pentru a verifica dacă lista este goală
    boolean isEmpty() {
        return size == 0;
    }

    // Metoda pentru a verifica dacă lista conține un element
    boolean contains(T t) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == t) {
                return true;
            }
        }
        return false;
    }


    public String toString(){
        String result="Lista contine:";
        for(int i=0;i<size;i++){
            result += elements[i].toString();
            if(i<size-1){
                result+=", ";
            }
        }
        return result;
    }

    

///addall
boolean addAll(T[] newElements) {
    if (newElements.length == 0) {
        return false;
    }
    int newNum = newElements.length;
     if(size + newNum > capacity) {
        double_capacity();
    }
    // Adăugăm fiecare element din array la lista noastră
    for (int i = 0; i < newNum; i++) {
        elements[size++] = newElements[i];
    }
    return true; // Returnează true dacă s-au adăugat elementele
}
    
public array_list<T> subList(int fromIndex, int toIndex) {
    if (fromIndex < 0) throw new IndexOutOfBoundsException("Index invalid!!!");
    if (toIndex > size) throw new IndexOutOfBoundsException("Index gresit!");
    if (toIndex <= fromIndex) throw new IndexOutOfBoundsException("Eroare!!!!1");

    array_list<T> subList = new array_list<>(); // Creăm un nou array_list pentru sublis

    // Copiem elementele din lista originală în sublistă
    for (int i = fromIndex; i < toIndex; i++) {
        subList.add_element((T) elements[i]);
    }

    return subList;
  }
}



