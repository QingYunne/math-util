/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arstialmq.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtil {
    //trong class này cung cấp cho ai đó nhiều hàm xử lý toán học
        //clone class Math của JDK
        //hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái/giá trị
        //chọn thiết kế là làm static
        
        //hàm tính giai thừa!!!
        //n! = 1.2.3.4... n
        //ko có giai thừa cho số ấm
        //0! = 1! = 1 quy ước
        //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
        //20 giao thừa 18 con số 0, vừa kịp đủ cho kiểu long của Java
        //21 giai thừa tràn kiểu long
        //bài này quy ước tính n! trong khoảng từ 0..20
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid arguement. N must be between 0..20");
        if (n==0 || n == 1)
            return 1;   //kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt
        long product = 1;   //tích nhân dồn, thuật toán heo đất, ốc bu dồn thịt
        for (int i = 2; i <= n; i++) 
            product *= i;   //product = product * i; 
        return product;
    }
}
