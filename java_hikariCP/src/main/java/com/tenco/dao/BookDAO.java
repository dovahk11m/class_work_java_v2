package com.tenco.dao;

import com.tenco.dto.Book;
import com.tenco.util.DBConnectionManager;
import com.tenco.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 도서 관련 데이터베이스 작업을 처리하는 DAO 클래스
 */
public class BookDAO {

    // 모든 도서 모록을 조회 기능 추가
    public List<Book> getAllBooks() throws SQLException {
        List<Book> bookList = new ArrayList<>();
        String sql = "SELECT * FROM books ";
        try (Connection conn = DBConnectionManager.getConnection2();
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                int publicationYear = rs.getInt("publication_year");
                String isbn = rs.getString("isbn");
                boolean available = rs.getBoolean("available");

                Book book = new Book(id, title, author, publisher, publicationYear, isbn, available);
                bookList.add(book);
            }
        }
        return bookList;
    }//getAllBooks

    //테스트코드
    public static void main(String[] args) {

        BookDAO bookDAO = new BookDAO();

        try {
            System.out.println("도서조회");
            bookDAO.getAllBooks();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }//main
}//class
