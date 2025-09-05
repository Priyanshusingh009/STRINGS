public class Stringmultiply{
    public static void main(String[] args) {
        String num1="2";
        String num2="3";
        int nums1=Integer.parseInt(num1);
        int nums2=Integer.parseInt(num2);
        int multi=nums1*nums2;
        String result=String.valueOf(multi);
        System.out.println(result);
        /*BigInteger nums1=new BigInteger(num1);
        BigInteger nums2=new BigInteger(num2);
        BigInteger multi=nums1.multiply(nums2);
        String result=multi.toString();
        return result;
 */
    }
}