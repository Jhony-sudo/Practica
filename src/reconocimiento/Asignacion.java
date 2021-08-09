
package reconocimiento;
import javax.swing.JTextField;

public class Asignacion {
    private String Cadena;
    private Identificador Asignar [];
    private JTextField Cuadro;
    public Asignacion(String Cadena, JTextField Cuadro){
        this.Cadena = Cadena;
        this.Cuadro = Cuadro;
        
    }
    
    public void Recorrer(){
        String Mensaje = "";
        int Longitud = Cadena.length();
        int NumeroTokens = 1;
        for(int i =0;i<=Longitud;i++){
            if(esEspacio(Cadena.charAt(i))){
                NumeroTokens ++;
                for(int x=0;x<i;i++){
                    if(esLetra(Cadena.charAt(x))){
                        Mensaje = Mensaje + "Letra" + Cadena.charAt(x);
                    }
                    if(esNumero(Cadena.charAt(x))){
                    }
                    if(esSimbolo(Cadena.charAt(x))){
                    }
                }
            
            } 
            else{
            
            }
        }
        Cuadro.setText(Mensaje);
        
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
    
    public boolean esSimbolo(char Entrada){
        boolean res = false;
        for(int i=33;i<=126;i++){
            int Numero = i;
            char Letra = (char) Numero;
            if(Letra == Numero && (!esLetra(Letra)|!esNumero(Letra)|!esEspacio(Letra))){
                res = true;
            }
        }
        return res; 
      
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
