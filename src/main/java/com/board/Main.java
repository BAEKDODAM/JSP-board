package com.board;

public class Main {
    public static void main(String[] args) {
        System.out.println("JSP Start");
    }
}
/*
    톰캣이란?
    완성된 자바 프로그래밍임
    웹프로그래밍을 하면서 필요한 통신, 스레드 등과 같은 기능들이 톰캣에 이미 만들어져 있고, 우리가 이를 가져다 사용
    톰캣 프로그램 안에 우리가 만든 프로그램이 쏙 들어감
    우리의 프로그램은 하나의 부품이라고 봐야 함

    비유하자면 톰캣은 건물주, 우리 프로그램은 세입자

    모듈이 우리가 만드는 서비스고
    모듈 안에 여러 서블렛이 존재함
    - 모듈 = jsp_board
    - 서블렛 = http://localhost:8080/user/article/list, ...
 */
