public class J201_21 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 10; i < 101; i++){
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
