public abstract class CriaturasMarinas {
    //variables
    String nombre;

    public CriaturasMarinas(String nombre) {
        this.nombre = nombre;
    }

    //esto obliga a sobreescribir en las clases que heredan de criaturas marinas
    abstract void nadar();
}
