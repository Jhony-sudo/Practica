
package reconocimiento;
import javax.swing.JTextArea;

public class Asignacion {
    private String Cadena;
    private Identificador Asignar [];
    private JTextArea Cuadro;
    public Asignacion(String Cadena, JTextArea Cuadro){
        this.Cadena = Cadena;
        this.Cuadro = Cuadro;
        
    }
    
    public void Recorrer(){
        String Mensaje = "a";
        int Longitud = Cadena.length();
        System.out.println(Longitud);
        int NumeroTokens = 1;
        for(int i =0;i<Longitud;i++){
            if(esEspacio(Cadena.charAt(i))){
                NumeroTokens ++;
                for(int x=0;x<i;x++){
                    System.out.println("Entre");
                    if(esLetra(Cadena.charAt(x))){
                        System.out.println("Entre Letra");
                         Mensaje = Mensaje + "Letra " + Cadena.charAt(x);
                    }
                    if(esNumero(Cadena.charAt(x))){
                        System.out.println("Entre Numero");
                        Mensaje = Mensaje + "Numero " + Cadena.charAt(x);
                    }
                    if(esSimbolo(Cadena.charAt(x))){
                        System.out.println("Entre Simbolo");
                        Mensaje = Mensaje + "Simbolo " + Cadena.charAt(x) + "\n";
                    }
                }
            
            } 
            else{
            
            }
        }
        System.out.println("Antes del mensaje");
        System.out.println(Mensaje);
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
            char Letra = Entrada;
            if(Letra == Numero && (!esLetra(Letra)&& !esNumero(Letra)&& !esEspacio(Letra))){
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
            char Letra = Entrada;
            
            if(Letra == Numero){
                res = true;
            }
        }
        
        return res;
    }
    
}
