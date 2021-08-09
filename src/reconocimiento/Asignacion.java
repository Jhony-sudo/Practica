
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
        String Mensaje = "Letras ";
        String Id = "ID ";
        String Numero = "Numeros ";
        String Simbolo = "Simbolos ";
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
                         Mensaje = Mensaje + Cadena.charAt(x);
                    }
                    if(esNumero(Cadena.charAt(x))){
                        System.out.println("Entre Numero");
                        Numero = Numero  + Cadena.charAt(x) ;
                    }
                    if(esSimbolo(Cadena.charAt(x))){
                        System.out.println("Entre Simbolo");
                        Simbolo = Simbolo +  Cadena.charAt(x);
                    }
                }
            
            } 
            else{
                if(esLetra(Cadena.charAt(0)) && i == (Longitud - 1)){
                    for(int x=0;x<Longitud;x++){
                        Id = Id + Cadena.charAt(x);
                    }
                }
            
            }
        }
        System.out.println("Antes del mensaje");
        System.out.println(Mensaje);
        Mensaje = Mensaje + "\n" + Numero + "\n" + Simbolo + "\n" + Id + "\n";
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
