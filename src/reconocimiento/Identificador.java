
package reconocimiento;

public enum Identificador {
    Numero(5),Id("ASD5"),Caracter('a'),Error("5.");
    private int Num;
    private char Carac;
    private String Identificador;
    private String Penalizacion;
    
    private Identificador(int Numero){
        this.Num = Numero;
    }
    
    private Identificador(String Identificador){
        this.Identificador = Identificador;
    }
    
    private Identificador(char Carac){
        this.Carac = Carac;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public char getCarac() {
        return Carac;
    }

    public void setCarac(char Carac) {
        this.Carac = Carac;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public String getPenalizacion() {
        return Penalizacion;
    }
    
    public void setPenalizacion(String Penalizacion) {
        this.Penalizacion = Penalizacion;
    }
    
    
    
    
}
