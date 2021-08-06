
package reconocimiento;
import javax.swing.JTextArea;

public class Asignacion {
    private String Cadena;
    private Identificador Asignar [];
    
    public Asignacion(String Cadena, JTextArea Tabla){
        this.Cadena = Cadena;
    }
    
    public void Recorrer(){
        int Longitud = Cadena.length();
        char [] Letras = new char [Longitud];
        for(int i = 0;i<= Longitud;i++){
            char Simbolo = Cadena.charAt(i);
            if(esLetra(Simbolo)){
                Identificador P1 = Identificador.Numero;
            }
        }
    }
    
    public boolean esLetra(char Entrada){
        boolean res = false;
        for(int i=97;i<=122;i++){
            int Numero = i;
            char Letra = (char) Numero;
            if(Entrada == Letra){
                res = true;
            }
        }
        
        for(int i=65;i<=90;i++){
            int Numero = i;
            char Letra = (char) Numero;
            if(Entrada == Letra){
                res = true;
            }
        }
        return res;
    }
    
    public boolean esSimbolo(){
      return false;  
    }
    
    public boolean esEspacio(char Entrada){
        boolean res = false;
        
        if(Entrada == 32){
            res = true;
        }
        return res;
        
    }
    
    public boolean esNumero(char Entrada){
        boolean res = false;
        for(int i=48;i<=57;i++){
            int Numero = i;
            char Letra = (char) Numero;
            
            if(Letra == Numero){
                res = true;
            }
        }
        
        return res;
    }
    
}
