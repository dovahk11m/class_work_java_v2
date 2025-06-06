package com.tenco.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnectionManager {

    //HikariCP 설정 클래스 - 설정을 할 수 있는 클래스 타입
    private static HikariDataSource dataSource;

    /* 새로운 문법

    ⭐정적 초기화 블록
    Static Initialization Block
    클래스가 로드될 때 단 한 번 실행된다. */

    static {

        //HikariCp 설정 구성
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/library?serverTimeZone=Asia/Seoul");
        config.setUsername("root");
        config.setPassword("asd1234");

        //Connection 최대 연결 개수 설정
        config.setMaximumPoolSize(10);

        //HikariDataSource 객체에
        //HikariConfig 객체를 주입하게 만들어져 있다. (API 문서 확인)

        dataSource = new HikariDataSource(config);
    }

    //db 연결을 반환하는 메서드 만들기 (Connection)
    public static Connection getConnection2() throws SQLException {
        return dataSource.getConnection();
    }

    //테스트코드
    public static void main(String[] args) {

        try {
            System.out.println("DB 연결 요청 시작");
            DBConnectionManager.getConnection2();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }//main
}//class
