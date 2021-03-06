package es.unileon.prg.tema7;

class Date{

	private int _day;
	private int _month;
	private int _year;
	
	public Date(int day, int month, int year){
		this._day=day;
		this._month=month;
		this._year=year;
	}
	

	public int getDay(){
		return _day; 
	}

	public int getMonth(){
		return _month; 
	}

	public int getYear(){
		return _year; 
	}


	public boolean isSameYear(Date otherDate){
		if (otherDate.getYear() == getYear()){
			return true;
		}else{
			return false;
		}
	}

	public boolean isSameMonth(Date otherDate){
		if (otherDate.getMonth()  == getMonth()){
			return true;
		}else{
			return false;
		}
	}

	public boolean isSameDay(Date otherDate){
		if (otherDate.getDay() == getDay()){
			return true;
		}else{
			return false;
		}
	}

	public boolean isSame(Date otherDate){
		if (isSameYear(otherDate) && isSameMonth(otherDate) && isSameDay(otherDate) ){
			return true;
			}
		return false;
			
	}
	public String getMonthName(){
		String name =" ";
		switch (getMonth()){
		case 1:
			name = "enero";
			break;
		case 2:
			name = "febrero";
			break;
		case 3:
			name = "marzo";
			break;
		case 4:
			name = "abril";
			break;
		case 5:
			name = "mayo";
			break;
		case 6:
			name = "junio";
			break;
		case 7:
			name = "julio";
			break;
		case 8:
			name = "agosto";
			break;
		case 9:
			name = "septiembre";
			break;
		case 10:
			name = "octubre";
			break;
		case 11:
			name = "noviembre";
			break;
		case 12:
			name = "diciembre";
			break;
		}
		return name;
	}
	
	private int daysOfMonth(){
		int number = 0;
		switch (getMonth()){
		case 1: 
			number = 31;
			break;
		case 2:
			number = 28;
			break;
		case 3: 
			number = 31;
			break;
		case 4: 
			number = 30;
			break;
		case 5: 
			number = 31;
			break;
		case 6: 
			number = 30;
			break;
		case 7: 
			number = 31;
			break;	
		case 8: 
			number = 31;
			break;
		case 9: 
			number = 30;
			break;
		case 10: 
			number = 31;
			break;
		case 11: 
			number = 30;
			break;
		case 12:
			number = 31;
			break;
		}
		return number;
	}
	public boolean isCorrectDays(){
		return (getDay() > 0) && (getDay() <= daysOfMonth() );
	}
	public String estaciones(){
		String estacion =" ";
		switch (getMonth()){
		case 1: 
			estacion = "Winter";
			break;
		case 2:
			estacion = "Winter";
			break;
		case 3: 
			estacion = "Winter";
			break;
		case 4: 
			estacion = "Spring";
			break;
		case 5: 
			estacion = "Spring";
			break;
		case 6: 
			estacion = "Spring";
			break;
		case 7: 
			estacion = "Summer";
			break;	
		case 8: 
			estacion = "Summer";
			break;
		case 9: 
			estacion = "Summer";
			break;
		case 10: 
			estacion = "Autumn";
			break;
		case 11: 
			estacion = "Autumn";
			break;
		case 12:
			estacion = "Autumn";
			break;
		}
		return estacion;
	}
	
	public void cantidadMeses(){
		int i=0;
		System.out.println("faltan "+(12-getMonth()+1)+" meses: ");
		for (i=getMonth();i<13;i++){
			
			System.out.println("el mes "+getMonthName2(i));
			
		}
	 	
	}
	private String getMonthName2(int meses){
		String name =" ";
		switch (meses){
		case 1:
			name = "enero";
			break;
		case 2:
			name = "febrero";
			break;
		case 3:
			name = "marzo";
			break;
		case 4:
			name = "abril";
			break;
		case 5:
			name = "mayo";
			break;
		case 6:
			name = "junio";
			break;
		case 7:
			name = "julio";
			break;
		case 8:
			name = "agosto";
			break;
		case 9:
			name = "septiembre";
			break;
		case 10:
			name = "octubre";
			break;
		case 11:
			name = "noviembre";
			break;
		case 12:
			name = "diciembre";
			break;
		}
		return name;
	}
	public void restOfDates(){
		String name;
		int i=0;
		for(i=getDay();i<daysOfMonth();i++){
			System.out.println(" "+i+"/"+getMonth()+"/"+getYear()+" ");
		}
	}
}

