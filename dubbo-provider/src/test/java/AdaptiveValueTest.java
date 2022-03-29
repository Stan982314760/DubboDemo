/**
 * @Author: stan
 * @Date: 2022/03/25
 * @Description:
 */
public class AdaptiveValueTest {
    public static void main(String[] args) {
        char[] charArray = AdaptiveValueTest.class.getSimpleName().toCharArray();
        StringBuilder sb = new StringBuilder(64);
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                if (i != 0) {
                    sb.append(".");
                }
                sb.append(Character.toLowerCase(charArray[i]));
            } else {
                sb.append(charArray[i]);
            }
        }

        System.out.println(sb.toString());
    }
}
