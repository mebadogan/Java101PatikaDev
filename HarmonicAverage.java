public class HarmonicAverage {
    static void Harmonic(int [] arr){
        double total = 0;
        
        for (int i = 0; i <= arr.length - 1; i++){
            
            total += 1.0 / arr[i];
            
        }
        double harmonicAverage = arr.length / total;
        System.out.println("Harmonic average is : " + harmonicAverage);
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Arithmetic average is :" + (sum / numbers.length));
        Harmonic(numbers);
    }
}