package org.vishal.dsa.problems.strings;

/**
 * Sample Input
 *
 * 07:05:45PM
 *
 * Sample Output
 *
 * 19:05:45
 */
public class TimeConversion {

    public static void main(String[] args) {
        String time = "04:59:59AM";
        System.out.println(timeConversion(time));
    }

    public static String timeConversion(String str){
        String[] time = str.split(":");
        String hh = time[0];
        String mm = time[1];
        String ss = time[2].substring(0, 2);
        String format = time[2].substring(2);
        int hhInt = Integer.parseInt(hh);
        int mmInt = Integer.parseInt(mm);
        int ssInt = Integer.parseInt(ss);
        StringBuilder output = new StringBuilder();
        System.out.println(format);
        if (format.equalsIgnoreCase("AM")){
            if (hhInt == 12){
                output.append("00").append(":").append(mm).append(":").append(ss);
            }else if (hhInt < 12){
                output.append(hh).append(":").append(mm).append(":").append(ss);
            }
        }else {
            if (hhInt == 12){
                output.append(12).append(":").append(mm).append(":").append(ss);
            }else if (hhInt < 12){
                output.append(hhInt + 12).append(":").append(mm).append(":").append(ss);
            }
        }
        return output.toString();
    }
}
