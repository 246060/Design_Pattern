package builder.case2;

interface Builder {
    void makeHeader(String title);
    void makeBody(String body);
    void makeFooter(String tail);
    String getResult();
}
