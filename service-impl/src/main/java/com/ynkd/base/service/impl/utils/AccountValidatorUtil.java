package com.ynkd.base.service.impl.utils;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Mind on 2018/1/18.
 * 功能描述：自己收集的各路神仙工具   牛逼就完事了
 */
public class AccountValidatorUtil {

    private static double EARTH_RADIUS = 6378.137;
    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }
    /**
     * 根据两个位置的经纬度，来计算两地的距离（单位为KM）
     * 参数为String类型
     *
     * @return
     */
    public static double getDistance(String lat1Str, String lng1Str, String lat2Str, String lng2Str) {
        Double lat1 = Double.parseDouble(lat1Str);
        Double lng1 = Double.parseDouble(lng1Str);
        Double lat2 = Double.parseDouble(lat2Str);
        Double lng2 = Double.parseDouble(lng2Str);
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double difference = radLat1 - radLat2;
        double mdifference = rad(lng1) - rad(lng2);
        double distance = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(difference / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(mdifference / 2), 2)));
        distance = distance * EARTH_RADIUS;
        distance = Math.round(distance * 10000) / 10000;
    /*  String distanceStr = distance + "";
        distanceStr = distanceStr.
        substring(0, distanceStr.indexOf("."));*/
        double distance2 = (double) Math.round(distance * 100) / 100;
        return distance2;
    }




    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     *
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

    /**
     * 判断对象或对象数组中每一个对象是否为空: 对象为null，字符序列长度为0，集合类、Map为empty
     *
     * @param obj
     * @return
     */
    public static boolean isNullOrEmpty(Object obj) {
        if (obj == null)
            return true;

        if (obj instanceof CharSequence)
            return ((CharSequence) obj).length() == 0;

        if (obj instanceof Collection)
            return ((Collection) obj).isEmpty();

        if (obj instanceof Map)
            return ((Map) obj).isEmpty();

        if (obj instanceof Object[]) {
            Object[] object = (Object[]) obj;
            if (object.length == 0) {
                return true;
            }
            boolean empty = true;
            for (int i = 0; i < object.length; i++) {
                if (!isNullOrEmpty(object[i])) {
                    empty = false;
                    break;
                }
            }
            return empty;
        }

        return false;
    }

    /**
     * * 两个Double数相乘 *
     *
     * @param v1 *
     * @param v2 *
     * @return Double
     */
    public static Double mul(Double v1, Double v2) {
        BigDecimal b1 = new BigDecimal(v1.toString());
        BigDecimal b2 = new BigDecimal(v2.toString());
        return new Double(b1.multiply(b2).doubleValue());
    }


    /**
     * 得到两日期相差几个月零几天
     * @param startDate 开始日期 0000-00-00
     * @param endDate 结束日期  0000-00-00
     * @return  月份，零几天     1,2   （一个月零两天） 返回0则结束日期小于开始日期
     * @throws ParseException
     */
    public static Map getMonthDiff(String startDate, String endDate) throws ParseException {
        Date Date1 = getTimeForString(startDate);
        Date Date2 = getTimeForString(endDate);
        String str="0";
        Map diff=new HashMap();
        if(Date2.getTime()>=Date1.getTime()){
            String[] split1 = startDate.split("-");
            int year1 = Integer.parseInt(split1[0]);
            int month1 = Integer.parseInt(split1[1]);
            int day1 = Integer.parseInt(split1[2]);

            String[] split2 = endDate.split("-");
            int year2 = Integer.parseInt(split2[0]);
            int month2 = Integer.parseInt(split2[1]);
            int day2 = Integer.parseInt(split2[2]);

            int year = year2-year1;
            int month =month2-month1;
            int day = day2-day1;

            if(day<=0){ //结束日期天 - 开始日期天为负数，则向月借位 ， 借位月 -1 ，天计算为 借位月天数+ 原结束日期天 - 开始日期天
                month--;
                if(month<0){//借位月减后小于等于0则向年借位
                    year--;//年--
                    if(year>=0){//如果年大于等于开始日期年，则借位月值为12，否则结束日期小于开始日期，异常
                        month=year*12+11;
                        int monthday = calDayByYearAndMonth(String.valueOf(year), String.valueOf(month));
                        day =monthday+day2-day1;
                        if(monthday==day){
                            month++;
                            day=0;
                        }
                    }else{
                        month=0;
                        day=0;
                    }
                }else{
                    month=year*12+month;
                    int monthday = calDayByYearAndMonth(String.valueOf(year), String.valueOf(month));
                    day =monthday+day2-day1;
                    if(monthday==day){
                        month++;
                        day=0;
                    }
                }
            }else{
                month = month +year*12;
                int monthday = calDayByYearAndMonth(String.valueOf(year2), String.valueOf(month2));
                if(monthday==day){
                    month++;
                    day=0;
                }
            }

            diff.put("month",month);
            diff.put("day",day);
           // str=month+","+day;
        }
        return diff;
    }

    //将字符串转为date
    public static Date getTimeForString(String datestr) {
        if (null == datestr || "" == datestr) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdf.parse(datestr);
        } catch (Exception e) {
            return null;
        }
    }
    /**
     * 根据年月获得当前月天数
     * @param dyear 年
     * @param dmouth 月
     * @return
     */
    public static int calDayByYearAndMonth(String dyear,String dmouth){
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy/MM");
        Calendar rightNow = Calendar.getInstance();
        try{
            rightNow.setTime(simpleDate.parse(dyear+"/"+dmouth));
        }catch(ParseException e){
            e.printStackTrace();
        }
        return rightNow.getActualMaximum(Calendar.DAY_OF_MONTH);//根据年月 获取月份天数
    }


    //获取编码集
    public static String getEncoding(String str) {
        String encode = "GB2312";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s = encode;
                return s;
            }
        } catch (Exception exception) {
        }
        encode = "ISO-8859-1";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s1 = encode;
                return s1;
            }
        } catch (Exception exception1) {
        }
        encode = "UTF-8";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s2 = encode;
                return s2;
            }
        } catch (Exception exception2) {
        }
        encode = "GBK";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s3 = encode;
                return s3;
            }
        } catch (Exception exception3) {
        }
        return "";
    }
    public static void main(String[] args) throws ParseException {
        Map map=AccountValidatorUtil.getMonthDiff("2018-06-19","2018-09-12");
        System.out.println(map);
    }
}