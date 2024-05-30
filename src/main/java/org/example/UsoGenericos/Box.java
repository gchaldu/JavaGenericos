package org.example.UsoGenericos;

public class Box<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return t;
    }

    public static void main(String[] args) {
        // Intentando crear una instancia de Box<String>
        Box<String> stringBox = new Box<>();
        stringBox.set("Hola");
        System.out.println(stringBox.get());

        Box<Humano> humanoBox = new Box<>();
        humanoBox.set(new Humano("Pepe"));
        System.out.println(humanoBox.get().nombre);
    }
}

class Humano{
    String nombre;

    public Humano(String nombre) {
        this.nombre = nombre;
    }
}
