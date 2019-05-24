package cn.itcast.jdbc;

import java.sql.*;
import java.sql.DriverManager;


public class Demo1 {
    private final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    private final String USERNAME = "root";
    private final String PWD = "000327chn";

    public void update() {//增删改
        Statement stmt = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            //1.导入jar包(驱动 ），加载驱动类
            Class.forName("oracle.jdbc.OracleDricer");
            //2.与数据库建立连接
            connection = DriverManager.getConnection(URL, USERNAME, PWD);
            //3.发送sql,执行增删改，查
            stmt = connection.createStatement();
            //4.执行增加语句
           // String sql = "insert into information values('张三',456)";
            //执行修改语句：
             String sql="update information set user_password=123,where user_name='王五";
            //执行删除语句：
            //String sql="delete message ;
            int count = stmt.executeUpdate(sql);//返回影响的行数
            //5.处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void query() {//查
        Statement stmt = null;
        Connection connection = null;
        ResultSet rs = null;

        try {
            //1.导入jar包(驱动 ），加载驱动类
            Class.forName("oracle.jdbc.OracleDricer");
            //2.与数据库建立连接
            connection = DriverManager.getConnection(URL, USERNAME, PWD);
            //3.发送sql,执行查询
            stmt = connection.createStatement();
}
        Scanner input=new Scanner(System,in);
        System.out.println("请输入用户名:");
        String name= input.nextLine();
        System.out.println("请输入密码");
        String pwd=input.nextLine();
        String sql="select count(*) from login where uname='%"+name+"'
        int count = -1;
        if(rs.next()){
            count=rs.getIn(1);
        }
        //5.处理结果
        if (count > 0) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");

        }
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    finally {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}