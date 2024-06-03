package org.example;

public class Main {
    public static void main(String[] args) {

        boolean[] arr1 = new boolean[3];
        double[] arr2 = new double[3];
        int[] arr3 = new int[10];

        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = true;

        arr2[0] = 3.14;
        arr2[1] = 7.77;
        arr2[2] = 11.11;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        System.out.printf("%s\n%s\n%s\n", arr2[0], arr2[1], arr2[2]);

        for (int a = 0; a < arr3.length; a++) {
            arr3[a] = a;
            System.out.printf("arr[%s] : %s\n", a , a + 1);
        }

        Myobject 내정보 = new Myobject();

        System.out.printf("저의 이름은 %s이고 %s살 %scm입니다.\n결혼여부은 %s입니다.", 내정보.이름, 내정보.나이, 내정보.키, 내정보.결혼) ;

        자동차 a1자동차 = new 자동차();
        자동차 a2자동차 = new 자동차();
        자동차 a3자동차 = new 자동차();

        a1자동차.최고속력 = 190;
        a2자동차.최고속력 = 200;
        a3자동차.최고속력 = 210;

        System.out.printf("a1자동차가 최고속력 %s로 달립니다.\n", a1자동차.최고속력);
        System.out.printf("a1자동차가 최고속력 %s로 달립니다.\n", a1자동차.최고속력);
        System.out.printf("a1자동차가 최고속력 %s로 달립니다.\n", a1자동차.최고속력);

        System.out.printf("a1자동차가 최고속력 %s로 달립니다.\n", a1자동차.최고속력);
        System.out.printf("a2자동차가 최고속력 %s로 달립니다.\n", a2자동차.최고속력);
        System.out.printf("a3자동차가 최고속력 %s로 달립니다.\n", a3자동차.최고속력);

        자동차 a자동차1 = new 자동차();
        a자동차1.최고속력 = 230;
        a자동차1.번호 = 1;
        자동차 a자동차2 = new 자동차();
        a자동차2.최고속력 = 210;
        a자동차2.번호 = 2;

        a자동차1.달리다();
        a자동차2.달리다();


    }
}

class Myobject {

    String 이름 = "김선주";
    int 나이 = 27;
    double 키 = 175.5;
    String 결혼 = "x";

}

class 자동차 {

    int 최고속력;
    int 번호;

    void 달리다() {
        System.out.printf("%s번 자동차가 %skm로 달립니다.\n", this.번호, this.최고속력);
    }

}

class 플레이어 {
    int 나이 = 20;
    String 이름 = "홍길동";
    String 직업 = "의적";
}
