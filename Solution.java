import java.lang.Math;
public class Main {

  public static int solution(String E, String L) {
    String[] eParts = E.split(":");
    String[] lParts = L.split(":");
    
    int entranceFee = 2;
    int firstHour = 3;
    int additionalHour = 4;

    int eMinutes = Integer.parseInt(eParts[0]) * 60 + Integer.parseInt(eParts[1]);
    int lMinutes = Integer.parseInt(lParts[0]) * 60 + Integer.parseInt(lParts[1]);

    int parkingHours = (int) Math.ceil((lMinutes - eMinutes) / 60.0);

    int parkingFee = (parkingHours-1) * additionalHour + firstHour + entranceFee;

    return parkingFee;
  }
  
    
  public static void main(String[] args) {
  	String E = "9:42";
	String L = "11:42";
    int result = solution(E, L);
		
	System.out.println("The parking fee is: $"+ result);
  }
}
