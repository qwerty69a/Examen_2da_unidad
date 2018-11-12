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
        Manufactura x=new Manufactura();
        Apoyo y=new Apoyo();
        Jefe z=new Jefe();
        System.out.println("Escribe el nombre del empleado de Manufactura");
        x.setNombre(leer.nextLine());
        System.out.println("Escribe el nombre del empleado de Apoyo");
        System.out.println(" ");
        System.out.println(" ");
        y.setNombre(leer.nextLine());
        System.out.println("Escribe el nombre del Jefe");
        System.out.println(" ");
        System.out.println(" ");
        z.setNombre(leer.nextLine());
        System.out.println("Escribe el apeido del empleado de Manufactura");
        x.setApeido(leer.nextLine());
        System.out.println("Escribe el apeido del empleado de Apoyo");
        y.setApeido(leer.nextLine());
        System.out.println("Escribe el apeido del Jefe");
        z.setApeido(leer.nextLine());
        System.out.println("Escribe la edad del empleado de Manufactura");
        x.setEdad(leer.nextInt());
        System.out.println("Escribe la edad del empleado de Apoyo");
        y.setEdad(leer.nextInt());
        System.out.println("Escribe la edad del Jefe");
        z.setEdad(leer.nextInt());
        System.out.println("¿Cuanto gana el empleado de Manufactura por hora?");
        x.setSalario(leer.nextDouble());
        System.out.println("¿Cuanto gana el empleado de Apoyo por hora?");
        y.setSalario(leer.nextDouble());
        System.out.println("¿Cuanto gana el Jefe a la semana?");
        z.setSalario(leer.nextDouble());
        System.out.println("Los 3 tipos de empleados son:");
        System.out.println("    Manufactura.");
        System.out.println("Nombre: "+x.getNombre());
        System.out.println("Apeido: "+x.getApeido());
        System.out.println("Edad: "+x.getEdad());
        System.out.println("Sueldo semanal: "+x.calcularSalario());
        System.out.println("    Apoyo.");
        System.out.println("Nombre: "+y.getNombre());
        System.out.println("Apeido: "+y.getApeido());
        System.out.println("Edad: "+y.getEdad());
        System.out.println("Sueldo semanal: "+y.calcularSalario());
        System.out.println("    El Jefe:");
        System.out.println("Nombre: "+z.getNombre());
        System.out.println("Apeido: "+z.getApeido());
        System.out.println("Edad: "+z.getEdad());
        System.out.println("Sueldo semanal: "+z.calcularSalario());
    }
}
interface Capturando
{
    public void setNombre(String nombre);
    public void setApeido(String apeido);
    public void setSalario(double salario);
    public void setEdad(int edad);
    public String getNombre();
    public String getApeido();
    public double getSalario();
    public int getEdad();
}
abstract class Empleados implements Capturando
{
    private String nombre, apeido;
    private double salario;
    private int edad;
    Empleados()
    {
        nombre="Alberto";
        apeido="Salazar";
        salario=7500.00;
        edad=22;
    }
    Empleados(String nombre, String apeido, double salario, int edad)
    {
        this.nombre=nombre;
        this.apeido=apeido;
        this.salario=salario;
        this.edad=edad;
    }
    @Override
    public int getEdad()
    {
        return edad;
    }
    @Override
    public double getSalario()
    {
        return salario;
    }
    @Override
    public String getApeido()
    {
        return apeido;
    }
    @Override
    public String getNombre()
    {
        return nombre;
    }
    @Override
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    @Override
    public void setSalario(double salario)
    {
        this.salario=salario;
    }
    @Override
    public void setApeido(String apeido)
    {
        this.apeido=apeido;
    }
    @Override
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
}
class Manufactura extends Empleados
{
    public double calcularSalario()
    {
        double sal;
        sal=getSalario()*45;
        return sal;
    }
}
class Apoyo extends Empleados
{
    public double calcularSalario()
    {
        double sal;
        sal=(getSalario()*45)+((getSalario()*45)*0.5);
        return sal;
    }
}
class Jefe extends Empleados
{
    public double calcularSalario()
    {
        double sal;
        sal=getSalario();
        return sal;
    }
}