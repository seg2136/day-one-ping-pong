public class PingPong {
    public static void main(String[] args) {

        Integer[] arrayList = { 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16 };
        for (Integer listItem : arrayList) {
            String value = checkPingPongValue(listItem);
            System.out.println(value);
        }
    }

    public static String checkPingPongValue(Integer number) {

        if (number % 15 == 0) {
            return "ping-pong";
        } else if (number % 3 == 0) {
            return "ping";
        } else if (number % 5 == 0) {
            return "pong";
        } else {
            String stringNumber = String.valueOf(number);
            return stringNumber;
        }
    }

}
