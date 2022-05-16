package electronicCalc;

import java.util.Scanner;

public class Calc {

    /*
    * 내 맘대로 만든 전기요금 계산기
    * 
    * 여러분 전기 아껴 쓰세요.
    * 
    * 전기세 계산 : 전기요금 + 부가가치세
    * 전기요금 : 기본요금 + 전력량 요금 + 기후환경 요금
    *
    * 기본 요금
    * 100kw/h 미만 : 460원 100kw/h 이상: 690원, 200초과는 910원 300초과는 1600원 400초과는 7300원 500초과는 9100원
    *
    * 전력량 요금 :
    * 100kWh 이하는 kWh당 60.7원, 100kWh 초과는 125.9원, 200kWh 초과는 187.9원, 300kWh 초과는 280.6원,
    * 400kWh 초과는 417.7원, 500kWh초과는 670.6원의 전력량 요금
    *
    * 기후환경 요금 : 사용량 * 7.3
    *
    * 부가가치세 : 전기요금 * 10%
    *
    * */
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("주택용 전기요금(저압) 계산기 ");
        System.out.println("=========================");
        while(true) {
            CalcBasic c = new CalcBasic();
            Scanner sc = new Scanner(System.in);
            System.out.println("사용량을 입력하세요");
            System.out.println("종료하려면 -2 를 누르세요");
            int use = sc.nextInt();
            c.setUse(use);
            c.getUse();
            c.getBasic();
            c.getPerKw();
            c.getTotal();
            double b = c.getCharge();
            System.out.println("전기요금 : " + b);

            if(use == -2) {
                break;}
        }

    }

}
