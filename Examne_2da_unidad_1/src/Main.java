import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
            Scanner leer=new Scanner(System.in);
            CadenaTexto obj=new CadenaTexto();
            System.out.println("escribe una palabra");
            obj.setCadena(leer.nextLine());
            System.out.println("¿cuantas veces quieres imprimir la palabra 'cadena'?");
            obj.setX(leer.nextInt());
            System.out.println("Escoge una opción:");
            System.out.println("1.- Vertical");
            System.out.println("2.- Horizontal");
            int a=leer.nextInt();
            if (a==1)
            {
                obj.setEstilo("V");
            }
            else if(a==2)
            {
                obj.setEstilo("H");
            }
            switch(obj.getEstilo())
            {
                case "H": for(int i=0; i<obj.getX(); i++)
                          {
                              obj.Cadena();
                              System.out.print(obj.getCadena());
                              System.out.print(" ");
                          }
                break;
                case "V": for(int i=0; i<obj.getX(); i++)
                          {
                              obj.Cadena();
                              System.out.print(obj.getCadena());
                              System.out.print(" \n");
                          }
                break;
                default: System.out.println("caracter invalido");
                break;
            }
	}
}
class Cadena
{
    private String cadena;
    public void Cadena()
    {
        System.out.print("Cadena ");
    }
    public void setCadena(String cadena)
    {
        this.cadena=cadena;
    }
    public String getCadena()
    {
        return cadena;
    }
}
class CadenaTexto extends Cadena
{
    private int x;
    private String estilo;
    public void setX(int x)
    {
        this.x=x;
    }
    public int getX()
    {
        return x;
    }
    public void setEstilo(String estilo)
    {
        this.estilo=estilo;
    }
    public String getEstilo()
    {
        return estilo;
    }
}