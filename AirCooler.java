class AirCooler{
	public static void on(int fanSpeed,String name,float coolingArea,short squareFeet,boolean isOn){
		System.out.println("The aircooler is on with the speed is......"+fanSpeed+"and it is On"+isOn+"and their square feet is:"+squareFeet);
		System.out.println("The cooler name is:"+name+"and their square feet is"+squareFeet);
	}
	public static void off(int currentSpeed,double reviews,char grade,long contactNumber,boolean isOff){
		System.out.println("The cooler is turned of:"+currentSpeed+reviews+grade+contactNumber+isOff);
	}
	public static void airFlow(String meter,boolean isRotating,int length,long qrCode,double radius){
		System.out.println("The cooler rotating direction is:"+meter+isRotating+length+qrCode+radius);
	}
	public static void adjustSpeed(int maxSpeed, boolean isActive, char currentMode,double batteryLevel, String name, long serialNumber, byte num){
       System.out.println("The adjusted Speed is : " + maxSpeed + isActive + currentMode + batteryLevel + name + serialNumber + num);
    }
	public static void settings(int changeSpeed,boolean isAvailable,byte differentSizes,char light,long referenceNumber){
		System.out.println("The setting mode is:"+changeSpeed+isAvailable+differentSizes+light+referenceNumber);
	}
	public static void main(String args[]){
		on(3,"Bajaj Frio",2.7f,(short)150,true);
		off(5,4.2,'A',8774378577L,false);
		airFlow("Average",true,40,5676483789L,23.5d);
		adjustSpeed(5,true,'N',9.6,"Bajaj",34356765123l , (byte)23);
		settings(7,true,6,'O',7347467474L);

	}


}