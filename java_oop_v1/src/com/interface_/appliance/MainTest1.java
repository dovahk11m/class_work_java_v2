package com.interface_.appliance;
/**
 * 4.23 인터페이스 2강
 */
public class MainTest1 {
    //main
    public static void main(String[] args) {
        /*
        인터페이스를 사용하면
        유연한 코드를 설계할 수 있다.
         */
        RemoteController[] remoteControllers = new RemoteController[3];

        remoteControllers[0] = new Television(); //다형성
        remoteControllers[1] = new Refrigerator();
        remoteControllers[2] = new ToyRobot();

        /*
        인터페이스는 표준이다.
        또는 강제성 있는 규약이다.
         */
        for (int i = 0; i < remoteControllers.length; i++) {
            remoteControllers[i].turnOn(); //한번에 모든 전원을 켰다.
        }

    }//end of main
}
