package com.careerit.jfs.cj.basics.day11;

public class StringMethodExample2 {

    public static void main(String[] args) {

        String data = "Hello \'Krish\', Welcome to the world of Java";
        System.out.println(data);

        String json = "{\"name\":\"John\", \"age\":31, \"city\":\"New York\"}";
        System.out.println(json);

        String s = "select empno,ename,salary,deptno,dname from"
                + " emp join dept on emp.deptno = dept.deptno"
                + " where salary > 5000 and dname = 'IT'";
        System.out.println(s);

        String html = """
                <html>
                    <head>
                        <title>Java 15</title>
                    </head>
                    <body>
                        <h1>Java 15 features</h1>
                        <p>Text block is a new feature in Java 15</p>
                    </body>
                </html>
                """;
        System.out.println(html);

        String jsonData = """
                {
                    "name":"Krish",
                    "age":31,
                    "city":"Hyderabad" 
                }
                """;
        System.out.println(jsonData);
    }
}
