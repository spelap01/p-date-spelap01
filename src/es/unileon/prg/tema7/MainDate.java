package es.unileon.prg.tema7;

public class MainDate{


	public static void main(String args[]){
		Date fecha= new Date(27,03,2017);
		Date fecha2= new Date(28,03,2017);
		System.out.println("es el mismo año: " +fecha.isSameYear(fecha2));
		System.out.println("es el mismo mes: " +fecha.isSameMonth(fecha2));
		System.out.println("es el mismo dia: " +fecha.isSameDay(fecha2));
		System.out.println("is same: "+fecha.isSame(fecha2));
		System.out.println("el mes "+fecha.getMonthName());
		System.out.println("el dia es: "+fecha.isCorrectDays());
		System.out.println("la estacion es: "+fecha.estaciones());
		fecha.cantidadMeses();
		fecha.restOfDates();
		System.out.println(" "+fecha.getMonthsSameDays());
	}
}
