package com.careerit.jfs.cj.basics.day11;

public class StringBuilderExample {

    public static void main(String[] args) {

        String html = "";

        html += "<html>";
        html += "<head>";
        html += "<title>Sample Page</title>";
        html += "</head>";
        html += "<body>";
        html += "<h1>Welcome to Java</h1>";
        html += "<p>Java is a programming language</p>";
        html += "</body>";
        html += "</html>";

        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Sample Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Welcome to Java</h1>");
        sb.append("<p>Java is a programming language</p>");
        sb.append("</body>");
        sb.append("</html>");
        System.out.println(sb.toString());

        System.out.println(html);
    }
}
