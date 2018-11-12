import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner leer=new Scanner(System.in);
                sedan sedan1=new sedan();
                moto moto1=new moto();
                sedan1.acelerar();
                sedan1.setCantPasajeros(4);
                sedan1.setNumRuedas(4);
                sedan1.setSonido(400);
                sedan1.setVocinas(4);
                sedan1.setTransmision("estandar");
                moto1.acelerar();
                moto1.setCantPasajeros(2);
                moto1.setNumRuedas(2);
                moto1.setTransmision("estandar");
                estacionar(sedan1);
                estacionar(moto1);
	}
	public static void estacionar(vehiculo vmw)
	{
            if(vmw instanceof sedan)
            {
                System.out.println("Tipo de vehiculo: Sedan");
                vmw.acelerometro();
                vmw.frenon();
                System.out.println("pasajeros permitidos en el sedan: "+vmw.getCantPasajeros());
                System.out.println("los whatts de potencia del sonido del d¿sedan: "+((sedan) vmw).getSonido());
                System.out.println("Número de vocinas del sedan: "+((sedan) vmw).getVocinas());
                System.out.println("Tipo de transmisión del sedan: "+vmw.getTransmision());
                System.out.println("número de ruedas en el Sedan: "+vmw.getNumRuedas());
            }
            else if(vmw instanceof moto)
            {
                System.out.println("Tipo de vehiculo: Motocicleta");
                vmw.acelerometro();
                vmw.frenon();
                System.out.println("pasajeros permitidos en el sedan: "+vmw.getCantPasajeros());
                System.out.println("Tipo de transmisión del sedan: "+vmw.getTransmision());
                System.out.println("número de ruedas en la moto: "+vmw.getNumRuedas());
            }
	}
}
class vehiculo
{
	private int numRuedas, cantPasajeros, velocidad;
	private String transmision;
	public void setNumRuedas(int numRuedas)
	{
		this.numRuedas=numRuedas;
	}
	public void setCantPasajeros(int cantPasajeros)
	{
		this.cantPasajeros=cantPasajeros;
	}
	public int getNumRuedas()
	{
		return numRuedas;
	}
	public int getCantPasajeros()
	{
		return cantPasajeros;
	}
	public void setTransmision(String transmision)
	{
		this.transmision=transmision;
	}
	public String getTransmision()
	{
		return transmision;
	}
	public void acelerar()
	{
		velocidad=velocidad+10;
	}
	public void frenar()
	{
		velocidad=velocidad-10;
	}
	public void frenon()
	{
		for(int i=0; i<(velocidad/10); i++)
		{
			frenar();
		}
		System.out.println("vehiculo estacionado");
		System.out.println("velocidad: "+velocidad+" km/h");
	}
	public void acelerometro()
	{
		if(velocidad==0)
		{
			System.out.println("vehiculo detenido");
		}
		else if(velocidad>0)
		{
			System.out.println("vehiculo en moviniento a "+velocidad+" km/h");
		}
	}
}
interface Tuneable
{
	public int sonido=200, vocinas=4;//sonido son los whatts de potncia que dio el profe.
	public void setSonido(int sonido);
	public void setVocinas(int vocinas);
	public int getSonido();
	public int getVocinas();
}
class sedan extends vehiculo implements Tuneable
{
	@Override
	public void setSonido(int sonido)
	{
            
	}

	@Override
	public void setVocinas(int vocinas)
	{
		
	}

	@Override
	public int getSonido()
	{
		return sonido;
	}

	@Override
	public int getVocinas()
	{
		return vocinas;
	}
}
class moto extends vehiculo
{
	
}