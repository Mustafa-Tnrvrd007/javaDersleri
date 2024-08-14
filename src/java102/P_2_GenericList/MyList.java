package java102.P_2_GenericList;

public class MyList<T> {
    private int arraySize; // dizi boyutu
    private T[] list; /// generic liste
    private int capacity;

    MyList() {
        setCapacity(10);
        // list = new T[getArraySize()];
        list = (T[]) new Object[getCapacity()];
    }

    MyList(int arrayLength) {

        setCapacity(capacityDetermination(arrayLength)); // kapasite ye göre atama
        list = (T[]) new Object[getCapacity()];
    }

    public void add(T data) { /// veri ekleme
        if (size() == capacityDetermination(getCapacity())) {
            sizeIncrease();

        }
        for (int i = 0; i < getCapacity(); i++) {
            if (getList()[i] == null) {
                getList()[i] = data;
                break;
            }
        }

    }

    public void sizeIncrease() { // listenin boyutunu büyütür
        T[] dizi = (T[]) new Object[capacityDetermination(getCapacity() + 1)];
        for (int i = 0; i < getCapacity(); i++) {
            dizi[i] = getList()[i];
        }
        setCapacity(capacityDetermination(getCapacity() + 1));
        setList(dizi); /// yeni dizi atamasi

    }

    public int size() { /// dizideki eleman sayisi
        int boyut = 0;
        for (int i = 0; i < getCapacity(); i++) {
            if (getList()[i] != null) {
                boyut++;
            }
        }
        return boyut;
    }

    public int capacityDetermination(int cpcty) { /// dizinin kapasitesi
        int size = 10;
        while (size < cpcty) {
            size *= 2;
        }
        return size;
    }

    public void printListe() { // listeyi yazdirir
        System.out.println("Liste :");

        for (int i = 0; i < getCapacity(); i++) {
            if (getList()[i] != null) {
                System.out.print("\t" + getList()[i]);
            }
        }
        System.out.println("\n");

    }

    public T get(int index) { /// index deki eleman
        if (index >= getCapacity() || index < 0) {
            System.out.println("get() fonksiyonu Hatali index girişi");
            return null;
        } else {
            return getList()[index];
        }
    }

    public void remove(int index) { /// verilen index'teki veriyi siler
        if (index > size() || index < 0){
            System.out.println("remove() fonksiyonu Hatali index girişi");
        }else {
            do {
                getList()[index]=getList()[index+1];
                index++;
            }while (index <size());

            getList()[size()] = null; // son index e null atar

        }
    }
    public void set( int index, T data){ // verilen indexteki veriyi parametre (data) ile değiştirir

        if (index >= getCapacity() || index < 0){
            System.out.println("set() fonksiyonu Hatali index girişi");
        }else {
            getList()[index] = data;
        }
    }

    public String toString(){ /// diziyi string ile listeler

        String str = "[";
        int dongu = size();
        for (int i = 0; i < dongu; i++) {
            str += getList()[i]+",";
        }
        str += "]";
        return str;
    }
    public int indexOf( T data){ // verinin index'ini bulur , veri yoksa -1 döner
        for (int i = 0; i < size(); i++) {
            if (data.equals(getList()[i])){
                return i;
            }
        }
        //System.out.println(" indexOf girdiginiz deger bulunamadi");
        return -1;
    }
    public int lastIndexOf(T data ){
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (data.equals(getList()[i])){
                index= i;
            }
        }
        return  index;
    }

    public  boolean isEmpty(){
        boolean control = true;
        for (int i = 0; i < getCapacity(); i++) {
            if (getList()[i] != null){
                control = false;
            }
        }
        return  control;
    }

    public T[] toArray(){

        return getList();
    }
    public void clear (){
        // System.out.println(" Liste temizleniyor ");
        for (int i = 0; i < size(); i++) {
            getList()[i]= null;
        }
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> sublist = new MyList<>(); // Yeni bir MyList oluştur
        for (int i = start; i <= finish; i++) {
            sublist.add(getList()[i]); // Elemanları alt listeye ekle
        }
        return sublist;
    }
    public  boolean contains(T data ){
        boolean control = false;
        for (int i = 0; i < size(); i++) {
            if (getList()[i].equals(data)){
                control=true;
            }
        }
        return control;
    }



    public T[] getList() {
        return this.list;
    }

    public void setList(T[] list) {
        this.list = list;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
