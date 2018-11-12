/**
 * 
 *
 * @author Alberto O, Salazar 18550300
 */
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        double a, b, c, d, e, f, g, h, i, j, k, l;
        Formula_1 x=new Formula_1();
        Formula_2 y=new Formula_2();
        Formula_3 z=new Formula_3();
        System.out.println("Da la aceleración");
        x.setAceleracion(leer.nextDouble());
        y.setAceleracion(x.getAceleracion());
        z.setAceleracion(y.getAceleracion());
        System.out.println("Da el tiempo en segundos");
        x.setTiempo(leer.nextDouble());
        y.setTiempo(x.getTiempo());
        z.setTiempo(y.getTiempo());
        System.out.println("Escribe la velocidad inicial en km/h");
        x.setVelInicial(leer.nextDouble());
        y.setVelInicial(x.getVelInicial());
        z.setVelInicial(y.getVelInicial());
        System.out.println("Escribe la velocidad final en km/h");
        x.setVelFinal(leer.nextDouble());
        y.setVelFinal(x.getVelFinal());
        z.setVelFinal(y.getVelFinal());
        a=x.getAceleracion();
        b=x.getTiempo();
        c=x.getVelInicial();
        d=x.getVelFinal();
        e=y.getAceleracion();
        f=y.getTiempo();
        g=y.getVelInicial();
        h=y.getVelFinal();
        i=z.getAceleracion();
        j=z.getTiempo();
        k=z.getVelInicial();
        l=z.getVelFinal();
        System.out.println("la distancia con la formula 1 es: "+x.calcularDistancia(a, b, c, d));
        System.out.println("la distancia con la formula 2 es: "+y.calcularDistancia(e, f, g, h));
        System.out.println("la distancia con la formula 3 es: "+z.calcularDistancia(i, j, k, l));
    }
}
interface Captura
{
    public void setAceleracion(double aceleracion);
    public void setTiempo(double tiempo);
    public void setVelInicial(double velInicial);
    public void setVelFinal(double velFinal);
    public double getAceleracion();
    public double getTiempo();
    public double getVelInicial();
    public double getVelFinal();
}
abstract class Movimiento implements Captura
{
    private double aceleracion, tiempo, velInicial, velFinal;
    Movimiento()
    {
        aceleracion=5.6;
        tiempo=10.0;
        velInicial=32.6;
        velFinal=40.5;
    }
    Movimiento(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        this.aceleracion=aceleracion;
        this.tiempo=tiempo;
        this.velInicial=velInicial;
        this.velFinal=velFinal;
    }
    public double calcularDistancia(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        double distancia=0;
        
        return distancia;
    }
    @Override
    public void setAceleracion(double aceleracion)
    {
        this.aceleracion=aceleracion;
    }
    @Override
    public void setTiempo(double tiempo)
    {
        this.tiempo=tiempo;
    }
    @Override
    public void setVelInicial(double velInicial)
    {
        this.velInicial=velInicial;
    }
    @Override
    public void setVelFinal(double velFinal)
    {
        this.velFinal=velFinal;
    }
    @Override
    public double getAceleracion()
    {
        return aceleracion;
    }
    @Override
    public double getTiempo()
    {
        return tiempo;
    }
    @Override
    public double getVelInicial()
    {
        return velInicial;
    }
    @Override
    public double getVelFinal()
    {
        return velFinal;
    }
}
class Formula_1 extends Movimiento
{
    @Override
    public double calcularDistancia(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        double distancia;
        distancia=(getVelInicial()*getTiempo())+((getAceleracion()*Math.pow(getTiempo(), 2.0))/2);
        return distancia;
    }
    
}
class Formula_2 extends Movimiento
{
    @Override
    public double calcularDistancia(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        double distancia;
        distancia=((getVelInicial()+getVelFinal())/2)*(getTiempo());
        return distancia;
    }
    
}
class Formula_3 extends Movimiento
{
    @Override
    public double calcularDistancia(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        double distancia;
        distancia=(getVelFinal()-getVelInicial())/(2*getAceleracion());
        return distancia;
    }
    
}